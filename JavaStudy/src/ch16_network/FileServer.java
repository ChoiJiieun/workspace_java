package ch16_network;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Class Name   : FileServer
 * Author       : GJ
 * Created Date : 2024. 9. 13.
 * Version      : 1.0
 * Purpose      : socket 통신
 * Description  : 파일을 받는 서버
 */

public class FileServer {

	public static void main(String[] args) {
		int port = 5000;
		
		try {
			ServerSocket sst = new ServerSocket(port);
			System.out.println("서버가 포트 : " + port + "에서 실행 중...");
			
			Socket socket = sst.accept();
			System.out.println("클라이언트 연결됨.");
			
			// 파일 수신
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			
			// 파일 이름과 크기
			String fileName = dis.readUTF();
			long fileSize = dis.readLong();
			
			// 파일 저장할 outputStream
			FileOutputStream fos = new FileOutputStream(fileName);
			byte[] buffer = new byte[4096];  // 숫자 크기는 보내는 쪽과 동일하면 됨.
			int read = 0;
			long totalRead = 0;
			int remaining = (int) fileSize;
			while ((read = dis.read(buffer, 0, Math.min(buffer.length, remaining))) > 0) {
				totalRead += read;
				remaining -= read;
				System.out.println("파일 수신 중: " + totalRead + " 바이트 (" + (totalRead * 100 / fileSize) + " %)");
				fos.write(buffer, 0, read);
			}
			System.out.println("파일 수신 완료: " + fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

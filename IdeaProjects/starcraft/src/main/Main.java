package main;
import unit.Marine;
import Zealout;
// 객체 사전적인 정의로 실제 존재하는 것을 말한다
// 클래스 템플릿
// 다형성
// 상속
// 캡슐화
public class Main {
    // 접근 제어자
// public -> protected -> default -> private
// public : 어디서든 가져다 쓸 수 있다.
// protected : 동일 패키지 내에서 가능 또는 상속을 받으면 가능
//	default : 동일 패키지 내에서 가능
//	private : 자기 자신 안에서만 가능
    public static void main(String[] args) {
//		Unit marine = new Unit("marine", 50, 10);
//		System.out.println(marine.attack());
//		Unit 저글링 = new Unit("저글링", 30, 5);
//		System.out.println(marine.getDamage(저글링));
//		System.out.println(marine.getHp());
        Marine marine = new Marine();
        Zealout zealout = new Zealout();
        for(int i=0; i < 5; i++) {
            zealout.getDamage(marine);
            System.out.println(zealout.getHp());
        }


    }
}
package com.example.structure;

import java.util.ArrayList;
import java.util.Arrays;

public class Ch01Array {
    
    // 배열관련 자료 구조
    // 배열 : 데이터를 나열하고, 각 데이터를 인덱스에 대응하도록 구성한 데이터 구조
    // 배열이 필요한 이유
    // - 같은 종류의 데이터를 효율적으로 관리하기 위해 사용
    // - 같은 종류의 데이터를 순차적으로 저장
    public static void main(String[] args) {
        // new 키워드를 사용해서, 배열을 미리 선언하고, 데이터를 넣을 수도 있음
        Integer[] dataList = new Integer[10];
        dataList[0] = 1;

        // dataList[0] 값 확인
        System.out.println(dataList[0]);

        // 직접 배열 데이터 선언시 넣을 수도 있음
        Integer datalist[] = {5, 4, 3, 2, 1};
        Integer[] dataList2 = {1, 2, 3, 4, 5};

        // dataList2[1] 값 확인
        System.out.println(dataList2[1]);

        // 배열의 내용을 출력하려면, Arrays.toString(배열변수) 메서드를 사용하면 됨
        System.out.println(Arrays.toString(dataList2));

        /*
        참고: List 와 ArrayList
            다음과 같이 List 와 ArrayList 선언의 차이점
                List<Integer> list1 = new ArrayList<Integer>();
                ArrayList<Integer> list1 = new ArrayList<Integer>();

            List 는 인터페이스이고, ArrayList 는 클래스임

            클래스는 크게 일반 클래스와 클래스 내에 '추상 메서드' 가 하나 이상 있거나, abstract 로 정의된 추상 클래스로 나뉨
            인터페이스는 모든 메서드가 추상 메서드인 경우를 의미하며, 인터페이스를 상속받는 클래스는 인터페이스에서 정의된 추상 메서드를 모두 구현해야 함
            (따라서 다양한 클래스를 상속받는 특정 인터페이스는 결국 동일한 메서드를 제공함)
            ArrayList 가 아니라, List 로 선언된 변수는 다음과 같이 필요에 따라 다른 리스트 클래스를 쓸 수 있는 구현상의 유연성 을 제공함
                List<Integer> list1 = new ArrayList<Integer>();
                list1 = new LinkedList<Integer>();
        */
        ArrayList<Integer> list1 = new ArrayList<Integer>(); // 가변 길이의 배열 선언
        list1.add(1); // 배열에 아이템 추가 시 add(아이템) 메서드 사용
        list1.add(2);
        System.out.println(list1.get(0)); // 배열에 특정 아이템을 읽을 시 get(인덱스번호) 메서드 사용

        list1.remove(0); // 특정 인덱스에 해당하는 아이템 삭제 시, remove(인덱스번호) 메서드 사용
        System.out.println(list1.get(0)); // 배열에 특정 아이템을 읽을 시 get(인덱스번호) 메서드 사용

        // 배열 길이 확인하기
        System.out.println(list1.size());

        // 2차원 배열
        Integer dataList3[][] = { {1, 2, 3}, {4, 5, 6} };

        // 데이터 2 인덱스로 지정해서 출력해보기
        System.out.println( dataList3[0][1] );
        // 데이터 5 인덱스로 지정해서 출력해보기
        System.out.println( dataList3[1][1] );

        Integer[][][] dataList4 = {
                {
                    {1, 2, 3},
                    {4, 5, 6}
                },
                {
                    {7, 8, 9},
                    {10, 11, 12}
                }
        };
        // EX1)
        /*위 3차원 배열에서 8, 10, 2 를 순서대로 각각의 라인에 출력해보기 (System.out.println 사용)*/
        System.out.println( dataList4[1][0][1] );  // 8
        System.out.println( dataList4[1][1][0] );  // 10
        System.out.println( dataList4[0][0][1] );  // 2

        String dataSet[] = {
            "Braund, Mr. Owen Harris",
            "Cumings, Mrs. John Bradley (Florence Briggs Thayer)",
            "Heikkinen, Miss. Laina",
            "Futrelle, Mrs. Jacques Heath (Lily May Peel)",
            "Allen, Mr. William Henry",
            "Moran, Mr. James",
            "McCarthy, Mr. Timothy J",
            "Palsson, Master. Gosta Leonard",
            "Johnson, Mrs. Oscar W (Elisabeth Vilhelmina Berg)",
            "Nasser, Mrs. Nicholas (Adele Achem)",
            "Sandstrom, Miss. Marguerite Rut",
            "Bonnell, Miss. Elizabeth",
            "Saundercock, Mr. William Henry",
            "Andersson, Mr. Anders Johan",
            "Vestrom, Miss. Hulda Amanda Adolfina",
            "Hewlett, Mrs. (Mary D Kingcome) ",
            "Rice, Master. Eugene",
            "Williams, Mr. Charles Eugene",
            "Vander Planke, Mrs. Julius (Emelia Maria Vandemoortele)",
            "Masselmani, Mrs. Fatima",
            "Fynney, Mr. Joseph J",
            "Beesley, Mr. Lawrence",
            "McGowan, Miss. Anna",
            "Sloper, Mr. William Thompson",
            "Palsson, Miss. Torborg Danira",
            "Asplund, Mrs. Carl Oscar (Selma Augusta Emilia Johansson)",
            "Emir, Mr. Farred Chehab",
            "Fortune, Mr. Charles Alexander",
            "Dwyer, Miss. Ellen",
            "Todoroff, Mr. Lalio"
        };

        /*
        위 1차원 배열에서, 문자 M 을 가지고 있는 아이템의 수를 출력해보기
            |참고|
            배열.length : 배열에 들어 있는 아이템 갯수
            문자열.indexof(String key) : 문자 key 가 해당 문자열에 있으면 해당 문자의 위치 (index 값) 를 리턴하고, 없으면 -1 을 리턴함
        */

        // 1) 전통적으로 사용해서 푼 방법
        int count = 0;

        for (int item=0; item < dataSet.length; item++) {
            if (dataSet[item].indexOf("M") > -1) {
                count++;
            }
        }
        System.out.println(count);

        // 2) stream을 사용해서 푼방법
        System.out.println(Arrays.stream(dataSet).filter(s->s.indexOf("M") != -1).count());
    }
}



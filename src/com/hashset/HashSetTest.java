package com.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hash = new HashSet<String>();
		hash.add("001");
		hash.add("002");
		hash.add("003");
		hash.add("004");
		hash.add("005");
		hash.add("003"); //�ظ�Ԫ�أ�δ������
		System.out.println("�˹�ϣ���е�Ԫ�طֱ�Ϊ��" + hash); //�����ϣ���е�Ԫ��
		System.out.println("�˹�ϣ���е�Ԫ�ظ���Ϊ��" + hash.size()); //���Ԫ�ظ���
	}

}

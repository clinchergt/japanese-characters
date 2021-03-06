package com.pikamander2.testhelloworldapp1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Question 
{
	private Random random = new Random();
	
	private ArrayList<String[]> listToUse;
	
	private int listId;
	
	private static String[][] tempHiraganaList = {{"あ", "a"},{"い", "i"},{"う", "u"},{"え", "e"},{"お", "o"},
	{"か", "ka"},{"き", "ki"},{"く", "ku"},{"け", "ke"},{"こ", "ko"},
	{"さ", "sa"},{"し", "shi"},{"す", "su"},{"せ", "se"},{"そ", "so"},
	{"た", "ta"},{"ち", "chi"},{"つ", "tsu"},{"て", "te"},{"と", "to"},
	{"な", "na"},{"に", "ni"},{"ぬ", "nu"},{"ね", "ne"},{"の", "no"},
	{"は", "ha"},{"ひ", "hi"},{"ふ", "fu"},{"へ", "he"},{"ほ", "ho"},
	{"ま", "ma"},{"み", "mi"},{"む", "mu"},{"め", "me"},{"も", "mo"},
	{"や", "ya"},{"ゆ", "yu"},{"よ", "yo"},
	{"ら", "ra"},{"り", "ri"},{"る", "ru"},{"れ", "re"},{"ろ", "ro"},
	{"わ", "wa"},{"を", "wo"},
	{"ん", "n"},
	{"が", "ga"},{"ぎ", "gi"},{"ぐ", "gu"},{"げ", "ge"},{"ご", "go"},
	{"ざ", "za"},{"じ", "zi"},{"ず", "zu"},{"ぜ", "ze"},{"ぞ", "zo"},
	{"だ", "da"},{"ぢ", "di"},{"づ", "du"},{"で", "de"},{"ど", "do"},
	{"ば", "ba"},{"び", "bi"},{"ぶ", "bu"},{"べ", "be"},{"ぼ", "bo"},
	{"ぱ", "pa"},{"ぴ", "pi"},{"ぷ", "pu"},{"ぺ", "pe"},{"ぽ", "po"}
	};
	
	private static ArrayList<String[]> hiraganaList = new ArrayList<String[]>(Arrays.asList(tempHiraganaList));
	
	private static String[][] tempKatakanaList = {{"ア", "a"},{"イ", "i"},{"ウ", "u"},{"エ", "e"},{"オ", "o"},
	{"カ", "ka"},{"キ", "ki"},{"ク", "ku"},{"ケ", "ke"},{"コ", "ko"},
	{"ガ", "ga"},{"ギ", "gi"},{"グ", "gu"},{"ゲ", "ge"},{"ゴ", "go"},
	{"サ", "sa"},{"シ", "shi"},{"ス", "su"},{"セ", "se"},{"ソ", "so"},
	{"ザ", "za"},{"ジ", "zi"},{"ズ", "zu"},{"ゼ", "ze"},{"ゾ", "zo"},
	{"タ", "ta"},{"チ", "chi"},{"ツ", "tsu"},{"テ", "te"},{"ト", "to"},
	{"ダ", "da"},{"ヂ", "di"},{"ヅ", "du"},{"デ", "de"},{"ド", "do"},
	{"ナ", "na"},{"ニ", "ni"},{"ヌ", "nu"},{"ネ", "ne"},{"ノ", "no"},
	{"ハ", "ha"},{"ヒ", "hi"},{"フ", "fu"},{"ヘ", "he"},{"ホ", "ho"},
	{"バ", "ba"},{"ビ", "bi"},{"ブ", "bu"},{"ベ", "be"},{"ボ", "bo"},
	{"パ", "pa"},{"ピ", "pi"},{"プ", "pu"},{"ペ", "pe"},{"ポ", "po"},
	{"マ", "ma"},{"ミ", "mi"},{"ム", "mu"},{"メ", "me"},{"モ", "mo"},
	{"ヤ", "ya"},{"ユ", "yu"},{"ヨ", "yo"},
	{"ラ", "ra"},{"リ", "ri"},{"ル", "ru"},{"レ", "re"},{"ロ", "ro"},
	{"レ", "wa"},{"ヲ", "wo"},
	{"ン", "n"}
	};
	
	private static ArrayList<String[]> katakanaList = new ArrayList<String[]>(Arrays.asList(tempKatakanaList));
	
	public Question(int tempListId)
	{
		listId = tempListId;
		setList(tempListId);
	}
	
	public void shuffleQuestions()
	{
		if (listId == 4)
		{
			setList(4);
		}
		
		Collections.shuffle(listToUse);
	}
	
	public void setList(int tempListId)
	{
		if (tempListId == 4)
		{
			tempListId = random.nextInt(2) + 1;
		}
		
		switch(tempListId)
		{
			case 1:
				listToUse = hiraganaList;
				break;
			case 2:
				listToUse = katakanaList;
				break;
		}
	}
	
	public String getAnswer(int charID, boolean romajiFirst)
	{
		if (romajiFirst)
		{
			return listToUse.get(charID)[0];
		}
		
		else
		{
			return listToUse.get(charID)[1];
		}
	}
	
	public String getQuestion(int charID, boolean romajiFirst)
	{
		if (romajiFirst)
		{
			return listToUse.get(charID)[1];
		}
		
		else
		{
			return listToUse.get(charID)[0];
		}
	}
}

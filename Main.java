package com.pluralsight.getorganized;

public class Main {

    // 6/13/2018 Java Language Fundamentals Section 3 Creating a Simple App
	public static void main(String[] args) {
	System.out.println("Hello Get Organized");
/*
	// 6/18/2018 Java Language Fundamentals Section 4 Datatypes
	int myVar = 50;
	System.out.println(myVar);

	int anotherVar = 100;
	System.out.println(anotherVar);

	myVar = anotherVar;
	System.out.println(myVar);

	anotherVar = 200;
	System.out.println(anotherVar);

	System.out.println(myVar);

	// 6/18/2018 Java Language Fundamentals Section 4 Primitive Datatypes
	// integer datatypes
	byte numberOfEnglishLetters = 26;
	short feetInAMile = 5283;
	int milesToSun = 92960000;
	long nationalDebt = 18100000000000L;

	System.out.println(numberOfEnglishLetters);
	System.out.println(feetInAMile);
	System.out.println(milesToSun);
	System.out.println(nationalDebt);

	// float datatypes
	float milesInAMarathon = 26.2f;
	double atomWidthInMeters = 0.0000000001d;

	System.out.println(milesInAMarathon);
	System.out.println(atomWidthInMeters);

	// character and boolean datatypes
	char regularU = 'U';
	char accentedU = '\u00DA';
	boolean iLoveJava = true ;

	System.out.println(regularU);
	System.out.println(accentedU);
	System.out.println(iLoveJava);

	// 6/18/2018 Arithmetic Operators
	int myVal = 5;
	System.out.println(myVal);
	System.out.println(myVal++);
	System.out.println(myVal);

	myVal = 50;
	myVal -= 5;

	System.out.println(myVal);

	int result = 100;
	int val1 = 5;
	int val2 = 10;
	result /= val1 * val2;

	System.out.println(result);

	// 6/18/2018 Operator Precedence

	int valA = 21;
	int valB = 6;
	int valC = 3;
	int valD = 1;

	int result1 = valA - valB / valC;
	int result2 = (valA - valB) / valC;

	System.out.println(result1);
	System.out.println(result2);

	int result3 = valA / valC * valD + valB;
	int result4 = valA / (valC * (valD + valB));

	System.out.println(result3);
	System.out.println(result4);

	// 6/18/2018 Type Conversions
	// Wider conversion -- can be done implicitly
	int iVal = 50;
	long lVal = iVal;

	System.out.println(iVal);
	System.out.println(lVal);

	// Narrowing conversions are to be explicitly noted, be careful
	long lVal2 = 50;
	int iVal2 = (int) lVal2;

	System.out.println(iVal2);
	System.out.println(lVal2);
*/
	float floatVal = 1.0f;
	double doubleVal = 4.0d;
	byte byteVal = 7;
	short shortVal = 7;
	long longVal = 5;

	// short result1 = byteVal; //valid assignment, short is bigger than byte so widening assignment

	// short result1 = longVal; //invalid assignment, incompatible type error

	// short result1 = (short) longVal; //valid explicit casting assignment

	// short result2 = byteVal - longVal; //invalid assignment

	// short result2 = (short) (byteVal - longVal); //valid assignment, short is bigger than byte so widening assignment

	// long result3 = longVal - floatVal; //invalid, convert from float to long

	float result3 = longVal - floatVal; //valid

	System.out.println("Success");


	}
}

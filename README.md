# 숫자
##### 자바에서는 따옴표가 없는 숫자는 숫자로 인식한다.

```
System.out.println(1+2); // 3

System.out.println(1.2+1.3); //2.5

System.out.println(2*5); //10

System.out.println(6/2); //3 
```
* * *

# 문자와 문자열

##### 자바는 문자와 문자열을 구분한다. 
##### 문자는 한 글자를 의미하고, 문자열은 여러 개의 문자가 결합한 것을 의미 
##### 문자는 작은 따옴표 문자열은 큰따옴표로 감싼다.
```
System.out.println('생');

System.out.println("생활코딩");

System.out.println('생활코딩'); //문자열을 작은 따옴표로 감싸면 에러가 발생한다

System.out println("생"); //한 글자도 문자열이 될 수 있기 때문에 에러가 발생하지는 않는다.
```
* * *
# 이스케이프
##### 문자열의 시작과 끝을 구분하는 구분자가 아니라 
##### 단순히 문자로 해석하도록 하는 기법을 이스케이프라고한다.

```
System.out.println("\"Welcome programming world\"");
```
 "Welcome programming world"
***
# 문자의 연산

```
System.out.println("생활"+"코딩");
```
***

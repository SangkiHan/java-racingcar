# 자동차 경주 게임

## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

##  자동차 경주
- 진행에 따라 업데이트 중입니다.

| Level | 과제 | 내용 | MERGE |
| ------ | -- | -- |----------- |
| 1단계 | String에 대한 메서드 | split(),contains(),containsExactly(), substring(), charAt()| ☑️
| 1단계 | Set Collection에 대한 메서드 |  @ParameterizedTest, @CsvSource | ☑️
| 2단계 | 문자열 덧셈 계산기 |  java.util.regex 패키지의 Matcher, Pattern  | ☑️
| 3단계 | 자동차 경주 | 자동차 수 & 시도횟수 입력 | 


## 구현 기능 목록
* 간단한 자동차 경주 게임을 구현한다.
* 자동차 수 와 시도 횟수를 입력받는다.
   * Scanner 이용.
* 각 자동차마다 랜덤값을 부여 받는다.
    * java.util.Random 클래스의 nextInt(10)이용.
    * 랜덤값이 4이상일 경우 => 전진 True 반환
    * 랜덤값이 4미만일 경우 => 변화 X False 반환
* 각 자동차마다 매번 상태를 화면에 출력한다.
    * 맨 처음 라운드는 모두 이동한다.
    * 자동차끼리 공백으로 구별하여 출력한다.
    * 자동차는 현재까지의 이동 상태를 저장하고 있어아 한다.
* 위의 내용을 시도 횟수만큼 반복한다.


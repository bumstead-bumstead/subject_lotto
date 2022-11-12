# 프로그램 로직
1. 구입 금액을 입력받는다.
1-1. 입력이 잘못되었을 경우, throw IllegalArgumentException 
1-2. 그렇지 않은 경우, List<lotto>에 입력값/1000만큼 로또 뽑아서 append
2. 번호를 오름차순 정렬하여 저장한 뒤 출력한다.
3. 당첨 번호와 보너스 번호를 입력받는다.
4. 모든 구매 lotto에 대해서, 당첨 번호와 보너스 번호 각각의 일치 여부를 계산한다.
5. 이에 대한 정보를 Enum에 각각 저장한다.
6. 수익률을 계산해서 반환한다.
# 기능 목록

## UI 계층
1. 구입 금액을 입력받는 메서드 : getInputMoney()
2. 구입한 로또의 번호를 출력하는 메서드 : printLottoNumbers()
3. 당첨 로또 번호를 입력받는 메서드 : getInputWinningNumbers()
4. 보너스 번호를 입력받는 메서드 : getInputBonusNumber()
5. 당첨 통계를 출력하는 메서드 : printWinningStats()

## 도메인 계층
1. Lotto 클래스
 - validate() : 입력받은 List의 유효성을 판단한다.
 - getNumberOfOverlapping() : 두 로또의 숫자 중 겹치는 숫자의 개수를 반환한다.
 - getRank() : 해당 로또의 등수를 계산한다.

2. 일치 개수 별로 저장하는 Enum - 멤버로 일치 개수와 당첨금액?
3. 구입 금액의 유효성 판단하는 메서드 - 유효하지 않을 경우 IllegalArgumentException 반환
4. 당첨 번호의 유효성을 판단하는 메서드 - validateWinningNumberInput()
5. 6개의 수로 구성된 로또 번호 List 반환하는 메서드
6. 입력받은 당첨 로또 번호를 List로 변환하는 메서드
7. 로또 번호 리스트와 당첨 번호로부터 각 등수의 개수를 계산해 반환하는 메서드 - getRankList();
8. 수익률 계산하는 메서드
 - 당첨 등수 별로 상금 계산하는 메서드 - getReward()
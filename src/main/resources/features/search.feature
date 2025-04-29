Feature: поиск по сайту
  Scenario: Успешный поиск по слову
   // given when then
    Given Я открываю главную страницу
    And  Ставлю cookie_policy = 1
    When Когда я выполняю поиск по слову Java
    Then Я вижу страницу с результатами
    And у всех книг есть слово Java в названии


    Scenario: поиск по пустой строке

      Scenario: поиск без результатов

# Shop
Задача 1. Покупка товаров
Описание
Вы пишете программу, планирующую продуктовую корзину.
У вас есть список доступных продуктов в одном массиве и соответствующая им цена в другом массиве. Пользователь вводит номер продукта из первого списка и количество продуктов этого вида, которое хочет купить. Программа добавляет указанное количество выбранного продукта в итоговую сумму продуктовой корзины. Действие повторяется до тех пор, пока пользователь не введет команду "end". Только после этого выводится вся корзина выбранных товаров и итоговая сумма.

Функционал программы
Создание массива продуктов внутри программы (без пользовательского ввода);
Создание массива цен на продукты (без пользовательского ввода);
Вывод списка доступных для покупки продуктов на экран;
Возможность ввода пользователем одной строкой номера продукта и количества для добавления в корзину;
Пользователь может добавлять несколько раз один и тот же товар в корзину, в этом случае он должен суммироваться);
Вывод всех покупок, их общую стоимость и количество на экран.
Пример
Список возможных товаров для покупки
1. Молоко 50 руб/шт
2. Хлеб 14 руб/шт
3. Гречневая крупа 80 руб/шт
Выберите товар и количество или введите `end`
1 10 <enter>
Выберите товар и количество или введите `end`
3 1 <enter>
Выберите товар и количество или введите `end`
end <enter>
Ваша корзина:
Наименование товара   Количество  Цена/за.ед  Общая стоимость
Молоко                10          50          500
Гречневая крупа       1           80          80
                                  Итого       580
Примечание: выравнивать столбцы в таблице необязательно.

Пример реализации
Итак, у нас есть список доступных продуктов в одном массиве:

String[] products = {"Хлеб", "Яблоки", "Молоко"}; 
и соответствующие цены в другом массиве:

int[] prices = {100, 200, 300};
При запуске программы необходимо вывести продукты и цены на экран пользователя:
for (int i = 0; i < products.length; i++) {
  ???
}
Нам надо придумать где и как будем хранить информацию о выбранных товарах. Мы предлагаем вам следующий вариант: заведите массив, где в каждой ячейке будет храниться выбранное пользователем количество того товара, чей номер совпадает с номером ячейки.

Дальше заводим цикл while (true). В нём нужно создать переменные, в которых сохраняются значения, вводимые пользователем. Допустим, что:

для номера продукта — это переменная:   int productNumber = 0;
для количества это — переменная:   int productCount = 0;
по номеру, например, можно найти цену продукта в массиве цен: int currentPrice = prices[productNumber];
Для проверки на ввод end использовать inputString.equals("end"), оператор == со строками не работает.

Напомним, что для приведения текста в числовой тип можно использовать Integer.parseInt(inputString)

Для подсчёта итоговой суммы чека заведите до цикла переменную int sumProducts = 0; и обновляйте её в соответствии с тем, что вводит пользователь.

После того как пользователь введет end, программа выйдет из цикла. На экран нужно вывести корзину и итоговую сумму продуктовой корзины.
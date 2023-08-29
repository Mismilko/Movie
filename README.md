# Домашнее задание к занятию "Композиция и зависимость объектов. Mockito при создании автотестов" #
### Цель задания ###
Научиться проектировать классы, внутреннее состояние которых содержит наборы данных
## Инструкция к заданию ##
1. Скачайте и установите профессиональный редактор кода Intellij Idea Community Version
1. Откройте IDEA и создайте и настройте новый Maven-проект (под каждую задачу следует создавать отдельный проект, если обратное не сказано в условии)
1. Создайте пустой репозиторий на GitHub и свяжите его с папкой вашего проекта (не с какой-либо другой папкой).
1. Правильно настройте репозиторий в плане .gitignore. Проигнорируйте папки .idea и target (раньше была out) и .iml-файл - их в репозитории быть не должно.
1. Закоммитьте и запушьте созданный проект на гитхаб, настройте Github Actions, сделайте git pull.
1. Выполните в IDEA требуемую задачу согласно условию.
1. Проверьте соблюдение правил форматирования кода
1. Убедитесь что при запуске mvn clean verify (раньше было mvn clean test) все тесты запускаются, проходят, а сборка завершается успешно
1. Закоммитьте и отправьте в репозиторий содержимое папки проекта.
1. Убедитесь, что CI запустился на последнем коммите и завершился успешно (зелёная галочка).

## Задание 1 (обязательное) ##
Вам необходимо реализовать менеджер афиши для фильмов. В качестве объекта фильма можно взять объект строки — название фильма — или создать свой дата-класс.

[![image for git.png](..%2F..%2F..%2F%CF%C0%CF%C0%2FDesktop%2F%EE%E1%F3%F7%E5%ED%E8%E5%2Fimage%20for%20git.png)]

В этой задаче не нужно разделять менеджер и репозиторий — все фильмы должны храниться внутри массива в поле самого менеджера. Изначально, сразу после создания, менеджер не должен содержать фильмов.

Менеджер должен уметь выполнять следующие операции:

1. Добавление нового фильма.
2. Вывод всех фильмов в порядке добавления (findAll).
3. Вывод максимально лимит* штук последних добавленных фильмов в обратном от добавления порядке (findLast).
*Сделайте так, чтобы по умолчанию выводилось последние 5 добавленных фильма, но при создании менеджера можно было указать другое число, чтобы, например, выдавать 7 или 3, а не 5. То есть у менеджера должно быть два конструктора: один без параметров, выставляющий лимит менеджера в 5, а другой с параметром, берущий значение лимита для менеджера из параметра конструктора.

Метод получения последних фильмов будет очень похож на тот, что был в лекции. Основное отличие в том, что вам в его начале надо будет вычислить правильный ожидаемый размер результирующего массива-ответа, а не просто брать длину массива, что лежит в поле. Сделать это можно, заведя целочисленную переменную, в которую вы сохраните желаемый размер создаваемого массива, вычислите с помощью условных операторов для неё значение, а затем только создадите массив, указав эту переменную как требуемый для него размер, например:

...
??? resultLength;
if ??? {
resultLength = ???
} else {
resultLength = ???
}
??? result = new ???[resultLength];
for (???) {
// заполняем result из массива, что лежит в поле
// в обратном порядке
}
...
Не забывайте про использование отладчика для поиска проблем вашей реализации, если тесты проходить не будут.

Напишите необходимые, с вашей точки зрения, автотесты на различные состояния менеджера. Можно делать их не в одном файле.

### Правила приема работы ###
Прикреплена ссылка на публичный репозиторий с решением задачи

### Критерии оценки ###
1. В каждом репозитории размещено содержимое папки проекта IDEA. Корнем репозитория должна именно папка проекта - не папка src, не папка внутри которой лежит папка проекта; т.о. в корне репозитория должна лежать сразу папка src.
2. Есть файл .gitignore, игнорирующий ненужные файлы и папки, которые должны отсутствовать в репозитории. Если они присутствуют - их нужно оттуда удалить.
3. Программа соответствует всем требованиям из условия задачи
4. Программа использует только те инструменты языка, которые мы проходили или которые прямо разрешены условием задачи
5. Программа работает правильно на всех примерах из условия
6. Программный код отформатирован и соответствует пройденным требованиям к качеству кода
7. При запуске mvn clean verify тесты запускаются и проходят, а сборка завершается успешно
8. В репозитории настроен CI на основе Github Actions и он успешно прошёл на последнем коммите
9. Программа спроектирована достаточно логично и правильно, не противоречит общепринятым в производстве практикам и традициям
10. При наличии недочётов, в зависимости от их серьёзности и количества, работа может быть отправлена на доработку или принята; решение принимается на основе экспертной оценки работы.
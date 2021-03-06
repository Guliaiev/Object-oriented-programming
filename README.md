Проанализируйте социальную сеть Vk. Подумайте, как бы вы спроектировали класс(ы) для хранения данных о посте? Внимание: проектируемые в первом задании классы не содержат логику операций над данными, только схему объектов (поля, геттеры, сеттеры), в которых мы будем хранить информацию о постах.

Если у вас по каким-то причинам недоступны сервисы Vk, то воспользуйтесь PDF-версией страницы.

Что нужно сделать:

Создайте Maven-проект
Добавьте в него спроектированный класс(ы) (поместите их в package domain)
Сделайте коммит и установите тег v1
Отправьте всё на GitHub
Важно: создавать объекты класса и заполнять их данными не нужно (хотя полезно продумать, как и что будет храниться).

Сравните результаты своего проектирования с тем, как это сделали разработчики VK: документация

Если у вас по каким-то причинам недоступны сервисы Vk, то воспользуйтесь PDF-версией страницы

Обратите внимание: описание объектов приведено в формате JSON (один из самых популярных форматов передачи данных) поскольку предполагается, что API Vk можно использовать на разных языках программирования.

Обратите внимание: в Java не принято классы, служащие для создания объектов, называть во множественном числе (например, Comments). Мы предлагаем вам подобные классы называть, например, CommentsInfo, а поле в классе Post - commentsInfo.

Подсказка
Важно: всегда старайтесь анализировать API популярных сервисов - это поможет вам самим научиться проектировать (обучение на примере).

Дополните при необходимости свой класс отсутствующими полями (при необходимости создайте новые классы). Игнорируйте все поля, тип которых - array.

Сделайте коммит и установите тег v2. В комментарии к сдаче ДЗ укажите: почему (по вашему мнению), в описании объектов в Vk оказались поля, которых не было в вашем классе?

Не забывайте, что в Java принято именование в стиле ownerId, а не owner_id.

P.S. Не думайте, что разработчики Vk сделали всё идеально. Например, подумайте, как лучше хранить значения типа Да/Нет и посмотрите, как это делают они.

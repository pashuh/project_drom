# ��������� ������ �� ������������� ������������ ����� � ���������� ���������� Drom.ru

<img width="100%" title="Drom.ru" src="images/logo/drom.jpg">


## :page_with_curl:	����������

> :heavy_check_mark: [���������� � �����������](#technologist-����������-�-�����������)
>
> :heavy_check_mark: [����������� ��������](#bookmark_tabs-�����������-��������)
>
> :heavy_check_mark: [������ ������ �� ���������](#computer-������-������-��-���������)
>
> :heavy_check_mark: [������ ������ � Jenkins](#-������-������-�-jenkins)
>
> :heavy_check_mark: [����� � ����������� ������������ � Allure Report](#-�����-�-�����������-������������-�-allure-report)
>
> :heavy_check_mark: [���������� � Allure TestOps](#-����������-�-allure-testops)
>
> :heavy_check_mark: [���������� � Jira](#-����������-�-jira)
>
> :heavy_check_mark: [����������� � Telegram � �������������� ����](#-�����������-�-telegram-�-��������������-����)
>
> :heavy_check_mark: [������ ������� ����� � Selenoid](#-������-�������-�����-�-selenoid)

## :technologist: ���������� � �����������

<p  align="center">

<img width="5%" title="IntelliJ IDEA" src="images/logo/Idea.svg">
<img width="5%" title="Java" src="images/logo/Java.svg">
<img width="5%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="5%" title="Selenide" src="images/logo/Selenide.svg">
<img width="5%" title="Gradle" src="images/logo/Gradle.svg">
<img width="5%" title="Junit5" src="images/logo/Junit5.svg">
<img width="5%" title="GitHub" src="images/logo/GitHub.svg">
<img width="5%" title="Allure TestOPS" src="images/logo/Allure_TO.svg">
<img width="5%" title="Allure Report" src="images/logo/Allure.svg">
<img width="5%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="5%" title="Jira" src="images/logo/Jira.svg">
<img width="5%" title="Telegram" src="images/logo/Telegram.svg">
<img width="5%" title="Android studio" src="images/logo/android-studio-1.svg">
<img width="5%" title="Browserstack" src="images/logo/Browserstack.svg">
<img width="5%" title="RestAssured" src="images/logo/RestAssured.svg">
</p>

> *� ������ ������� ��������� �������� �� <code><strong>*Java*</strong></code> � �������������� ���������� <code><strong>*Selenide*</strong></code> ��� UI-������ � <code><strong>*RestAssured*</strong></code> ��� Api-������.*
>
>*��� ������ ������� ������������ <code><strong>*Gradle*</strong></code>.*
>
>*<code><strong>*JUnit 5*</strong></code> ������������ ��� ��������� ��� ���������� ������������.*
>
>*������ ������ ����������� �� <code><strong>*Jenkins*</strong></code>.*
>
>*<code><strong>*Selenoid*</strong></code> ������������ ��� ������� ��������� � �����������  <code><strong>*Docker*</strong></code>.*
>
>*<code><strong>*Allure Report, Allure TestOps, Jira, Telegram Bot*</strong></code> ������������ ��� ������������ ����������� ������������.*
>
>*��� ������� ��������� ������ ������������ <code><strong>*Android studio*</strong></code> � <code><strong>*Browserstack*</strong></code>.*



## :bookmark_tabs: ����������� ��������

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Web

> - [x] *�������� ����������� �����������*
>- [x] *�������� ������� ��������� ������ � ������������ ��������*
>- [x] *�������� ������� ������� ��� ��������� ����� � ������ ���� � ��������*
>- [x] *�������� ����������� ���������� ���������� � ���������*
>- [x] *�������� ����������� �������� ���������� �� ����������*
>- [x] *�������� ������ ���� �� ������*
>- [x] *�������� ������ ���� �� ���������*
>- [x] *�������� ������ ���� �� ����������: �����, �������������� �����������*
>- [x] *�������� ��������� �� ���������� ������ ��� ���������� ����������*
>- [x] *�������� ��������� �� ���������� ��������� ��� ���������� ����������*

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; API

> - [x] *�������� ������ ���� �� ����������: �����, ������, ��� ���*
>- [x] *�������� ������ ���� �� ����������: �����, ������*
>- [x] *�������� ���������� ���������� � �����������, ��������� �� ��������, ��� ������*
>- [x] *�������� ���������� ������� '���������' ��� �������� ���������������� �������������*
>- [x] *�������� ������� ���������� ������ � ������� '�������'*

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Mobile

> - [x] *�������� ����������� �����������*
> - [x] *�������� ������ ���� �� ���������� �����*
>- [x] *�������� ����������� ���������� ���� � ������ '���������'*


## :computer: ������ ������ �� ���������

### ��������� ������ ������

```bash
gradle clean web -Dhost=local - ui �����
gradle clean api -Dhost=local - api �����
gradle clean mobile -DdeviceHost=realDevice - ����� ���������� ���������� �� ���������� �������
gradle clean mobile -DdeviceHost=local - ����� ���������� ���������� � ��������� AndroidStudio
gradle clean webAndApi -Dhost=local - ui + api �����

(host=remote �� ���������)
(deviceHost=browserstack �� ���������)
```

### ��������� ������ ������

```bash
gradle clean web -Dhost=remote - ui �����
gradle clean api -Dhost=remote - api �����
gradle clean mobile -DdeviceHost=browserstack - ����� ���������� ���������� �� ������� Browserstack
gradle clean webAndApi -Dhost=remote - ui + api �����
```

### ��������� ������

>
> <code>browser</code> � �������, � ������� ����� ����������� ����� (_�� ��������� - <code>chrome</code>_).
>
> <code>browserVersion</code> � ������ ��������, � ������� ����� ����������� ����� (_�� ��������� - <code>100</code>_).
>
> <code>browserSize</code> � ������ ���� ��������, � ������� ����� ����������� ����� (_�� ��������� - <code>1920x1080</code>_).

## <img width="4%" title="Jenkins" src="images/logo/Jenkins.svg"> ������ ������ � [Jenkins](https://jenkins.autotests.cloud/job/project_drom/)

*��� ������� ������ ���������� ������� �������� ���������� � ������ ������ <code><strong>*�������*</strong></code>.*

<p align="center">
  <img src="images/screens/Jenkins1.png" alt="job" width="800">
</p>

*����� ���������� ������, � ����� <code><strong>*������� ������*</strong></code> �������� ������ ������ ��������
������ <img width="2%" title="Allure Report" src="images/logo/Allure.svg"><code><strong>*Allure
Report*</strong></code>, ������� �� ��������, ��������� �������� � �������������� html-�������.*

<p align="center">
  <img src="images/screens/Jenkins2.png" alt="job" width="1000">
</p>

## <img width="4%" title="Allure Report" src="images/logo/Allure.svg"> ����� � ����������� ������������ � [Allure Report](https://jenkins.autotests.cloud/job/project_drom/9/allure/)

### :pushpin: ����� ����������

*������� �������� Allure-������ �������� ��������� �������������� �����:*

> - [x] <code><strong>*ALLURE REPORT*</strong></code> - ���������� ���� � ����� ����������� �����, ����� ���������� ���������� ������, � ����� ��������� � ��������� �������� � ���������� ��������, ������� � ����������� � �������� ���������� ������
>- [x] <code><strong>*TREND*</strong></code> - ���������� ����� ����������� ������ �� ������ � ������
>- [x] <code><strong>*SUITES*</strong></code> - ���������� ������������� ����������� ������ �� �������� �������
>- [x] <code><strong>*ENVIRONMENT*</strong></code> - ���������� �������� ���������, �� ������� ����������� ����� (� ������ ������ ���������� �� ������)
>- [x] <code><strong>*CATEGORIES*</strong></code> - ���������� ������������� ��������� ��������� ������ �� ����� ��������
>- [x] <code><strong>*FEATURES BY STORIES*</strong></code> - ���������� ������������� ������ �� �����������, ������� ��� ���������
>- [x] <code><strong>*EXECUTORS*</strong></code> - ���������� ����������� ������� ������ (������ �� ������ � Jenkins)

<p align="center">
  <img src="images/screens/AllureReport1.png" alt="Allure Report" width="900">
</p>

### :pushpin: �����
<p align="center">
  <img src="images/screens/AllureReport2.png" alt="Allure Report" width="900">
</p>

## <img width="4%" title="Allure TestOPS" src="images/logo/Allure_TO.svg"> ���������� � [Allure TestOps](https://allure.autotests.cloud/launch/15585)

### :pushpin: �������� �������

<p align="center">
  <img src="images/screens/AllureTestOps1.png" alt="dashboards" width="900">
</p>

### :pushpin: ����-�����

<p align="center">
  <img src="images/screens/AllureTestOps2.png" alt="test cases" width="900">
</p>

## <img width="4%" title="Jira" src="images/logo/Jira.svg"> ���������� � [Jira](https://jira.autotests.cloud/browse/AUTO-1349)

<p align="center">
  <img src="images/screens/Jira.png" alt="jira" width="1000">
</p>


## <img width="4%" title="Telegram" src="images/logo/Telegram.svg"> ����������� � Telegram � �������������� ����

> ����� ���������� ������ ����������� ���, ��������� � <code>Telegram</code>, ������������� ������������ � ���������� ��������� � ������� � ������� ������.

<p align="center">
<img title="Telegram Notifications" src="images/screens/Telegram.png">
</p>

## <img width="4%" title="Selenoid" src="images/logo/Selenoid.svg"> ������ ������� ����� � Selenoid

> � ������� ����� � ������ ����������� �����.
<p align="center">
  <img title="Selenoid Video" src="images/gif/video.gif">
</p>


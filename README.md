# AndroidStudioProjects

## KlientREST
Ta aplikacja mobilna została stworzona jako prosty klient REST, który umożliwia użytkownikowi wygodne wysyłanie zapytań do serwera. Aplikacja została zaprojektowana z myślą o prostocie i czytelności interfejsu, co pozwala użytkownikowi łatwo korzystać z jej funkcji.

Właściwości:

(a) Prosty Interfejs Użytkownika:
Aplikacja składa się z pojedynczej aktywności (widoku), który zawiera wyjściowe pole tekstowe, wejściowe pole tekstowe oraz przycisk. Wszystkie elementy interfejsu są czytelnie opisane, co ułatwia użytkownikowi korzystanie z aplikacji.

(b) Podawanie URL zasobu serwera:
Wejściowe pole tekstowe umożliwia użytkownikowi wprowadzenie URL zasobu serwera, do którego chce wysłać zapytanie.

(c) Wyświetlanie Odpowiedzi Serwera:
Wyjściowe pole tekstowe wyświetla odpowiedź serwera na zapytanie wysłane pod wskazany URL. Użytkownik może łatwo odczytać odpowiedź serwera bez konieczności analizowania surowego formatu JSON czy XML.

(d) Wykonywanie Zapytania po Naciśnięciu Przycisku:
Aby wysłać zapytanie do serwera, użytkownik musi jedynie wprowadzić URL zasobu do odpowiedniego pola tekstowego i nacisnąć przycisk. Aplikacja wykonuje zapytanie do wskazanego URL po naciśnięciu przez użytkownika przycisku, co pozwala na szybkie uzyskanie odpowiedzi serwera.

Ta aplikacja jest idealnym przykładem prostego klienta REST dla urządzeń mobilnych, który może być używany do interakcji z różnymi serwerami za pomocą prostego i czytelnego interfejsu użytkownika.

## SenseHatClientFinal
Mobilny Klient Kontroli i Pomiarów to zaawansowana aplikacja dla urządzeń mobilnych, zaprojektowana do komunikacji z wbudowanym systemem pomiaru i sterowania. Aplikacja oferuje intuicyjny interfejs użytkownika, który umożliwia monitorowanie danych pomiarowych, sterowanie wyjściami oraz odczytywanie stanu wejść użytkownika. Dzięki wyraźnym wykresom, dynamicznym listom i tabelom oraz łatwym w obsłudze elementom interaktywnym, użytkownicy mogą łatwo zarządzać systemem pomiarowym i sterować urządzeniami wyjściowymi.

Funkcje:

(a) Monitorowanie Pomiarów:
Aplikacja wyświetla wykresy czasowe co najmniej dwóch różnych wielkości pomiarowych, takich jak orientacja kątowa (RPY), temperatura, ciśnienie i wilgotność. Wykresy są czytelne i zawierają wszystkie niezbędne informacje do prawidłowej interpretacji danych.

(b) Dane Pomiarowe i Wejścia Użytkownika:
Interfejs zawiera dynamiczną listę lub tabelę, prezentującą dostępne pomiary (np. orientacja kątowa, temperatura, ciśnienie, wilgotność) oraz stan wejść użytkownika (np. stan trzech liczników joysticka). Każdy element listy/tabeli zawiera nazwę pomiaru lub wejścia, aktualny stan oraz jednostkę pomiarową.

(c) Sterowanie Wyjściami:
Użytkownicy mogą kontrolować stany wszystkich dostępnych wyjść, takich jak matryca LED z karty Sense Hat. Interfejs umożliwia łatwe ustawienie stanów wyjść i wyraźnie informuje użytkownika, czy aktualne ustawienia odpowiadają stanom wyjść.

(d) Dostosowywalny Okres Próbkowania:
Użytkownik może określić okres próbkowania danych pomiarowych, umożliwiając precyzyjne monitorowanie zmian w czasie rzeczywistym.

(e) Cykliczne Zapytania i Aktualizacje:
Aplikacja cyklicznie wysyła zapytania do serwera, aktualizując dane pomiarowe i stany wejść użytkownika. Interfejs jest dynamicznie aktualizowany na podstawie odpowiedzi serwera.

Aplikacja została przetestowana na rzeczywistych urządzeniach mobilnych oraz na wirtualnych urządzeniach wbudowanych, zapewniając niezawodność i skuteczność komunikacji sieciowej. Pełniąc rolę zaawansowanego klienta REST, ta aplikacja zapewnia kompleksowe rozwiązanie do kontroli, monitorowania i interpretacji danych pomiarowych oraz stanu wejść użytkownika.

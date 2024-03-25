# enUygunTask

# JAVA PART
## Projemde POM model kullanarak Cucumber ile framework oluşturdum.
Bunun içinde Maven dependency'leri ve pluginleri kullandım.Pluginler sayesinde rapor alabildim.Pluginlerdeki Maven Sure File sayesinde Runner Class'ı kullandım.
Runner Class'ta yalnızca annatotation'un ismini @case1 @case2 gibi kullanarak koşabildim.
Senaryoyu yazarken Cucumber'da BDD(Behaviour Driven Development) appraoch ile Gherkhin language kullandım.
Buradaki Gherhkin language'in amacı ise java ve non-java insanları ortak bir noktada buluşturmaktır.
Test case'lerini yazdıktan sonra POM(Page Object Model) kullandım.Herbir page için farklı bir class oluşturdum.Page Initializer kullandım.
Onların steplerini yine Runner classtaki dryRun özelliğini kullanarak implement ettim ve indirdim.
JUnit altındaki assertation kullanarakta validatation yapabildim.Pluginden report yaptım.
Çalıştırdıktan sonra target file'ın altında sonuçları gördüm.
Hooks'u kullanarak her seferinde browser' açtım kapatmadan 1 ekran görüntüsü aldım.
Kullandığım ortak methodlar için SendKey, click vs kendi yazdığım kodlarla Common Methods'un içerisinde topladım.Böylece gereksiz koddan kurtuldum ve kod reusability sağlamış oldum.
Inheritance kullanarak Common Methods'a extend ettim ve böylelikle diğer bütün classlarda da kullanabilmiş oldum.
# NON-JAVA PART
Non-java kısmında faeuture file oluşturdum.İçerisinde Given When Then kullanarak step definitionları yaptım.(Gherkhin language ile)
Constants sabit veriler için kullandım.Config Reader sayesinde Constants file'ı okuyabildim, veriyi aldım.




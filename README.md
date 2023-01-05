# **ALGO GYAKORLÓ FELADAT**  
**Bevezetés**  
Ebben a feladatban egy metódust kell létrehoznod, ami egy tömböt dolgoz fel.  
A main metódusban próbálhatod ki a kódodat, illetve használd az előre megírt teszteseteket az algoritmusod kipróbálására! A kiadott teszteseteken ne módosíts!  
## **Feladatleírás**  
Írj egy metódust a `hu.nive.ujratervezes.findprimedivisor.DivisorFinder` osztályban a következő specifikácó alapján:  
a metódus neve: `findPrimeDivisors`  
**bemeneti paramétere:**  
`numbers`, egy egész számokat tartalmazó tömb (int[])  
**visszatérési értéke:**  
egy új, egész számokat tartalmazó tömb int[]

A `findPrimeDivisors` metódus:  
Megkeresi a numbers tömb minden elemének összes prím osztóját és egy int[] tömben adja vissza őket. Minden érték csak egyszer szerepeljen az eredmény tömbben!

A beépített sort(),min(), max(), average(), stb... metódusok használata a feladat megoldása során nem megengedett.

**Kivételkezelés:**  
ha a metódust úgy hívjuk meg, hogy a numbers paraméter egy üres tömb, akkor adjon vissza egy új, üres tömböt  
ha a metódust úgy hívjuk meg, hogy a numbers paraméter értéke null, akkor dobjon IllegalArgumentException-t  

## **Példák**

| Numbers | Eredmény |
| ----------- | ----------- |
| [10,11,12] | [2,3,5,11] |
| [] | [] |
| [1, 0] | [] |

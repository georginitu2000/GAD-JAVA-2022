2. Visitor
Am folosit acest design pattern pentru a afla costul total al unui client in urma cazarii la un hotel, in functie de facilitati
si de durata sederii. Astfel, se iau in calcul numarul de nopti in care a fost cazat, tipul de camera de hotel in care a stat,
cate zile a folosit serviciile spa (daca le-a folosit) si daca a servit vreo masa la hotel.
Acest design pattern este eficient in acest caz, deoarece daca se schimba vreun pret este nevoie sa se modifice acest lucru
doar in clasa CostVisitor, costul final fiind recalculat automat ulterior.
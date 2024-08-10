using DesafioPOO;

List<Mesa> mesas = new List<Mesa>() { 
 new Mesa(1),
 new Mesa(2),
 new Mesa(3),
 new Mesa(4),


};
List<ItemCardapio> cardapio = new List<ItemCardapio>();
List<Pedido> pedidos = new List<Pedido>();

double total = 0;
//metodos
void mesa() {
    void addmesa() {
        while (true) {
            Console.WriteLine("escolha uma mesa");
            int numeromesa = int.Parse(Console.ReadLine());
            bool MesaExiste = mesas.All(mesa => mesa.NumeroMesa == numeromesa);
            if (MesaExiste) {
                mesas.Add(new Mesa(numeromesa));
                break;
            }
            else {
                Console.WriteLine("esse numero ja existe escolha outro");
            }
        }
    }//funcionando
    void attmesa() {
        foreach (var item in mesas) {
            Console.WriteLine($"Mesa:{item}");
        }
        Console.WriteLine("Escolha o numero da mesa que deseja atualizar");
        int i = int.Parse(Console.ReadLine());
        Console.WriteLine($"Mesa {mesas[i]} escolhida, insira o Numero que deseja colocar:");
        while (true) {

            int numeromesa = int.Parse(Console.ReadLine());
            bool MesaExiste = mesas.All(mesa => mesa.NumeroMesa == numeromesa);
            if (MesaExiste) {
                mesas[i].AtualizarMesa(numeromesa);
                break;
            }
            else {
                Console.WriteLine("esse numero ja existe escolha outro");
            }
        }
    }
    Console.Clear();

    Console.WriteLine("1-Adicionar mesa");
    Console.WriteLine("2-Atualizar mesa");
    Console.WriteLine("3-Apagar  mesa");
    int resposta = int.Parse(Console.ReadLine());
    switch (resposta) {
        case 1:

            addmesa();

            break;
        case 2:

            attmesa();

            break;
    }
}//funcionando

Console.WriteLine("1-Adicionar mesa");
mesa();
Console.WriteLine("2-Adicionar item ao cardapio");
Console.WriteLine("3-Criar pedido");
Console.WriteLine("4-Fechar pedido");



foreach (var mesinha in mesas) {
    Console.WriteLine(mesinha);

}







/*
for (int i = 0; i < mesas.Count; i++){
    Console.WriteLine($"Mesa {mesas[i].NumeroMesa}:");
    mesas[i].FazerPedido();
    total += mesas[i].TotalDaMesa;

}

foreach(var sla in mesas) {
    Console.WriteLine(sla);
    Console.WriteLine($"total de lucro do dia {total.ToString("c")}");
}

Mesa Pedidos = new Mesa ();
double total = 0;
total = Pedidos.FazerPedido();
Console.WriteLine(total);*/

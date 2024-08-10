using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;

namespace DesafioPOO {
    internal class ItemCardapio {
        public string Nome { get; set; }
        public double Preco { get; set; }
        public bool Disponivel { get; set; }

        public ItemCardapio(string nome, double preco) {
            Nome = nome;
            Preco = preco;
        }
        public ItemCardapio(string nome, double preco, bool disponivel) : this(nome, preco) {
            Disponivel = disponivel;
        }


        public override string ToString() {
            return $"{Nome}, {Preco}";
        }

    }



}

package com.example.exemplorecyclerview;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.Snackbar;
import java.util.LinkedList;

public class TrabalhadorAdapter
        extends RecyclerView.Adapter<TrabalhadorAdapter.TrabalhadorViewHolder> {

    private LinkedList <Trabalhador> dados;

    public TrabalhadorAdapter(){
        dados = new LinkedList();
        preparaDadosRecyclerView();
    }

    public void preparaDadosRecyclerView() {
        //Os dados que alimentarão o RecyclerView (poderiam ser carregados de um banco de dados).
        dados.add(new Trabalhador("Betty Lima", 3000.00f, 29, 'F'));
        dados.add(new Trabalhador("Amilton Souza", 8000.00f, 42, 'M'));
        dados.add(new Trabalhador("Ana Linares", 8900.00f, 40, 'F'));
        dados.add(new Trabalhador("Carlos Lopes", 4500.00f, 33,'M' ));
        dados.add(new Trabalhador("Roberto Fernandez", 7900.00f, 62, 'M'));
        dados.add(new Trabalhador("Ludmilla Souza", 2900.00f, 37, 'F'));
        dados.add(new Trabalhador("Luiz Hernandes", 3330.00f, 38, 'M'));
        dados.add(new Trabalhador("Caio Silva", 7770.00f, 55, 'M'));
        dados.add(new Trabalhador("Vanessa Nunes", 7000.00f, 27, 'F'));
        dados.add(new Trabalhador("Alcides Guimarães", 2200.00f, 31,'M' ));
        dados.add(new Trabalhador("Roberto L. Fernandez", 9100.00f, 64, 'M'));
        dados.add(new Trabalhador("Vanessa Nunes", 7000.00f, 27, 'F'));
        dados.add(new Trabalhador("Renata da Silva", 6100.00f, 19, 'F'));
        dados.add(new Trabalhador("Julio Dagoberto Lopes", 1500.00f, 23,'M' ));
        dados.add(new Trabalhador("Luiz Roberto da Silva", 9000.00f, 42, 'M'));
        dados.add(new Trabalhador("Edith Lima", 6900.00f, 37, 'F'));
        dados.add(new Trabalhador("Estevam Duarte", 2220.00f, 58, 'M'));
        dados.add(new Trabalhador("Lara Carol Dias", 6980.00f, 19, 'F'));
        dados.add(new Trabalhador("Lia Lima", 7980.00f, 19, 'F'));
        dados.add(new Trabalhador("Joe Silva", 8200.00f, 33, 'M'));
        dados.add(new Trabalhador("Isidro Lopes", 4400.00f, 34,'M' ));
        dados.add(new Trabalhador("Roberto Luís Vieira", 4100.00f, 24, 'M'));
        dados.add(new Trabalhador("Isabela Freitas", 3000.00f, 21, 'F'));
        dados.add(new Trabalhador("Márcia Silas Lopes", 7050.00f, 29, 'F'));
        dados.add(new Trabalhador());
    }

    @Override   //método obrigatório
    public TrabalhadorViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_trabalhador, viewGroup, false);
        return new TrabalhadorViewHolder(itemView);
    }

    @Override   //método obrigatório
    public void onBindViewHolder(TrabalhadorViewHolder viewHolder, int i) {
        Trabalhador trab = dados.get(i); //ou pegar o regisro i de uma tabela de um BD...
        viewHolder.viewNome.setText(trab.getNome());
        viewHolder.viewSalario.setText("" + trab.getSalario());
        viewHolder.viewIdade.setText("" + trab.getIdade());
        if (trab.getSexo() == 'F')
            viewHolder.viewSexo.setImageResource(R.drawable.femen);
        else
            viewHolder.viewSexo.setImageResource(R.drawable.masc);
    }

    @Override    //método obrigatório
    public int getItemCount() {
        return dados.size();
    }

    // Classe interna que se encarrega dos detalhes dos itens da lista

    public class TrabalhadorViewHolder extends RecyclerView.ViewHolder{
        protected TextView viewNome;
        protected TextView viewSalario;
        protected TextView viewIdade;
        protected ImageView viewSexo;

        public TrabalhadorViewHolder(View itemView) {
            super(itemView);
            //para atender o evento de click em um item da lista:
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();
                    Snackbar.make (v, "Selecionado: \n"
                                    + dados.get(pos), Snackbar.LENGTH_LONG)
                            .setAction(" Action", null ).show();
                }
            });
            viewNome = (TextView) itemView.findViewById(R.id.nome);
            viewSalario = (TextView) itemView.findViewById(R.id.salario);
            viewIdade = (TextView) itemView.findViewById(R.id.idade);
            viewSexo = (ImageView) itemView.findViewById(R.id.sexo);
        }
    }

}
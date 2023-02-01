package dam.alejandro.interfaces_a42;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Tasca2 extends AppCompatActivity {
    public RecyclerView recyclerView;
    public String[] nombres = {"Alejandro Valero", "Arnau Carbonell", "Ester Expositor", "Francisco Frasco"};
    public String[] cargos = {"Programador", "Animadora", "Analista", "CEO"};
    public int[] fotos = {R.drawable.persona3, R.drawable.persona2, R.drawable.persona1, R.drawable.persona4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tasca2);
        recyclerView = findViewById(R.id.recycler1);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter((new AdaptadorEmpleado()));


    }

    private class AdaptadorEmpleado extends RecyclerView.Adapter<AdaptadorEmpleado.AdaptadorEmpleadoHolder>{
        class AdaptadorEmpleadoHolder extends RecyclerView.ViewHolder{
            ImageView imagen;
            TextView nombre, cargo;

            public AdaptadorEmpleadoHolder(View itemView){
                super(itemView);
                imagen = itemView.findViewById(R.id.imageView);
                nombre = itemView.findViewById(R.id.tvNombre);
                cargo = itemView.findViewById(R.id.tvCargo);
            }
            public void imprimir(int position){
                imagen.setImageResource(fotos[position]);
                nombre.setText(nombres[position]);
                cargo.setText(cargos[position]);
            }
        }

        @NonNull
        @Override
        public AdaptadorEmpleadoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new AdaptadorEmpleadoHolder((getLayoutInflater().inflate(R.layout.layout_targeta, parent, false)));
        }

        @Override
        public void onBindViewHolder(@NonNull AdaptadorEmpleadoHolder holder, int position) {
            holder.imprimir(position);
        }

        @Override
        public int getItemCount() {
            return nombres.length;
        }
    }
}




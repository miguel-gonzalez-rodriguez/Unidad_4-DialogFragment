package gal.cifpacarballeira.unidad4_fragmentsydialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class Dialogo extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        // Construir el diálogo
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Inflar el layout del diálogo con el xml que hemos creado antes
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        builder.setView(layoutInflater.inflate(R.layout.otro_dialog, null));

        // Establece el título
        builder.setTitle("Mi diálogo");

        // Añadir botones de aceptar y cancelar
        builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int id) {
                    // Ejecutar al pulsar el botón aceptar
                }
            })
            .setNegativeButton("KJDSALJLASJLAJS", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    // Ejecutar al pulsar el botón aceptar
                    Dialogo.this.getDialog().cancel();
                }
            });

        // Devuelve el diálogo
        return builder.create();

    }
}

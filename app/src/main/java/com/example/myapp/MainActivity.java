package com.example.myapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity" ;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    TextInputEditText email;
    TextInputEditText password;
    Button login;


    public void inicio (){

        mAuth= FirebaseAuth.getInstance();
        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();

                if(user!=null){
                    Log.d(TAG,"el usuario cambió");
                }
                else{
                    Log.d(TAG,"No se encuentra conectado");
                }
            }
        };
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                inicioSesion(email.getText().toString(),password.getText().toString());
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();
        email= findViewById(R.id.usuario);
        password= findViewById(R.id.clave);
        login = findViewById(R.id.sesion);
        inicio();

    }
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();

    }

    public void Registrar(View view){
        Intent reg = new Intent(this,RegiserActivity.class);
        startActivity(reg);
    }

   public void inicioSesion(String email,String password){

       mAuth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
        @Override
        public void onComplete(@NonNull Task<AuthResult> task) {
            if (task.isSuccessful()) {
                // Sign in success, update UI with the signed-in user's information
                Log.d(TAG, "signInWithEmail:success");
                FirebaseUser user = mAuth.getCurrentUser();
                Toast.makeText(MainActivity.this, "Autenticación exitosa.",
                        Toast.LENGTH_SHORT).show();
                irContenedor();

            } else {
                // If sign in fails, display a message to the user.
                Log.w(TAG, "signInWithEmail:failure", task.getException());
                Toast.makeText(MainActivity.this, "Autenticación fallida",
                        Toast.LENGTH_SHORT).show();

            }

            // ...
        }
    });
   }
   public void irContenedor(){
        Intent intent = new Intent(this,Contenedor.class);
        startActivity(intent);

   }
}

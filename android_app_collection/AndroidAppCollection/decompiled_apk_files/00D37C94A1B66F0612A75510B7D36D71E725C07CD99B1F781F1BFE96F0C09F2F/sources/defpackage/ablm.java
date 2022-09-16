package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ablm  reason: default package */
/* loaded from: classes.dex */
final class ablm implements afzf {
    final /* synthetic */ abln a;

    public ablm(abln ablnVar) {
        this.a = ablnVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.a.dismiss();
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        atep atepVar;
        atep atepVar2;
        arvr arvrVar = (arvr) obj;
        arvs arvsVar = arvrVar.c;
        if (arvsVar == null) {
            arvsVar = arvs.a;
        }
        if (arvsVar.b == 66439850) {
            atepVar = (atep) arvsVar.c;
        } else {
            atepVar = atep.a;
        }
        if (atepVar.c.size() != 0) {
            final abln ablnVar = this.a;
            arvs arvsVar2 = arvrVar.c;
            if (arvsVar2 == null) {
                arvsVar2 = arvs.a;
            }
            if (arvsVar2.b == 66439850) {
                atepVar2 = (atep) arvsVar2.c;
            } else {
                atepVar2 = atep.a;
            }
            ablnVar.ah.setVisibility(8);
            ablnVar.ai.setVisibility(0);
            ablnVar.ai.removeAllViews();
            LayoutInflater layoutInflater = ablnVar.af.getLayoutInflater();
            for (final aten atenVar : atepVar2.c) {
                TextView textView = (TextView) layoutInflater.inflate(R.layout.live_chat_item_context_menu_item, (ViewGroup) ablnVar.ai, false);
                textView.setText(abgc.h(atenVar));
                if (abgc.d(atenVar) == null && abgc.e(atenVar) == null) {
                    ater aterVar = atenVar.d;
                    if (aterVar == null) {
                        aterVar = ater.a;
                    }
                    if ((aterVar.b & 16) == 0) {
                        ablnVar.ai.addView(textView);
                    }
                }
                textView.setOnClickListener(new View.OnClickListener() { // from class: abll
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        abln ablnVar2 = abln.this;
                        aten atenVar2 = atenVar;
                        abre abreVar = ablnVar2.ag;
                        if (abreVar != null) {
                            abreVar.f(atenVar2);
                        }
                        ablnVar2.dismiss();
                    }
                });
                ablnVar.ai.addView(textView);
            }
            return;
        }
        this.a.dismiss();
    }
}

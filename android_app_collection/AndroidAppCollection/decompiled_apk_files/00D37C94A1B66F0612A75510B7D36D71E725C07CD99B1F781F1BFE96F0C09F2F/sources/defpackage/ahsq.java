package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ahsq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ahsq implements View.OnClickListener {
    public final /* synthetic */ ahsr a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahsq(ahsr ahsrVar, int i) {
        this.b = i;
        this.a = ahsrVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            ahsr ahsrVar = this.a;
            ahst ahstVar = ahsrVar.ag;
            if (ahstVar != null) {
                ahstVar.a();
            }
            ahsrVar.dismiss();
            return;
        }
        ahsr ahsrVar2 = this.a;
        ahst ahstVar2 = ahsrVar2.ag;
        if (ahstVar2 != null) {
            ahsu ahsuVar = (ahsu) ahstVar2;
            ahsv ahsvVar = ahsuVar.a;
            dt dtVar = ahsuVar.c;
            if (!ahsvVar.ap() && !ahsvVar.at()) {
                ahsvVar.ag = ahstVar2;
                ahsvVar.qv(dtVar.getSupportFragmentManager(), ahsv.ae);
            }
        }
        ahsrVar2.dismiss();
    }
}

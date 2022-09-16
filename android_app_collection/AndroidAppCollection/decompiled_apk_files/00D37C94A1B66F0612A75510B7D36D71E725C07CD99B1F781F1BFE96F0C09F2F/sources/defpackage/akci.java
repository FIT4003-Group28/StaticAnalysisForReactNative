package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: akci  reason: default package */
/* loaded from: classes.dex */
final class akci implements View.OnClickListener {
    private final akch a;
    private final acte b;
    private final acti c;

    public akci(akch akchVar, acte acteVar, acti actiVar) {
        this.a = akchVar;
        this.b = acteVar;
        this.c = actiVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        akch akchVar = this.a;
        if (akchVar != null) {
            akch akchVar2 = ((akcg) akchVar).a.f;
            if (akchVar2 != null) {
                xli xliVar = ((xkw) akchVar2).a;
                xliVar.m.e(xliVar.k);
                xliVar.m.b();
                xliVar.m.e(xliVar.j);
            }
            this.c.H(3, this.b, null);
        }
    }
}

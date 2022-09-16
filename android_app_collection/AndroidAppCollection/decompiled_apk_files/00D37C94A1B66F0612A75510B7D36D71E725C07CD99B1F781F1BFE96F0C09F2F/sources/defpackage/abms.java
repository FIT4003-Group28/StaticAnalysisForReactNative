package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: abms  reason: default package */
/* loaded from: classes.dex */
final class abms implements View.OnClickListener {
    final /* synthetic */ asrw a;
    final /* synthetic */ acte b;
    final /* synthetic */ abmt c;

    public abms(abmt abmtVar, asrw asrwVar, acte acteVar) {
        this.c = abmtVar;
        this.a = asrwVar;
        this.b = acteVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aafo aafoVar = this.c.a;
        apzg apzgVar = this.a.q;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.c(apzgVar, this.c.m);
        this.c.b.H(3, this.b, null);
    }
}

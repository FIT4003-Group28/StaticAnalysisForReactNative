package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: abmu  reason: default package */
/* loaded from: classes.dex */
final class abmu implements View.OnClickListener {
    final /* synthetic */ asrx a;
    final /* synthetic */ acte b;
    final /* synthetic */ abmv c;

    public abmu(abmv abmvVar, asrx asrxVar, acte acteVar) {
        this.c = abmvVar;
        this.a = asrxVar;
        this.b = acteVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aafo aafoVar = this.c.b;
        apzg apzgVar = this.a.d;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.c(apzgVar, null);
        this.c.a.H(3, this.b, null);
    }
}

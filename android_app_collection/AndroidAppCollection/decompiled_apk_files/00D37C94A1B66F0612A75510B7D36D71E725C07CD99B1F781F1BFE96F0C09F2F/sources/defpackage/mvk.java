package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: mvk  reason: default package */
/* loaded from: classes3.dex */
final class mvk implements View.OnClickListener {
    final /* synthetic */ aafo a;
    final /* synthetic */ mvl b;

    public mvk(mvl mvlVar, aafo aafoVar) {
        this.b = mvlVar;
        this.a = aafoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        areu areuVar = this.b.a;
        if (areuVar != null) {
            aret aretVar = areuVar.p;
            if (aretVar == null) {
                aretVar = aret.a;
            }
            aujn aujnVar = aretVar.c;
            if (aujnVar == null) {
                aujnVar = aujn.a;
            }
            if ((aujnVar.b & 4) == 0) {
                return;
            }
            aafo aafoVar = this.a;
            aret aretVar2 = this.b.a.p;
            if (aretVar2 == null) {
                aretVar2 = aret.a;
            }
            aujn aujnVar2 = aretVar2.c;
            if (aujnVar2 == null) {
                aujnVar2 = aujn.a;
            }
            apzg apzgVar = aujnVar2.d;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
        }
    }
}

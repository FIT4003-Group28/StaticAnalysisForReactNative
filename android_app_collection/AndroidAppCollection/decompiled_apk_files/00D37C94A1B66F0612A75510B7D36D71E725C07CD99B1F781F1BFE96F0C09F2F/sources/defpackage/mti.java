package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: mti  reason: default package */
/* loaded from: classes3.dex */
final class mti implements View.OnClickListener {
    final /* synthetic */ aafo a;
    final /* synthetic */ mtk b;

    public mti(mtk mtkVar, aafo aafoVar) {
        this.b = mtkVar;
        this.a = aafoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aqen aqenVar = this.b.b;
        if (aqenVar != null) {
            aqem aqemVar = aqenVar.p;
            if (aqemVar == null) {
                aqemVar = aqem.a;
            }
            aujn aujnVar = aqemVar.c;
            if (aujnVar == null) {
                aujnVar = aujn.a;
            }
            if ((aujnVar.b & 4) == 0) {
                return;
            }
            aafo aafoVar = this.a;
            aqem aqemVar2 = this.b.b.p;
            if (aqemVar2 == null) {
                aqemVar2 = aqem.a;
            }
            aujn aujnVar2 = aqemVar2.c;
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

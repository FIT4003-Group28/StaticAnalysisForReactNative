package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: mmu  reason: default package */
/* loaded from: classes3.dex */
final class mmu implements View.OnClickListener {
    final /* synthetic */ aafo a;
    final /* synthetic */ mmv b;

    public mmu(mmv mmvVar, aafo aafoVar) {
        this.b = mmvVar;
        this.a = aafoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        audd auddVar = this.b.a;
        if (auddVar == null || (auddVar.b & 2) == 0) {
            return;
        }
        aafo aafoVar = this.a;
        apzg apzgVar = auddVar.d;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.c(apzgVar, null);
    }
}

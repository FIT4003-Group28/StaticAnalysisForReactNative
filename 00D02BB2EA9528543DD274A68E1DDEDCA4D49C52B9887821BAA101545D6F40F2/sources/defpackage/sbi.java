package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: sbi  reason: default package */
/* loaded from: classes7.dex */
final class sbi implements cqkn<saa> {
    final /* synthetic */ sbl a;

    public sbi(sbl sblVar) {
        this.a = sblVar;
    }

    @Override // defpackage.cqkn
    public final /* bridge */ /* synthetic */ void a(saa saaVar, View view) {
        gga ggaVar = (gga) view.getContext();
        if (ggaVar == null || !ggaVar.aZ) {
            return;
        }
        sbl sblVar = this.a;
        sblVar.a.d(sblVar.b, sblVar.f, sblVar.d, sblVar.e);
    }
}

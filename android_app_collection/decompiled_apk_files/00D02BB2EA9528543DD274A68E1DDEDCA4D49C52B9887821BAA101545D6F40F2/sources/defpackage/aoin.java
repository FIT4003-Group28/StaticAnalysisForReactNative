package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aoin  reason: default package */
/* loaded from: classes2.dex */
public final class aoin implements View.OnClickListener {
    final /* synthetic */ aoio a;
    final /* synthetic */ dcdc b;
    final /* synthetic */ int c;

    public aoin(aoio aoioVar, dcdc dcdcVar, int i) {
        this.a = aoioVar;
        this.b = dcdcVar;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aoio aoioVar = this.a;
        dcdc dcdcVar = this.b;
        int i = this.c;
        bbut bbutVar = aoioVar.a;
        ckne ckneVar = new ckne(dcdcVar);
        bbtv v = bbty.v();
        v.c(dbpy.a);
        v.d(false);
        v.e(true);
        v.g(true);
        bbutVar.o(ckneVar, i, v.a(), null);
    }
}

package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aoik  reason: default package */
/* loaded from: classes2.dex */
public final class aoik implements View.OnClickListener {
    final /* synthetic */ dbsg a;
    final /* synthetic */ dcdc b;
    final /* synthetic */ int c;

    public aoik(dbsg dbsgVar, dcdc dcdcVar, int i) {
        this.a = dbsgVar;
        this.b = dcdcVar;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dcdc dcdcVar = this.b;
        int i = this.c;
        bbut bbutVar = ((aoil) ((dbsu) this.a).a).a;
        ckne ckneVar = new ckne(dcdcVar);
        bbtv v = bbty.v();
        v.c(dbpy.a);
        v.d(false);
        v.e(true);
        v.g(true);
        bbutVar.o(ckneVar, i, v.a(), null);
    }
}

package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: askh  reason: default package */
/* loaded from: classes2.dex */
final class askh implements View.OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ askm b;

    public askh(askm askmVar, String str) {
        this.b = askmVar;
        this.a = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        askm askmVar = this.b;
        if (askmVar.am) {
            askmVar.af.i(cjtd.a(askmVar.an ? dtxw.as : dtxj.dv));
            this.b.aJ(this.a);
        }
    }
}

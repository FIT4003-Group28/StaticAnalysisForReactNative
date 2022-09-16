package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: kks  reason: default package */
/* loaded from: classes3.dex */
final class kks implements View.OnClickListener {
    final /* synthetic */ kkv a;

    public kks(kkv kkvVar) {
        this.a = kkvVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kkv kkvVar = this.a;
        kku kkuVar = kkvVar.d;
        if (kkuVar != null) {
            kkj kkjVar = (kkj) kkuVar;
            kkjVar.b.j(kkvVar.i, kkvVar.j);
            kkjVar.a(wzq.USER_SKIPPED);
        }
    }
}

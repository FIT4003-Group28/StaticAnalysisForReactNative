package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ackq  reason: default package */
/* loaded from: classes2.dex */
final class ackq implements View.OnClickListener {
    final /* synthetic */ int a;
    final /* synthetic */ acks b;

    public ackq(acks acksVar, int i) {
        this.b = acksVar;
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.b.a().o(new ckni(dcbg.b(this.b.c).s(ackp.a).z(), null), this.a, bbty.v().a(), null);
    }
}

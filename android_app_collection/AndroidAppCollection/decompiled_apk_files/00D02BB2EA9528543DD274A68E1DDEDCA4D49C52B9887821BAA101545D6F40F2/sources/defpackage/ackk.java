package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ackk  reason: default package */
/* loaded from: classes2.dex */
final class ackk implements View.OnClickListener {
    final /* synthetic */ dwfl a;
    final /* synthetic */ ackl b;

    public ackk(ackl acklVar, dwfl dwflVar) {
        this.b = acklVar;
        this.a = dwflVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.a.a().l(this.b.b, this.a, bbur.OPEN_IN_STORE_TAB);
    }
}

package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: alog  reason: default package */
/* loaded from: classes.dex */
final class alog implements View.OnClickListener {
    final /* synthetic */ View.OnClickListener a;
    final /* synthetic */ aloh b;

    public alog(aloh alohVar, View.OnClickListener onClickListener) {
        this.b = alohVar;
        this.a = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.onClick(view);
        this.b.e(1);
    }
}

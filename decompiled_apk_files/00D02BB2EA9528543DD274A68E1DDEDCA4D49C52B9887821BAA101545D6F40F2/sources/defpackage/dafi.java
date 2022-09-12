package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: dafi  reason: default package */
/* loaded from: classes5.dex */
final class dafi implements View.OnClickListener {
    final /* synthetic */ View.OnClickListener a;
    final /* synthetic */ dafk b;

    public dafi(dafk dafkVar, View.OnClickListener onClickListener) {
        this.b = dafkVar;
        this.a = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.onClick(view);
        this.b.e(1);
    }
}

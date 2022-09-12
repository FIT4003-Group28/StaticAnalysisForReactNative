package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: jdt  reason: default package */
/* loaded from: classes7.dex */
final class jdt implements View.OnClickListener {
    final /* synthetic */ View.OnClickListener a;
    final /* synthetic */ jdv b;

    public jdt(jdv jdvVar, View.OnClickListener onClickListener) {
        this.b = jdvVar;
        this.a = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.a();
        this.a.onClick(view);
    }
}

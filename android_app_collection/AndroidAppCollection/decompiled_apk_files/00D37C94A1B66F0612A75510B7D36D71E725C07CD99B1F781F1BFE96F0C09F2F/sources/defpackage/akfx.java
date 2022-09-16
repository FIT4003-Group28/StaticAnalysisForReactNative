package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: akfx  reason: default package */
/* loaded from: classes.dex */
final class akfx implements View.OnClickListener {
    final /* synthetic */ View.OnClickListener a;
    final /* synthetic */ akfl b;

    public akfx(View.OnClickListener onClickListener, akfl akflVar) {
        this.a = onClickListener;
        this.b = akflVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.a;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        this.b.b();
    }
}

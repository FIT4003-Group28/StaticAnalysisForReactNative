package defpackage;

import android.view.View;
import android.widget.EditText;
/* compiled from: PG */
/* renamed from: bgsw  reason: default package */
/* loaded from: classes3.dex */
final class bgsw implements View.OnAttachStateChangeListener {
    final /* synthetic */ bgsy a;

    public bgsw(bgsy bgsyVar) {
        this.a = bgsyVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (view instanceof EditText) {
            bgsy bgsyVar = this.a;
            bgsyVar.c = (EditText) view;
            bgsyVar.c.setImeOptions(3);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        jmw.d(this.a.a, null);
        this.a.c = null;
    }
}

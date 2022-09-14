package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: cvve  reason: default package */
/* loaded from: classes5.dex */
final class cvve implements View.OnAttachStateChangeListener {
    final /* synthetic */ Drawable a;
    final /* synthetic */ boolean b;
    final /* synthetic */ cvvf c;

    public cvve(cvvf cvvfVar, Drawable drawable, boolean z) {
        this.c = cvvfVar;
        this.a = drawable;
        this.b = z;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        cvvf cvvfVar = this.c;
        Drawable drawable = this.a;
        czhz.b();
        ImageView imageView = cvvfVar.a.get();
        if (!cvvfVar.d && imageView != null) {
            imageView.setImageDrawable(drawable);
        }
        if (this.b) {
            this.c.d();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}

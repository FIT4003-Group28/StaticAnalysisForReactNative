package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: ukg  reason: default package */
/* loaded from: classes4.dex */
final class ukg implements View.OnAttachStateChangeListener {
    final /* synthetic */ Drawable a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ukh c;

    public ukg(ukh ukhVar, Drawable drawable, boolean z) {
        this.c = ukhVar;
        this.a = drawable;
        this.b = z;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        ukh ukhVar = this.c;
        Drawable drawable = this.a;
        uwp.f();
        ImageView imageView = (ImageView) ukhVar.a.get();
        if (!ukhVar.d && imageView != null) {
            imageView.setImageDrawable(drawable);
        }
        if (this.b) {
            this.c.b();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}

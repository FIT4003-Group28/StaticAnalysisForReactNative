package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: zmd  reason: default package */
/* loaded from: classes4.dex */
final class zmd extends Animatable2.AnimationCallback {
    final /* synthetic */ ImageView a;
    final /* synthetic */ int b;
    final /* synthetic */ zmf c;

    public zmd(zmf zmfVar, ImageView imageView, int i) {
        this.c = zmfVar;
        this.a = imageView;
        this.b = i;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.a.setImageDrawable(this.c.b.getResources().getDrawable(this.b));
    }
}

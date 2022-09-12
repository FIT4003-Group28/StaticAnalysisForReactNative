package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: azt  reason: default package */
/* loaded from: classes3.dex */
final class azt extends Animatable2.AnimationCallback {
    final /* synthetic */ azu a;

    public azt(azu azuVar) {
        this.a = azuVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.a.b();
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.a.c();
    }
}

package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: bok  reason: default package */
/* loaded from: classes2.dex */
public final class bok extends Animatable2.AnimationCallback {
    final /* synthetic */ bol a;

    public bok(bol bolVar) {
        this.a = bolVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.a.a();
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
    }
}

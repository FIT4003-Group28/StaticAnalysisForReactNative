package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
/* compiled from: PG */
/* renamed from: eez  reason: default package */
/* loaded from: classes6.dex */
final class eez extends Animation {
    private final int a;
    private final int b;
    private final View c;

    public eez(View view, int i, int i2) {
        this.c = view;
        this.a = i;
        this.b = i2 - i;
        setDuration(300L);
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        this.c.getLayoutParams().height = Math.round(this.a + (this.b * f));
        this.c.requestLayout();
    }

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }
}

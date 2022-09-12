package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
/* compiled from: PG */
/* renamed from: coj  reason: default package */
/* loaded from: classes5.dex */
final class coj extends Animation {
    public float a;

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        super.applyTransformation(f, transformation);
        transformation.getMatrix().setTranslate(0.0f, this.a);
    }
}

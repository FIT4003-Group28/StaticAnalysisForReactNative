package defpackage;

import android.animation.TypeEvaluator;
import android.graphics.RectF;
/* compiled from: PG */
/* renamed from: cwqn  reason: default package */
/* loaded from: classes5.dex */
public final class cwqn implements TypeEvaluator<RectF> {
    private final RectF a;

    public cwqn(RectF rectF) {
        this.a = rectF;
    }

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ RectF evaluate(float f, RectF rectF, RectF rectF2) {
        RectF rectF3 = rectF;
        RectF rectF4 = rectF2;
        this.a.top = rectF3.top + ((rectF4.top - rectF3.top) * f);
        this.a.left = rectF3.left + ((rectF4.left - rectF3.left) * f);
        this.a.right = rectF3.right + ((rectF4.right - rectF3.right) * f);
        this.a.bottom = rectF3.bottom + (f * (rectF4.bottom - rectF3.bottom));
        return this.a;
    }
}

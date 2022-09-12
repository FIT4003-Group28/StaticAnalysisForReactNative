package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
/* compiled from: PG */
/* renamed from: awt  reason: default package */
/* loaded from: classes3.dex */
final class awt extends Animation {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ axb c;

    public awt(axb axbVar, int i, int i2) {
        this.c = axbVar;
        this.a = i;
        this.b = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        awp awpVar = this.c.k;
        int i = this.a;
        awpVar.setAlpha((int) (i + ((this.b - i) * f)));
    }
}

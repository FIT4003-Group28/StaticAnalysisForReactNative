package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
/* compiled from: PG */
/* renamed from: awv  reason: default package */
/* loaded from: classes3.dex */
final class awv extends Animation {
    final /* synthetic */ axb a;

    public awv(axb axbVar) {
        this.a = axbVar;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i;
        axb axbVar = this.a;
        if (!axbVar.m) {
            i = axbVar.i - Math.abs(axbVar.h);
        } else {
            i = axbVar.i;
        }
        axb axbVar2 = this.a;
        int i2 = axbVar2.f;
        this.a.l((i2 + ((int) ((i - i2) * f))) - axbVar2.e.getTop());
        this.a.k.c(1.0f - f);
    }
}

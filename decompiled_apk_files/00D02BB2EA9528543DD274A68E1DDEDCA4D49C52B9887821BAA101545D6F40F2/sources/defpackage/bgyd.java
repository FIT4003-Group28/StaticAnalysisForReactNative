package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
/* compiled from: PG */
/* renamed from: bgyd  reason: default package */
/* loaded from: classes3.dex */
final class bgyd extends Animation {
    final /* synthetic */ int a;
    final /* synthetic */ View b;
    final /* synthetic */ bgyf c;

    public bgyd(bgyf bgyfVar, int i, View view) {
        this.c = bgyfVar;
        this.a = i;
        this.b = view;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        int i = (int) (this.a * f);
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        bgyf bgyfVar = this.c;
        int i2 = bgyf.d;
        if (bgyfVar.b != bgye.EXPAND) {
            i = this.a - i;
        }
        layoutParams.height = i;
        this.b.setLayoutParams(layoutParams);
    }
}

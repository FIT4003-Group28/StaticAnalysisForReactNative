package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfc  reason: default package */
/* loaded from: classes2.dex */
public final class bfc extends Animation {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ View c;

    public bfc(int i, int i2, View view) {
        this.a = i;
        this.b = i2;
        this.c = view;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        int i = this.a;
        bfl.n(this.c, i - ((int) ((i - this.b) * f)));
    }
}

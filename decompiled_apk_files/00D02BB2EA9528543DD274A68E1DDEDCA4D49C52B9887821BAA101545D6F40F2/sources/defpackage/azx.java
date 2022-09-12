package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: azx  reason: default package */
/* loaded from: classes.dex */
public final class azx extends Drawable.ConstantState {
    int a;
    bam b;
    public AnimatorSet c;
    ArrayList<Animator> d;
    aif<Animator, String> e;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}

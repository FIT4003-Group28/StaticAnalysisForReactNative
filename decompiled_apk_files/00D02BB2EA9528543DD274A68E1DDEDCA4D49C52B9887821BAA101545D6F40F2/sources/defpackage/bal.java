package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
/* compiled from: PG */
/* renamed from: bal  reason: default package */
/* loaded from: classes.dex */
final class bal extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public bal(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        bam bamVar = new bam();
        bamVar.e = (VectorDrawable) this.a.newDrawable();
        return bamVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        bam bamVar = new bam();
        bamVar.e = (VectorDrawable) this.a.newDrawable(resources);
        return bamVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        bam bamVar = new bam();
        bamVar.e = (VectorDrawable) this.a.newDrawable(resources, theme);
        return bamVar;
    }
}

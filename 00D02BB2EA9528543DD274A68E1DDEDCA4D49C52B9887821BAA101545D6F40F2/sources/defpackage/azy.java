package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azy  reason: default package */
/* loaded from: classes.dex */
public final class azy extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public azy(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        azz azzVar = new azz();
        azzVar.e = this.a.newDrawable();
        azzVar.e.setCallback(azzVar.d);
        return azzVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        azz azzVar = new azz();
        azzVar.e = this.a.newDrawable(resources);
        azzVar.e.setCallback(azzVar.d);
        return azzVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        azz azzVar = new azz();
        azzVar.e = this.a.newDrawable(resources, theme);
        azzVar.e.setCallback(azzVar.d);
        return azzVar;
    }
}

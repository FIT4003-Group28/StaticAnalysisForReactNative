package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
/* compiled from: PG */
/* renamed from: bpa  reason: default package */
/* loaded from: classes2.dex */
final class bpa extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public bpa(Drawable.ConstantState constantState) {
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
        bpb bpbVar = new bpb();
        bpbVar.e = (VectorDrawable) this.a.newDrawable();
        return bpbVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        bpb bpbVar = new bpb();
        bpbVar.e = (VectorDrawable) this.a.newDrawable(resources);
        return bpbVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        bpb bpbVar = new bpb();
        bpbVar.e = (VectorDrawable) this.a.newDrawable(resources, theme);
        return bpbVar;
    }
}

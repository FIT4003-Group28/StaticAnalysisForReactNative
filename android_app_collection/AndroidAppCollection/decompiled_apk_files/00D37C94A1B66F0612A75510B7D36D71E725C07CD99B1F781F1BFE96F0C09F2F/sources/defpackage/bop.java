package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bop  reason: default package */
/* loaded from: classes2.dex */
public final class bop extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public bop(Drawable.ConstantState constantState) {
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
        boq boqVar = new boq();
        boqVar.e = this.a.newDrawable();
        boqVar.e.setCallback(boqVar.d);
        return boqVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        boq boqVar = new boq();
        boqVar.e = this.a.newDrawable(resources);
        boqVar.e.setCallback(boqVar.d);
        return boqVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        boq boqVar = new boq();
        boqVar.e = this.a.newDrawable(resources, theme);
        boqVar.e.setCallback(boqVar.d);
        return boqVar;
    }
}

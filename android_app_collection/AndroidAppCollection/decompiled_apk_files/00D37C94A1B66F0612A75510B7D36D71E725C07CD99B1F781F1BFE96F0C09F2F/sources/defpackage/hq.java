package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: hq  reason: default package */
/* loaded from: classes3.dex */
final class hq extends Drawable.ConstantState {
    int a;
    Drawable.ConstantState b;
    ColorStateList c;
    PorterDuff.Mode d;

    public hq(hq hqVar) {
        this.c = null;
        this.d = ho.a;
        if (hqVar != null) {
            this.a = hqVar.a;
            this.b = hqVar.b;
            this.c = hqVar.c;
            this.d = hqVar.d;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i = this.a;
        Drawable.ConstantState constantState = this.b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new hp(this, resources);
    }
}

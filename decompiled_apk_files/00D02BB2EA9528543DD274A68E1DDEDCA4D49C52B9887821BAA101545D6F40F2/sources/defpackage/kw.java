package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kw  reason: default package */
/* loaded from: classes.dex */
public final class kw extends Drawable.ConstantState {
    int a;
    Drawable.ConstantState b;
    ColorStateList c;
    PorterDuff.Mode d;

    public kw(kw kwVar) {
        this.c = null;
        this.d = ku.a;
        if (kwVar != null) {
            this.a = kwVar.a;
            this.b = kwVar.b;
            this.c = kwVar.c;
            this.d = kwVar.d;
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
        return new kv(this, resources);
    }
}

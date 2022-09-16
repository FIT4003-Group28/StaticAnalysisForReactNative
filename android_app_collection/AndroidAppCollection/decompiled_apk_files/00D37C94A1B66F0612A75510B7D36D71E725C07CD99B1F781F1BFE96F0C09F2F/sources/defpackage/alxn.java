package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
/* compiled from: PG */
/* renamed from: alxn  reason: default package */
/* loaded from: classes.dex */
public final class alxn extends LayerDrawable {
    public ColorStateList a;

    public alxn(Drawable drawable) {
        super(new Drawable[]{drawable});
        this.a = null;
    }

    public static alxn a(Drawable drawable) {
        if (drawable instanceof alxn) {
            return (alxn) drawable;
        }
        return new alxn(drawable.mutate());
    }

    public final boolean b() {
        ColorStateList colorStateList = this.a;
        if (colorStateList != null) {
            setColorFilter(colorStateList.getColorForState(getState(), 0), PorterDuff.Mode.SRC_IN);
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        return super.setState(iArr) || b();
    }
}

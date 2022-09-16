package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: cqq  reason: default package */
/* loaded from: classes3.dex */
public abstract class cqq implements cku, ckr {
    protected final Drawable a;

    public cqq(Drawable drawable) {
        hy.N(drawable);
        this.a = drawable;
    }

    @Override // defpackage.ckr
    public void d() {
        Drawable drawable = this.a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (!(drawable instanceof cqy)) {
        } else {
            ((cqy) drawable).a().prepareToDraw();
        }
    }

    @Override // defpackage.cku
    /* renamed from: f */
    public final Drawable c() {
        Drawable.ConstantState constantState = this.a.getConstantState();
        return constantState == null ? this.a : constantState.newDrawable();
    }
}

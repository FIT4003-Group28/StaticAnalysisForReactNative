package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: ceu  reason: default package */
/* loaded from: classes4.dex */
public abstract class ceu<T extends Drawable> implements bxd, bwy {
    protected final T a;

    public ceu(T t) {
        cjn.b(t);
        this.a = t;
    }

    @Override // defpackage.bxd
    public final /* bridge */ /* synthetic */ Object b() {
        Drawable.ConstantState constantState = this.a.getConstantState();
        return constantState == null ? this.a : constantState.newDrawable();
    }

    @Override // defpackage.bwy
    public void e() {
        T t = this.a;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (!(t instanceof cfg)) {
        } else {
            ((cfg) t).a().prepareToDraw();
        }
    }
}

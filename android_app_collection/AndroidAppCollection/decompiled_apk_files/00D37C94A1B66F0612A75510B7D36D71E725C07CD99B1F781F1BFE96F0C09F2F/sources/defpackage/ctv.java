package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: ctv  reason: default package */
/* loaded from: classes3.dex */
public abstract class ctv extends cuc implements cuf {
    private Animatable c;

    public ctv(ImageView imageView) {
        super(imageView);
    }

    private final void p(Object obj) {
        i(obj);
        if (!(obj instanceof Animatable)) {
            this.c = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.c = animatable;
        animatable.start();
    }

    @Override // defpackage.ctq, defpackage.ctz
    public void a(Drawable drawable) {
        this.b.c();
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
        p(null);
        j(drawable);
    }

    @Override // defpackage.ctz
    public void b(Object obj, cug cugVar) {
        if (cugVar != null) {
            cugVar.a(this);
        }
        p(obj);
    }

    @Override // defpackage.ctq, defpackage.ctz
    public void e(Drawable drawable) {
        p(null);
        j(drawable);
    }

    @Override // defpackage.ctq, defpackage.ctz
    public void f(Drawable drawable) {
        p(null);
        j(drawable);
    }

    protected abstract void i(Object obj);

    public final void j(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // defpackage.ctq, defpackage.cse
    public final void l() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.ctq, defpackage.cse
    public final void m() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
    }
}

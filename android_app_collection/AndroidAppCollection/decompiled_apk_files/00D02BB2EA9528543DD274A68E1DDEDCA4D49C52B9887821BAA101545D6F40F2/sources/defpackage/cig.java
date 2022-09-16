package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: cig  reason: default package */
/* loaded from: classes.dex */
public abstract class cig<Z> extends cim<ImageView, Z> implements cis {
    private Animatable c;

    public cig(ImageView imageView) {
        super(imageView);
    }

    private final void o(Z z) {
        l(z);
        p(z);
    }

    private final void p(Z z) {
        if (!(z instanceof Animatable)) {
            this.c = null;
            return;
        }
        Animatable animatable = (Animatable) z;
        this.c = animatable;
        animatable.start();
    }

    @Override // defpackage.chz, defpackage.cij
    public final void a(Drawable drawable) {
        o(null);
        n(drawable);
    }

    @Override // defpackage.cij
    public final void b(Z z, cit<? super Z> citVar) {
        if (citVar == null || !citVar.a(z, this)) {
            o(z);
        } else {
            p(z);
        }
    }

    @Override // defpackage.chz, defpackage.cij
    public final void c(Drawable drawable) {
        this.b.a();
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
        o(null);
        n(drawable);
    }

    @Override // defpackage.chz, defpackage.cgp
    public final void d() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.chz, defpackage.cgp
    public final void e() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // defpackage.chz, defpackage.cij
    public void k(Drawable drawable) {
        o(null);
        n(drawable);
    }

    protected abstract void l(Z z);

    @Override // defpackage.cis
    public final Drawable m() {
        return ((ImageView) this.a).getDrawable();
    }

    @Override // defpackage.cis
    public final void n(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }
}

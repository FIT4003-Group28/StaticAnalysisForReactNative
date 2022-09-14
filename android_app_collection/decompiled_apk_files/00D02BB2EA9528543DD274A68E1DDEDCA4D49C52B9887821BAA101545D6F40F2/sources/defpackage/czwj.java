package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
/* compiled from: PG */
/* renamed from: czwj  reason: default package */
/* loaded from: classes.dex */
public final class czwj {
    public final MaterialButton a;
    public dadx b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public boolean n = false;
    public boolean o = false;
    public boolean p;
    public int q;
    private LayerDrawable r;

    public czwj(MaterialButton materialButton, dadx dadxVar) {
        this.a = materialButton;
        this.b = dadxVar;
    }

    private final dadr h(boolean z) {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (dadr) ((LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    private final dadr i() {
        return h(true);
    }

    public final void a() {
        MaterialButton materialButton = this.a;
        dadr dadrVar = new dadr(this.b);
        dadrVar.W(this.a.getContext());
        dadrVar.setTintList(this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            dadrVar.setTintMode(mode);
        }
        dadrVar.T(this.h, this.k);
        dadr dadrVar2 = new dadr(this.b);
        dadrVar2.setTint(0);
        dadrVar2.S(this.h, 0);
        dadr dadrVar3 = new dadr(this.b);
        this.m = dadrVar3;
        dadrVar3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(dadg.a(this.l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{dadrVar2, dadrVar}), this.c, this.e, this.d, this.f), this.m);
        this.r = rippleDrawable;
        materialButton.c(rippleDrawable);
        dadr d = d();
        if (d != null) {
            d.aa(this.q);
        }
    }

    public final void b() {
        this.n = true;
        this.a.setSupportBackgroundTintList(this.j);
        this.a.setSupportBackgroundTintMode(this.i);
    }

    public final void c() {
        dadr d = d();
        dadr i = i();
        if (d != null) {
            d.T(this.h, this.k);
            if (i == null) {
                return;
            }
            i.S(this.h, 0);
        }
    }

    public final dadr d() {
        return h(false);
    }

    public final daei e() {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.r.getNumberOfLayers() > 2) {
            return (daei) this.r.getDrawable(2);
        }
        return (daei) this.r.getDrawable(1);
    }

    public final void f(dadx dadxVar) {
        this.b = dadxVar;
        if (d() != null) {
            d().setShapeAppearanceModel(dadxVar);
        }
        if (i() != null) {
            i().setShapeAppearanceModel(dadxVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(dadxVar);
        }
    }

    public final void g(int i, int i2) {
        int w = od.w(this.a);
        int paddingTop = this.a.getPaddingTop();
        int x = od.x(this.a);
        int paddingBottom = this.a.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.n) {
            a();
        }
        od.y(this.a, w, (paddingTop + i) - i3, x, (paddingBottom + i2) - i4);
    }
}

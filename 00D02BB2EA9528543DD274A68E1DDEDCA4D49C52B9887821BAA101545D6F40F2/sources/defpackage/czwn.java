package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import com.google.android.apps.maps.R;
import com.google.android.material.card.MaterialCardView;
/* compiled from: PG */
/* renamed from: czwn  reason: default package */
/* loaded from: classes.dex */
public final class czwn {
    private static final int[] s = {16842912};
    private static final double t = Math.cos(Math.toRadians(45.0d));
    public final MaterialCardView a;
    public final dadr c;
    public final dadr d;
    public int e;
    public int f;
    public int g;
    public Drawable h;
    public Drawable i;
    public ColorStateList j;
    public ColorStateList k;
    public dadx l;
    public ColorStateList m;
    public Drawable n;
    public LayerDrawable o;
    public dadr p;
    public boolean r;
    public final Rect b = new Rect();
    public boolean q = false;

    public czwn(MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
        this.a = materialCardView;
        dadr dadrVar = new dadr(materialCardView.getContext(), attributeSet, i, 2132018731);
        this.c = dadrVar;
        dadrVar.W(materialCardView.getContext());
        dadrVar.am();
        dadw e = dadrVar.P().e();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, czwo.a, i, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            e.i(obtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.d = new dadr();
        k(e.b());
        obtainStyledAttributes.recycle();
    }

    private final boolean s() {
        return this.c.al();
    }

    private final float t() {
        return Math.max(Math.max(v(this.l.b, this.c.ah()), v(this.l.c, this.c.ai())), Math.max(v(this.l.d, this.c.ak()), v(this.l.e, this.c.aj())));
    }

    private final Drawable u() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = this.i;
        if (drawable != null) {
            stateListDrawable.addState(s, drawable);
        }
        return stateListDrawable;
    }

    private static final float v(dadl dadlVar, float f) {
        if (dadlVar instanceof dadv) {
            double d = f;
            Double.isNaN(d);
            return (float) ((1.0d - t) * d);
        } else if (!(dadlVar instanceof dadm)) {
            return 0.0f;
        } else {
            return f / 2.0f;
        }
    }

    public final void a(ColorStateList colorStateList) {
        if (this.m == colorStateList) {
            return;
        }
        this.m = colorStateList;
        g();
    }

    public final void b(ColorStateList colorStateList) {
        this.c.Q(colorStateList);
    }

    public final void c(ColorStateList colorStateList) {
        dadr dadrVar = this.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        dadrVar.Q(colorStateList);
    }

    public final void d(int i, int i2, int i3, int i4) {
        this.b.set(i, i2, i3, i4);
        h();
    }

    public final void e() {
        this.c.aa(this.a.f.b.getElevation());
    }

    public final void f() {
        if (!this.q) {
            this.a.i(l(this.c));
        }
        this.a.setForeground(l(this.h));
    }

    public final void g() {
        this.d.T(this.g, this.m);
    }

    public final void h() {
        float e;
        float f = 0.0f;
        float t2 = (o() || p()) ? t() : 0.0f;
        MaterialCardView materialCardView = this.a;
        if (materialCardView.b && materialCardView.a) {
            double d = 1.0d - t;
            e = super/*androidx.cardview.widget.CardView*/.e();
            double d2 = e;
            Double.isNaN(d2);
            f = (float) (d * d2);
        }
        int i = (int) (t2 - f);
        this.a.h(this.b.left + i, this.b.top + i, this.b.right + i, this.b.bottom + i);
    }

    public final void i(ColorStateList colorStateList) {
        this.j = colorStateList;
        r();
    }

    public final void j(Drawable drawable) {
        this.i = drawable;
        if (drawable != null) {
            Drawable b = ks.b(drawable.mutate());
            this.i = b;
            b.setTintList(this.k);
        }
        if (this.o != null) {
            this.o.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, u());
        }
    }

    public final void k(dadx dadxVar) {
        this.l = dadxVar;
        this.c.setShapeAppearanceModel(dadxVar);
        dadr dadrVar = this.c;
        dadrVar.B = !dadrVar.al();
        this.d.setShapeAppearanceModel(dadxVar);
        dadr dadrVar2 = this.p;
        if (dadrVar2 != null) {
            dadrVar2.setShapeAppearanceModel(dadxVar);
        }
    }

    public final Drawable l(Drawable drawable) {
        int i;
        int i2;
        if (this.a.a) {
            int ceil = (int) Math.ceil(m());
            i = (int) Math.ceil(n());
            i2 = ceil;
        } else {
            i = 0;
            i2 = 0;
        }
        return new czwm(drawable, i, i2, i, i2);
    }

    public final float m() {
        return (this.a.f() * 1.5f) + (p() ? t() : 0.0f);
    }

    public final float n() {
        return this.a.f() + (p() ? t() : 0.0f);
    }

    public final boolean o() {
        return this.a.b && !s();
    }

    public final boolean p() {
        return this.a.b && s() && this.a.a;
    }

    public final Drawable q() {
        if (this.n == null) {
            int[] iArr = dadg.a;
            this.p = new dadr(this.l);
            this.n = new RippleDrawable(this.j, null, this.p);
        }
        if (this.o == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.n, this.d, u()});
            this.o = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.o;
    }

    public final void r() {
        int[] iArr = dadg.a;
        Drawable drawable = this.n;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(this.j);
        }
    }
}

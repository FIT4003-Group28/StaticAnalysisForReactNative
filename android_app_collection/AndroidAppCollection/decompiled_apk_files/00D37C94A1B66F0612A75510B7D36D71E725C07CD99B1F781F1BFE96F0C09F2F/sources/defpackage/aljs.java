package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.material.button.MaterialButton;
/* compiled from: PG */
/* renamed from: aljs  reason: default package */
/* loaded from: classes.dex */
public final class aljs {
    public final MaterialButton a;
    public alnc b;
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
    public boolean o;
    public LayerDrawable p;
    public int q;

    public aljs(MaterialButton materialButton, alnc alncVar) {
        this.a = materialButton;
        this.b = alncVar;
    }

    private final almx e(boolean z) {
        LayerDrawable layerDrawable = this.p;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (almx) ((LayerDrawable) ((InsetDrawable) this.p.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    private final almx f() {
        return e(true);
    }

    public final almx a() {
        return e(false);
    }

    public final alnn b() {
        LayerDrawable layerDrawable = this.p;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.p.getNumberOfLayers() > 2) {
            return (alnn) this.p.getDrawable(2);
        }
        return (alnn) this.p.getDrawable(1);
    }

    public final void c() {
        this.n = true;
        this.a.setSupportBackgroundTintList(this.j);
        this.a.setSupportBackgroundTintMode(this.i);
    }

    public final void d(alnc alncVar) {
        this.b = alncVar;
        if (a() != null) {
            a().b(alncVar);
        }
        if (f() != null) {
            f().b(alncVar);
        }
        if (b() != null) {
            b().b(alncVar);
        }
    }
}

package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: xx  reason: default package */
/* loaded from: classes4.dex */
public class xx extends ViewGroup.MarginLayoutParams {
    public yo c;
    public final Rect d;
    public boolean e;
    boolean f;

    public xx(int i, int i2) {
        super(i, i2);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public final int qa() {
        return this.c.c();
    }

    public final boolean qb() {
        return this.c.y();
    }

    public final boolean qc() {
        return this.c.v();
    }

    public xx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public xx(xx xxVar) {
        super((ViewGroup.LayoutParams) xxVar);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public xx(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public xx(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }
}

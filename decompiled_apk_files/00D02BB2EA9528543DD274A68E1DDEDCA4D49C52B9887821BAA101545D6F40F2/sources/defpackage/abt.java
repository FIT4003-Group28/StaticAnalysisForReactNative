package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: abt  reason: default package */
/* loaded from: classes.dex */
public class abt extends ViewGroup.MarginLayoutParams {
    public acl c;
    public final Rect d;
    public boolean e;
    boolean f;

    public abt(int i, int i2) {
        super(i, i2);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public final boolean RU() {
        return this.c.p();
    }

    public final boolean RV() {
        return this.c.B();
    }

    public final int RW() {
        return this.c.d();
    }

    public abt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public abt(abt abtVar) {
        super((ViewGroup.LayoutParams) abtVar);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public abt(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public abt(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }
}

package defpackage;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: dadq  reason: default package */
/* loaded from: classes.dex */
public final class dadq extends Drawable.ConstantState {
    public dadx a;
    public czyv b;
    public ColorFilter c;
    public ColorStateList d;
    public ColorStateList e;
    public ColorStateList f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public Rect i;
    public float j;
    public float k;
    public float l;
    public int m;
    public float n;
    public float o;
    public float p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public Paint.Style v;

    public dadq(dadq dadqVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = 255;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint.Style.FILL_AND_STROKE;
        this.a = dadqVar.a;
        this.b = dadqVar.b;
        this.l = dadqVar.l;
        this.c = dadqVar.c;
        this.d = dadqVar.d;
        this.e = dadqVar.e;
        this.h = dadqVar.h;
        this.g = dadqVar.g;
        this.m = dadqVar.m;
        this.j = dadqVar.j;
        this.s = dadqVar.s;
        int i = dadqVar.q;
        this.q = 0;
        boolean z = dadqVar.u;
        this.u = false;
        this.k = dadqVar.k;
        this.n = dadqVar.n;
        this.o = dadqVar.o;
        float f = dadqVar.p;
        this.p = 0.0f;
        this.r = dadqVar.r;
        this.t = dadqVar.t;
        ColorStateList colorStateList = dadqVar.f;
        this.f = null;
        this.v = dadqVar.v;
        Rect rect = dadqVar.i;
        if (rect != null) {
            this.i = new Rect(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        dadr dadrVar = new dadr(this);
        dadrVar.A = true;
        return dadrVar;
    }

    public dadq(dadx dadxVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = 255;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint.Style.FILL_AND_STROKE;
        this.a = dadxVar;
        this.b = null;
    }
}

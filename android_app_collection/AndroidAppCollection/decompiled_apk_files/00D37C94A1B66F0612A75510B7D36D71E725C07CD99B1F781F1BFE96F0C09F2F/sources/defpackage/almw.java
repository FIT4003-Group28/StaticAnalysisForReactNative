package defpackage;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: almw  reason: default package */
/* loaded from: classes.dex */
public final class almw extends Drawable.ConstantState {
    public alnc a;
    public aljw b;
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

    public almw(almw almwVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = PrivateKeyType.INVALID;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint.Style.FILL_AND_STROKE;
        this.a = almwVar.a;
        this.b = almwVar.b;
        this.l = almwVar.l;
        this.c = almwVar.c;
        this.d = almwVar.d;
        this.e = almwVar.e;
        this.h = almwVar.h;
        this.g = almwVar.g;
        this.m = almwVar.m;
        this.j = almwVar.j;
        this.s = almwVar.s;
        this.q = almwVar.q;
        boolean z = almwVar.u;
        this.u = false;
        this.k = almwVar.k;
        this.n = almwVar.n;
        this.o = almwVar.o;
        float f = almwVar.p;
        this.p = 0.0f;
        this.r = almwVar.r;
        this.t = almwVar.t;
        ColorStateList colorStateList = almwVar.f;
        this.f = null;
        this.v = almwVar.v;
        Rect rect = almwVar.i;
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
        almx almxVar = new almx(this);
        almxVar.e = true;
        return almxVar;
    }

    public almw(alnc alncVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = PrivateKeyType.INVALID;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint.Style.FILL_AND_STROKE;
        this.a = alncVar;
        this.b = null;
    }
}

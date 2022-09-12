package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;
/* compiled from: PG */
/* renamed from: cmfv  reason: default package */
/* loaded from: classes5.dex */
public final class cmfv {
    public CharSequence a;
    public Bitmap b;
    public Layout.Alignment c;
    public int d;
    public float e;
    public int f;
    public int g;
    public float h;
    public float i;
    public float j;
    public boolean k;
    public int l;
    public int m;
    private float n;
    private int o;

    public cmfv() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.n = -3.4028235E38f;
        this.o = Integer.MIN_VALUE;
        this.d = Integer.MIN_VALUE;
        this.e = -3.4028235E38f;
        this.f = Integer.MIN_VALUE;
        this.g = Integer.MIN_VALUE;
        this.h = -3.4028235E38f;
        this.i = -3.4028235E38f;
        this.j = -3.4028235E38f;
        this.k = false;
        this.l = -16777216;
        this.m = Integer.MIN_VALUE;
    }

    public cmfv(cmfw cmfwVar) {
        this.a = cmfwVar.b;
        this.b = cmfwVar.d;
        this.c = cmfwVar.c;
        this.n = cmfwVar.e;
        this.o = cmfwVar.f;
        this.d = cmfwVar.g;
        this.e = cmfwVar.h;
        this.f = cmfwVar.i;
        this.g = cmfwVar.n;
        this.h = cmfwVar.o;
        this.i = cmfwVar.j;
        this.j = cmfwVar.k;
        this.k = cmfwVar.l;
        this.l = cmfwVar.m;
        this.m = cmfwVar.p;
    }

    public final cmfw a() {
        return new cmfw(this.a, this.c, this.b, this.n, this.o, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
    }

    public final void b(float f, int i) {
        this.n = f;
        this.o = i;
    }
}

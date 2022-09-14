package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
/* compiled from: PG */
/* renamed from: bkz  reason: default package */
/* loaded from: classes3.dex */
public final class bkz extends bki {
    private final bnl c;
    private final String d;
    private final boolean e;
    private final blc<Integer, Integer> f;
    private blc<ColorFilter, ColorFilter> g;

    public bkz(bjr bjrVar, bnl bnlVar, bni bniVar) {
        super(bjrVar, bnlVar, bng.b(bniVar.i), bnh.b(bniVar.j), bniVar.g, bniVar.e, bniVar.f, bniVar.c, bniVar.b);
        this.c = bnlVar;
        this.d = bniVar.a;
        this.e = bniVar.h;
        blc<Integer, Integer> a = bniVar.d.a();
        this.f = a;
        a.a(this);
        bnlVar.i(a);
    }

    @Override // defpackage.bki, defpackage.bkm
    public final void c(Canvas canvas, Matrix matrix, int i) {
        if (this.e) {
            return;
        }
        this.b.setColor(((bld) this.f).k());
        blc<ColorFilter, ColorFilter> blcVar = this.g;
        if (blcVar != null) {
            this.b.setColorFilter(blcVar.h());
        }
        super.c(canvas, matrix, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bki, defpackage.blz
    public final <T> void f(T t, bpv<T> bpvVar) {
        super.f(t, bpvVar);
        if (t == bjv.b) {
            this.f.d = bpvVar;
        } else if (t != bjv.B) {
        } else {
            blr blrVar = new blr(bpvVar);
            this.g = blrVar;
            blrVar.a(this);
            this.c.i(this.f);
        }
    }

    @Override // defpackage.bkk
    public final String g() {
        return this.d;
    }
}

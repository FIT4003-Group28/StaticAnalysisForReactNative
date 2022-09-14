package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
/* compiled from: PG */
/* renamed from: bkn  reason: default package */
/* loaded from: classes3.dex */
public final class bkn implements bku, blb, bks {
    private final String b;
    private final bjr c;
    private final blc<?, PointF> d;
    private final blc<?, PointF> e;
    private final bmr f;
    private boolean h;
    private final Path a = new Path();
    private final bkj g = new bkj();

    public bkn(bjr bjrVar, bnl bnlVar, bmr bmrVar) {
        this.b = bmrVar.a;
        this.c = bjrVar;
        blc<PointF, PointF> a = bmrVar.c.a();
        this.d = a;
        blc<PointF, PointF> a2 = bmrVar.b.a();
        this.e = a2;
        this.f = bmrVar;
        bnlVar.i(a);
        bnlVar.i(a2);
        a.a(this);
        a2.a(this);
    }

    @Override // defpackage.blb
    public final void a() {
        this.h = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.bkk
    public final void b(List<bkk> list, List<bkk> list2) {
        for (int i = 0; i < list.size(); i++) {
            bkk bkkVar = list.get(i);
            if (bkkVar instanceof bla) {
                bla blaVar = (bla) bkkVar;
                if (blaVar.e == 1) {
                    this.g.a(blaVar);
                    blaVar.c(this);
                }
            }
        }
    }

    @Override // defpackage.blz
    public final void e(bly blyVar, int i, List<bly> list, bly blyVar2) {
        bpr.i(blyVar, i, list, blyVar2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.blz
    public final <T> void f(T t, bpv<T> bpvVar) {
        blc<?, PointF> blcVar;
        if (t == bjv.g) {
            blcVar = this.d;
        } else if (t != bjv.j) {
            return;
        } else {
            blcVar = this.e;
        }
        blcVar.d = bpvVar;
    }

    @Override // defpackage.bkk
    public final String g() {
        return this.b;
    }

    @Override // defpackage.bku
    public final Path j() {
        if (this.h) {
            return this.a;
        }
        this.a.reset();
        if (this.f.e) {
            this.h = true;
            return this.a;
        }
        PointF h = this.d.h();
        float f = h.x / 2.0f;
        float f2 = h.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.a.reset();
        if (this.f.d) {
            float f5 = -f2;
            this.a.moveTo(0.0f, f5);
            float f6 = -f3;
            float f7 = -f;
            float f8 = -f4;
            this.a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.a.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.a.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.a.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = -f4;
            this.a.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.a.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = -f3;
            float f16 = -f;
            this.a.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.a.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF h2 = this.e.h();
        this.a.offset(h2.x, h2.y);
        this.a.close();
        this.g.b(this.a);
        this.h = true;
        return this.a;
    }
}

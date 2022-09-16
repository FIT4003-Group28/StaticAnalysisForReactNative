package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;
/* compiled from: PG */
/* renamed from: bkw  reason: default package */
/* loaded from: classes3.dex */
public final class bkw implements blb, bks, bku {
    private final String c;
    private final boolean d;
    private final bjr e;
    private final blc<?, PointF> f;
    private final blc<?, PointF> g;
    private final blc<?, Float> h;
    private boolean j;
    private final Path a = new Path();
    private final RectF b = new RectF();
    private final bkj i = new bkj();

    public bkw(bjr bjrVar, bnl bnlVar, bna bnaVar) {
        this.c = bnaVar.a;
        this.d = bnaVar.e;
        this.e = bjrVar;
        blc<PointF, PointF> a = bnaVar.b.a();
        this.f = a;
        blc<PointF, PointF> a2 = bnaVar.c.a();
        this.g = a2;
        blc<Float, Float> a3 = bnaVar.d.a();
        this.h = a3;
        bnlVar.i(a);
        bnlVar.i(a2);
        bnlVar.i(a3);
        a.a(this);
        a2.a(this);
        a3.a(this);
    }

    @Override // defpackage.blb
    public final void a() {
        this.j = false;
        this.e.invalidateSelf();
    }

    @Override // defpackage.bkk
    public final void b(List<bkk> list, List<bkk> list2) {
        for (int i = 0; i < list.size(); i++) {
            bkk bkkVar = list.get(i);
            if (bkkVar instanceof bla) {
                bla blaVar = (bla) bkkVar;
                if (blaVar.e == 1) {
                    this.i.a(blaVar);
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
        blc blcVar;
        if (t == bjv.h) {
            blcVar = this.g;
        } else if (t == bjv.j) {
            blcVar = this.f;
        } else if (t != bjv.i) {
            return;
        } else {
            blcVar = this.h;
        }
        blcVar.d = bpvVar;
    }

    @Override // defpackage.bkk
    public final String g() {
        return this.c;
    }

    @Override // defpackage.bku
    public final Path j() {
        if (this.j) {
            return this.a;
        }
        this.a.reset();
        if (this.d) {
            this.j = true;
            return this.a;
        }
        PointF h = this.g.h();
        float f = h.x / 2.0f;
        float f2 = h.y / 2.0f;
        float k = ((ble) this.h).k();
        float min = Math.min(f, f2);
        if (k > min) {
            k = min;
        }
        PointF h2 = this.f.h();
        this.a.moveTo(h2.x + f, (h2.y - f2) + k);
        this.a.lineTo(h2.x + f, (h2.y + f2) - k);
        if (k > 0.0f) {
            float f3 = k + k;
            this.b.set((h2.x + f) - f3, (h2.y + f2) - f3, h2.x + f, h2.y + f2);
            this.a.arcTo(this.b, 0.0f, 90.0f, false);
        }
        this.a.lineTo((h2.x - f) + k, h2.y + f2);
        if (k > 0.0f) {
            float f4 = k + k;
            this.b.set(h2.x - f, (h2.y + f2) - f4, (h2.x - f) + f4, h2.y + f2);
            this.a.arcTo(this.b, 90.0f, 90.0f, false);
        }
        this.a.lineTo(h2.x - f, (h2.y - f2) + k);
        if (k > 0.0f) {
            float f5 = k + k;
            this.b.set(h2.x - f, h2.y - f2, (h2.x - f) + f5, (h2.y - f2) + f5);
            this.a.arcTo(this.b, 180.0f, 90.0f, false);
        }
        this.a.lineTo((h2.x + f) - k, h2.y - f2);
        if (k > 0.0f) {
            float f6 = k + k;
            this.b.set((h2.x + f) - f6, h2.y - f2, h2.x + f, (h2.y - f2) + f6);
            this.a.arcTo(this.b, 270.0f, 90.0f, false);
        }
        this.a.close();
        this.i.b(this.a);
        this.j = true;
        return this.a;
    }
}

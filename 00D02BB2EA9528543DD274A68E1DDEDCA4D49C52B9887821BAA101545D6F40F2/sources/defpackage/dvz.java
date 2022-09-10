package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: dvz  reason: default package */
/* loaded from: classes6.dex */
public final class dvz implements dfen, dtv {
    private static final int[] a = {-12417548, -1424587, -279548, -13326253};
    private final cze f;
    private final czd g;
    private final czd h;
    private final dua j;
    @dzsi
    private dtu k;
    @dzsi
    private dvx l;
    private final dvh o;
    private boolean b = false;
    private boolean c = false;
    private int n = 1;
    private dfgu d = dfgu.STOPPED;
    private int e = 0;
    private final List<dvw> i = new ArrayList();
    private final dzjj<dvy> m = new dzjs();

    public dvz(dvh dvhVar, dua duaVar, cze czeVar, czd czdVar, czd czdVar2) {
        this.o = dvhVar;
        this.j = duaVar;
        this.f = czeVar;
        this.g = czdVar;
        this.h = czdVar2;
    }

    private final void b(boolean z) {
        if (this.b != z) {
            this.b = z;
            this.c = true;
        }
    }

    private final void c() {
        this.e = 0;
        dvx dvxVar = this.l;
        if (dvxVar != null) {
            bvrj.UI_THREAD.c();
            dvxVar.a.cancel();
            this.l = null;
        }
    }

    private final boolean d() {
        return this.l != null;
    }

    private final void i() {
        float f;
        Iterator a2 = ((dzjs) this.m).k().a();
        int i = 0;
        while (a2.hasNext()) {
            dzjh dzjhVar = (dzjh) a2.next();
            dvy dvyVar = (dvy) dzjhVar.getValue();
            if (dvyVar.g) {
                dbsk.l(i < 60);
                dvw dvwVar = this.i.get(i);
                dvwVar.d = dvyVar;
                dvwVar.e.j(dvyVar.a.e(), dvyVar.a.f(), dvyVar.a.g());
                float f2 = dvyVar.e + dvyVar.b;
                int i2 = i;
                akse akseVar = new akse((float) ((Math.sin(2.6f * f2) + Math.sin(3.7f * f2)) * 0.00524717615917325d), (float) ((Math.sin(2.3f * f2) + Math.sin(3.3f * f2)) * 0.00524717615917325d));
                double sin = Math.sin(f2 + f2);
                double sin2 = Math.sin(f2 * 3.1f);
                float f3 = dvyVar.h;
                float f4 = ((float) ((((sin + sin2) * 0.1899999976158142d) + 0.5d) * 0.017490586265921593d)) * f3;
                akse.m(akseVar, f3, akseVar);
                dvwVar.f.j(akseVar.b, akseVar.c, 0.0f);
                dvwVar.b.i(new bnvs(f4, f4, f4));
                if (!dvyVar.d) {
                    f = dvyVar.b;
                } else {
                    f = dvyVar.f;
                }
                dvwVar.b.j(akn.a(f / 0.3f, 0.0f, 1.0f));
                dtu dtuVar = dvwVar.b;
                int a3 = dzjhVar.a();
                StringBuilder sb = new StringBuilder(31);
                sb.append("PointRenderableNode@");
                sb.append(a3);
                sb.toString();
                dtuVar.u();
                dvwVar.b.k(16777215);
                dvwVar.a.g(true);
                dvwVar.c.g(false);
                i = i2 + 1;
            }
        }
        for (int i3 = i; i3 < 60; i3++) {
            dvw dvwVar2 = this.i.get(i3);
            dvwVar2.a.g(false);
            dvwVar2.b.u();
            dvwVar2.d = null;
        }
    }

    private final void j(int i) {
        if (this.n != i) {
            int i2 = i - 1;
            if (i2 == 0) {
                b(false);
                c();
                this.m.clear();
            } else if (i2 == 1) {
                b(true);
                c();
                this.m.clear();
            }
        }
        this.n = i;
    }

    @Override // defpackage.dfen
    public final void a() {
        c();
        dtu dtuVar = this.k;
        if (dtuVar != null) {
            dtuVar.f();
        }
        this.j.b(this);
    }

    @Override // defpackage.dtv
    public final void e(dua duaVar) {
    }

    @Override // defpackage.dtv
    public final void f() {
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0209 A[SYNTHETIC] */
    @Override // defpackage.dtv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(com.google.ar.core.Frame r17, @defpackage.dzsi defpackage.dad r18, defpackage.dfgv r19, float r20) {
        /*
            Method dump skipped, instructions count: 845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvz.g(com.google.ar.core.Frame, dad, dfgv, float):void");
    }

    @Override // defpackage.dtv
    public final void h(float f) {
    }
}

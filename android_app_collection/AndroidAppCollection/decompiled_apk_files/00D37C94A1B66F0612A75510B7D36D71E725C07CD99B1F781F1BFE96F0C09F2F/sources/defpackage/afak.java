package defpackage;

import android.os.Looper;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: afak  reason: default package */
/* loaded from: classes.dex */
public final class afak {
    public final prh a;
    public Format b = null;
    public final List c = new ArrayList();
    public volatile boolean d;
    private long e;

    public afak(axf axfVar, Looper looper, pnp pnpVar, pnj pnjVar, long j) {
        this.a = prh.C(axfVar, looper, pnpVar, pnjVar);
        f(j);
    }

    private final synchronized void j() {
        prh prhVar = this.a;
        prhVar.A(prhVar.i());
    }

    private final synchronized void k() {
        prh prhVar = this.a;
        prhVar.A(prhVar.b);
    }

    public final synchronized int a(pit pitVar, pmv pmvVar, int i) {
        return this.a.j(pitVar, pmvVar, i, this.d);
    }

    public final synchronized int b(long j) {
        int h;
        h = this.a.h(j, this.d);
        this.a.x(h);
        return h;
    }

    public final synchronized List c(ajfw ajfwVar, int i, boolean z) {
        int af = pxi.af(amxp.u(this.c, adrz.h), Integer.valueOf(i));
        int i2 = -1;
        if (af < 0 || af >= this.c.size() || ((afaj) this.c.get(af)).b != i) {
            af = -1;
        }
        if (af >= 0 && ((afaj) this.c.get(af)).a.equals(ajfwVar)) {
            i2 = af;
        }
        if (i2 < 0) {
            return Collections.emptyList();
        }
        afaj afajVar = (afaj) this.c.get(i2);
        if (!z || afajVar.c > this.a.m()) {
            while (afajVar.c <= this.a.m()) {
                i2++;
                if (i2 < this.c.size()) {
                    afajVar = (afaj) this.c.get(i2);
                } else {
                    return Collections.emptyList();
                }
            }
            this.a.q(afajVar.c);
        } else {
            long m = this.a.m();
            k();
            this.a.q(afajVar.c);
            j();
            this.a.c = m;
        }
        int size = this.c.size();
        if (this.d && size == this.c.size()) {
            this.d = false;
        }
        List subList = this.c.subList(i2, size);
        ArrayList arrayList = new ArrayList(subList);
        subList.clear();
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r11 < (r3 + r5)) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d(long r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            prh r0 = r10.a     // Catch: java.lang.Throwable -> L65
            long r0 = r0.m()     // Catch: java.lang.Throwable -> L65
            long r11 = java.lang.Math.min(r11, r0)     // Catch: java.lang.Throwable -> L65
            java.util.List r0 = r10.c     // Catch: java.lang.Throwable -> L65
            adrz r1 = defpackage.adrz.i     // Catch: java.lang.Throwable -> L65
            java.util.List r0 = defpackage.amxp.u(r0, r1)     // Catch: java.lang.Throwable -> L65
            java.lang.Long r1 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L65
            int r0 = defpackage.pxi.af(r0, r1)     // Catch: java.lang.Throwable -> L65
            r1 = -1
            if (r0 < 0) goto L45
            java.util.List r2 = r10.c     // Catch: java.lang.Throwable -> L65
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L65
            if (r0 >= r2) goto L45
            java.util.List r2 = r10.c     // Catch: java.lang.Throwable -> L65
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L65
            afaj r2 = (defpackage.afaj) r2     // Catch: java.lang.Throwable -> L65
            long r3 = r2.c     // Catch: java.lang.Throwable -> L65
            int r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r5 > 0) goto L45
            long r5 = r2.e     // Catch: java.lang.Throwable -> L65
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L3f
            long r5 = r2.d     // Catch: java.lang.Throwable -> L65
            long r5 = r5 - r3
        L3f:
            long r3 = r3 + r5
            int r2 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r2 >= 0) goto L45
            goto L46
        L45:
            r0 = -1
        L46:
            if (r0 > 0) goto L4a
            monitor-exit(r10)
            return
        L4a:
            java.util.List r11 = r10.c     // Catch: java.lang.Throwable -> L65
            java.lang.Object r11 = r11.get(r0)     // Catch: java.lang.Throwable -> L65
            afaj r11 = (defpackage.afaj) r11     // Catch: java.lang.Throwable -> L65
            prh r12 = r10.a     // Catch: java.lang.Throwable -> L65
            long r1 = r11.c     // Catch: java.lang.Throwable -> L65
            r11 = 0
            r12.o(r1, r11, r11)     // Catch: java.lang.Throwable -> L65
            java.util.List r12 = r10.c     // Catch: java.lang.Throwable -> L65
            java.util.List r11 = r12.subList(r11, r0)     // Catch: java.lang.Throwable -> L65
            r11.clear()     // Catch: java.lang.Throwable -> L65
            monitor-exit(r10)
            return
        L65:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afak.d(long):void");
    }

    public final synchronized void e() {
        this.c.clear();
        this.d = false;
        this.a.v();
        f(this.e);
    }

    public final synchronized void f(long j) {
        this.e = j;
        this.a.c = j;
    }

    public final synchronized boolean g() {
        return this.a.z(this.d);
    }

    public final synchronized void h() {
        this.a.D();
    }

    public final synchronized boolean i(long j) {
        boolean B;
        B = this.a.B(j, false);
        f(j);
        return B;
    }
}

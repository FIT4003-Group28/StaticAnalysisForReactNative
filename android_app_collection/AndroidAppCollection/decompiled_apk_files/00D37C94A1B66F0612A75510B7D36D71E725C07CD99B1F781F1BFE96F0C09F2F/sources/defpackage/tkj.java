package defpackage;

import com.google.android.libraries.lidar.VisibilityChangeEventData;
/* compiled from: PG */
/* renamed from: tkj  reason: default package */
/* loaded from: classes4.dex */
public abstract class tkj {
    public static final void c(tky tkyVar, VisibilityChangeEventData visibilityChangeEventData, tla tlaVar) {
        int i;
        double d;
        long j;
        long j2;
        int i2;
        double d2;
        tjz tjzVar = visibilityChangeEventData.a;
        long currentTimeMillis = System.currentTimeMillis();
        tld a = tkyVar.h.a();
        boolean z = false;
        if (a != null) {
            int i3 = a.a;
            if (tkyVar.p == 0) {
                tkyVar.p = i3;
                ((tlc) tkyVar.e).p = i3;
            }
            i = a.b;
            tkyVar.n = a.c;
        } else {
            if (tkyVar.r == 2) {
                tkyVar.r = 1;
            }
            i = 0;
        }
        double d3 = visibilityChangeEventData.b;
        if (tlaVar != null && tlaVar.u) {
            z = true;
        }
        long j3 = tkyVar.b;
        long j4 = 0;
        if (j3 <= 0 || tkyVar.m) {
            return;
        }
        if (tkyVar.c == -1) {
            tkyVar.c = currentTimeMillis;
        }
        int i4 = tkyVar.p;
        if (i > i4 && i4 > 0) {
            i = i4;
        }
        long j5 = currentTimeMillis - j3;
        int i5 = i - tkyVar.q;
        boolean z2 = z;
        long j6 = tkyVar.i;
        if (tkyVar.l || i5 < 0) {
            d = d3;
            j = 0;
        } else {
            d = d3;
            j = Math.max(j5 - i5, 0L);
        }
        tkyVar.i = j6 + j;
        long j7 = tkyVar.j;
        if (i5 < 0) {
            j4 = Math.abs(i5);
        }
        tkyVar.j = j7 + j4;
        if (tkyVar.k == -1 && i > 0) {
            tkyVar.k = currentTimeMillis - tkyVar.c;
        }
        if (tkyVar.r == 2) {
            j5 = i5;
        }
        if (!tkyVar.l) {
            j2 = currentTimeMillis;
            i2 = i5;
            long j8 = j5;
            d2 = d;
            ((tlc) tkyVar.e).g(j8, tjzVar.a, d2, tkyVar.o, tkyVar.n, tkyVar.a, z2, tjzVar.b);
            tkyVar.j().g(j8, tjzVar.a, d2, tkyVar.o, tkyVar.n, tkyVar.a, z2, tjzVar.b);
        } else {
            j2 = currentTimeMillis;
            i2 = i5;
            d2 = d;
        }
        if (i2 <= 0) {
            i = tkyVar.q;
        }
        tkyVar.q = i;
        tkyVar.b = j2;
        tkyVar.o = d2;
        tkyVar.f = tjzVar;
    }

    public abstract void a(tky tkyVar, tla tlaVar);

    public abstract void b();
}

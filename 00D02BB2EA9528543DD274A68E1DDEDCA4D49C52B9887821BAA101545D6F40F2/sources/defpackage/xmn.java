package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xmn  reason: default package */
/* loaded from: classes7.dex */
public final class xmn {
    public final cjqy a;
    public final cqat b;
    @dzsi
    public ddsk c = null;
    public final Map<String, xmm> d = new HashMap();

    public xmn(cjqy cjqyVar, cqat cqatVar) {
        this.a = cjqyVar;
        this.b = cqatVar;
    }

    @dzsi
    public static dqdy e(xmx xmxVar) {
        dqea m = xmxVar.m();
        if (m == null || m.a.size() <= 0) {
            return null;
        }
        return m.a.get(0);
    }

    public final void a(String str) {
        xmm xmmVar = this.d.get(str);
        if (xmmVar == null) {
            return;
        }
        b(xmmVar);
        this.d.remove(str);
    }

    public final void b(xmm xmmVar) {
        if (((ddst) xmmVar.a.b).b) {
            c(xmmVar);
            ddmg b = xmmVar.d.b();
            ddsq ddsqVar = xmmVar.a;
            if (ddsqVar.c) {
                ddsqVar.bF();
                ddsqVar.c = false;
            }
            ddst ddstVar = (ddst) ddsqVar.b;
            b.getClass();
            ddstVar.h = b;
            ddstVar.a |= 64;
        }
        ddsk ddskVar = this.c;
        dbsk.s(ddskVar);
        ddst bK = xmmVar.a.bK();
        if (ddskVar.c) {
            ddskVar.bF();
            ddskVar.c = false;
        }
        ddsu ddsuVar = (ddsu) ddskVar.b;
        ddsu ddsuVar2 = ddsu.e;
        bK.getClass();
        dsrj<ddst> dsrjVar = ddsuVar.d;
        if (!dsrjVar.a()) {
            ddsuVar.d = dsqw.cl(dsrjVar);
        }
        ddsuVar.d.add(bK);
    }

    public final void c(xmm xmmVar) {
        int d = d(xmmVar.b);
        for (int i = xmmVar.c; i < d; i++) {
            xmmVar.d.a(i);
        }
    }

    public final int d(dqdy dqdyVar) {
        return (int) (eaow.e(this.b.b()).g() - dqdyVar.b);
    }
}

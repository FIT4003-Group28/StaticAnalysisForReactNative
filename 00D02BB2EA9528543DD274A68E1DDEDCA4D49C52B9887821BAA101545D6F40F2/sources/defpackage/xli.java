package defpackage;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: xli  reason: default package */
/* loaded from: classes7.dex */
public final class xli {
    public final cqat a;
    public final int c;
    public final int d;
    public final xmn e;
    public boolean g;
    public final int h;
    public aifa i;
    public long j;
    public xmx k;
    private final Application m;
    private final xlj n;
    private final dxio<akvz> o;
    private final Runnable p;
    private final Runnable q;
    private final boolean r;
    private final boolean s;
    private akuh t;
    private xly u;
    @dzsi
    private dnoh v;
    public final List<xky> b = new ArrayList();
    @dzsi
    public xky l = null;
    public boolean f = false;

    public xli(Application application, cqat cqatVar, xlj xljVar, dxio<akvz> dxioVar, btvo btvoVar, dqdy dqdyVar, xmx xmxVar, Runnable runnable, Runnable runnable2, boolean z, boolean z2, xmn xmnVar, int i) {
        akrn akrnVar = null;
        this.m = application;
        this.a = cqatVar;
        this.n = xljVar;
        this.o = dxioVar;
        this.k = xmxVar;
        this.p = runnable;
        this.q = runnable2;
        this.s = z2;
        this.r = z;
        this.e = xmnVar;
        this.h = i;
        int max = Math.max(100, btvoVar.getTransitPagesParameters().t);
        this.c = max;
        this.d = Math.min(3000, max);
        dpum dpumVar = dqdyVar.a;
        akra f = akra.f(akqq.f(dpumVar == null ? dpum.d : dpumVar));
        dbsi<akrn, akrn> dbsiVar = ((xkt) c(f, f)).a;
        akrnVar = dbsiVar != null ? dbsiVar.a : akrnVar;
        this.j = TimeUnit.SECONDS.toMillis(dqdyVar.b);
        g(akrnVar != null ? akrnVar.a : f, runnable, runnable2);
    }

    public static void d(akrk akrkVar, akrn akrnVar, akrn akrnVar2, xlh xlhVar) {
        akra akraVar = new akra();
        akra akraVar2 = new akra(akrnVar.a);
        int i = akrnVar.d;
        while (true) {
            i++;
            if (i <= akrnVar2.d) {
                akraVar.aa(akraVar2);
                akrkVar.n(i, akraVar2);
                xlhVar.a(akraVar, akraVar2, i - 1);
            } else {
                akraVar.aa(akraVar2);
                akraVar2.aa(akrnVar2.a);
                xlhVar.a(akraVar, akraVar2, akrnVar2.d);
                return;
            }
        }
    }

    @dzsi
    public static dqdy f(xmx xmxVar) {
        dqea m = xmxVar.m();
        if (m == null || m.a.size() <= 0) {
            return null;
        }
        return m.a.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g(defpackage.akra r25, java.lang.Runnable r26, java.lang.Runnable r27) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xli.g(akra, java.lang.Runnable, java.lang.Runnable):void");
    }

    public final aifa a() {
        aifa aifaVar = this.i;
        dbsk.s(aifaVar);
        return aifaVar;
    }

    public final aifa b() {
        g(a().a().a().a(), this.p, this.q);
        return a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fe, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fe, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.xme c(defpackage.akra r21, defpackage.akra r22) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xli.c(akra, akra):xme");
    }

    public final void e() {
        aifa aifaVar = this.i;
        if (aifaVar != null) {
            aifaVar.c();
        }
        if (this.t != null) {
            this.o.a().j(this.t);
        }
    }
}

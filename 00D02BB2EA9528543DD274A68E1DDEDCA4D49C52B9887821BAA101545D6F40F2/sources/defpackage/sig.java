package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: sig  reason: default package */
/* loaded from: classes7.dex */
public final class sig {
    private static final long a = TimeUnit.MILLISECONDS.convert(60, TimeUnit.MINUTES);
    private final cqat b;
    private final dxio<ckcw> c;
    private final cjqy d;
    private dbsg<Integer> e = dbpy.a;
    private long f = -1;
    private dbsg<dpkf> g = dbpy.a;

    public sig(cqat cqatVar, dxio<ckcw> dxioVar, cjqy cjqyVar) {
        this.b = cqatVar;
        this.c = dxioVar;
        this.d = cjqyVar;
    }

    public final synchronized void a(int i) {
        this.e = dbsg.i(Integer.valueOf(i));
    }

    public final synchronized void b(amsy amsyVar) {
        dgas x;
        ckha ckhaVar;
        if (!this.e.a()) {
            return;
        }
        if (vyb.x(amsyVar.m(0)) == null) {
            return;
        }
        dbsg<dpkf> i = amsyVar.i() < 0 ? dbpy.a : dbsg.i(amsyVar.h(amsyVar.i() - 1));
        if (this.b.b() - this.f < a && (!i.a() || i.equals(this.g))) {
            return;
        }
        long intValue = this.e.b().intValue() - TimeUnit.SECONDS.toMinutes(x.b);
        ckcw a2 = this.c.a();
        if (intValue >= 0) {
            ckhaVar = ckht.al;
        } else {
            ckhaVar = ckht.am;
        }
        ((ckcp) a2.a(ckhaVar)).a(Math.abs(intValue));
        cjst d = cjsu.d();
        d.d(ddda.cs);
        cjry e = cjrz.e();
        e.b(ddcu.JE);
        ddzf bZ = ddzg.t.bZ();
        ddik bZ2 = ddil.e.bZ();
        int i2 = (int) intValue;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddil ddilVar = (ddil) bZ2.b;
        ddilVar.a |= 1024;
        ddilVar.c = i2;
        ddil bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddzg ddzgVar = (ddzg) bZ.b;
        bK.getClass();
        ddzgVar.f = bK;
        ddzgVar.a |= 16777216;
        ((cjrn) e).a = bZ.bK();
        d.f(e.a());
        this.d.l(d.e());
        this.f = this.b.b();
        this.g = i;
    }
}

package defpackage;

import android.app.Application;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ahly  reason: default package */
/* loaded from: classes2.dex */
public final class ahly implements ahjw {
    public final Application b;
    public final cqat c;
    private final cjqy j;
    private final dxio<akfa> k;
    private final boolean l;
    private static final long i = TimeUnit.SECONDS.toMillis(30);
    static final long a = TimeUnit.SECONDS.toMillis(10);
    public final ahlw d = new ahlw(this);
    public long e = -1;
    public long f = -1;
    private boolean m = false;
    @dzsi
    public dsjq g = null;
    @dzsi
    public ahlx h = null;

    public ahly(Application application, btvo btvoVar, cjqy cjqyVar, dxio<akfa> dxioVar, cqat cqatVar) {
        this.b = application;
        this.j = cjqyVar;
        this.c = cqatVar;
        this.k = dxioVar;
        duwx duwxVar = btvoVar.getLocationParameters().f;
        this.l = (duwxVar == null ? duwx.i : duwxVar).h;
    }

    @Override // defpackage.ahjw
    public final dbsg<Integer> a() {
        dsjq dsjqVar = this.g;
        if (dsjqVar == null || this.c.e() - this.e > i) {
            return dbpy.a;
        }
        return dbsg.i(Integer.valueOf(dsjqVar.a));
    }

    @Override // defpackage.ahjw
    public final void b(boolean z) {
        dsjq dsjqVar = this.g;
        if (dsjqVar == null || !this.k.a().j().l()) {
            return;
        }
        if ((this.e - this.f <= a || this.m || !this.l) && !z) {
            return;
        }
        cjst d = cjsu.d();
        d.d(ddda.cR);
        cjry e = cjrz.e();
        e.b(ddcu.u);
        ddzf bZ = ddzg.t.bZ();
        ddyr bZ2 = ddys.d.bZ();
        int i2 = dsjqVar.a;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddys ddysVar = (ddys) bZ2.b;
        ddysVar.a |= 1;
        ddysVar.b = i2;
        int a2 = dsjs.a(dsjqVar.b);
        if (a2 == 0) {
            a2 = 1;
        }
        int i3 = a2 - 1;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddys ddysVar2 = (ddys) bZ2.b;
        ddysVar2.a |= 2;
        ddysVar2.c = i3;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddzg ddzgVar = (ddzg) bZ.b;
        ddys bK = bZ2.bK();
        bK.getClass();
        ddzgVar.q = bK;
        ddzgVar.b |= 268435456;
        ((cjrn) e).a = bZ.bK();
        d.f(e.a());
        this.j.l(d.e());
        this.m = true;
    }
}

package defpackage;

import android.location.Location;
/* compiled from: PG */
/* renamed from: byzk  reason: default package */
/* loaded from: classes4.dex */
public final class byzk {
    public final cqat a;
    public final btrm b;
    public final cjqy c;
    public final btpa d;
    public final crnz e;
    public final dxio<ahjq> f;
    public long g;
    public double h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    @dzsi
    public cjsw r;
    @dzsi
    public amub s;
    @dzsi
    public byzj q = null;
    @dzsi
    public Long t = null;
    public int u = 0;
    public int v = 0;
    @dzsi
    public ddrx p = null;
    @dzsi
    public Location o = null;

    public byzk(cqat cqatVar, btrm btrmVar, cjqy cjqyVar, btpa btpaVar, dxio<ahjq> dxioVar, dxio<crnz> dxioVar2) {
        this.a = cqatVar;
        this.b = btrmVar;
        this.c = cjqyVar;
        this.d = btpaVar;
        this.f = dxioVar;
        this.e = dxioVar2.a();
    }

    public final void a(ddsg ddsgVar) {
        ddrx ddrxVar = this.p;
        if (ddrxVar == null) {
            return;
        }
        if (ddrxVar.c) {
            ddrxVar.bF();
            ddrxVar.c = false;
        }
        ddsh ddshVar = (ddsh) ddrxVar.b;
        ddsh ddshVar2 = ddsh.w;
        ddsgVar.getClass();
        dsrj<ddsg> dsrjVar = ddshVar.h;
        if (!dsrjVar.a()) {
            ddshVar.h = dsqw.cl(dsrjVar);
        }
        ddshVar.h.add(ddsgVar);
    }

    public final void b(@dzsi eaow eaowVar) {
        if (eaowVar != null) {
            if (this.r == null) {
                this.r = new cjsw(1.0f, 3.6E7f, 3600);
            }
            this.r.a((float) eaowVar.b);
        }
    }

    public final void c() {
        long e = this.a.e();
        Long l = this.t;
        if (l != null) {
            this.v += ((int) (e - l.longValue())) / 1000;
            this.t = null;
        }
    }
}

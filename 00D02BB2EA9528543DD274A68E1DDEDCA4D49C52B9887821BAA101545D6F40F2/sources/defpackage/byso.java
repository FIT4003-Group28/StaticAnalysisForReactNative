package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: byso  reason: default package */
/* loaded from: classes4.dex */
public class byso implements bysf {
    public final dxio<byqh> a;
    public final dxio<byye> b;
    public final dxio<akfa> c;
    public final dpyv d;
    @dzsi
    public final String e;
    private final Resources f;
    private final dxio<auhi> g;
    private final dxio<cjqy> h;
    private final Executor i;
    private final ddho j;
    private final ddho k;
    private final ddho l;
    private final ddho m;
    private final int n;
    private final int o;
    @dzsi
    private final String p;
    @dzsi
    private final bysn q;

    public byso(Resources resources, dxio<auhi> dxioVar, dxio<byqh> dxioVar2, dxio<byye> dxioVar3, dxio<cjqy> dxioVar4, dxio<akfa> dxioVar5, Executor executor, dpyv dpyvVar, ddho ddhoVar, ddho ddhoVar2, ddho ddhoVar3, ddho ddhoVar4, int i, int i2, int i3, int i4, @dzsi String str, @dzsi String str2, @dzsi bysn bysnVar) {
        this.f = resources;
        this.g = dxioVar;
        this.a = dxioVar2;
        this.b = dxioVar3;
        this.h = dxioVar4;
        this.c = dxioVar5;
        this.i = executor;
        this.d = dpyvVar;
        this.j = ddhoVar;
        this.k = ddhoVar2;
        this.l = ddhoVar3;
        this.m = ddhoVar4;
        this.n = i;
        this.o = i2;
        this.p = str;
        this.e = str2;
        this.q = bysnVar;
    }

    public static byso l(bysp byspVar, @dzsi String str, @dzsi String str2, bysn bysnVar) {
        return byspVar.a(dpyv.TRAFFIC_TO_PLACE, dtyc.bO, dtyc.bL, dtyc.bP, dtyc.bN, R.string.INFERRED_COMMUTE_DESTINATION_NOTIFICATION_TRAFFIC_WARMUP_BANNER_TITLE, R.string.INFERRED_COMMUTE_DESTINATION_NOTIFICATION_TRAFFIC_WARMUP_BANNER_CONTENT, str, str2, bysnVar);
    }

    public static byso m(bysp byspVar, @dzsi String str, @dzsi String str2, bysn bysnVar) {
        return byspVar.a(dpyv.TRANSIT_TO_PLACE, dtxs.U, dtxs.R, dtxs.V, dtxs.T, R.string.INFERRED_COMMUTE_DESTINATION_NOTIFICATION_TRANSIT_WARMUP_BANNER_TITLE, R.string.INFERRED_COMMUTE_DESTINATION_NOTIFICATION_TRANSIT_WARMUP_BANNER_CONTENT, str, str2, bysnVar);
    }

    private final void s(int i) {
        int i2 = 3;
        if (i != 3) {
            this.g.a().e(this.d.dm, i == 1 ? aufs.ENABLED : aufs.DISABLED);
            if (this.d == dpyv.TRAFFIC_TO_PLACE) {
                this.a.a().n();
            }
            final String str = this.p;
            if (str != null) {
                this.i.execute(new Runnable(this, str) { // from class: bysm
                    private final byso a;
                    private final String b;

                    {
                        this.a = this;
                        this.b = str;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byso bysoVar = this.a;
                        String str2 = this.b;
                        dpyv dpyvVar = dpyv.UNKNOWN_NOTIFICATION_ID;
                        int ordinal = bysoVar.d.ordinal();
                        if (ordinal == 98) {
                            bysoVar.a.a().i(qjj.TRAFFIC_TO_PLACE, str2, bysoVar.e == null ? null : bysoVar.c.a().n(bysoVar.e));
                        } else if (ordinal != 101) {
                        } else {
                            bysoVar.b.a().a(str2);
                        }
                    }
                });
            }
        }
        byou byouVar = (byou) this.q;
        byov byovVar = byouVar.a;
        if (byovVar.aD) {
            if (i != 3) {
                bypy bypyVar = byovVar.d;
                if (i != 1) {
                    i2 = 4;
                }
                byot byotVar = (byot) bypyVar;
                byotVar.b(i2);
                byotVar.a.Z(bvjk.cB, byotVar.b.b());
                if (i != 1) {
                    byotVar.a.S(bvjk.cE, true);
                }
            }
            gga ggaVar = byouVar.a.aE;
            dbsk.s(ggaVar);
            ggaVar.g().f();
        }
    }

    @Override // defpackage.bysf
    public cqkl a() {
        s(1);
        return cqkl.a;
    }

    @Override // defpackage.bysf
    public cqkl b() {
        s(2);
        return cqkl.a;
    }

    @Override // defpackage.bysf
    public cqkl c() {
        s(3);
        this.h.a().i(cjtd.a(this.j));
        return cqkl.a;
    }

    @Override // defpackage.bysf
    public cjtd i() {
        return cjtd.a(this.k);
    }

    @Override // defpackage.bysf
    public cjtd j() {
        return cjtd.a(this.l);
    }

    @Override // defpackage.bysf
    public cjtd k() {
        return cjtd.a(this.m);
    }

    @Override // defpackage.bysf
    /* renamed from: n */
    public String d() {
        return this.f.getString(this.n);
    }

    @Override // defpackage.bysf
    /* renamed from: o */
    public String e() {
        return this.f.getString(this.o);
    }

    @Override // defpackage.bysf
    /* renamed from: p */
    public String f() {
        return this.f.getString(R.string.INFERRED_COMMUTE_DESTINATION_NOTIFICATION_WARMUP_BANNER_ACCEPT);
    }

    @Override // defpackage.bysf
    /* renamed from: q */
    public String g() {
        return this.f.getString(R.string.INFERRED_COMMUTE_DESTINATION_NOTIFICATION_WARMUP_BANNER_DECLINE);
    }

    @Override // defpackage.bysf
    /* renamed from: r */
    public String h() {
        bvsi bvsiVar = new bvsi(this.f);
        bvsiVar.d(d());
        bvsiVar.d(e());
        return bvsiVar.toString();
    }
}

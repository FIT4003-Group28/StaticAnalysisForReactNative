package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: adfp  reason: default package */
/* loaded from: classes2.dex */
public class adfp extends aczs implements adfo {
    public final cqhn a;
    public final abjo b;
    public final List<dqfq> c;
    public final abfc d;
    public final ddho e;
    public final abse f;
    @dzsi
    public final acwt g;
    @dzsi
    public final dxio<aeaa> h;
    @dzsi
    public awwb i;
    @dzsi
    public String j;
    @dzsi
    public abqn k;
    private final dxio<abfa> l;
    private final ddho m;

    public adfp(cqhn cqhnVar, abjo abjoVar, acyr acyrVar, dxio<abfa> dxioVar, acwt acwtVar, abfc abfcVar, @dzsi dxio<aeaa> dxioVar2, abse abseVar) {
        dcdc f;
        this.g = acwtVar;
        this.a = cqhnVar;
        ArrayList arrayList = new ArrayList();
        for (dkum dkumVar : acyrVar.a().ah) {
            if ((dkumVar.a & 1) != 0) {
                dqfo dqfoVar = dkumVar.b;
                arrayList.add(dqfoVar == null ? dqfo.j : dqfoVar);
            }
        }
        if (arrayList.isEmpty()) {
            f = dcdc.e();
        } else {
            dqfp bZ = dqfq.h.bZ();
            bZ.a(arrayList);
            f = dcdc.f(bZ.bK());
        }
        dcdc dcdcVar = f;
        this.c = dcdcVar;
        this.l = dxioVar;
        this.b = abjoVar;
        this.h = dxioVar2;
        this.f = abseVar;
        this.d = abfcVar;
        this.k = null;
        absg b = absg.b(abseVar.b);
        ddho ddhoVar = (b == null ? absg.UNKNOWN_EXPLORE_SURFACE : b) == absg.AREA_EXPLORE ? dtxj.cl : dtxr.Z;
        this.e = ddhoVar;
        absg b2 = absg.b(abseVar.b);
        this.m = (b2 == null ? absg.UNKNOWN_EXPLORE_SURFACE : b2) == absg.AREA_EXPLORE ? dtxj.cn : dtxr.aa;
        if (!abfcVar.b() || dcdcVar.isEmpty()) {
            if (abfcVar.a()) {
                return;
            }
            this.k = abjoVar.a(abfcVar.c(), ddhoVar, null, acwtVar, abseVar);
            return;
        }
        this.k = abjoVar.a(dcdcVar, ddhoVar, dxioVar2, acwtVar, abseVar);
    }

    @Override // defpackage.adfo
    @dzsi
    public abqn a() {
        return this.k;
    }

    @Override // defpackage.adfo
    public Boolean b() {
        return Boolean.valueOf(this.l.a().e());
    }

    public boolean c() {
        awwb awwbVar;
        return !this.d.b() || this.k != null || ((awwbVar = this.i) != null && !awwbVar.c(awvv.c).b());
    }

    @Override // defpackage.aczr
    public cjtd e() {
        cjta b = cjtd.b();
        b.g(this.j);
        b.d = this.m;
        return b.a();
    }
}

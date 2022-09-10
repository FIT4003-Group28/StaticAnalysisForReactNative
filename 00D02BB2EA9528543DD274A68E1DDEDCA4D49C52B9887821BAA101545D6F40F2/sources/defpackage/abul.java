package defpackage;

import android.app.Activity;
import java.util.List;
/* compiled from: PG */
/* renamed from: abul  reason: default package */
/* loaded from: classes2.dex */
public class abul implements abmg {
    public final absg a;
    @dzsi
    public final acwt b;
    public final abuh c;
    private final ilo d;
    private final dxio<axwo> e;
    @dzsi
    private djrm f;
    private List<ablx> g = dcdc.e();

    public abul(dxio dxioVar, abuh abuhVar, acwt acwtVar, abse abseVar, ilo iloVar) {
        this.e = dxioVar;
        this.c = abuhVar;
        this.b = acwtVar;
        absg b = absg.b(abseVar.b);
        this.a = b == null ? absg.UNKNOWN_EXPLORE_SURFACE : b;
        this.d = iloVar;
        i(null);
    }

    private final void h() {
        this.b.a();
        djrm djrmVar = this.f;
        if (djrmVar == null || djrmVar.e.size() <= 0) {
            return;
        }
        this.e.a().h(this.d);
    }

    private final boolean i(@dzsi djrm djrmVar) {
        if (djrmVar == null || djrmVar.e.size() <= 0) {
            this.g = dcdc.e();
            this.f = null;
            return true;
        } else if (!this.g.isEmpty() && j(this.f).equals(j(djrmVar))) {
            return false;
        } else {
            ddes bZ = ddet.D.bZ();
            ddzh bZ2 = ddzp.i.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddet ddetVar = (ddet) bZ.b;
            ddzp bK = bZ2.bK();
            bK.getClass();
            ddetVar.h = bK;
            ddetVar.a |= 32;
            final ddet bK2 = bZ.bK();
            this.g = dcbg.b(djrmVar.e).s(new dbrn(this, bK2) { // from class: abui
                private final abul a;
                private final ddet b;

                {
                    this.a = this;
                    this.b = bK2;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    abul abulVar = this.a;
                    ddet ddetVar2 = this.b;
                    dvyw dvywVar = (dvyw) obj;
                    abuh abuhVar = abulVar.c;
                    ddho ddhoVar = abulVar.a == absg.AREA_EXPLORE ? dtxj.cB : dtxo.cC;
                    acwt acwtVar = abulVar.b;
                    Activity activity = (Activity) ((dxjd) abuhVar.a).a;
                    abuh.a(activity, 1);
                    abuo a = abuhVar.b.a();
                    abuh.a(a, 2);
                    abuh.a(dvywVar, 3);
                    abuh.a(ddhoVar, 4);
                    return new abug(activity, a, dvywVar, ddhoVar, ddetVar2, acwtVar);
                }
            }).o(abuj.a).z();
            this.f = djrmVar;
            return true;
        }
    }

    @Override // defpackage.abmg
    public Boolean a(@dzsi djrm djrmVar) {
        boolean i = i(djrmVar);
        if (i) {
            cqkx.p(this);
        }
        return Boolean.valueOf(i);
    }

    @Override // defpackage.abmg
    public String b() {
        djrm djrmVar = this.f;
        return djrmVar != null ? djrmVar.b : "";
    }

    @Override // defpackage.abmg
    public List<ablx> c() {
        return this.g;
    }

    @Override // defpackage.abmg
    public cjtd d() {
        return cjtd.a(this.a == absg.AREA_EXPLORE ? dtxj.cC : dtxo.cD);
    }

    @Override // defpackage.abmg
    public cjtd e() {
        return cjtd.a(this.a == absg.AREA_EXPLORE ? dtxj.cA : dtxo.cB);
    }

    @Override // defpackage.abmg
    public cqkl f(cjqm cjqmVar) {
        h();
        return cqkl.a;
    }

    @Override // defpackage.abmg
    public cqkl g(cjqm cjqmVar) {
        h();
        return cqkl.a;
    }

    private static dcep<String> j(@dzsi djrm djrmVar) {
        if (djrmVar == null) {
            return dcmr.a;
        }
        return dcbg.b(djrmVar.e).s(abuk.a).B();
    }
}

package defpackage;

import android.content.res.Resources;
import android.view.View;
/* compiled from: PG */
/* renamed from: bfmp  reason: default package */
/* loaded from: classes3.dex */
public class bfmp implements bfmg {
    private static final dcep<dwci> b = dcep.B(dwci.VOTING_FACILITIES);
    public cjtd a = cjtd.b;
    private final iic c;
    private final bfmn d;
    private final bfmi e;
    private final btvo f;
    private iib g;

    public bfmp(bvpe bvpeVar, huc hucVar, bfmn bfmnVar, bfmj bfmjVar, btvo btvoVar) {
        this.d = bfmnVar;
        hub a = hucVar.a(new htz(this) { // from class: bfmo
            private final bfmp a;

            {
                this.a = this;
            }

            @Override // defpackage.htz
            public final cjtd a() {
                return this.a.a;
            }

            @Override // defpackage.htz
            public final cjql b() {
                return null;
            }
        });
        iic j = iid.j();
        View.OnAttachStateChangeListener[] onAttachStateChangeListenerArr = {bvpeVar.b, a};
        ifj ifjVar = (ifj) j;
        ifjVar.e = new bvob(onAttachStateChangeListenerArr);
        ifjVar.f = this.a;
        j.e(dcdc.e());
        this.c = j;
        this.g = j.f();
        this.e = bfmjVar.a(5, b, false);
        this.f = btvoVar;
    }

    @Override // defpackage.acto
    public iib a() {
        return this.g;
    }

    @Override // defpackage.acto
    @dzsi
    public String b() {
        return null;
    }

    @Override // defpackage.bfmg
    public void c(bwrs<ilo> bwrsVar) {
        if (!this.f.getPlaceSheetParameters().af()) {
            return;
        }
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null) {
            e();
            return;
        }
        cjta c = cjtd.c(iloVar.bZ());
        c.d = dtxl.ad;
        cjtd a = c.a();
        this.a = a;
        ((ifj) this.c).f = a;
        this.e.a(bwrsVar);
        dccx F = dcdc.F();
        dcdc<bfmh> dcdcVar = this.e.b;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            F.g(cqgr.fT(new bfmd(), dcdcVar.get(i)));
        }
        this.c.e(F.f());
        if (this.e.a.size() > 5) {
            iic iicVar = this.c;
            bfmn bfmnVar = this.d;
            dcdc<String> dcdcVar2 = this.e.a;
            Resources a2 = bfmnVar.a.a();
            bfmn.a(a2, 1);
            dzsj<brba> dzsjVar = bfmnVar.b;
            bfmn.a(bwrsVar, 3);
            bfmn.a(dcdcVar2, 4);
            bfmn.a("", 5);
            iicVar.g(new bfmm(a2, dzsjVar, bwrsVar, dcdcVar2, ""));
        }
        this.g = this.c.f();
    }

    @Override // defpackage.bfmg
    public Integer d() {
        return Integer.valueOf(this.e.a.size());
    }

    public void e() {
        cjtd cjtdVar = cjtd.b;
        this.a = cjtdVar;
        iic iicVar = this.c;
        ((ifj) iicVar).f = cjtdVar;
        iicVar.e(dcdc.e());
        this.g = this.c.f();
        this.e.b();
    }
}

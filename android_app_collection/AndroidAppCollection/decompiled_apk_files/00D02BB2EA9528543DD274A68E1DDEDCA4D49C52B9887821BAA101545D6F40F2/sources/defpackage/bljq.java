package defpackage;

import android.app.Activity;
import java.util.List;
/* compiled from: PG */
/* renamed from: bljq  reason: default package */
/* loaded from: classes3.dex */
public class bljq implements blja {
    public final blji a;
    public final bljt b;
    public final bljv c;
    private final boolean d;
    private final int e;
    private List<bliy> f = dcdc.e();

    public bljq(blji bljiVar, bljt bljtVar, bljv bljvVar, btvo btvoVar, int i) {
        this.a = bljiVar;
        this.c = bljvVar;
        this.b = bljtVar;
        boolean z = false;
        if (btvoVar.getUgcParameters().ap().d && btvoVar.getUgcParameters().aq().a.isEmpty()) {
            z = true;
        }
        this.d = z;
        this.e = i;
    }

    @Override // defpackage.blja
    public List<bliy> a() {
        return this.f;
    }

    public void b(final bwrs<ilo> bwrsVar, final bliz blizVar) {
        dcdc z;
        ilo c = bwrsVar.c();
        dbsk.s(c);
        if (this.d) {
            dcbg s = dcbg.b(c.bE().a).s(new dbrn(this, bwrsVar) { // from class: bljj
                private final bljq a;
                private final bwrs b;

                {
                    this.a = this;
                    this.b = bwrsVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    bljq bljqVar = this.a;
                    return bljs.k(bljqVar.b, this.b, bljqVar.c, (djck) obj);
                }
            }).o(bljk.a).s(bljl.a);
            blizVar.getClass();
            z = s.o(new dbsl(blizVar) { // from class: bljm
                private final bliz a;

                {
                    this.a = blizVar;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    bliy bliyVar = (bliy) obj;
                    return true;
                }
            }).z();
        } else {
            dcbg s2 = dcbg.b(c.bB()).s(new dbrn(this, bwrsVar) { // from class: bljn
                private final bljq a;
                private final bwrs b;

                {
                    this.a = this;
                    this.b = bwrsVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    bljq bljqVar = this.a;
                    bwrs bwrsVar2 = this.b;
                    doft doftVar = (doft) obj;
                    blji bljiVar = bljqVar.a;
                    Activity activity = (Activity) ((dxjd) bljiVar.a).a;
                    blji.a(activity, 1);
                    btvo a = bljiVar.b.a();
                    blji.a(a, 2);
                    dxio a2 = ((dxjh) bljiVar.c).a();
                    blji.a(a2, 3);
                    cafi a3 = bljiVar.d.a();
                    blji.a(a3, 4);
                    dxio a4 = ((dxjh) bljiVar.e).a();
                    blji.a(a4, 5);
                    blji.a(bwrsVar2, 6);
                    blji.a(doftVar, 7);
                    return new bljh(activity, a, a2, a3, a4, bwrsVar2, doftVar);
                }
            });
            blizVar.getClass();
            z = s2.o(new dbsl(blizVar) { // from class: bljo
                private final bliz a;

                {
                    this.a = blizVar;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    bliy bliyVar = (bliy) obj;
                    return true;
                }
            }).z();
        }
        dccx F = dcdc.F();
        int size = z.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            bliy bliyVar = (bliy) z.get(i2);
            F.g(bliyVar);
            if (!bliyVar.e().booleanValue() && (i = i + 1) >= this.e) {
                break;
            }
        }
        this.f = F.f();
    }

    public void c() {
        this.f = dcdc.e();
    }

    public Boolean d() {
        return Boolean.valueOf(dcbg.b(this.f).p(bljp.a));
    }
}

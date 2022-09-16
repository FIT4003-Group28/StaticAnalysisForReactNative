package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cadz  reason: default package */
/* loaded from: classes4.dex */
public final class cadz {
    public static final dcqe a = dcqe.c("cadz");
    public final caek b;
    public List<cagb> c;
    public List<cagg> d;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;

    public cadz(caek caekVar) {
        this.b = caekVar;
        this.c = new ArrayList(caekVar.A());
        this.d = caekVar.H();
    }

    private static int d(int i, int i2) {
        return i == 0 ? i2 : Math.min(i, i2);
    }

    private static void e(@dzsi cafy cafyVar, cqiv cqivVar) {
        if (cafyVar != null) {
            cafyVar.a(cqivVar);
        }
    }

    public final void a(dwkv dwkvVar, cqiv cqivVar) {
        dwku dwkuVar = dwku.UNKNOWN_COMPONENT;
        dwku b = dwku.b(dwkvVar.b);
        if (b == null) {
            b = dwku.UNKNOWN_COMPONENT;
        }
        int ordinal = b.ordinal();
        if (ordinal != 10) {
            switch (ordinal) {
                case 1:
                    int d = d(dwkvVar.c, this.c.size());
                    for (cagb cagbVar : this.c.subList(0, d)) {
                        if (cagbVar.q().booleanValue()) {
                            if (this.b.aa().booleanValue()) {
                                cqivVar.a(new carl(), cagbVar);
                            } else {
                                cqivVar.a(new carm(), cagbVar);
                            }
                        }
                    }
                    List<cagb> list = this.c;
                    this.c = list.subList(d, list.size());
                    return;
                case 2:
                    e(this.b.B(), cqivVar);
                    return;
                case 3:
                    int d2 = d(dwkvVar.c, this.d.size());
                    for (cagg caggVar : this.d.subList(0, d2)) {
                        cqivVar.a(new catu(), caggVar);
                    }
                    List<cagg> list2 = this.d;
                    this.d = list2.subList(d2, list2.size());
                    return;
                case 4:
                    e(this.b.F(), cqivVar);
                    return;
                case 5:
                    e(this.b.E(), cqivVar);
                    return;
                case 6:
                    e(this.b.C(), cqivVar);
                    return;
                case 7:
                    e(this.b.D(), cqivVar);
                    return;
                default:
                    Object[] objArr = new Object[1];
                    dwku b2 = dwku.b(dwkvVar.b);
                    if (b2 == null) {
                        b2 = dwku.UNKNOWN_COMPONENT;
                    }
                    objArr[0] = b2;
                    bvoo.h("Unsupported ranking component: %s", objArr);
                    return;
            }
        }
        e(this.b.G(), cqivVar);
    }

    public final void b(cqiv cqivVar) {
        if (!this.g) {
            cqivVar.a(new casa(), this.b);
            this.g = true;
        }
    }

    public final void c(cqiv cqivVar) {
        if (!this.e) {
            cqivVar.a(new hsd(), hsd.e(cqrp.d(16.0d)));
            this.e = true;
        }
    }
}

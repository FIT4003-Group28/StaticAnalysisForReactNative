package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: boww  reason: default package */
/* loaded from: classes3.dex */
public final class boww extends bowv {
    private final dcdc<ilo> B;
    private final boxj C;
    private final boxi D;
    private final dcdn<String, bokk> E;

    public boww(ilo iloVar, List<ilo> list, @dzsi dodb dodbVar, dnqe dnqeVar) {
        super(iloVar, dnqeVar);
        boolean z;
        doay ce = iloVar.ce();
        Iterator<ilo> it = list.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            if (it.next().ce() != ce) {
                z = false;
            }
            dbsk.a(z);
        }
        this.B = dcdc.r(list);
        dcdc e = dcdc.e();
        if (ce == doay.TYPE_ROAD) {
            List<dodb> t = t(iloVar);
            dccx F = dcdc.F();
            for (dodb dodbVar2 : t) {
                Iterator<ilo> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!t(it2.next()).contains(dodbVar2)) {
                            break;
                        }
                    } else {
                        F.g(dodbVar2);
                        break;
                    }
                }
            }
            e = F.f();
            if (dodbVar != null && !e.contains(dodbVar)) {
                z = false;
            }
            dbsk.l(z);
        }
        this.C = new boxj(e, dodbVar);
        this.D = new boxi(e, dbsg.j(dodbVar));
        dcdg p = dcdn.p();
        int size = e.size();
        for (int i = 0; i < size; i++) {
            dodb dodbVar3 = (dodb) e.get(i);
            p.f(dodbVar3.b, new bokk(dodbVar3.c, false));
        }
        this.E = p.b();
    }

    private static List<dodb> t(ilo iloVar) {
        dodc dodcVar = iloVar.cd().e;
        if (dodcVar == null) {
            dodcVar = dodc.i;
        }
        return dodcVar.f;
    }

    @Override // defpackage.bowv
    public final dcdc<ilo> a() {
        dccx F = dcdc.F();
        F.g(this.a);
        F.i(this.B);
        return F.f();
    }

    @Override // defpackage.bowv
    public final boolean b() {
        return c() != null;
    }

    @Override // defpackage.bowv
    @dzsi
    public final dodb c() {
        return this.C.c();
    }

    @Override // defpackage.bowv
    public final boxi d() {
        return this.D;
    }

    @Override // defpackage.bowv
    public final Map<String, bokk> e() {
        return this.E;
    }
}

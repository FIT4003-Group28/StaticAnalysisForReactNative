package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: edv  reason: default package */
/* loaded from: classes3.dex */
public final class edv implements wvs, ecx, ecz {
    final xei a = new xei();
    private final azqb b;

    public edv(azqb azqbVar, edd eddVar) {
        this.b = azqbVar;
        eddVar.a(this);
    }

    @Override // defpackage.ecx
    public final void b() {
        ArrayList arrayList = new ArrayList();
        for (xeh xehVar : this.a.c()) {
            if (xehVar.b instanceof xdp) {
                arrayList.add(xehVar);
            }
        }
        if (!arrayList.isEmpty()) {
            ((wvr) this.b.get()).q(arrayList);
        }
    }

    @Override // defpackage.ecx
    public final /* synthetic */ void f(xdo xdoVar, String str) {
    }

    @Override // defpackage.ecx
    public final void h(xdo xdoVar) {
        ArrayList arrayList = new ArrayList();
        for (xeh xehVar : this.a.c()) {
            xek xekVar = xehVar.b;
            if ((xekVar instanceof xds) && akzj.f(xdoVar.a, ((xds) xekVar).a.a)) {
                arrayList.add(xehVar);
            }
        }
        if (!arrayList.isEmpty()) {
            ((wvr) this.b.get()).q(arrayList);
        }
    }

    @Override // defpackage.ecx
    public final /* synthetic */ void j(List list) {
    }

    @Override // defpackage.ecx
    public final /* synthetic */ void l(xdo xdoVar) {
    }

    @Override // defpackage.ecx
    public final /* synthetic */ void m(int i, xdo xdoVar) {
    }

    @Override // defpackage.ecz
    public final void n(ecy ecyVar) {
        ecyVar.a(this);
    }

    @Override // defpackage.ecz
    public final void o(eda edaVar) {
    }

    @Override // defpackage.wvs
    public final void qN(int i, xek xekVar, xdu xduVar, xci xciVar) {
        if (this.a.e(xekVar.c())) {
            String str = xduVar.a;
            throw new wuq(str.length() != 0 ? "Tried to register duplicate trigger for slot: ".concat(str) : new String("Tried to register duplicate trigger for slot: "));
        } else if ((xekVar instanceof xdp) || (xekVar instanceof xds) || (xekVar instanceof xdr)) {
            this.a.d(xekVar.c(), new xeh(i, xekVar, xduVar, xciVar));
            if (!(xekVar instanceof xdr)) {
                return;
            }
            xdr xdrVar = (xdr) xekVar;
            if (xdrVar.b.d == null) {
                return;
            }
            ((wvr) this.b.get()).q(Arrays.asList(this.a.a(xdrVar.a)));
        } else {
            String str2 = xduVar.a;
            String name = xekVar.b().name();
            StringBuilder sb = new StringBuilder(str2.length() + 91 + String.valueOf(name).length());
            sb.append("Incorrect TriggerType: Tried to register trigger for slot: ");
            sb.append(str2);
            sb.append(" of type ");
            sb.append(name);
            sb.append(" in ReelsTriggerAdapter");
            throw new wuq(sb.toString());
        }
    }

    @Override // defpackage.wvs
    public final void qO(xek xekVar) {
        this.a.b(xekVar.c());
    }

    @Override // defpackage.ecz
    public final void s() {
    }

    @Override // defpackage.ecx
    public final void v(xdo xdoVar) {
        ArrayList arrayList = new ArrayList();
        for (xeh xehVar : this.a.c()) {
            xek xekVar = xehVar.b;
            if ((xekVar instanceof xdr) && akzj.f(xdoVar.a, ((xdr) xekVar).b.a)) {
                arrayList.add(xehVar);
            }
        }
        if (!arrayList.isEmpty()) {
            ((wvr) this.b.get()).q(arrayList);
        }
    }
}

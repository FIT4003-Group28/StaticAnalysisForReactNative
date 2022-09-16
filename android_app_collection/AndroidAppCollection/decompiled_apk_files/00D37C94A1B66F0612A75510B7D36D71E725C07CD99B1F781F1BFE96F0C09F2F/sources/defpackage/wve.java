package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: wve  reason: default package */
/* loaded from: classes4.dex */
public final class wve implements wvs, wun, wuk, wui, wuj, wue, wuf, wuh, wug, wuc, wud, wua, wub {
    private final azqb b;
    final xei a = new xei();
    private final Set c = new HashSet();
    private final Set e = new HashSet();
    private final Set d = new HashSet();
    private final Set f = new HashSet();
    private final Set g = new HashSet();

    public wve(azqb azqbVar) {
        this.b = azqbVar;
    }

    private final void l(List list, xeh xehVar, ampq ampqVar, ampq ampqVar2) {
        xek xekVar = xehVar.b;
        if (!(xekVar instanceof xcm)) {
            return;
        }
        xcm xcmVar = (xcm) xekVar;
        if (!ampqVar.h() && !ampqVar2.h()) {
            return;
        }
        if (ampqVar.h() && !TextUtils.equals((CharSequence) ampqVar.c(), xcmVar.b)) {
            return;
        }
        if ((ampqVar2.h() && !TextUtils.equals((CharSequence) ampqVar2.c(), xcmVar.a)) || !this.d.contains(xcmVar.b) || !this.g.contains(xcmVar.a)) {
            return;
        }
        list.add(xehVar);
    }

    @Override // defpackage.wuc
    public final void a(xdu xduVar, xci xciVar) {
        this.f.add(xciVar.a);
    }

    @Override // defpackage.wue
    public final void b(xdu xduVar) {
        ArrayList arrayList = new ArrayList();
        for (xeh xehVar : this.a.c()) {
            xek xekVar = xehVar.b;
            if ((xekVar instanceof xdw) && TextUtils.equals(((xdw) xekVar).a, xduVar.a)) {
                arrayList.add(xehVar);
            }
        }
        if (!arrayList.isEmpty()) {
            ((wvr) this.b.get()).q(arrayList);
        }
    }

    @Override // defpackage.wuf
    public final void d(xdu xduVar) {
        this.e.add(xduVar.a);
        ArrayList arrayList = new ArrayList();
        for (xeh xehVar : this.a.c()) {
            xek xekVar = xehVar.b;
            if ((xekVar instanceof xdx) && TextUtils.equals(((xdx) xekVar).a, xduVar.a)) {
                arrayList.add(xehVar);
            }
        }
        if (!arrayList.isEmpty()) {
            ((wvr) this.b.get()).q(arrayList);
        }
    }

    @Override // defpackage.wug
    public final void e(xdu xduVar) {
        this.e.remove(xduVar.a);
        ArrayList arrayList = new ArrayList();
        for (xeh xehVar : this.a.c()) {
            xek xekVar = xehVar.b;
            if ((xekVar instanceof xdy) && TextUtils.equals(((xdy) xekVar).a, xduVar.a)) {
                arrayList.add(xehVar);
            }
        }
        if (!arrayList.isEmpty()) {
            ((wvr) this.b.get()).q(arrayList);
        }
    }

    @Override // defpackage.wui
    public final void f(xdu xduVar) {
        this.c.add(xduVar.a);
        ArrayList arrayList = new ArrayList();
        for (xeh xehVar : this.a.c()) {
            xek xekVar = xehVar.b;
            if ((xekVar instanceof xea) && TextUtils.equals(((xea) xekVar).a, xduVar.a)) {
                arrayList.add(xehVar);
            }
        }
        if (!arrayList.isEmpty()) {
            ((wvr) this.b.get()).q(arrayList);
        }
    }

    @Override // defpackage.wuk
    public final Set g() {
        return this.g;
    }

    @Override // defpackage.wun
    public final Set h() {
        return this.e;
    }

    @Override // defpackage.wuj
    public final void i(xdu xduVar) {
        this.c.remove(xduVar.a);
        this.d.remove(xduVar.a);
    }

    @Override // defpackage.wuh
    public final void j(xdu xduVar) {
        this.d.add(xduVar.a);
        ArrayList arrayList = new ArrayList();
        for (xeh xehVar : this.a.c()) {
            l(arrayList, xehVar, ampq.j(xduVar.a), amon.a);
        }
        if (!arrayList.isEmpty()) {
            ((wvr) this.b.get()).q(arrayList);
        }
    }

    @Override // defpackage.wun
    public final Set k() {
        return this.d;
    }

    @Override // defpackage.wua
    public final void o(xdu xduVar, xci xciVar) {
        this.g.add(xciVar.a);
        ArrayList arrayList = new ArrayList();
        for (xeh xehVar : this.a.c()) {
            xek xekVar = xehVar.b;
            if ((xekVar instanceof xcn) && TextUtils.equals(xciVar.a, ((xcn) xekVar).a)) {
                arrayList.add(xehVar);
            }
            xek xekVar2 = xehVar.b;
            if (xekVar2 instanceof xdc) {
                xdc xdcVar = (xdc) xekVar2;
                if (xduVar.c() == xdcVar.b && xciVar.b == xdcVar.c && !TextUtils.equals(xciVar.a, xdcVar.a)) {
                    arrayList.add(xehVar);
                }
            }
            l(arrayList, xehVar, amon.a, ampq.j(xciVar.a));
        }
        if (!arrayList.isEmpty()) {
            ((wvr) this.b.get()).q(arrayList);
        }
    }

    @Override // defpackage.wvs
    public final void qN(int i, xek xekVar, xdu xduVar, xci xciVar) {
        if (this.a.e(xekVar.c())) {
            String valueOf = String.valueOf(xekVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Tried to register duplicate trigger: ");
            sb.append(valueOf);
            throw new wuq(sb.toString());
        }
        boolean z = xekVar instanceof xea;
        if (z || (xekVar instanceof xdw) || (xekVar instanceof xdx) || (xekVar instanceof xdy) || (xekVar instanceof xdc) || (xekVar instanceof xcn) || (xekVar instanceof xco) || (xekVar instanceof xcl) || (xekVar instanceof xck) || (xekVar instanceof xcm)) {
            if (xekVar instanceof xco) {
                xco xcoVar = (xco) xekVar;
                if (!this.f.contains(xcoVar.a) && (xciVar == null || !TextUtils.equals(xcoVar.a, xciVar.a))) {
                    throw new wuq("LayoutIdExitedTrigger has unrecognized layoutId");
                }
            }
            if (xekVar instanceof xcl) {
                xcl xclVar = (xcl) xekVar;
                if (!this.f.contains(xclVar.a) && (xciVar == null || !TextUtils.equals(xclVar.a, xciVar.a))) {
                    throw new wuq("LayoutExitedForReasonTrigger has unrecognized layoutId");
                }
            }
            if (xekVar instanceof xck) {
                xck xckVar = (xck) xekVar;
                if (!this.f.contains(xckVar.f()) && (xciVar == null || !TextUtils.equals(xckVar.f(), xciVar.a))) {
                    throw new wuq("LayoutExitedForOtherReasonTrigger has unrecognized layoutId");
                }
            }
            if (xekVar instanceof xdy) {
                xdy xdyVar = (xdy) xekVar;
                if (!this.c.contains(xdyVar.a) && !TextUtils.equals(xdyVar.a, xduVar.a)) {
                    throw new wuq("SlotIdExitedTrigger has unrecognized slotId");
                }
            }
            this.a.d(xekVar.c(), new xeh(i, xekVar, xduVar, xciVar));
            if (z && this.c.contains(((xea) xekVar).a)) {
                ((wvr) this.b.get()).q(Arrays.asList(this.a.a(xekVar.c())));
            }
            if ((xekVar instanceof xdx) && this.e.contains(((xdx) xekVar).a)) {
                ((wvr) this.b.get()).q(Arrays.asList(this.a.a(xekVar.c())));
            }
            if (!(xekVar instanceof xcn) || !this.g.contains(((xcn) xekVar).a)) {
                return;
            }
            ((wvr) this.b.get()).q(Arrays.asList(this.a.a(xekVar.c())));
            return;
        }
        String name = xekVar.b().name();
        StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 104);
        sb2.append("Incorrect TriggerType: Tried to register trigger for slot of type: ");
        sb2.append(name);
        sb2.append(" in AdsControlFlowEventTriggerAdapter");
        throw new wuq(sb2.toString());
    }

    @Override // defpackage.wvs
    public final void qO(xek xekVar) {
        this.a.b(xekVar.c());
    }

    @Override // defpackage.wub
    public final void s(xdu xduVar, xci xciVar, int i) {
        this.g.remove(xciVar.a);
        ArrayList arrayList = new ArrayList();
        for (xeh xehVar : this.a.c()) {
            xek xekVar = xehVar.b;
            if ((xekVar instanceof xco) && TextUtils.equals(xciVar.a, ((xco) xekVar).a)) {
                arrayList.add(xehVar);
            }
            xek xekVar2 = xehVar.b;
            if (xekVar2 instanceof xcl) {
                xcl xclVar = (xcl) xekVar2;
                if (TextUtils.equals(xciVar.a, xclVar.a) && xclVar.b == i) {
                    arrayList.add(xehVar);
                }
            }
            xek xekVar3 = xehVar.b;
            if (xekVar3 instanceof xck) {
                xck xckVar = (xck) xekVar3;
                if (TextUtils.equals(xciVar.a, xckVar.f()) && xckVar.e() != i) {
                    arrayList.add(xehVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            ((wvr) this.b.get()).q(arrayList);
        }
    }

    @Override // defpackage.wud
    public final void v(xci xciVar) {
        this.f.remove(xciVar.a);
    }
}

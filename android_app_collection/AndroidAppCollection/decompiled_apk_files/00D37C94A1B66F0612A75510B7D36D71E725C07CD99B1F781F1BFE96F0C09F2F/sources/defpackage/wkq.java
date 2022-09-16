package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: wkq  reason: default package */
/* loaded from: classes4.dex */
public final class wkq implements wtn, wvr, wuv, wqf, wkt, woj, wum {
    private final wkr a;
    private final Set b;
    private final Set c;
    private final Set d;
    private final Set e;
    private final Set f;
    private final Set g;
    private final Set h;
    private final Set i;
    private final Set j;
    private final Set k;
    private final xir l;
    private final wtx m;
    private final aadd n;
    private final wtv o;

    public wkq(wkr wkrVar, Set set, Set set2, Set set3, Set set4, Set set5, Set set6, Set set7, Set set8, Set set9, Set set10, xir xirVar, wtv wtvVar, wtx wtxVar, aadd aaddVar) {
        this.a = wkrVar;
        this.b = set;
        this.c = set2;
        this.d = set3;
        this.e = set4;
        this.g = set5;
        this.f = set6;
        this.h = set7;
        this.i = set8;
        this.j = set9;
        this.k = set10;
        this.l = xirVar;
        this.o = wtvVar;
        this.m = wtxVar;
        this.n = aaddVar;
    }

    private final void A(xdu xduVar) {
        if (this.a.m(xduVar) && this.a.a(xduVar).o == 3 && this.a.l(xduVar)) {
            this.l.a(apbz.ADS_CLIENT_EVENT_TYPE_ENTER_LAYOUT_REQUESTED, this.a.b(xduVar), xduVar, this.a.c(xduVar));
            wks a = this.a.a(xduVar);
            a.o = 4;
            a.k.qI();
        }
    }

    private final void B(xdu xduVar, xci xciVar, int i) {
        apbz apbzVar = (apbz) wvv.c.get(Integer.valueOf(i));
        xir xirVar = this.l;
        if (apbzVar == null) {
            apbzVar = apbz.ADS_CLIENT_EVENT_TYPE_UNSPECIFIED;
        }
        xirVar.a(apbzVar, this.a.b(xduVar), xduVar, xciVar);
        wks a = this.a.a(xduVar);
        if (a.o != 4) {
            wkr.u(a, "stopRenderingLayout");
        }
        a.o = 5;
        a.k.qJ(i);
    }

    private final void C(xdu xduVar, boolean z) {
        this.a.a(xduVar).l = false;
        if (!z) {
            wks a = this.a.a(xduVar);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(a.g);
            a.g.clear();
            q(arrayList);
        }
    }

    private final boolean D(xdu xduVar, xci xciVar) {
        return this.a.m(xduVar) && this.a.l(xduVar) && this.a.q(xduVar) && this.a.p(xduVar) && this.a.o(xduVar, xciVar);
    }

    private final void v(xdu xduVar, boolean z) {
        xci c = this.a.c(xduVar);
        int i = 4;
        if (D(xduVar, c)) {
            if (true == z) {
                i = 1;
            }
            B(xduVar, c, i);
            return;
        }
        this.l.b(apbz.ADS_CLIENT_EVENT_TYPE_EXIT_SLOT_REQUESTED, this.a.b(xduVar), xduVar, z);
        wks a = this.a.a(xduVar);
        int i2 = a.o;
        if (i2 != 2 && i2 != 3 && i2 != 4) {
            wkr.u(a, "exitSlot");
        }
        a.o = 6;
        a.j.b();
    }

    private final void w(xcb xcbVar, xdu xduVar, xci xciVar, int i) {
        apbz apbzVar = (apbz) wvv.d.get(Integer.valueOf(i));
        xir xirVar = this.l;
        if (apbzVar == null) {
            apbzVar = apbz.ADS_CLIENT_EVENT_TYPE_UNSPECIFIED;
        }
        xirVar.a(apbzVar, xcbVar, xduVar, xciVar);
    }

    private final void x(xcb xcbVar, xdu xduVar, xci xciVar) {
        this.l.a(apbz.ADS_CLIENT_EVENT_TYPE_LAYOUT_ENTERED, xcbVar, xduVar, xciVar);
        for (wua wuaVar : this.j) {
            wuaVar.o(xduVar, xciVar);
        }
    }

    private final void y(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xeh xehVar = (xeh) it.next();
            if (D(xehVar.c, xehVar.d)) {
                B(xehVar.c, xehVar.d, i);
            }
        }
    }

    private final void z(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xeh xehVar = (xeh) it.next();
            xci xciVar = xehVar.d;
            if (xciVar == null || !xciVar.g.containsKey(xehVar.b)) {
                xdu xduVar = xehVar.c;
                xci xciVar2 = xehVar.d;
                String valueOf = String.valueOf(xehVar.b.b().name());
                wwf.b(xduVar, xciVar2, valueOf.length() != 0 ? "Ping migration no associated ping bindings for activated trigger: ".concat(valueOf) : new String("Ping migration no associated ping bindings for activated trigger: "));
            } else {
                List<apae> list2 = (List) xehVar.d.g.get(xehVar.b);
                this.l.c(apbz.ADS_CLIENT_EVENT_TYPE_PING_SEND_REQUESTED, xehVar.c, xehVar.d, new xdj(xehVar.b.b(), list2.size(), amuk.q()), this.a.b(xehVar.c));
                amuf f = amuk.f();
                int i = 0;
                for (apae apaeVar : list2) {
                    try {
                        xcd a = this.m.a(xehVar.c, xehVar.d, xehVar.e, apaeVar);
                        this.o.a(a);
                        f.h(ampq.j(a));
                        i++;
                    } catch (MalformedURLException | wlb | wup e) {
                        xdu xduVar2 = xehVar.c;
                        xci xciVar3 = xehVar.d;
                        String valueOf2 = String.valueOf(e.getMessage());
                        wwf.b(xduVar2, xciVar3, valueOf2.length() != 0 ? "Ping migration failed to send ping".concat(valueOf2) : new String("Ping migration failed to send ping"));
                        f.h(amon.a);
                    }
                }
                if (i > 0) {
                    this.l.c(apbz.ADS_CLIENT_EVENT_TYPE_PING_SENT, xehVar.c, xehVar.d, new xdj(xehVar.b.b(), i, f.g()), this.a.b(xehVar.c));
                }
            }
        }
    }

    @Override // defpackage.wqf
    public final void a(xdu xduVar, xci xciVar) {
        x(this.a.b(xduVar), xduVar, xciVar);
    }

    @Override // defpackage.wkt
    public final void b(xcb xcbVar, xdu xduVar, xci xciVar) {
        x(xcbVar, xduVar, xciVar);
    }

    @Override // defpackage.wqf
    public final void c(xdu xduVar, xci xciVar, wuo wuoVar) {
        wwf.b(xduVar, xciVar, wuoVar.toString());
        r(xduVar, true);
    }

    @Override // defpackage.wqf
    public final void d(xdu xduVar, xci xciVar, int i) {
        if (!this.a.m(xduVar)) {
            wwf.b(xduVar, xciVar, "Warning - got onLayoutExited() when slot was unregistered");
            return;
        }
        w(this.a.b(xduVar), xduVar, xciVar, i);
        if (!this.a.q(xduVar)) {
            wwf.b(xduVar, xciVar, "Warning - got onLayoutExited() when slot was inactive");
        }
        wkr wkrVar = this.a;
        if (wkrVar.o(xduVar, xciVar)) {
            wks a = wkrVar.a(xduVar);
            if (!a.d()) {
                wkr.u(a, "onLayoutExited");
            }
            a.o = 3;
        }
        for (wub wubVar : this.k) {
            wubVar.s(xduVar, xciVar, i);
        }
        if (!this.a.m(xduVar) || !this.a.o(xduVar, xciVar)) {
            return;
        }
        v(xduVar, false);
    }

    @Override // defpackage.wkt
    public final void e(xcb xcbVar, xdu xduVar, xci xciVar, int i) {
        w(xcbVar, xduVar, xciVar, i);
        for (wub wubVar : this.k) {
            wubVar.s(xduVar, xciVar, i);
        }
    }

    @Override // defpackage.wkt
    public final void f(xcb xcbVar, xdu xduVar, xci xciVar) {
        this.l.a(apbz.ADS_CLIENT_EVENT_TYPE_LAYOUT_SCHEDULED, xcbVar, xduVar, xciVar);
        try {
            this.a.i(xduVar, xciVar);
        } catch (wuq e) {
            wwf.a(xduVar, e.toString());
        }
        for (wuc wucVar : this.h) {
            wucVar.a(xduVar, xciVar);
        }
    }

    @Override // defpackage.wum
    public final void g() {
        wkr wkrVar = this.a;
        ArrayList<xdu> arrayList = new ArrayList();
        for (Map map : wkrVar.g.values()) {
            for (wks wksVar : map.values()) {
                arrayList.add(wksVar.a);
            }
        }
        for (xdu xduVar : arrayList) {
            if (this.a.p(xduVar)) {
                this.l.a(apbz.ADS_CLIENT_EVENT_TYPE_NON_TERMINAL_ABANDON, this.a.b(xduVar), xduVar, this.a.c(xduVar));
            } else {
                this.l.b(apbz.ADS_CLIENT_EVENT_TYPE_NON_TERMINAL_ABANDON, this.a.b(xduVar), xduVar, false);
            }
        }
    }

    @Override // defpackage.wuv
    public final void h(xdu xduVar) {
        this.l.b(apbz.ADS_CLIENT_EVENT_TYPE_SLOT_ENTERED, this.a.b(xduVar), xduVar, false);
        try {
            wkr wkrVar = this.a;
            wks a = wkrVar.a(xduVar);
            if (a != null) {
                if (!a.f()) {
                    throw new wuq(wkr.d(a, "validateOnSlotEntered"));
                }
                if (a.j == null) {
                    throw new wuq("No registeredSlotAdapter onSlotEntered");
                }
                for (wks wksVar : wkrVar.e(xduVar).values()) {
                    if (a != wksVar && wksVar.c()) {
                        String a2 = wksVar.a();
                        throw new wuq(a2.length() != 0 ? "Entered a slot when a slot of same type and physical position is already active. Its status: ".concat(a2) : new String("Entered a slot when a slot of same type and physical position is already active. Its status: "));
                    }
                }
                wks a3 = this.a.a(xduVar);
                if (!a3.f()) {
                    wkr.u(a3, "onSlotEntered");
                }
                a3.o = 3;
                for (wuf wufVar : this.e) {
                    wufVar.d(xduVar);
                }
                A(xduVar);
                return;
            }
            throw new wuq("Null slotState for onSlotEntered");
        } catch (wuq e) {
            wwf.a(xduVar, e.toString());
            r(xduVar, true);
        }
    }

    @Override // defpackage.wkt
    public final void i(xcb xcbVar, xdu xduVar) {
        this.l.b(apbz.ADS_CLIENT_EVENT_TYPE_SLOT_ENTERED, xcbVar, xduVar, false);
        for (wuf wufVar : this.e) {
            wufVar.d(xduVar);
        }
    }

    @Override // defpackage.wuv, defpackage.woj
    public final void j(xdu xduVar, wuq wuqVar) {
        wwf.a(xduVar, wuqVar.toString());
        r(xduVar, true);
    }

    @Override // defpackage.wuv
    public final void k(xdu xduVar) {
        if (!this.a.m(xduVar)) {
            wwf.a(xduVar, "Warning - got onSlotExited() when slot was unregistered");
            return;
        }
        this.l.b(apbz.ADS_CLIENT_EVENT_TYPE_SLOT_EXITED, this.a.b(xduVar), xduVar, false);
        wks a = this.a.a(xduVar);
        if (!a.g()) {
            wkr.u(a, "onSlotExited");
        }
        a.o = 1;
        for (wug wugVar : this.g) {
            wugVar.e(xduVar);
        }
        if (!this.a.m(xduVar) || !this.a.n(xduVar)) {
            return;
        }
        r(xduVar, false);
    }

    @Override // defpackage.wkt
    public final void l(xcb xcbVar, xdu xduVar) {
        this.l.b(apbz.ADS_CLIENT_EVENT_TYPE_SLOT_EXITED, xcbVar, xduVar, false);
        for (wug wugVar : this.g) {
            wugVar.e(xduVar);
        }
    }

    @Override // defpackage.woj
    public final void m(xdu xduVar, xci xciVar) {
        if (!this.a.m(xduVar)) {
            return;
        }
        wks a = this.a.a(xduVar);
        if (!a.b()) {
            wkr.t(a, "registerLayout");
        }
        a.p = 2;
        a.n = xciVar;
        if (xciVar == null) {
            this.l.b(apbz.ADS_CLIENT_EVENT_TYPE_SLOT_FULFILLED_EMPTY, this.a.b(xduVar), xduVar, false);
            r(xduVar, false);
            return;
        }
        this.l.a(apbz.ADS_CLIENT_EVENT_TYPE_SLOT_FULFILLED_NON_EMPTY, this.a.b(xduVar), xduVar, xciVar);
        for (wuh wuhVar : this.f) {
            wuhVar.j(xduVar);
        }
        if (!this.a.m(xduVar)) {
            return;
        }
        if (this.a.n(xduVar)) {
            r(xduVar, false);
            return;
        }
        this.l.a(apbz.ADS_CLIENT_EVENT_TYPE_SCHEDULE_LAYOUT_REQUESTED, this.a.b(xduVar), xduVar, xciVar);
        try {
            wkr wkrVar = this.a;
            xci xciVar2 = wkrVar.a(xduVar).n;
            if (xciVar2.d.isEmpty() && xciVar2.e.isEmpty() && xciVar2.f.isEmpty()) {
                throw new wuo("Layout has no exit triggers.");
            }
            wkrVar.k(xciVar2.d);
            wkrVar.k(xciVar2.e);
            wkrVar.k(xciVar2.f);
            wkrVar.k(xciVar2.g.keySet());
            this.a.f(xduVar);
            try {
                wkr wkrVar2 = this.a;
                wks a2 = wkrVar2.a(xduVar);
                wrj wrjVar = wkrVar2.b;
                xci xciVar3 = a2.n;
                azqb azqbVar = (azqb) wrjVar.b.get(xduVar.c());
                if (azqbVar == null) {
                    String valueOf = String.valueOf(xduVar.c().name());
                    throw new wrh(valueOf.length() != 0 ? "Could not find a matching layoutRenderingAdapterFactory for slotType: ".concat(valueOf) : new String("Could not find a matching layoutRenderingAdapterFactory for slotType: "));
                }
                wqg a3 = ((wri) azqbVar.get()).a((wqf) wrjVar.a.get(), xduVar, xciVar3);
                a3.b();
                a2.k = a3;
                wkrVar2.i(a2.a, a2.n);
                xci xciVar4 = a2.n;
                wkrVar2.h(a2, xciVar4, xciVar4.d, 1);
                wkrVar2.h(a2, xciVar4, xciVar4.e, 2);
                wkrVar2.h(a2, xciVar4, xciVar4.f, 3);
                this.l.a(apbz.ADS_CLIENT_EVENT_TYPE_LAYOUT_SCHEDULED, this.a.b(xduVar), xduVar, xciVar);
                for (wuc wucVar : this.h) {
                    wucVar.a(xduVar, xciVar);
                }
                C(xduVar, false);
                A(xduVar);
            } catch (wrh | wuq e) {
                wwf.b(xduVar, xciVar, e.toString());
                C(xduVar, true);
                r(xduVar, true);
            }
        } catch (wuo e2) {
            wwf.b(xduVar, xciVar, e2.toString());
            r(xduVar, true);
        }
    }

    @Override // defpackage.woj
    public final void n(xdu xduVar) {
        this.l.b(apbz.ADS_CLIENT_EVENT_TYPE_SLOT_FULFILLMENT_CANCELLED, this.a.b(xduVar), xduVar, false);
        if (!this.a.m(xduVar)) {
            return;
        }
        this.a.a(xduVar).p = 4;
        r(xduVar, false);
    }

    @Override // defpackage.wkt
    public final void o(xcb xcbVar, xdu xduVar) {
        this.l.b(apbz.ADS_CLIENT_EVENT_TYPE_SLOT_SCHEDULED, xcbVar, xduVar, false);
        for (wui wuiVar : this.b) {
            wuiVar.f(xduVar);
        }
    }

    @Override // defpackage.wkt
    public final void p(xcb xcbVar, xdu xduVar) {
        this.l.b(apbz.ADS_CLIENT_EVENT_TYPE_SLOT_UNSCHEDULED, xcbVar, xduVar, false);
        for (wuj wujVar : this.c) {
            wujVar.i(xduVar);
        }
    }

    @Override // defpackage.wvr
    public final void q(List list) {
        SparseArray sparseArray = new SparseArray();
        Collections.sort(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xeh xehVar = (xeh) it.next();
            if (this.a.m(xehVar.c)) {
                if (xrz.m(this.n)) {
                    wkr wkrVar = this.a;
                    if (xehVar.b.d() && wkrVar.a(xehVar.c).h.contains(xehVar)) {
                    }
                }
                if (!this.a.a(xehVar.c).l) {
                    xej xejVar = (xej) xehVar.b.getClass().getAnnotation(xej.class);
                    if (xejVar == null || xehVar.e.d(xejVar.a())) {
                        if (xrz.m(this.n)) {
                            this.a.a(xehVar.c).h.add(xehVar);
                        }
                        xir xirVar = this.l;
                        apbz apbzVar = apbz.ADS_CLIENT_EVENT_TYPE_TRIGGER_ACTIVATED;
                        xcb b = this.a.b(xehVar.c);
                        if (xirVar.a.d()) {
                            xirVar.e(apbzVar, xehVar.c, xehVar.d, xehVar, 0, null, null, b, false);
                        }
                        List list2 = (List) sparseArray.get(xehVar.a);
                        if (list2 == null) {
                            list2 = new ArrayList();
                            sparseArray.put(xehVar.a, list2);
                        }
                        list2.add(xehVar);
                    } else {
                        xdu xduVar = xehVar.c;
                        xci xciVar = xehVar.d;
                        String valueOf = String.valueOf(xehVar.b.b().name());
                        wwf.b(xduVar, xciVar, valueOf.length() != 0 ? "TriggerBundle doesn't have the required metadata specified by the trigger ".concat(valueOf) : new String("TriggerBundle doesn't have the required metadata specified by the trigger "));
                    }
                } else {
                    this.a.a(xehVar.c).g.add(xehVar);
                }
            }
        }
        if (sparseArray.get(0) != null) {
            z((List) sparseArray.get(0));
        }
        if (sparseArray.get(1) != null) {
            y((List) sparseArray.get(1), 0);
        }
        if (sparseArray.get(2) != null) {
            y((List) sparseArray.get(2), 2);
        }
        if (sparseArray.get(3) != null) {
            y((List) sparseArray.get(3), 3);
        }
        if (sparseArray.get(6) != null) {
            for (xeh xehVar2 : (List) sparseArray.get(6)) {
                r(xehVar2.c, false);
            }
        }
        if (sparseArray.get(7) != null) {
            for (xeh xehVar3 : (List) sparseArray.get(7)) {
                int i = this.a.a(xehVar3.c).p;
                if (i != 1 && i != 2) {
                    this.l.b(apbz.ADS_CLIENT_EVENT_TYPE_FULFILL_SLOT_REQUESTED, this.a.b(xehVar3.c), xehVar3.c, false);
                    wks a = this.a.a(xehVar3.c);
                    if (a.p != 0) {
                        wkr.t(a, "markFillRequested");
                    }
                    a.p = 1;
                    a.i.a();
                }
            }
        }
        if (sparseArray.get(8) != null) {
            for (xeh xehVar4 : (List) sparseArray.get(8)) {
                if (!this.a.r(xehVar4.c) && !this.a.q(xehVar4.c)) {
                    this.l.b(apbz.ADS_CLIENT_EVENT_TYPE_ENTER_SLOT_REQUESTED, this.a.b(xehVar4.c), xehVar4.c, false);
                    try {
                        wkr wkrVar2 = this.a;
                        xdu xduVar2 = xehVar4.c;
                        wks a2 = wkrVar2.a(xduVar2);
                        if (a2 != null) {
                            if (a2.j != null) {
                                if (!a2.e()) {
                                    throw new wuq(wkr.d(a2, "validateEnterSlot"));
                                }
                                for (wks wksVar : wkrVar2.e(xduVar2).values()) {
                                    if (a2 != wksVar && wksVar.c()) {
                                        int i2 = wksVar.o;
                                        StringBuilder sb = new StringBuilder(112);
                                        sb.append("Trying to enter a slot when a slot of same type and physical position is already active. Its status: ");
                                        sb.append(i2);
                                        throw new wuq(sb.toString());
                                    }
                                }
                                wks a3 = this.a.a(xehVar4.c);
                                if (!a3.e()) {
                                    wkr.u(a3, "requestEnterSlot");
                                }
                                a3.o = 2;
                                a3.j.a();
                                for (wue wueVar : this.d) {
                                    wueVar.b(xehVar4.c);
                                }
                            } else {
                                throw new wuq("Tried to enter slot with no assigned slotAdapter");
                            }
                        } else {
                            throw new wuq("Got enter request for unknown slot");
                        }
                    } catch (wuq e) {
                        wwf.a(xehVar4.c, e.toString());
                        r(xehVar4.c, true);
                    }
                }
            }
        }
    }

    final void r(xdu xduVar, boolean z) {
        if (!this.a.m(xduVar)) {
            return;
        }
        if (this.a.a(xduVar).g() || this.a.a(xduVar).o == 5) {
            this.a.g(xduVar);
            if (!z) {
                return;
            }
        }
        if (this.a.q(xduVar) || this.a.r(xduVar)) {
            this.a.g(xduVar);
            v(xduVar, z);
        } else if (!this.a.a(xduVar).b()) {
            xci c = this.a.c(xduVar);
            xcb b = this.a.b(xduVar);
            this.l.b(apbz.ADS_CLIENT_EVENT_TYPE_UNSCHEDULE_SLOT_REQUESTED, b, xduVar, z);
            wkr wkrVar = this.a;
            wks a = wkrVar.a(xduVar);
            if (a != null) {
                amuk amukVar = xduVar.d;
                int i = ((amxx) amukVar).c;
                for (int i2 = 0; i2 < i; i2++) {
                    xek xekVar = (xek) amukVar.get(i2);
                    wvs wvsVar = (wvs) a.c.remove(xekVar.c());
                    if (wvsVar != null) {
                        wvsVar.qO(xekVar);
                    }
                }
                amuk amukVar2 = xduVar.e;
                int i3 = ((amxx) amukVar2).c;
                for (int i4 = 0; i4 < i3; i4++) {
                    xek xekVar2 = (xek) amukVar2.get(i4);
                    wvs wvsVar2 = (wvs) a.d.remove(xekVar2.c());
                    if (wvsVar2 != null) {
                        wvsVar2.qO(xekVar2);
                    }
                }
                amuk amukVar3 = xduVar.f;
                int i5 = ((amxx) amukVar3).c;
                for (int i6 = 0; i6 < i5; i6++) {
                    xek xekVar3 = (xek) amukVar3.get(i6);
                    wvs wvsVar3 = (wvs) a.f.remove(xekVar3.c());
                    if (wvsVar3 != null) {
                        wvsVar3.qO(xekVar3);
                    }
                }
                if (wkrVar.l(xduVar)) {
                    xci xciVar = a.n;
                    wkr.s(a, xciVar.d);
                    wkr.s(a, xciVar.e);
                    wkr.s(a, xciVar.f);
                    wkrVar.j(xciVar);
                }
                a.i = null;
                a.j = null;
                wqg wqgVar = a.k;
                if (wqgVar != null) {
                    wqgVar.qH();
                }
                a.k = null;
            }
            wkr wkrVar2 = this.a;
            wks a2 = wkrVar2.a(xduVar);
            if (a2 != null) {
                int i7 = a2.o;
                if (i7 != 0 && i7 != 1) {
                    wkr.u(a2, "unregisterSlot");
                }
                a2.o = 0;
                wkrVar2.e(xduVar).remove(xduVar.a);
            }
            this.l.b(apbz.ADS_CLIENT_EVENT_TYPE_SLOT_UNSCHEDULED, b, xduVar, z);
            for (wuj wujVar : this.c) {
                wujVar.i(xduVar);
            }
            if (c == null) {
                return;
            }
            for (wud wudVar : this.i) {
                wudVar.v(c);
            }
        } else {
            this.a.g(xduVar);
            try {
                this.l.b(apbz.ADS_CLIENT_EVENT_TYPE_CANCEL_SLOT_FULFILLMENT_REQUESTED, this.a.b(xduVar), xduVar, z);
                wkr wkrVar3 = this.a;
                wks a3 = wkrVar3.a(xduVar);
                if (a3 != null) {
                    if (a3.i != null) {
                        wkrVar3.a(xduVar).p = 3;
                        woo wooVar = a3.i.d;
                        if (!wooVar.c) {
                            wwf.a(wooVar.b, "Tried to cancel task when nothing had been initiated");
                            wooVar.a.n(wooVar.b);
                            return;
                        }
                        wom womVar = wooVar.d;
                        if (womVar != null) {
                            womVar.c = true;
                            womVar.a.cancel(true);
                            return;
                        }
                        wwf.a(wooVar.b, "Tried to cancel task when the task was synchronous");
                        wooVar.a.n(wooVar.b);
                        return;
                    }
                    throw new wuq("Couldn't cancel fill request due to null fulfillment adapter");
                }
                throw new wuq("Couldn't cancel fill request due to null slot");
            } catch (wuq e) {
                wwf.a(xduVar, e.toString());
            }
        }
    }

    @Override // defpackage.wtn
    public final void s(int i, xcb xcbVar, List list) {
        wkr wkrVar;
        wkr wkrVar2;
        wks a;
        azqb azqbVar;
        this.l.d(apbz.ADS_CLIENT_EVENT_TYPE_OPPORTUNITY_PROCESSED, i, list, xcbVar);
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xdu xduVar = (xdu) it.next();
            this.l.b(apbz.ADS_CLIENT_EVENT_TYPE_SCHEDULE_SLOT_REQUESTED, xcbVar, xduVar, false);
            try {
                wkrVar = this.a;
            } catch (wuq e) {
                wwf.a(xduVar, e.toString());
            }
            if (xduVar != null) {
                if (TextUtils.isEmpty(xduVar.a)) {
                    throw new wuq("Slot ID was empty");
                }
                if (wkrVar.f.contains(xduVar.c())) {
                    if (!xduVar.d.isEmpty()) {
                        amuk amukVar = xduVar.d;
                        int i2 = ((amxx) amukVar).c;
                        int i3 = 0;
                        while (i3 < i2) {
                            xek xekVar = (xek) amukVar.get(i3);
                            i3++;
                            if (wkrVar.d.get(xekVar.b()) == null) {
                                String valueOf = String.valueOf(xekVar.b().name());
                                throw new wuq(valueOf.length() != 0 ? "No trigger adapter registered for entry with trigger of type: ".concat(valueOf) : new String("No trigger adapter registered for entry with trigger of type: "));
                            }
                        }
                        if (!xduVar.e.isEmpty()) {
                            amuk amukVar2 = xduVar.e;
                            int i4 = ((amxx) amukVar2).c;
                            int i5 = 0;
                            while (i5 < i4) {
                                xek xekVar2 = (xek) amukVar2.get(i5);
                                i5++;
                                if (wkrVar.d.get(xekVar2.b()) == null) {
                                    String valueOf2 = String.valueOf(xekVar2.b().name());
                                    throw new wuq(valueOf2.length() != 0 ? "No trigger adapter registered for fulfillment with trigger of type: ".concat(valueOf2) : new String("No trigger adapter registered for fulfillment with trigger of type: "));
                                }
                            }
                            if (!xduVar.f.isEmpty()) {
                                amuk amukVar3 = xduVar.f;
                                int i6 = ((amxx) amukVar3).c;
                                int i7 = 0;
                                while (i7 < i6) {
                                    xek xekVar3 = (xek) amukVar3.get(i7);
                                    i7++;
                                    if (wkrVar.d.get(xekVar3.b()) == null) {
                                        String valueOf3 = String.valueOf(xekVar3.b().name());
                                        throw new wuq(valueOf3.length() != 0 ? "No trigger adapter registered for expiration with trigger of type: ".concat(valueOf3) : new String("No trigger adapter registered for expiration with trigger of type: "));
                                    }
                                }
                                Map e2 = this.a.e(xduVar);
                                if (e2.containsKey(xduVar.a)) {
                                    throw new wuq("Duplicate slots not supported");
                                }
                                e2.put(xduVar.a, new wks(xduVar, xcbVar));
                                this.a.f(xduVar);
                                try {
                                    wkrVar2 = this.a;
                                    a = wkrVar2.a(xduVar);
                                    amuk amukVar4 = xduVar.d;
                                    int i8 = ((amxx) amukVar4).c;
                                    for (int i9 = 0; i9 < i8; i9++) {
                                        xek xekVar4 = (xek) amukVar4.get(i9);
                                        wvs wvsVar = (wvs) ((azqb) wkrVar2.d.get(xekVar4.b())).get();
                                        wvsVar.qN(8, xekVar4, xduVar, null);
                                        a.c.put(xekVar4.c(), wvsVar);
                                    }
                                    amuk amukVar5 = xduVar.e;
                                    int i10 = ((amxx) amukVar5).c;
                                    for (int i11 = 0; i11 < i10; i11++) {
                                        xek xekVar5 = (xek) amukVar5.get(i11);
                                        wvs wvsVar2 = (wvs) ((azqb) wkrVar2.d.get(xekVar5.b())).get();
                                        wvsVar2.qN(7, xekVar5, xduVar, null);
                                        a.d.put(xekVar5.c(), wvsVar2);
                                    }
                                    amuk amukVar6 = xduVar.f;
                                    int i12 = ((amxx) amukVar6).c;
                                    for (int i13 = 0; i13 < i12; i13++) {
                                        xek xekVar6 = (xek) amukVar6.get(i13);
                                        wvs wvsVar3 = (wvs) ((azqb) wkrVar2.d.get(xekVar6.b())).get();
                                        wvsVar3.qN(6, xekVar6, xduVar, null);
                                        a.f.put(xekVar6.c(), wvsVar3);
                                    }
                                    azqbVar = (azqb) wkrVar2.c.a.get(xduVar.c());
                                } catch (wpl | wuq | wva e3) {
                                    wwf.a(xduVar, e3.toString());
                                    C(xduVar, true);
                                    r(xduVar, true);
                                }
                                if (azqbVar == null) {
                                    String valueOf4 = String.valueOf(xduVar.c().name());
                                    throw new wpl(valueOf4.length() != 0 ? "Could not find a matching fulfillmentAdapterFactory for slotType: ".concat(valueOf4) : new String("Could not find a matching fulfillmentAdapterFactory for slotType: "));
                                }
                                wok a2 = ((wpm) azqbVar.get()).a(xduVar);
                                wvc wvcVar = wkrVar2.a;
                                azqb azqbVar2 = (azqb) wvcVar.b.get(xduVar.c());
                                if (azqbVar2 == null) {
                                    String valueOf5 = String.valueOf(xduVar.c().name());
                                    throw new wva(valueOf5.length() != 0 ? "Could not find a matching slotAdapterFactory for slotType: ".concat(valueOf5) : new String("Could not find a matching slotAdapterFactory for slotType: "));
                                }
                                wuw a3 = ((wvb) azqbVar2.get()).a((wuv) wvcVar.a.get(), xduVar);
                                a.i = a2;
                                a.j = a3;
                                this.l.b(apbz.ADS_CLIENT_EVENT_TYPE_SLOT_SCHEDULED, xcbVar, xduVar, false);
                                wkr wkrVar3 = this.a;
                                ((yni) wkrVar3.e.get()).d(new wyr());
                                wks a4 = wkrVar3.a(xduVar);
                                if (a4.o != 0) {
                                    wkr.u(a4, "onSlotScheduled");
                                }
                                a4.o = 1;
                                for (wui wuiVar : this.b) {
                                    wuiVar.f(xduVar);
                                }
                                C(xduVar, false);
                            } else {
                                throw new wuq("Slot expiration trigger was empty");
                            }
                        } else {
                            throw new wuq("Slot fulfillment trigger was empty");
                        }
                    } else {
                        throw new wuq("Slot entry trigger was empty");
                    }
                } else {
                    throw new wuq("Slot type not supported by this application");
                }
            } else {
                throw new wuq("Slot was null");
            }
        }
    }

    @Override // defpackage.wtn
    public final void t(int i, xcb xcbVar) {
        this.l.d(apbz.ADS_CLIENT_EVENT_TYPE_OPPORTUNITY_RECEIVED, i, null, xcbVar);
    }

    @Override // defpackage.wkt
    public final void u(xci xciVar) {
        this.a.j(xciVar);
        for (wud wudVar : this.i) {
            wudVar.v(xciVar);
        }
    }
}

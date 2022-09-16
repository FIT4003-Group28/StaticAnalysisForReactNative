package defpackage;

import android.text.TextUtils;
import java.util.Set;
/* compiled from: PG */
/* renamed from: wkv  reason: default package */
/* loaded from: classes4.dex */
public final class wkv extends wky implements wlz, wum, wkw {
    public wkv(xir xirVar, wwf wwfVar, Set set, Set set2, Set set3, Set set4, Set set5, Set set6, Set set7, Set set8) {
        super(xirVar, set, set2, set3, set4, set5, set6, set7, set8);
    }

    private static xci m(aoyz aoyzVar) {
        apcy apcyVar = aoyzVar.d;
        if (apcyVar == null) {
            apcyVar = apcy.a;
        }
        apcx apcxVar = apcyVar.d;
        if (apcxVar == null) {
            apcxVar = apcx.a;
        }
        String str = apcxVar.c;
        apcb b = apcb.b(apcyVar.c);
        if (b == null) {
            b = apcb.LAYOUT_TYPE_UNSPECIFIED;
        }
        return xci.c(str, b, 3, ampq.i(aoyzVar), xac.b(new xal[0]));
    }

    private static xdu n(apan apanVar) {
        apdh apdhVar = apanVar.c;
        if (apdhVar == null) {
            apdhVar = apdh.a;
        }
        apdg apdgVar = apdhVar.f;
        if (apdgVar == null) {
            apdgVar = apdg.a;
        }
        String str = apdgVar.c;
        apcd b = apcd.b(apdhVar.c);
        if (b == null) {
            b = apcd.SLOT_TYPE_UNSPECIFIED;
        }
        return xdu.i(str, b, apdhVar.e, xac.b(new xal[0]));
    }

    @Override // defpackage.wlz
    public final void b(apan apanVar, aoyz aoyzVar) {
        int i = apanVar.b & 2;
        if (i == 0 && (aoyzVar.b & 2) == 0) {
            wwf.a(null, "Invalid input for SectionListExternallyManagedSlotAdapter#onDataDisposed().");
        } else if (i == 0) {
            wwf.a(null, "Missing slot data for Section list item.");
        } else {
            xdu n = n(apanVar);
            wkx wkxVar = (wkx) this.a.get(n.a);
            if (wkxVar == null || !wkxVar.b()) {
                return;
            }
            if ((aoyzVar.b & 2) == 0) {
                wwf.a(n, "Missing layout data for Section list item.");
            } else {
                xci m = m(aoyzVar);
                h(n, m, xcb.a, 0);
                k(n, m);
            }
            i(n, xcb.a);
        }
    }

    @Override // defpackage.wkw
    public final void d(xdu xduVar, boolean z) {
        if (xduVar.c() == apcd.SLOT_TYPE_IN_FEED || xduVar.c() == apcd.SLOT_TYPE_ABOVE_FEED) {
            if (z) {
                for (wkx wkxVar : this.a.values()) {
                    if (wkxVar.b()) {
                        xdu xduVar2 = wkxVar.a;
                        xci xciVar = wkxVar.b;
                        if (wkxVar.c()) {
                            h(xduVar2, xciVar, xcb.a, 0);
                            k(xduVar2, xciVar);
                        }
                        i(xduVar2, xcb.a);
                    }
                }
            }
            this.b.b(apbz.ADS_CLIENT_EVENT_TYPE_SLOT_SCHEDULED, xcb.a, xduVar, false);
            for (wui wuiVar : this.c) {
                wuiVar.f(xduVar);
            }
            try {
                if (xduVar != null) {
                    if (TextUtils.isEmpty(xduVar.a)) {
                        throw new wuq("Slot ID was empty");
                    }
                    if (!this.a.containsKey(xduVar.a)) {
                        this.a.put(xduVar.a, new wkx(xduVar));
                        wkx e = e(xduVar);
                        if (e.c != 0) {
                            wky.l(e, "onSlotExternallyManaged");
                        }
                        e.c = 1;
                        return;
                    }
                    throw new wuq("Duplicate slots not supported");
                }
                throw new wuq("Slot was null");
            } catch (wuq e2) {
                wwf.a(xduVar, e2.toString());
            }
        }
    }

    @Override // defpackage.wlz
    public final void a(apan apanVar, aoyz aoyzVar) {
        if ((apanVar.b & 2) == 0) {
            wwf.a(null, "Invalid Slot input for SectionListExternallyManagedSlotAdapter#onDataBinded().");
            return;
        }
        xdu n = n(apanVar);
        this.b.b(apbz.ADS_CLIENT_EVENT_TYPE_SLOT_ENTERED, xcb.a, n, false);
        for (wuf wufVar : this.e) {
            wufVar.d(n);
        }
        wkx e = e(n);
        if (e != null) {
            try {
                wkx e2 = e(n);
                if (e2.c == 1) {
                    for (wkx wkxVar : this.a.values()) {
                        if (e2 != wkxVar && e2.a.a() == wkxVar.a.a() && e2.a.c() == wkxVar.a.c() && wkxVar.b()) {
                            String a = wkxVar.a();
                            throw new wuq(a.length() != 0 ? "Entered a slot when a slot of same type and physical position is already active. Its status: ".concat(a) : new String("Entered a slot when a slot of same type and physical position is already active. Its status: "));
                        }
                    }
                    e.c = 3;
                } else {
                    throw new wuq(wky.f(e2, "validateOnSlotEnteredExternallyManaged"));
                }
            } catch (wuq e3) {
                wwf.a(n, e3.toString());
            }
        } else {
            wwf.a(n, "Warning - got onSlotEnteredExternallyManaged() when slot was unregistered");
        }
        if ((aoyzVar.b & 2) == 0) {
            wwf.a(n, "Invalid Layout input for SectionListExternallyManagedSlotAdapter#onDataBinded().");
            return;
        }
        xci m = m(aoyzVar);
        this.b.a(apbz.ADS_CLIENT_EVENT_TYPE_LAYOUT_SCHEDULED, xcb.a, n, m);
        for (wuc wucVar : this.f) {
            wucVar.a(n, m);
        }
        wkx e4 = e(n);
        if (e4 == null) {
            wwf.a(n, "Warning - got onLayoutScheduledExternallyManaged() when slot was unregistered");
        } else {
            try {
                if (e4.b == null) {
                    e4.b = m;
                } else {
                    throw new wuq("Multiple layouts on a Slot not supported");
                }
            } catch (wuq e5) {
                wwf.b(n, m, e5.toString());
            }
        }
        this.b.a(apbz.ADS_CLIENT_EVENT_TYPE_LAYOUT_ENTERED, xcb.a, n, m);
        for (wua wuaVar : this.g) {
            wuaVar.o(n, m);
        }
        try {
            super.j(n, m, "onLayoutEnteredExternallyManaged");
            wkx e6 = e(n);
            if (e6.c != 3) {
                wky.l(e6, "onLayoutEnteredExternallyManaged");
            }
            e6.c = 4;
        } catch (wuq e7) {
            wwf.a(n, e7.toString());
        }
    }

    @Override // defpackage.wlz
    public final void c(apan apanVar) {
        if ((apanVar.b & 2) == 0) {
            wwf.a(null, "Invalid Slot input for SectionListExternallyManagedSlotAdapter#onDataClear().");
            return;
        }
        xdu n = n(apanVar);
        xcb xcbVar = xcb.a;
        wkx e = e(n);
        if (e == null) {
            wwf.a(n, "Warning - got onSlotUnscheduledExternallyManaged() when slot was unregistered");
        } else {
            if (e.b()) {
                i(n, xcbVar);
            }
            int i = e.c;
            if (i != 0 && i != 1) {
                wky.l(e, "onSlotUnscheduledExternallyManaged");
            }
            e.c = 0;
            this.a.remove(n.a);
        }
        this.b.b(apbz.ADS_CLIENT_EVENT_TYPE_SLOT_UNSCHEDULED, xcbVar, n, false);
        for (wuj wujVar : this.d) {
            wujVar.i(n);
        }
    }
}

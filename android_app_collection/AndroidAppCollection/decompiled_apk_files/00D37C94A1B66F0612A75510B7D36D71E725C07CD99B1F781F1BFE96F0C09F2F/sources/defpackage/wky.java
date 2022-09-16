package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: wky  reason: default package */
/* loaded from: classes4.dex */
public class wky {
    public final Map a = new HashMap();
    public final xir b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final Set f;
    public final Set g;
    private final Set h;
    private final Set i;
    private final Set j;

    public wky(xir xirVar, Set set, Set set2, Set set3, Set set4, Set set5, Set set6, Set set7, Set set8) {
        this.b = xirVar;
        this.c = set;
        this.d = set2;
        this.e = set3;
        this.h = set4;
        this.f = set5;
        this.g = set6;
        this.i = set7;
        this.j = set8;
    }

    public static String f(wkx wkxVar, String str) {
        String a = wkxVar.a();
        StringBuilder sb = new StringBuilder(a.length() + 37 + str.length());
        sb.append("Slot status was ");
        sb.append(a);
        sb.append(" when calling method ");
        sb.append(str);
        return sb.toString();
    }

    public static final void l(wkx wkxVar, String str) {
        wwf.a(wkxVar.a, f(wkxVar, str));
    }

    public final wkx e(xdu xduVar) {
        return (wkx) this.a.get(xduVar.a);
    }

    public final void g() {
        for (wkx wkxVar : this.a.values()) {
            this.b.b(apbz.ADS_CLIENT_EVENT_TYPE_NON_TERMINAL_ABANDON, xcb.a, wkxVar.a, false);
        }
    }

    public final void h(xdu xduVar, xci xciVar, xcb xcbVar, int i) {
        wkx e = e(xduVar);
        if (e == null || e.c()) {
            apbz apbzVar = (apbz) wvv.d.get(Integer.valueOf(i));
            xir xirVar = this.b;
            if (apbzVar == null) {
                apbzVar = apbz.ADS_CLIENT_EVENT_TYPE_UNSPECIFIED;
            }
            xirVar.a(apbzVar, xcbVar, xduVar, xciVar);
            for (wub wubVar : this.i) {
                wubVar.s(xduVar, xciVar, i);
            }
            try {
                j(xduVar, xciVar, "onLayoutExitedExternallyManaged");
                e.c = 3;
            } catch (wuq e2) {
                wwf.a(xduVar, e2.toString());
            }
        }
    }

    public final void i(xdu xduVar, xcb xcbVar) {
        wkx e = e(xduVar);
        if (e == null) {
            wwf.a(xduVar, "Warning - got onSlotExitedExternallyManaged() when slot was unregistered");
        } else if (e.b()) {
            xci xciVar = e.b;
            if (xciVar != null && e.c()) {
                h(xduVar, xciVar, xcbVar, 4);
            }
            e.c = 1;
        }
        this.b.b(apbz.ADS_CLIENT_EVENT_TYPE_SLOT_EXITED, xcbVar, xduVar, false);
        for (wug wugVar : this.h) {
            wugVar.e(xduVar);
        }
    }

    public final void j(xdu xduVar, xci xciVar, String str) {
        wkx e = e(xduVar);
        if (e != null) {
            xci xciVar2 = e.b;
            if (xciVar2 != null) {
                if (xciVar.a.equals(xciVar2.a)) {
                    return;
                }
                StringBuilder sb = new StringBuilder(str.length() + 64);
                sb.append("Got ");
                sb.append(str);
                sb.append(" when layout is different from registered layout on the slot");
                throw new wuq(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(str.length() + 33);
            sb2.append("Got ");
            sb2.append(str);
            sb2.append(" when layout was unregistered");
            throw new wuq(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(str.length() + 31);
        sb3.append("Got ");
        sb3.append(str);
        sb3.append(" when slot was unregistered");
        throw new wuq(sb3.toString());
    }

    public final void k(xdu xduVar, xci xciVar) {
        wkx e = e(xduVar);
        if (e == null || e.b != null) {
            for (wud wudVar : this.j) {
                wudVar.v(xciVar);
            }
            try {
                j(xduVar, xciVar, "onLayoutUnscheduledExternallyManaged");
                e.b = null;
            } catch (wuq e2) {
                wwf.a(xduVar, e2.toString());
            }
        }
    }
}

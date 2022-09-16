package defpackage;

import android.text.TextUtils;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: wvd  reason: default package */
/* loaded from: classes4.dex */
public final class wvd implements wvs, wlf {
    final xei a = new xei();
    private final azqb b;
    private final azqb c;
    private final wtx d;
    private final wtv e;

    public wvd(azqb azqbVar, azqb azqbVar2, wtv wtvVar, wtx wtxVar) {
        this.b = azqbVar;
        this.c = azqbVar2;
        this.e = wtvVar;
        this.d = wtxVar;
    }

    private final void f(List list) {
        if (!xrz.b((aadd) this.c.get())) {
            return;
        }
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
                for (apae apaeVar : (List) xehVar.d.g.get(xehVar.b)) {
                    try {
                        this.e.a(this.d.a(xehVar.c, xehVar.d, xehVar.e, apaeVar));
                    } catch (MalformedURLException | wlb | wup e) {
                        xdu xduVar2 = xehVar.c;
                        xci xciVar3 = xehVar.d;
                        String valueOf2 = String.valueOf(e.getMessage());
                        wwf.b(xduVar2, xciVar3, valueOf2.length() != 0 ? "Ping migration failed to send ping".concat(valueOf2) : new String("Ping migration failed to send ping"));
                    }
                }
            }
        }
    }

    @Override // defpackage.wlf
    public final void b(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (xeh xehVar : this.a.c()) {
            xek xekVar = xehVar.b;
            if (xekVar instanceof wzk) {
                wzk wzkVar = (wzk) xekVar;
                if (xehVar.c.c() != apcd.SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM) {
                    if (TextUtils.equals(wzkVar.a, str)) {
                        arrayList.add(xehVar);
                    }
                } else {
                    arrayList2.add(xehVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            ((wvr) this.b.get()).q(arrayList);
        }
        if (!arrayList2.isEmpty()) {
            f(arrayList2);
        }
    }

    @Override // defpackage.wlf
    public final void d(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (xeh xehVar : this.a.c()) {
            xek xekVar = xehVar.b;
            if (xekVar instanceof wzl) {
                wzl wzlVar = (wzl) xekVar;
                if (xehVar.c.c() != apcd.SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM) {
                    if (TextUtils.equals(wzlVar.a, str)) {
                        arrayList.add(xehVar);
                    }
                } else {
                    arrayList2.add(xehVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            ((wvr) this.b.get()).q(arrayList);
        }
        if (!arrayList2.isEmpty()) {
            f(arrayList2);
        }
    }

    @Override // defpackage.wlf
    public final void e(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (xeh xehVar : this.a.c()) {
            xek xekVar = xehVar.b;
            if (xekVar instanceof wzp) {
                wzp wzpVar = (wzp) xekVar;
                if (xehVar.c.c() != apcd.SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM) {
                    if (TextUtils.equals(wzpVar.a, str)) {
                        arrayList.add(xehVar);
                    }
                } else {
                    arrayList2.add(xehVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            ((wvr) this.b.get()).q(arrayList);
        }
        if (!arrayList2.isEmpty()) {
            f(arrayList2);
        }
    }

    @Override // defpackage.wvs
    public final void qN(int i, xek xekVar, xdu xduVar, xci xciVar) {
        if (this.a.e(xekVar.c())) {
            String str = xduVar.a;
            throw new wuq(str.length() != 0 ? "Tried to register duplicate trigger for slot: ".concat(str) : new String("Tried to register duplicate trigger for slot: "));
        } else if ((xekVar instanceof wzp) || (xekVar instanceof wzl) || (xekVar instanceof wzk)) {
            this.a.d(xekVar.c(), new xeh(i, xekVar, xduVar, xciVar));
        } else {
            String str2 = xduVar.a;
            String name = xekVar.b().name();
            StringBuilder sb = new StringBuilder(str2.length() + 101 + String.valueOf(name).length());
            sb.append("Incorrect TriggerType: Tried to register trigger for slot: ");
            sb.append(str2);
            sb.append(" of type ");
            sb.append(name);
            sb.append(" in ActiveViewEventTriggerAdapter");
            throw new wuq(sb.toString());
        }
    }

    @Override // defpackage.wvs
    public final void qO(xek xekVar) {
        this.a.b(xekVar.c());
    }
}

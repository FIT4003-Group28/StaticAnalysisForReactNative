package defpackage;

import java.util.List;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: dqf  reason: default package */
/* loaded from: classes3.dex */
public final class dqf extends dqs {
    private final dqj a;

    public dqf(dqj dqjVar) {
        super("internal.registerCallback");
        this.a = dqjVar;
    }

    @Override // defpackage.dqs
    public final dqz a(dpu dpuVar, List list) {
        TreeMap treeMap;
        dqt.l(this.d, 3, list);
        dpuVar.b((dqz) list.get(0)).i();
        dqz b = dpuVar.b((dqz) list.get(1));
        if (!(b instanceof dqy)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        dqz b2 = dpuVar.b((dqz) list.get(2));
        if (!(b2 instanceof dqw)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        dqw dqwVar = (dqw) b2;
        if (!dqwVar.t("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        String i = dqwVar.f("type").i();
        int f = dqwVar.t("priority") ? dqt.f(dqwVar.f("priority").h().doubleValue()) : 1000;
        dqj dqjVar = this.a;
        dqy dqyVar = (dqy) b;
        if ("create".equals(i)) {
            treeMap = dqjVar.b;
        } else if (!"edit".equals(i)) {
            String valueOf = String.valueOf(i);
            throw new IllegalStateException(valueOf.length() != 0 ? "Unknown callback type: ".concat(valueOf) : new String("Unknown callback type: "));
        } else {
            treeMap = dqjVar.a;
        }
        if (treeMap.containsKey(Integer.valueOf(f))) {
            f = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(f), dqyVar);
        return dqz.f;
    }
}

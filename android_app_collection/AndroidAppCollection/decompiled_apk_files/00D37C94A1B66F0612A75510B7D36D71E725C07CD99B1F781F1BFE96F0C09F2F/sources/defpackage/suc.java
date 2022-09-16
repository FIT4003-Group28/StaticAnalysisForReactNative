package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: suc  reason: default package */
/* loaded from: classes4.dex */
public final class suc implements tcr {
    private final amuk a;
    private final Map b = DesugarCollections.synchronizedMap(new HashMap());

    public suc(amuk amukVar) {
        this.a = amukVar;
    }

    @Override // defpackage.tcr
    public final tcq a(tcq tcqVar) {
        amuk amukVar = this.a;
        int i = ((amxx) amukVar).c;
        tcq tcqVar2 = tcqVar;
        for (int i2 = 0; i2 < i; i2++) {
            tcqVar2 = ((tcr) amukVar.get(i2)).a(tcqVar);
        }
        synchronized (this.b) {
            for (tcr tcrVar : this.b.values()) {
                tcqVar2 = tcrVar.a(tcqVar);
            }
        }
        return tcqVar2;
    }

    public final void b(Object obj, tcr tcrVar) {
        this.b.put(obj, tcrVar);
    }

    public final void c(Object obj) {
        this.b.remove(obj);
    }
}

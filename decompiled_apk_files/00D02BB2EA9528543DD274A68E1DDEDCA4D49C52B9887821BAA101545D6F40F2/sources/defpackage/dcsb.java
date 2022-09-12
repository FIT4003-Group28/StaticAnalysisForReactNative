package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcsb  reason: default package */
/* loaded from: classes.dex */
public final class dcsb extends dcsc {
    private final LinkedHashMap<dcqy<?>, Object> b;

    public dcsb(dcrp dcrpVar, dcrp dcrpVar2) {
        LinkedHashMap<dcqy<?>, Object> linkedHashMap = new LinkedHashMap<>();
        this.b = linkedHashMap;
        b(dcrpVar);
        b(dcrpVar2);
        for (Map.Entry<dcqy<?>, Object> entry : linkedHashMap.entrySet()) {
            entry.getKey();
        }
    }

    private final void b(dcrp dcrpVar) {
        for (int i = 0; i < dcrpVar.a(); i++) {
            dcqy<?> b = dcrpVar.b(i);
            this.b.get(b);
            this.b.put(b, b.c(dcrpVar.c(i)));
        }
    }

    @Override // defpackage.dcsc
    public final <C> void a(dcrv<C> dcrvVar, C c) {
        for (Map.Entry<dcqy<?>, Object> entry : this.b.entrySet()) {
            dcrvVar.a(entry.getKey(), entry.getValue(), c);
        }
    }
}

package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bxes  reason: default package */
/* loaded from: classes4.dex */
public final class bxes {
    public final Map<String, dwjj> a = new LinkedHashMap();
    public final Map<String, dwjp> b = new HashMap();

    public final synchronized void a(dwjn dwjnVar, dwjp dwjpVar) {
        dwjh dwjhVar = dwjpVar.b;
        if (dwjhVar == null) {
            dwjhVar = dwjh.c;
        }
        for (dwjj dwjjVar : dwjhVar.a) {
            Map<String, dwjj> map = this.a;
            dxbp dxbpVar = dwjjVar.b;
            if (dxbpVar == null) {
                dxbpVar = dxbp.x;
            }
            map.put(dxbpVar.b, dwjjVar);
        }
        this.b.put(dbqa.a(dwjnVar.b), dwjpVar);
    }

    public final synchronized void b() {
        this.a.clear();
        this.b.clear();
    }
}

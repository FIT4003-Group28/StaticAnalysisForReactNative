package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: zib  reason: default package */
/* loaded from: classes4.dex */
public final class zib {
    final Map a;

    public zib() {
        this.a = new HashMap();
    }

    public final synchronized void a(cyv cyvVar, dbb dbbVar, String str) {
        if (str == null) {
            return;
        }
        dar darVar = (dar) this.a.get(str);
        if (darVar == null) {
            return;
        }
        darVar.b = true;
        int c = darVar.a.c();
        for (int i = 0; i < c; i++) {
            daq daqVar = (daq) darVar.a.g(i);
            daqVar.a = dbbVar;
            Object[] objArr = daqVar.c;
            if (objArr != null) {
                objArr[0] = cyvVar;
            }
        }
    }

    public final synchronized void b() {
        Iterator it = this.a.keySet().iterator();
        while (it.hasNext()) {
            dar darVar = (dar) this.a.get(it.next());
            if (darVar != null && darVar.b) {
                darVar.b = false;
            }
            it.remove();
        }
    }

    public final synchronized void c(String str, daq daqVar) {
        if (str == null) {
            return;
        }
        dar darVar = (dar) this.a.get(str);
        if (darVar == null) {
            darVar = new dar();
            this.a.put(str, darVar);
        }
        darVar.a.k(daqVar.b, daqVar);
    }

    public final zna d(String str) {
        return (zna) this.a.get(str);
    }

    public zib(Map map) {
        this.a = Collections.unmodifiableMap(map);
    }
}

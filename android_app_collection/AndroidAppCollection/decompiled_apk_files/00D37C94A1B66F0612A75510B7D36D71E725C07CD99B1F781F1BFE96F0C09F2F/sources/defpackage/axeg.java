package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: axeg  reason: default package */
/* loaded from: classes2.dex */
public final class axeg {
    public final HashMap a;
    public final HashMap b;

    public axeg() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public axeg(axeg axegVar) {
        this.a = new HashMap(axegVar.a);
        HashMap hashMap = new HashMap(axegVar.b);
        this.b = hashMap;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (((axed) ((Map.Entry) it.next()).getValue()).e.get()) {
                it.remove();
            }
        }
    }
}

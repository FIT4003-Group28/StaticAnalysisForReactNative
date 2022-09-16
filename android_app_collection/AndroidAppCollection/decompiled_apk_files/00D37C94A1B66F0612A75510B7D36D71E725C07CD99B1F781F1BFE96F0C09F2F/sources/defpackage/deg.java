package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: deg  reason: default package */
/* loaded from: classes3.dex */
final class deg {
    public final Map a = new LinkedHashMap();
    public final Map b = new LinkedHashMap();
    public final Map c = new LinkedHashMap();
    public final Map d = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object a(def defVar) {
        return this.d.get(defVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Collection b() {
        return this.d.values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set c() {
        return this.d.keySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(def defVar) {
        if (this.d.remove(defVar) == null) {
            return;
        }
        int i = defVar.a;
        if (i == 1) {
            this.a.remove(defVar.b);
        } else if (i != 2) {
            this.c.remove(defVar.b);
        } else {
            String str = defVar.c;
            Map map = (Map) this.b.get(str);
            map.remove(defVar.b);
            if (!map.isEmpty()) {
                return;
            }
            this.b.remove(str);
        }
    }
}

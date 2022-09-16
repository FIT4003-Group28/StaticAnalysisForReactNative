package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aw  reason: default package */
/* loaded from: classes.dex */
public final class aw {
    public final HashMap<String, an> a = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final an a(String str) {
        return this.a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<String> b() {
        return new HashSet(this.a.keySet());
    }

    public final void c() {
        for (an anVar : this.a.values()) {
            anVar.c = true;
            synchronized (anVar.b) {
                for (Object obj : anVar.b.values()) {
                    an.b(obj);
                }
            }
            anVar.a();
        }
        this.a.clear();
    }
}

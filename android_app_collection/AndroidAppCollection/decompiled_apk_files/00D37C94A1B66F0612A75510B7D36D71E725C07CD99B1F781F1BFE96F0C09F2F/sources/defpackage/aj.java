package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aj  reason: default package */
/* loaded from: classes.dex */
public final class aj {
    public final HashMap a = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ac a(String str) {
        return (ac) this.a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set b() {
        return new HashSet(this.a.keySet());
    }

    public final void c() {
        for (ac acVar : this.a.values()) {
            acVar.c = true;
            synchronized (acVar.b) {
                for (Object obj : acVar.b.values()) {
                    ac.a(obj);
                }
            }
            acVar.b();
        }
        this.a.clear();
    }
}

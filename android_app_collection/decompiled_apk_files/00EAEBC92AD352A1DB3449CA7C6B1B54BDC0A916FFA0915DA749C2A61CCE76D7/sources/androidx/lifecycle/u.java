package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, s> f1879a = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final s a(String str) {
        return this.f1879a.get(str);
    }

    public final void a() {
        for (s sVar : this.f1879a.values()) {
            sVar.a();
        }
        this.f1879a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, s sVar) {
        s put = this.f1879a.put(str, sVar);
        if (put != null) {
            put.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<String> b() {
        return new HashSet(this.f1879a.keySet());
    }
}

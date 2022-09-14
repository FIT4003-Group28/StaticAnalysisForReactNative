package android.arch.lifecycle;

import java.util.HashMap;
/* compiled from: ViewModelStore.java */
/* loaded from: classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, n> f104a = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, n nVar) {
        n nVar2 = this.f104a.get(str);
        if (nVar2 != null) {
            nVar2.a();
        }
        this.f104a.put(str, nVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final n a(String str) {
        return this.f104a.get(str);
    }

    public final void a() {
        for (n nVar : this.f104a.values()) {
            nVar.a();
        }
        this.f104a.clear();
    }
}

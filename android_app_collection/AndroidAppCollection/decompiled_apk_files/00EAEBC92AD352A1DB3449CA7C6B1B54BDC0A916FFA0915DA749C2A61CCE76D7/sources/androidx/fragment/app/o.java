package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.t;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o extends androidx.lifecycle.s {

    /* renamed from: h  reason: collision with root package name */
    private static final t.a f1727h = new a();

    /* renamed from: e  reason: collision with root package name */
    private final boolean f1731e;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, Fragment> f1728b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, o> f1729c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, androidx.lifecycle.u> f1730d = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private boolean f1732f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1733g = false;

    /* loaded from: classes.dex */
    static class a implements t.a {
        a() {
        }

        @Override // androidx.lifecycle.t.a
        public <T extends androidx.lifecycle.s> T a(Class<T> cls) {
            return new o(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(boolean z) {
        this.f1731e = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o a(androidx.lifecycle.u uVar) {
        return (o) new androidx.lifecycle.t(uVar, f1727h).a(o.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(Fragment fragment) {
        if (this.f1728b.containsKey(fragment.f1642f)) {
            return false;
        }
        this.f1728b.put(fragment.f1642f, fragment);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment b(String str) {
        return this.f1728b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.s
    public void b() {
        if (l.d(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1732f = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Fragment fragment) {
        if (l.d(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        o oVar = this.f1729c.get(fragment.f1642f);
        if (oVar != null) {
            oVar.b();
            this.f1729c.remove(fragment.f1642f);
        }
        androidx.lifecycle.u uVar = this.f1730d.get(fragment.f1642f);
        if (uVar != null) {
            uVar.a();
            this.f1730d.remove(fragment.f1642f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o c(Fragment fragment) {
        o oVar = this.f1729c.get(fragment.f1642f);
        if (oVar == null) {
            o oVar2 = new o(this.f1731e);
            this.f1729c.put(fragment.f1642f, oVar2);
            return oVar2;
        }
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection<Fragment> c() {
        return this.f1728b.values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.lifecycle.u d(Fragment fragment) {
        androidx.lifecycle.u uVar = this.f1730d.get(fragment.f1642f);
        if (uVar == null) {
            androidx.lifecycle.u uVar2 = new androidx.lifecycle.u();
            this.f1730d.put(fragment.f1642f, uVar2);
            return uVar2;
        }
        return uVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.f1732f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e(Fragment fragment) {
        return this.f1728b.remove(fragment.f1642f) != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return this.f1728b.equals(oVar.f1728b) && this.f1729c.equals(oVar.f1729c) && this.f1730d.equals(oVar.f1730d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f(Fragment fragment) {
        if (!this.f1728b.containsKey(fragment.f1642f)) {
            return true;
        }
        return this.f1731e ? this.f1732f : !this.f1733g;
    }

    public int hashCode() {
        return (((this.f1728b.hashCode() * 31) + this.f1729c.hashCode()) * 31) + this.f1730d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f1728b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f1729c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1730d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}

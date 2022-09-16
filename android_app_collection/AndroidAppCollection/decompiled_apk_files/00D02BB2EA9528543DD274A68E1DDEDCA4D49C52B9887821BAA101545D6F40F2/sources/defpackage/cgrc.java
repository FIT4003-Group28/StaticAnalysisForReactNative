package defpackage;

import android.os.Bundle;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cgrc  reason: default package */
/* loaded from: classes4.dex */
public class cgrc {
    private static final dcqe a = dcqe.c("cgrc");
    private Map<String, Bundle> b = null;
    private final Map<String, cgrb> c = dcjz.d();
    private boolean d = false;

    public final void a(@dzsi Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("ACTIVITY_LISTENER_MANAGER");
        if (bundle2 == null) {
            bvoo.h("No ACTIVITY_LISTENER_MANAGER key in bundle for ActivityListenerManager", new Object[0]);
            return;
        }
        this.b = dcjz.d();
        for (String str : bundle2.keySet()) {
            this.b.put(str, bundle2.getBundle(str));
        }
    }

    public final cgrb b(String str) {
        cgrb cgrbVar = this.c.get(str);
        if (cgrbVar == null) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "No listener for key: ".concat(valueOf) : new String("No listener for key: "));
        }
        return cgrbVar;
    }

    public final void c() {
        if (!this.d) {
            Map<String, Bundle> map = this.b;
            if (map == null || map.isEmpty()) {
                this.d = true;
            } else {
                String valueOf = String.valueOf(this.b);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                sb.append("Saved not empy at onStart: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            }
        }
        for (cgrb cgrbVar : this.c.values()) {
            cgrbVar.c();
        }
    }

    public final void d(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        for (String str : this.c.keySet()) {
            Bundle bundle3 = new Bundle();
            this.c.get(str).d(bundle3);
            bundle2.putBundle(str, bundle3);
        }
        bundle.putBundle("ACTIVITY_LISTENER_MANAGER", bundle2);
    }

    public final void e() {
        for (cgrb cgrbVar : this.c.values()) {
            cgrbVar.e();
        }
    }

    public final void f() {
        for (cgrb cgrbVar : this.c.values()) {
            cgrbVar.f();
        }
    }

    public final <A extends cgrb> void g(String str, A a2) {
        Bundle remove;
        if (this.d) {
            throw new IllegalStateException("Listeners cannot be added after onStart.");
        }
        if (this.c.containsKey(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Listener already present for key: ".concat(valueOf) : new String("Listener already present for key: "));
        }
        Map<String, Bundle> map = this.b;
        if (map == null) {
            remove = null;
        } else if (!map.containsKey(str)) {
            String valueOf2 = String.valueOf(str);
            throw new IllegalStateException(valueOf2.length() != 0 ? "Listener not present in saved bundle: ".concat(valueOf2) : new String("Listener not present in saved bundle: "));
        } else {
            remove = this.b.remove(str);
        }
        if (remove != null && remove.getBoolean("PENDING")) {
            ((cgre) a2).b = true;
        }
        this.c.put(str, a2);
    }
}

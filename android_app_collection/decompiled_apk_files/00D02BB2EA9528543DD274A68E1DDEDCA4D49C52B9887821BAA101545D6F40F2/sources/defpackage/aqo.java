package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: aqo  reason: default package */
/* loaded from: classes2.dex */
public final class aqo {
    public final Bundle a;
    private arc b;

    public aqo(arc arcVar, boolean z) {
        if (arcVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.a = bundle;
        this.b = arcVar;
        bundle.putBundle("selector", arcVar.a);
        bundle.putBoolean("activeScan", z);
    }

    private final void d() {
        if (this.b == null) {
            arc d = arc.d(this.a.getBundle("selector"));
            this.b = d;
            if (d != null) {
                return;
            }
            this.b = arc.c;
        }
    }

    public final arc a() {
        d();
        return this.b;
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean c() {
        d();
        arc arcVar = this.b;
        arcVar.b();
        return !arcVar.b.contains(null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aqo) {
            aqo aqoVar = (aqo) obj;
            if (a().equals(aqoVar.a()) && b() == aqoVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode() ^ b();
    }

    public final String toString() {
        return "DiscoveryRequest{ selector=" + a() + ", activeScan=" + b() + ", isValid=" + c() + " }";
    }
}

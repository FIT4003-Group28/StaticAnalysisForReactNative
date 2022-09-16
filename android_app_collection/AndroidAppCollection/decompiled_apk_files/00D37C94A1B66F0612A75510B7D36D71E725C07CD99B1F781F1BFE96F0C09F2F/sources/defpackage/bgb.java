package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bgb  reason: default package */
/* loaded from: classes2.dex */
public final class bgb {
    public final Bundle a;
    private bgo b;

    public bgb(bgo bgoVar, boolean z) {
        if (bgoVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.a = bundle;
        this.b = bgoVar;
        bundle.putBundle("selector", bgoVar.b);
        bundle.putBoolean("activeScan", z);
    }

    private final void d() {
        if (this.b == null) {
            bgo a = bgo.a(this.a.getBundle("selector"));
            this.b = a;
            if (a != null) {
                return;
            }
            this.b = bgo.a;
        }
    }

    public final bgo a() {
        d();
        return this.b;
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean c() {
        d();
        bgo bgoVar = this.b;
        bgoVar.c();
        return !bgoVar.c.contains(null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bgb) {
            bgb bgbVar = (bgb) obj;
            if (a().equals(bgbVar.a()) && b() == bgbVar.b()) {
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

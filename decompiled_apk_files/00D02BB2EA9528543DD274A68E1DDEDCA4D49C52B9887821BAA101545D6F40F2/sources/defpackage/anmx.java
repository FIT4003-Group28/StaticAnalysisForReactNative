package defpackage;

import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anmx  reason: default package */
/* loaded from: classes2.dex */
public final class anmx {
    public final List<anmv> a;

    public anmx() {
        this.a = new ArrayList();
    }

    private final int d(dnrw dnrwVar) {
        return dcft.n(this.a, new anmw(dnrwVar));
    }

    public final void a(anmv anmvVar) {
        if (d(anmvVar.a) < 0) {
            this.a.add(anmvVar);
        }
    }

    public final void b(dnrw dnrwVar) {
        int d = d(dnrwVar);
        if (d >= 0) {
            this.a.remove(d);
        }
    }

    public final boolean c() {
        return this.a.isEmpty();
    }

    public anmx(anmx anmxVar) {
        this.a = new ArrayList(anmxVar.a);
    }
}

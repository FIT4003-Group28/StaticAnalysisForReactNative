package defpackage;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: kdg  reason: default package */
/* loaded from: classes7.dex */
public class kdg implements btph {
    public kde a;
    public kdc b;
    public kdd c;
    public final Set<kdf> d;
    public final Set<kdf> e;
    private kdb f;
    private kda g;
    private final Set<kdf> h;
    private final Set<kdf> i;
    private final Set<Object> j;
    private final Set<kdf> k;
    private final Set<Object> l;
    private final Set<Object> m;
    private final boolean n;

    public kdg() {
        this(false);
    }

    private final void p() {
        bvrj.UI_THREAD.c();
        for (kdf kdfVar : this.k) {
            kdfVar.c();
        }
    }

    private final void q(boolean z) {
        bvrj.UI_THREAD.c();
        for (kdf kdfVar : this.e) {
            kdfVar.d(z);
        }
    }

    private final void r() {
        bvrj.UI_THREAD.c();
        for (kdf kdfVar : this.i) {
            kdfVar.e();
        }
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    public final void a(kdf kdfVar) {
        bvrj.UI_THREAD.c();
        this.h.add(kdfVar);
    }

    public final void b(kdf kdfVar) {
        bvrj.UI_THREAD.c();
        this.h.remove(kdfVar);
    }

    public final void d(Object obj) {
        f(kdc.MAP_INTERACTION_DISABLED);
        g(obj, true);
        i(obj);
    }

    public final void e(Object obj) {
        j(obj);
        h(obj, true);
        f(kdc.MAP_INTERACTION_AND_BUTTONS_ENABLED);
    }

    public final void f(kdc kdcVar) {
        if (o() || this.b == kdcVar) {
            return;
        }
        this.b = kdcVar;
        bvrj.UI_THREAD.c();
        for (kdf kdfVar : this.h) {
            kdfVar.a();
        }
    }

    public final void g(Object obj, boolean z) {
        if (this.j.add(obj) && this.f == kdb.VISIBLE) {
            this.f = kdb.HIDDEN;
            r();
        }
    }

    public final void h(Object obj, boolean z) {
        if (this.j.remove(obj) && this.j.isEmpty()) {
            this.f = kdb.VISIBLE;
            r();
        }
    }

    public final void i(Object obj) {
        if (this.l.add(obj) && this.g == kda.VISIBLE) {
            this.g = kda.HIDDEN;
            p();
        }
    }

    public final void j(Object obj) {
        if (this.l.remove(obj) && this.l.isEmpty()) {
            this.g = kda.VISIBLE;
            p();
        }
    }

    public final void k(Object obj, boolean z) {
        if (this.m.add(obj) && this.a == kde.VISIBLE) {
            this.a = kde.HIDDEN;
            q(z);
        }
    }

    public final void l(Object obj, boolean z) {
        if (this.m.remove(obj) && this.m.isEmpty()) {
            this.a = kde.VISIBLE;
            q(z);
        }
    }

    public final void m(kdd kddVar) {
        if ((kddVar == kdd.NONE || this.c == kdd.NONE) && kddVar != this.c) {
            this.c = kddVar;
            bvrj.UI_THREAD.c();
            for (kdf kdfVar : this.d) {
                kdfVar.b();
            }
        }
    }

    public final void n(kdd kddVar) {
        dbsk.a(kddVar != kdd.NONE);
        if (this.c != kddVar) {
            return;
        }
        m(kdd.NONE);
    }

    public final boolean o() {
        bvrj.UI_THREAD.c();
        return this.n;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("mapInteractability:", this.b);
        b.b("micMode:", this.f);
        b.b("hideMicSolicitors", this.j);
        b.b("accountParticleMode:", this.g);
        b.b("hideAccountParticleSolicitors", this.l);
        b.b("speedLimitAndWatermarkMode:", this.a);
        b.b("hideSpeedLimitAndWatermarkSolicitors", this.m);
        b.b("navigationMode:", this.c);
        b.h("isLimitedMapsUi", o());
        return b.toString();
    }

    public kdg(boolean z) {
        this.h = new HashSet();
        this.d = new HashSet();
        this.i = new HashSet();
        this.j = new HashSet();
        this.k = new HashSet();
        this.l = new HashSet();
        this.e = new HashSet();
        this.m = new HashSet();
        this.n = z;
        if (!z) {
            this.b = kdc.MAP_INTERACTION_AND_BUTTONS_ENABLED;
        } else {
            this.b = kdc.LIMITED_MAPS_INTERACTIONS;
        }
        this.f = kdb.VISIBLE;
        this.g = kda.VISIBLE;
        this.a = kde.VISIBLE;
        this.c = kdd.NONE;
    }
}

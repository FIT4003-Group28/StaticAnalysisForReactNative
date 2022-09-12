package defpackage;

import android.view.View;
import defpackage.cuvu;
import defpackage.cuvv;
/* compiled from: PG */
/* renamed from: aqeg  reason: default package */
/* loaded from: classes2.dex */
public final class aqeg<P extends cuvu, V extends View & cuvv<P>> {
    public final View.OnAttachStateChangeListener a;
    public final cqjg b;
    public final Class<V> c;
    public final k d;
    public final aqek<V> e;
    @dzsi
    public aqef<P, V> f;
    @dzsi
    public P g;
    @dzsi
    public V h;
    private final aou i;

    public aqeg(k kVar, Class<V> cls, cqjg cqjgVar) {
        e eVar = new e() { // from class: com.google.android.apps.gmm.messaging.common.mvp.LighterUiAdapter$1
            @Override // defpackage.f
            public final void a(m mVar) {
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [P extends cuvu, cuvu] */
            @Override // defpackage.f
            public final void b(m mVar) {
                aqeg aqegVar = aqeg.this;
                if (aqegVar.g == 0 && aqegVar.f != null && aqegVar.h != 0 && aqegVar.d.c() != j.DESTROYED) {
                    aqef<P, V> aqefVar = aqegVar.f;
                    dbsk.s(aqefVar);
                    V v = aqegVar.h;
                    dbsk.s(v);
                    aqegVar.g = aqefVar.a(v);
                }
                aqeg.this.c();
            }

            @Override // defpackage.f
            public final void c(m mVar) {
            }

            @Override // defpackage.f
            public final void d(m mVar) {
            }

            @Override // defpackage.f
            public final void e(m mVar) {
                P p = aqeg.this.g;
                if (p != 0) {
                    p.A();
                }
            }

            @Override // defpackage.f
            public final void f(m mVar) {
                P p = aqeg.this.g;
                if (p != 0) {
                    p.B();
                }
                aqeg.this.g = null;
            }
        };
        this.i = eVar;
        this.a = new aqee(this);
        this.e = new aqek(this) { // from class: aqed
            private final aqeg a;

            {
                this.a = this;
            }

            @Override // defpackage.aqek
            public View.OnAttachStateChangeListener a() {
                return this.a.a;
            }
        };
        this.f = null;
        this.g = null;
        this.h = null;
        this.c = cls;
        this.b = cqjgVar;
        this.d = kVar;
        kVar.a(eVar);
    }

    public final void a(aqef<P, V> aqefVar) {
        this.f = aqefVar;
        b();
        c();
    }

    public final void b() {
        if (this.f == null || this.h == null || this.d.c() == j.DESTROYED) {
            return;
        }
        P p = this.g;
        if (p != null) {
            p.A();
            P p2 = this.g;
            dbsk.s(p2);
            p2.B();
        }
        aqef<P, V> aqefVar = this.f;
        dbsk.s(aqefVar);
        V v = this.h;
        dbsk.s(v);
        this.g = aqefVar.a(v);
    }

    public final void c() {
        if (this.g == null || this.h == null || !this.d.c().a(j.STARTED)) {
            return;
        }
        P p = this.g;
        dbsk.s(p);
        p.z();
    }
}

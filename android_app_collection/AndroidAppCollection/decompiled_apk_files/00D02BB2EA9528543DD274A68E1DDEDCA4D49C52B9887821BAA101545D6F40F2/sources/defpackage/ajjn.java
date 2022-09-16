package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ajjn  reason: default package */
/* loaded from: classes2.dex */
public final class ajjn {
    public final cqat a;
    public final btrm b;
    public final ajmq c;
    public final ajnm d;
    public final Executor e;
    public dehn<Void> f;
    public dbsg<ajjm> g = dbpy.a;
    public dbsg<eaow> h = dbpy.a;
    public boolean i = false;
    public dbsg<eapd> j = dbpy.a;
    private final dbsg<ahwo> k;

    public ajjn(cqat cqatVar, btrm btrmVar, ajmq ajmqVar, ajnm ajnmVar, @dzsi ahwo ahwoVar, Executor executor) {
        this.b = btrmVar;
        this.a = cqatVar;
        this.c = ajmqVar;
        this.d = ajnmVar;
        this.k = dbsg.j(ahwoVar);
        this.e = executor;
    }

    public final void a(dbsg<GmmLocation> dbsgVar) {
        if (!this.h.a()) {
            return;
        }
        if (this.j.a()) {
            if (!new eaow(this.j.b(), new eapd(this.a.b())).p(this.h.b())) {
                return;
            }
        }
        if (!dbsgVar.a() || this.f == null) {
            return;
        }
        final GmmLocation b = dbsgVar.b();
        b();
        this.d.e();
        dehn<Void> dehnVar = this.f;
        dbsk.s(dehnVar);
        dehnVar.Pk(new Runnable(this, b) { // from class: ajjl
            private final ajjn a;
            private final GmmLocation b;

            {
                this.a = this;
                this.b = b;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ajjn ajjnVar = this.a;
                GmmLocation gmmLocation = this.b;
                dbsg<ajni> b2 = ajjnVar.d.b();
                if (b2.a()) {
                    b2.b().c();
                    ajjnVar.b();
                    ajjnVar.j = dbsg.i(new eapd(ajjnVar.a.b()));
                    dcen N = dcep.N();
                    N.i(b2.b().g());
                    N.b(dqym.IN_ACTIVE_NAVIGATION);
                    bvqd.a(ajjnVar.c.d(b2.b().c(), N.f(), dcdc.f(gmmLocation)), ajjnVar.e);
                    return;
                }
                ajjnVar.b();
            }
        }, this.e);
    }

    public final void b() {
        if (this.k.a()) {
            this.k.b().b();
        }
    }
}

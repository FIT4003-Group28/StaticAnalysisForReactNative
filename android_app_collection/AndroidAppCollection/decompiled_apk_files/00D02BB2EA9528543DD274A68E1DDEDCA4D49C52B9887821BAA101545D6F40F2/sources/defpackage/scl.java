package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: scl  reason: default package */
/* loaded from: classes7.dex */
final class scl implements degu<Object> {
    final /* synthetic */ sco a;

    public scl(sco scoVar) {
        this.a = scoVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        throw new RuntimeException(th);
    }

    @Override // defpackage.degu
    public final void b(Object obj) {
        final sco scoVar = this.a;
        scoVar.c.c(new sib(scoVar) { // from class: scd
            private final sco a;

            {
                this.a = scoVar;
            }

            @Override // defpackage.sib
            public final void a(qjn qjnVar) {
                sco scoVar2 = this.a;
                scoVar2.q.b = sht.k(scoVar2.b, qjnVar.a());
                scoVar2.r.b = sht.k(scoVar2.b, qjnVar.b());
                scoVar2.q.u(sco.i(qjnVar.a()));
                scoVar2.r.u(sco.i(qjnVar.b()));
                scoVar2.v();
                scoVar2.x();
                cqkx.p(scoVar2);
            }
        });
        if (scoVar.f.p().a()) {
            scoVar.a.a().a(1, new scm(scoVar));
        } else {
            sca scaVar = scoVar.s;
            dbsk.s(scaVar);
            scoVar.u(scaVar, scoVar.j(dndr.WORK));
        }
        if (scoVar.f.s().a()) {
            scoVar.a.a().a(2, new scn(scoVar));
        } else {
            sca scaVar2 = scoVar.t;
            dbsk.s(scaVar2);
            scoVar.u(scaVar2, scoVar.j(dndr.HOME));
        }
        scb scbVar = scoVar.x;
        dbsk.s(scbVar);
        scbVar.C(scoVar.d());
        if (scoVar.e()) {
            scb scbVar2 = scoVar.y;
            dbsk.s(scbVar2);
            scbVar2.C(scoVar.g.d());
        }
        String string = scoVar.b.getString(R.string.SETTING_NOT_SET_TEXT);
        dbsg<domy> g = scoVar.f.g();
        if (g.a()) {
            scoVar.v.a = sht.o(g.b());
            scoVar.v.b = sht.r(scoVar.b, scoVar.d, g.b(), false, true);
            scoVar.v.d = sht.q(scoVar.b, scoVar.d, g.b());
        } else {
            sca scaVar3 = scoVar.v;
            scaVar3.b = string;
            scaVar3.d = string;
        }
        scoVar.v.u(scoVar.w());
        if (!scoVar.f.d() || !g.a()) {
            sca scaVar4 = scoVar.w;
            scaVar4.b = string;
            scaVar4.c = string;
        } else {
            scoVar.w.b = sht.a(scoVar.b, scoVar.f.j(), false, scoVar.f.l(), scoVar.f.n());
            scoVar.w.c = sht.a(scoVar.b, scoVar.f.j(), true, scoVar.f.l(), scoVar.f.n());
        }
        scoVar.w.u(scoVar.f.d());
        scoVar.x();
        cqkx.p(scoVar);
    }
}

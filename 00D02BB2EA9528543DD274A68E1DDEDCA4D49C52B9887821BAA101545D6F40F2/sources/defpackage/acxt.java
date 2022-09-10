package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acxt  reason: default package */
/* loaded from: classes.dex */
public final class acxt implements awwn {
    final /* synthetic */ acyf a;

    public acxt(acyf acyfVar) {
        this.a = acyfVar;
    }

    @Override // defpackage.awwn
    @dzsi
    public final awwt a() {
        dcep<awvv<?>> dcepVar;
        aegc h;
        jjf i;
        acyf acyfVar = this.a;
        if (!acyfVar.ba) {
            return null;
        }
        aebb a = acyfVar.c.a();
        if (a != null) {
            dcepVar = acyfVar.ay.a().a(a.a());
        } else {
            dcepVar = dcmr.a;
        }
        boolean z = !acyfVar.g() ? !((h = acyfVar.h()) == null || !h.b()) : !((i = acyfVar.i()) == null || !i.f());
        if (z && dcepVar.isEmpty()) {
            acyfVar.bc = true;
            return null;
        }
        boolean z2 = !acyfVar.bf && acyfVar.aq.a();
        awws u = awwt.u();
        u.t(dcdc.f("home_screen"));
        final acys acysVar = acyfVar.aq;
        acysVar.getClass();
        ((awvt) u).a = new Runnable(acysVar) { // from class: acxh
            private final acys a;

            {
                this.a = acysVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                acxb acxbVar = ((acxc) this.a).b;
                if (acxbVar == null || acxbVar.e) {
                    return;
                }
                acxbVar.c = true;
            }
        };
        if (z2) {
            u.c(acyfVar.ak.getPassiveAssistParameters().g().a);
            u.s(true);
        }
        u.b(acyfVar.ak.getPassiveAssistParameters().g().b);
        u.o(acyfVar.ak.getPassiveAssistParameters().a().U);
        dktk f = acyfVar.b.a().f();
        if (f != dktk.COMMUTE) {
            acwx acwxVar = acyfVar.ar;
            acwx.a(f, 2);
            acwx.a(acwxVar.a.a(), 3);
            acwx.a(acwxVar.b.a(), 4);
            acwx.a(acwxVar.c.a(), 5);
            ckcw a2 = acwxVar.d.a();
            acwx.a(a2, 6);
            u.q(dcdc.f(new acww(z2, f, a2)));
        }
        aegc h2 = acyfVar.h();
        dcen dcenVar = new dcen();
        if (acyfVar.bd && acyfVar.aT.a().w()) {
            dcenVar.b(awvv.L);
        }
        if (z) {
            acyfVar.bc = true;
        } else if (h2 == null || h2.d() > acyfVar.aM()) {
            acyfVar.bc = false;
            if (a != null) {
                dcenVar.i(a.h());
            }
        } else {
            acyfVar.bc = true;
            if (a != null) {
                dcenVar.i(a.g());
            }
        }
        if (a != null) {
            dcenVar.i(acyfVar.ay.a().a(a.a()));
        }
        u.d(dcenVar.f());
        acyfVar.bf = true;
        aeal aealVar = acyfVar.bv;
        if (aealVar == null || !aealVar.b()) {
            acyfVar.bv = acyfVar.aw.a().f();
        }
        return u.a();
    }

    @Override // defpackage.awwn
    public final void b(awwb awwbVar, awwp awwpVar) {
        bvrj.UI_THREAD.c();
        acyf acyfVar = this.a;
        acyfVar.bg = awwbVar;
        acyfVar.bh = awwpVar;
        if (!acyfVar.aJ() || this.a.bb) {
            this.a.aR(awwbVar, awwpVar);
        }
    }
}

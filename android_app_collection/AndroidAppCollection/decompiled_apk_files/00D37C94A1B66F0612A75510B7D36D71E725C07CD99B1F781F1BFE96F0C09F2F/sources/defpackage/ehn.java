package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ehn  reason: default package */
/* loaded from: classes3.dex */
public final class ehn implements egn {
    public final Handler a;
    private final aadd d;
    private final azqb f;
    private final snc g;
    private final axnm h;
    private final aacz j;
    public eik c = eik.UNKNOWN;
    public final Runnable b = new Runnable() { // from class: ehl
        @Override // java.lang.Runnable
        public final void run() {
            ehn ehnVar = ehn.this;
            ehnVar.a.removeCallbacks(ehnVar.b);
            ehnVar.h();
        }
    };
    private egm i = egm.DISABLED;
    private final azpx e = azpm.aI(egm.DISABLED).aO();

    public ehn(azqb azqbVar, aadd aaddVar, aacz aaczVar, final axnm axnmVar, final axnm axnmVar2, Handler handler, final ayor ayorVar, Executor executor, snc sncVar) {
        this.f = azqbVar;
        this.d = aaddVar;
        this.j = aaczVar;
        this.h = axnmVar;
        this.a = handler;
        this.g = sncVar;
        if (eog.av(aaczVar)) {
            executor.execute(new Runnable() { // from class: ehm
                @Override // java.lang.Runnable
                public final void run() {
                    ehn.this.i(axnmVar, axnmVar2, ayorVar);
                }
            });
            return;
        }
        azqbVar.get();
        i(axnmVar, axnmVar2, ayorVar);
    }

    private final bahm l(bahm bahmVar, boolean z) {
        int i;
        if (z) {
            i = ((ehh) this.h.get()).b().d;
        } else {
            i = ((ehh) this.h.get()).b().e;
        }
        bahm j = bahmVar.b(i - bahmVar.b.o().a(bahmVar.a)).j();
        return j.a > bahq.b(bahmVar) ? j : j.i();
    }

    private final void m(apnb apnbVar, apnc apncVar) {
        arhd a = this.d.a();
        if (a != null) {
            asxp asxpVar = a.e;
            if (asxpVar == null) {
                asxpVar = asxp.a;
            }
            if (!asxpVar.ac) {
                return;
            }
            apnd a2 = apne.a();
            a2.copyOnWrite();
            ((apne) a2.instance).e(apnbVar);
            a2.copyOnWrite();
            ((apne) a2.instance).f(apncVar);
            arrf a3 = arrh.a();
            a3.copyOnWrite();
            ((arrh) a3.instance).cc((apne) a2.mo39build());
            ((acrr) this.f.get()).c((arrh) a3.mo39build());
        }
    }

    private final boolean n(bahm bahmVar) {
        int i = ((ehh) this.h.get()).b().d;
        int i2 = ((ehh) this.h.get()).b().e;
        int a = bahp.t.a(bahmVar.b).a(bahmVar.a);
        return i < i2 ? a >= i && a < i2 : a >= i || a < i2;
    }

    private final boolean o() {
        return ((ehh) this.h.get()).l() && this.c == eik.IN_BEDTIME;
    }

    @Override // defpackage.egn
    public final egm a() {
        return this.i;
    }

    @Override // defpackage.egn
    public final ayoi b() {
        return this.e.B();
    }

    @Override // defpackage.egn
    public final void c(apnc apncVar) {
        boolean k;
        if (o()) {
            k = k(egm.SYSTEM_DISMISSED);
        } else {
            k = k(egm.DISMISSED);
        }
        if (k) {
            m(apnb.BEDTIME_REMINDER_EVENT_TYPE_DISMISS, apncVar);
        }
    }

    @Override // defpackage.egn
    public final void d(apnc apncVar) {
        m(apnb.BEDTIME_REMINDER_EVENT_TYPE_IMPRESSION, apncVar);
    }

    @Override // defpackage.egn
    public final void e(apnc apncVar) {
        if (k(egm.SNOOZED)) {
            m(apnb.BEDTIME_REMINDER_EVENT_TYPE_SNOOZE, apncVar);
        }
    }

    @Override // defpackage.egn
    public final void f() {
        if (o()) {
            k(egm.SYSTEM_ACTIVE);
        } else if (!((ehh) this.h.get()).l() || o()) {
            if (n(new bahm(this.g.c()))) {
                k(egm.ACTIVE);
            } else {
                k(egm.INACTIVE);
            }
        } else {
            k(egm.SYSTEM_INACTIVE);
        }
    }

    @Override // defpackage.egn
    public final boolean g() {
        return this.i.equals(egm.ON_HOLD) || this.i.equals(egm.ACTIVE) || this.i.equals(egm.SYSTEM_ACTIVE) || this.i.equals(egm.SYSTEM_ON_HOLD);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r7 = this;
            axnm r0 = r7.h
            java.lang.Object r0 = r0.get()
            ehh r0 = (defpackage.ehh) r0
            boolean r0 = r0.l()
            if (r0 == 0) goto L16
            eik r0 = r7.c
            eik r1 = defpackage.eik.UNKNOWN
            if (r0 == r1) goto L15
            goto L16
        L15:
            return
        L16:
            boolean r0 = r7.j()
            if (r0 != 0) goto L20
            egm r0 = defpackage.egm.DISABLED
            goto L95
        L20:
            axnm r0 = r7.h
            java.lang.Object r0 = r0.get()
            ehh r0 = (defpackage.ehh) r0
            bahm r1 = new bahm
            snc r2 = r7.g
            long r2 = r2.c()
            r1.<init>(r2)
            boolean r2 = r0.l()
            if (r2 == 0) goto L42
            boolean r2 = r7.o()
            if (r2 != 0) goto L4b
            egm r0 = defpackage.egm.SYSTEM_INACTIVE
            goto L95
        L42:
            boolean r2 = r7.n(r1)
            if (r2 != 0) goto L4b
            egm r0 = defpackage.egm.INACTIVE
            goto L95
        L4b:
            egw r2 = r0.b()
            int r2 = r2.b
            r2 = r2 & 16
            if (r2 == 0) goto L78
            egw r2 = r0.b()
            boolean r2 = r2.h
            egw r3 = r0.b()
            long r3 = r3.g
            long r5 = r1.a
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 >= 0) goto L78
            if (r2 == 0) goto L75
            boolean r0 = r0.l()
            if (r0 == 0) goto L72
            egm r0 = defpackage.egm.SYSTEM_DISMISSED
            goto L95
        L72:
            egm r0 = defpackage.egm.DISMISSED
            goto L95
        L75:
            egm r0 = defpackage.egm.SNOOZED
            goto L95
        L78:
            boolean r0 = r0.m()
            if (r0 == 0) goto L8a
            boolean r0 = r7.o()
            if (r0 == 0) goto L87
            egm r0 = defpackage.egm.SYSTEM_ON_HOLD
            goto L95
        L87:
            egm r0 = defpackage.egm.ON_HOLD
            goto L95
        L8a:
            boolean r0 = r7.o()
            if (r0 == 0) goto L93
            egm r0 = defpackage.egm.SYSTEM_ACTIVE
            goto L95
        L93:
            egm r0 = defpackage.egm.ACTIVE
        L95:
            r7.k(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehn.h():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(axnm axnmVar, axnm axnmVar2, ayor ayorVar) {
        h();
        ((ehh) axnmVar.get()).g().X(ayorVar).as(new ehk(this, 1));
        ((eil) axnmVar2.get()).a().X(ayorVar).as(new ehk(this));
    }

    public final boolean j() {
        return eog.B(this.d) && ((ehh) this.h.get()).j();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(defpackage.egm r11) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehn.k(egm):boolean");
    }
}

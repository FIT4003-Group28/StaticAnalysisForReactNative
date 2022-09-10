package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.maps.R;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: akdv  reason: default package */
/* loaded from: classes2.dex */
public final class akdv implements akfc {
    private static final dcqe i = dcqe.c("akdv");
    public final ff a;
    public final akcl b;
    public final dbty<AccountManager> c;
    public final akby d;
    public final Executor e;
    public final String f = btud.a();
    public final cjqy g;
    public final dbsg<dxio<ine>> h;
    private final Executor j;
    private final axrx k;
    private final axru l;
    private final btpc m;
    private final cjqq n;
    private final bwqv o;
    private final Boolean p;
    @dzsi
    private final aedv q;
    private final dbsg<dxio<afef>> r;
    private final dbsg<dxio<afha>> s;
    private final dbsg<akfd> t;

    public akdv(Activity activity, final Application application, akby akbyVar, Executor executor, Executor executor2, axrx axrxVar, axru axruVar, btpc btpcVar, akfa akfaVar, cjqy cjqyVar, cjqq cjqqVar, dbsg<akfd> dbsgVar, dbsg<dxio<afef>> dbsgVar2, dbsg<dxio<afha>> dbsgVar3, dbsg<dxio<ine>> dbsgVar4, bwqv bwqvVar, Boolean bool, @dzsi aedv aedvVar) {
        this.a = (ff) activity;
        this.c = dbud.a(new dbty(application) { // from class: akcu
            private final Application a;

            {
                this.a = application;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return AccountManager.get(this.a);
            }
        });
        this.d = akbyVar;
        this.j = executor;
        this.e = executor2;
        this.k = axrxVar;
        this.l = axruVar;
        this.m = btpcVar;
        this.g = cjqyVar;
        this.n = cjqqVar;
        this.t = dbsgVar;
        this.r = dbsgVar2;
        this.s = dbsgVar3;
        this.h = dbsgVar4;
        this.o = bwqvVar;
        this.p = bool;
        this.q = aedvVar;
        this.b = (akcl) akfaVar;
    }

    public static boolean g(btlu btluVar, akeu akeuVar) {
        return akeuVar.a().contains(btlu.i(btluVar));
    }

    private final boolean s(final btlu btluVar, akeu akeuVar, final akeo akeoVar, final Runnable runnable) {
        if (g(btluVar, akeuVar)) {
            akeoVar.a((gga) this.a, btluVar);
            return true;
        } else if (this.m.i()) {
            return false;
        } else {
            final Runnable runnable2 = new Runnable(this, akeoVar, btluVar) { // from class: akcx
                private final akdv a;
                private final akeo b;
                private final btlu c;

                {
                    this.a = this;
                    this.b = akeoVar;
                    this.c = btluVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    akdv akdvVar = this.a;
                    this.b.b((gga) akdvVar.a, this.c);
                }
            };
            ppw.b(this.a, new DialogInterface.OnClickListener(runnable, runnable2) { // from class: akcy
                private final Runnable a;
                private final Runnable b;

                {
                    this.a = runnable;
                    this.b = runnable2;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    Runnable runnable3 = this.a;
                    Runnable runnable4 = this.b;
                    if (i2 == -1) {
                        runnable3.run();
                    } else {
                        runnable4.run();
                    }
                }
            }, new DialogInterface.OnCancelListener(runnable2) { // from class: akcz
                private final Runnable a;

                {
                    this.a = runnable2;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.a.run();
                }
            });
            return true;
        }
    }

    private final boolean t() {
        return btsj.b(this.a) || this.l.a("android.permission.GET_ACCOUNTS");
    }

    private final void u(@dzsi final akey akeyVar) {
        afdr i2 = afdt.i();
        i2.c(new afds(akeyVar) { // from class: akdd
            private final akey a;

            {
                this.a = akeyVar;
            }

            @Override // defpackage.afds
            public final void Pn(gga ggaVar, boolean z) {
                akey akeyVar2 = this.a;
                if (akeyVar2 == null) {
                    return;
                }
                if (z) {
                    akeyVar2.a(true);
                } else {
                    akeyVar2.b();
                }
            }
        });
        i2.a();
        this.r.b().a().r();
    }

    private final void v(dbty<btlu> dbtyVar, @dzsi akey akeyVar) {
        akdp akdpVar = new akdp(akeyVar);
        if (t()) {
            r(dbtyVar, akdpVar);
        } else {
            this.k.b("android.permission.GET_ACCOUNTS", new akdq(this, dbtyVar, akdpVar));
        }
    }

    @Override // defpackage.akfc
    public final void a(final akeq akeqVar) {
        btlu q = btlu.q(this.b.j());
        if (s(q, akeqVar.c(), akeqVar.a(), new Runnable(this, akeqVar) { // from class: akcv
            private final akdv a;
            private final akeq b;

            {
                this.a = this;
                this.b = akeqVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a(this.b);
            }
        })) {
            return;
        }
        akdj akdjVar = new akdj(this, akeqVar, q);
        btlt btltVar = btlt.UNKNOWN;
        int ordinal = btlu.i(q).ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                u(akdjVar);
                return;
            } else if (ordinal != 3) {
                return;
            }
        }
        if (akeqVar.b().a()) {
            l(akdjVar, akeqVar.b().b());
        } else {
            k(akdjVar, this.a.getString(akeqVar.c().d()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.akfc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(final defpackage.akes r11) {
        /*
            r10 = this;
            akcl r0 = r10.b
            btlu r0 = r0.j()
            btlu r0 = defpackage.btlu.q(r0)
            akeu r1 = r11.b()
            aket r2 = r11.a()
            akcw r3 = new akcw
            r3.<init>(r10, r11)
            boolean r1 = r10.s(r0, r1, r2, r3)
            if (r1 == 0) goto L1e
            return
        L1e:
            akdu r3 = new akdu
            r3.<init>(r11)
            akeu r1 = r11.b()
            btlt r2 = defpackage.btlt.UNKNOWN
            btlt r0 = defpackage.btlu.i(r0)
            int r0 = r0.ordinal()
            r2 = 0
            if (r0 == 0) goto L8f
            r4 = 1
            if (r0 == r4) goto L8e
            r4 = 2
            if (r0 == r4) goto L40
            r4 = 3
            if (r0 == r4) goto L8f
            r0 = 0
            goto Lc3
        L40:
            bwqv r0 = r10.o
            afdr r4 = defpackage.afdt.i()
            r4.c(r3)
            int r3 = r1.f()
            r4.g(r3)
            int r3 = r1.g()
            r4.f(r3)
            int r1 = r1.h()
            r4.b(r1)
            r4.e(r2)
            dbsg r1 = r11.c()
            java.lang.Object r1 = r1.f()
            dktk r1 = (defpackage.dktk) r1
            r3 = r4
            afdo r3 = (defpackage.afdo) r3
            r3.b = r1
            dbsg r1 = r11.d()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r1 = r1.c(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r4.d(r1)
            afdt r1 = r4.a()
            afaw r0 = defpackage.afaw.aR(r0, r1)
            goto Lc3
        L8e:
            return
        L8f:
            bwqv r0 = r10.o
            int r4 = r1.d()
            int r5 = r1.e()
            int r6 = r1.b()
            int r7 = r1.c()
            dbsg r1 = r11.c()
            java.lang.Object r1 = r1.f()
            r8 = r1
            dktk r8 = (defpackage.dktk) r8
            dbsg r1 = r11.d()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r1 = r1.c(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r9 = r1.booleanValue()
            r2 = r0
            akef r0 = defpackage.akef.aJ(r2, r3, r4, r5, r6, r7, r8, r9)
        Lc3:
            if (r0 == 0) goto Le9
            dbsg r1 = r11.c()
            boolean r1 = r1.a()
            if (r1 == 0) goto Le2
            aedv r1 = r10.q
            if (r1 != 0) goto Ld4
            goto Le2
        Ld4:
            dbsg r11 = r11.c()
            java.lang.Object r11 = r11.b()
            dktk r11 = (defpackage.dktk) r11
            r1.r(r0, r11)
            return
        Le2:
            ff r11 = r10.a
            gga r11 = (defpackage.gga) r11
            r11.D(r0)
        Le9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akdv.b(akes):void");
    }

    @Override // defpackage.akfc
    public final void c(akez akezVar) {
        if (!this.t.a()) {
            this.b.r(akezVar);
        } else {
            deha.q(this.t.b().a(null), new akdk(this, akezVar), dege.a);
        }
    }

    @Override // defpackage.akfc
    public final void d(String str) {
        if (!this.t.a() || !this.b.c()) {
            e(str, null);
        } else {
            deha.q(this.t.b().a(str), new akdl(this, str), dege.a);
        }
    }

    @Override // defpackage.akfc
    public final void e(String str, @dzsi akey akeyVar) {
        v(new akdm(this, str), akeyVar);
    }

    @Override // defpackage.akfc
    public final void f(String str, @dzsi akey akeyVar) {
        v(new akdn(this, str), akeyVar);
    }

    public final void h(UserRecoverableAuthException userRecoverableAuthException, @dzsi final Account account, @dzsi final akey akeyVar) {
        if (userRecoverableAuthException instanceof cmrj) {
            final cmrj cmrjVar = (cmrj) userRecoverableAuthException;
            this.j.execute(new Runnable(this, cmrjVar, account, akeyVar) { // from class: akdb
                private final akdv a;
                private final cmrj b;
                private final Account c;
                private final akey d;

                {
                    this.a = this;
                    this.b = cmrjVar;
                    this.c = account;
                    this.d = akeyVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    akdv akdvVar = this.a;
                    Dialog a = cnnk.a(this.b.a, akdvVar.a, awnn.USER_RECOVERY.ordinal(), new akde(akdvVar, this.c, this.d));
                    if (a != null) {
                        a.show();
                    }
                }
            });
            return;
        }
        Intent a = userRecoverableAuthException.a();
        if (a == null) {
            this.a.runOnUiThread(new akdf(this));
            return;
        }
        if (akeyVar != null) {
            int identityHashCode = System.identityHashCode(akeyVar);
            Bundle bundleExtra = a.getBundleExtra("callerExtras");
            if (bundleExtra == null) {
                bundleExtra = new Bundle();
                a.putExtra("callerExtras", bundleExtra);
            }
            bundleExtra.putInt("callbackId", identityHashCode);
            this.b.q.put(Integer.valueOf(identityHashCode), akeyVar);
        }
        if (this.s.a()) {
            this.s.b().a().j(a, awnn.USER_RECOVERY.ordinal(), 2);
            return;
        }
        if (this.a instanceof gga) {
            bvoo.h("Should not directly launch intents in GmmActivity.", new Object[0]);
        }
        this.a.startActivityForResult(a, awnn.USER_RECOVERY.ordinal());
    }

    @Override // defpackage.akfc
    public final void i(int i2, @dzsi Intent intent) {
        if (intent != null) {
            Bundle bundleExtra = intent.getBundleExtra("callerExtras");
            akey remove = bundleExtra == null ? null : this.b.q.remove(Integer.valueOf(bundleExtra.getInt("callbackId")));
            if (i2 == -1) {
                String stringExtra = intent.getStringExtra("authAccount");
                dbsk.s(stringExtra);
                e(stringExtra, remove);
            } else if (i2 != 0) {
            } else {
                this.b.w(remove, false, false);
            }
        }
    }

    @Override // defpackage.akfc
    public final void j() {
        if (this.m.i()) {
            k(null, null);
            return;
        }
        ff ffVar = this.a;
        ppw.b(ffVar, new akdh(this, ffVar), new akdi());
    }

    @Override // defpackage.akfc
    public final void k(@dzsi akey akeyVar, @dzsi CharSequence charSequence) {
        if (this.b.d()) {
            u(akeyVar);
        } else if (charSequence == null || charSequence.length() == 0) {
            l(akeyVar, null);
        } else {
            l(akeyVar, new akfn(charSequence));
        }
    }

    public final void l(@dzsi final akey akeyVar, @dzsi final cqiw<cqkp> cqiwVar) {
        bvrj.UI_THREAD.c();
        if (this.p.booleanValue()) {
            cqiwVar = new akfn(this.a.getString(R.string.FEATURE_UNAVAILABLE_IN_DEMO_MODE));
        }
        if (t()) {
            m(cqiwVar, akeyVar);
        } else {
            this.k.b("android.permission.GET_ACCOUNTS", new axrw(this, cqiwVar, akeyVar) { // from class: akdc
                private final akdv a;
                private final cqiw b;
                private final akey c;

                {
                    this.a = this;
                    this.b = cqiwVar;
                    this.c = akeyVar;
                }

                @Override // defpackage.axrw
                public final void a(int i2) {
                    this.a.m(this.b, this.c);
                }
            });
        }
    }

    public final void m(@dzsi cqiw<cqkp> cqiwVar, @dzsi akey akeyVar) {
        bvrj.UI_THREAD.c();
        ff ffVar = this.a;
        akco akcoVar = new akco();
        akcoVar.ad = akeyVar;
        akcoVar.ae = cqiwVar;
        gei.b(ffVar, akcoVar, "loginDialog");
    }

    @Override // defpackage.akfc
    public final void n(String str, akey akeyVar) {
        String o = this.b.o();
        if (o == null || !o.equals(str)) {
            e(str, new akdt(this, akeyVar));
        } else {
            akeyVar.a(false);
        }
    }

    @Override // defpackage.akfc
    public final void o(String str, akey akeyVar) {
        btlu j = this.b.j();
        if (!j.l() || !j.d.equals(str)) {
            f(str, new akdt(this, akeyVar));
        } else {
            akeyVar.a(false);
        }
    }

    @Override // defpackage.akfc
    public final void p(boolean z) {
        dafk a = ckos.a(this.a.findViewById(16908290), this.a.getString(R.string.SIGNED_IN_AS, new Object[]{this.b.o()}), 0);
        if (z) {
            cjtd a2 = cjtd.a(dtxu.fV);
            a.t(R.string.ACCOUNT_SWITCH, new akdg(this, a2));
            this.n.g().d(a2);
        }
        this.n.g().d(cjtd.a(dtxu.fU));
        a.c();
    }

    public final void q(@dzsi akey akeyVar) {
        this.a.runOnUiThread(new akdo(this));
        this.b.w(akeyVar, false, false);
        akcl akclVar = this.b;
        akclVar.E(akclVar.j());
    }

    public final void r(final dbty<btlu> dbtyVar, final akey akeyVar) {
        this.e.execute(new Runnable(this, akeyVar, dbtyVar) { // from class: akda
            private final akdv a;
            private final akey b;
            private final dbty c;

            {
                this.a = this;
                this.b = akeyVar;
                this.c = dbtyVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                akdv akdvVar = this.a;
                akey akeyVar2 = this.b;
                dbty dbtyVar2 = this.c;
                if (!akdvVar.b.i()) {
                    akdvVar.q(akeyVar2);
                    return;
                }
                btlu btluVar = (btlu) dbtyVar2.a();
                if (btluVar == btlu.a) {
                    akdvVar.q(akeyVar2);
                    return;
                }
                try {
                    btua B = akdvVar.b.B(btluVar, akdvVar.f);
                    String f = B.f();
                    if (f == null) {
                        akdvVar.c.a().updateCredentials(btluVar.s(), akdvVar.f, null, akdvVar.a, null, null).getResult();
                        f = B.f();
                    }
                    if (f == null) {
                        akdvVar.q(akeyVar2);
                        return;
                    }
                    akcl akclVar = akdvVar.b;
                    akdvVar.b.w(akeyVar2, true, akclVar.p(btluVar, akclVar.t()));
                } catch (UserRecoverableAuthException e) {
                    akdvVar.h(e, btluVar.s(), akeyVar2);
                } catch (Exception e2) {
                    dbue.b(e2);
                    akdvVar.q(akeyVar2);
                }
            }
        });
    }
}

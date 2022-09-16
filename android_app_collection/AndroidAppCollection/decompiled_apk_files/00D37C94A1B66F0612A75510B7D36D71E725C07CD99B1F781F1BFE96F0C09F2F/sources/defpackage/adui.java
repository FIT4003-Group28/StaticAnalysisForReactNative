package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.libraries.onegoogle.accountmanagement.AccountsModelUpdater;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: adui  reason: default package */
/* loaded from: classes.dex */
public final class adui implements adty, ynl {
    public final advc a;
    public final adux b;
    public final adup c;
    public final acti d;
    public final azqb e;
    public final snc f;
    public final yni g;
    public oa i;
    public advb j;
    public una k;
    public final advo m;
    private final azqb n;
    private final azqb o;
    private final uqe p;
    public boolean l = false;
    public final Handler h = new Handler(Looper.getMainLooper());

    public adui(advc advcVar, adux aduxVar, adup adupVar, advo advoVar, azqb azqbVar, azqb azqbVar2, uqe uqeVar, acti actiVar, azqb azqbVar3, snc sncVar, yni yniVar) {
        this.a = advcVar;
        this.b = aduxVar;
        this.c = adupVar;
        this.m = advoVar;
        this.n = azqbVar;
        this.o = azqbVar2;
        this.p = uqeVar;
        this.d = actiVar;
        this.e = azqbVar3;
        this.f = sncVar;
        this.g = yniVar;
    }

    @Override // defpackage.adty
    public final void a(final oa oaVar, final String str, final ampq ampqVar, final boolean z, final boolean z2, final boolean z3) {
        ankt b;
        if (oaVar == null) {
            zep.m("MDX.tvsignin.ExpressTvSignInDrawerController", "Sign in request is invalid or the View cannot be placed.");
        } else if (this.j != null) {
            zep.m("MDX.tvsignin.ExpressTvSignInDrawerController", "There is already a sign in request active. Exiting.");
        } else {
            advb g = this.a.g();
            if (g == null || g.b() == null) {
                return;
            }
            if (this.a.g().d == 1) {
                if (this.a.g().d != 1) {
                    b = anlz.q(false);
                } else {
                    b = ylx.b(oaVar, ((vne) this.e.get()).a(), new ampg() { // from class: aduc
                        /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
                            if (r0.f.c() >= (java.lang.Long.parseLong(r8) + java.util.concurrent.TimeUnit.DAYS.toMillis(30))) goto L25;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
                            r7 = true;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
                            if (r7 == false) goto L33;
                         */
                        @Override // defpackage.ampg
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object apply(java.lang.Object r15) {
                            /*
                                r14 = this;
                                adui r0 = defpackage.adui.this
                                boolean r1 = r2
                                boolean r2 = r3
                                awua r15 = (defpackage.awua) r15
                                long r3 = r15.c
                                r5 = 1
                                r6 = 0
                                if (r1 != 0) goto L83
                                aopu r15 = r15.e
                                advc r1 = r0.a
                                advb r1 = r1.g()
                                java.lang.String r1 = r1.b
                                java.util.Iterator r15 = r15.iterator()
                            L1c:
                                r7 = 0
                            L1d:
                                boolean r8 = r15.hasNext()
                                if (r8 == 0) goto L81
                                java.lang.Object r8 = r15.next()
                                java.lang.String r8 = (java.lang.String) r8
                                int r9 = r1.length()
                                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                                int r9 = r9 + r5
                                r10.<init>(r9)
                                r10.append(r1)
                                r9 = 58
                                r10.append(r9)
                                java.lang.String r10 = r10.toString()
                                boolean r10 = r8.startsWith(r10)
                                if (r10 == 0) goto L1d
                                int r9 = r8.indexOf(r9)
                                int r9 = r9 + r5
                                java.lang.String r8 = r8.substring(r9)
                                boolean r9 = defpackage.babj.c(r8)
                                if (r9 != 0) goto L1d
                                int r9 = r8.length()
                                r10 = 0
                            L59:
                                if (r10 >= r9) goto L68
                                char r11 = r8.charAt(r10)
                                boolean r11 = java.lang.Character.isDigit(r11)
                                if (r11 == 0) goto L1d
                                int r10 = r10 + 1
                                goto L59
                            L68:
                                long r7 = java.lang.Long.parseLong(r8)
                                snc r9 = r0.f
                                long r9 = r9.c()
                                java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.DAYS
                                r12 = 30
                                long r11 = r11.toMillis(r12)
                                long r7 = r7 + r11
                                int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                                if (r11 >= 0) goto L1c
                                r7 = 1
                                goto L1d
                            L81:
                                if (r7 != 0) goto La0
                            L83:
                                if (r2 != 0) goto L9f
                                r1 = -1
                                int r15 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                                if (r15 == 0) goto L9f
                                snc r15 = r0.f
                                long r0 = r15.c()
                                java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.DAYS
                                r7 = 1
                                long r7 = r15.toMillis(r7)
                                long r3 = r3 + r7
                                int r15 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                                if (r15 >= 0) goto L9f
                                goto La0
                            L9f:
                                r5 = 0
                            La0:
                                java.lang.Boolean r15 = java.lang.Boolean.valueOf(r5)
                                return r15
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.aduc.apply(java.lang.Object):java.lang.Object");
                        }
                    });
                }
                ylx.n(oaVar, b, aclb.h, new zdt() { // from class: adua
                    @Override // defpackage.zdt
                    public final void a(Object obj) {
                        adui aduiVar = adui.this;
                        oa oaVar2 = oaVar;
                        boolean z4 = z;
                        String str2 = str;
                        ampq ampqVar2 = ampqVar;
                        if (((Boolean) obj).booleanValue()) {
                            return;
                        }
                        aduiVar.c(oaVar2, z4, str2, ampqVar2);
                        ylx.m(((vne) aduiVar.e.get()).b(new adub(aduiVar), anjk.a), adkd.k);
                    }
                });
                return;
            }
            c(oaVar, z, str, ampqVar);
        }
    }

    public final void b(final boolean z) {
        this.h.post(new Runnable() { // from class: adue
            @Override // java.lang.Runnable
            public final void run() {
                advb advbVar;
                adui aduiVar = adui.this;
                if (z && (advbVar = aduiVar.j) != null) {
                    aduiVar.b.a(advbVar.b, "canceled");
                    zep.c("MDX.tvsignin.ExpressTvSignInDrawerController", "sending cancel message");
                }
                aduiVar.g.m(aduiVar);
                una unaVar = aduiVar.k;
                if (unaVar != null) {
                    uwp.f();
                    umx b = una.b(unaVar.a);
                    if (b != null) {
                        b.dismiss();
                    }
                }
                aduiVar.i = null;
                aduiVar.l = false;
                aduiVar.j = null;
                aduiVar.k = null;
            }
        });
    }

    public final void c(oa oaVar, boolean z, String str, ampq ampqVar) {
        uoc uocVar;
        uoe uoeVar;
        this.i = oaVar;
        this.j = this.a.g();
        boolean z2 = false;
        this.l = false;
        int l = almu.l(this.i, R.attr.isLightTheme, "MDX.tvsignin.ExpressTvSignInDrawerController");
        boolean z3 = l != 0;
        if ((this.i.getResources().getConfiguration().uiMode & 48) == 16) {
            z2 = true;
        }
        if (z2 ^ z3) {
            this.i.getDelegate().u(l != 0 ? 1 : 2);
        }
        if (z) {
            uocVar = (uoc) this.o.get();
        } else {
            uocVar = (uoc) this.n.get();
        }
        oa oaVar2 = this.i;
        umy umyVar = new umy(null);
        if (uocVar != null) {
            umyVar.a = uocVar;
            ulb g = AccountsModelUpdater.g();
            g.a = uocVar.a;
            g.b = this.p;
            umyVar.c = ampq.j(new AccountsModelUpdater(g.a, new ulf(g.b), g.b));
            uod uodVar = new uod();
            uodVar.a = uok.a().a();
            uodVar.b = new adtz(this);
            uoh uohVar = new uoh(null);
            if (str != null) {
                uohVar.a = str;
                uohVar.b = ampq.j((String) ((ampv) ampqVar).a);
                uoj a = uok.a();
                a.b = amon.a;
                String str2 = uohVar.a;
                if (str2 == null) {
                    throw new IllegalStateException("Missing required properties: title");
                }
                a.a = ampq.j(new uoi(str2, uohVar.b, uohVar.c, uohVar.d));
                a.b(vgh.d(this.i.getApplicationContext(), new Runnable() { // from class: adud
                    @Override // java.lang.Runnable
                    public final void run() {
                        adui aduiVar = adui.this;
                        boolean z4 = true;
                        if (aduiVar.l) {
                            aduiVar.d.H(3, new acte(acuo.b(50662)), null);
                            adup adupVar = aduiVar.c;
                            ankt anktVar = adupVar.e;
                            if (anktVar != null) {
                                anktVar.cancel(true);
                            }
                            adupVar.c();
                        } else {
                            advb advbVar = aduiVar.j;
                            if (advbVar == null || advbVar.d != 1) {
                                aduiVar.d.H(3, new acte(acuo.b(36380)), null);
                            } else {
                                aduiVar.d.H(3, new acte(acuo.b(108702)), null);
                                ylx.m(((vne) aduiVar.e.get()).b(new adub(aduiVar, 1), anjk.a), adkd.j);
                            }
                        }
                        advb advbVar2 = aduiVar.j;
                        if ((advbVar2 == null || advbVar2.d == 1) && !aduiVar.l) {
                            z4 = false;
                        }
                        aduiVar.b(z4);
                    }
                }));
                uodVar.a = a.a();
                umyVar.b = uodVar.a();
                uoc uocVar2 = umyVar.a;
                if (uocVar2 == null || (uoeVar = umyVar.b) == null) {
                    StringBuilder sb = new StringBuilder();
                    if (umyVar.a == null) {
                        sb.append(" expressSignInManager");
                    }
                    if (umyVar.b == null) {
                        sb.append(" expressSignInSpec");
                    }
                    String valueOf = String.valueOf(sb);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                    sb2.append("Missing required properties:");
                    sb2.append(valueOf);
                    throw new IllegalStateException(sb2.toString());
                }
                una unaVar = new una(oaVar2.getApplicationContext(), oaVar2.getSupportFragmentManager(), new umz(uocVar2, uoeVar, umyVar.c), oaVar2);
                this.k = unaVar;
                umx b = una.b(unaVar.a);
                if (b == null) {
                    b = new umx();
                    unaVar.a(b);
                }
                dt dtVar = unaVar.b;
                if ((dtVar == null || !dtVar.isFinishing()) && !b.ap() && !unaVar.a.Z()) {
                    b.qv(unaVar.a, umx.ae);
                }
                this.d.d(acuo.a(this.j.d == 1 ? 108701 : 36382), null, null);
                this.d.n(new acte(acuo.b(36381)));
                this.d.n(new acte(acuo.b(36380)));
                if (this.j.d == 1) {
                    this.d.n(new acte(acuo.b(108702)));
                }
                this.g.g(this);
                return;
            }
            throw new NullPointerException("Null title");
        }
        throw new NullPointerException("Null expressSignInManager");
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        boolean z = false;
        if (i != -1) {
            if (i == 0) {
                adva advaVar = (adva) obj;
                if (advaVar.d() && TextUtils.equals(advaVar.c(), this.j.b)) {
                    return null;
                }
                if (this.j.d != 1) {
                    z = true;
                }
                b(z);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{adva.class};
    }
}

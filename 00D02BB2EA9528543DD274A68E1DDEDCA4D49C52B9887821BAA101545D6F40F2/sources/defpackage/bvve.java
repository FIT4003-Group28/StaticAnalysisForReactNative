package defpackage;

import android.accounts.Account;
import android.net.Uri;
import android.util.Base64;
import com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvve  reason: default package */
/* loaded from: classes4.dex */
public final class bvve extends itb implements bvvw {
    public static final dcep<String> a = dcep.B("google.com");
    public final akfa b;
    public final dxio<cmrp> c;
    public dcep<String> d = dcmr.a;
    private final gga e;
    private final Executor f;
    private final btvo g;
    private final Executor h;
    private final dxio<bvxz> i;
    private final dxio<bvyc> j;
    private final dxio<bvuw> k;
    private final dxio<bwde> o;
    @dzsi
    private final crzp<btlu> p;

    public bvve(gga ggaVar, Executor executor, btvo btvoVar, akfa akfaVar, Executor executor2, dxio<bvxz> dxioVar, dxio<bvyc> dxioVar2, dxio<cmrp> dxioVar3, dxio<bvuw> dxioVar4, dxio<bwde> dxioVar5) {
        this.e = ggaVar;
        this.f = executor;
        this.g = btvoVar;
        this.b = akfaVar;
        this.h = executor2;
        this.i = dxioVar;
        this.j = dxioVar2;
        this.c = dxioVar3;
        this.k = dxioVar4;
        this.o = dxioVar5;
        if (!btvoVar.getEnableFeatureParameters().br) {
            this.p = null;
            return;
        }
        f(a);
        crzp<btlu> crzpVar = new crzp(this) { // from class: bvvb
            private final bvve a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                bvve bvveVar = this.a;
                bvrj.UI_THREAD.c();
                bvveVar.o();
                bvveVar.f(bvve.a);
            }
        };
        this.p = crzpVar;
        akfaVar.C().a(crzpVar, executor2);
    }

    @Override // defpackage.itb
    public final void Nu() {
        if (this.p != null) {
            this.b.C().c(this.p);
        }
        super.Nu();
    }

    @Override // defpackage.bvvw
    public final dehn<Void> e(Set<String> set) {
        dbsk.l(this.g.getEnableFeatureParameters().br);
        bvrj.UI_THREAD.c();
        dcnk p = dcnm.p(set, this.d);
        if (p.isEmpty()) {
            return dehk.a;
        }
        return f(p);
    }

    @Override // defpackage.bvvw
    public final dehn<Void> f(final Set<String> set) {
        dbsk.l(this.g.getEnableFeatureParameters().br);
        dbsk.a(!set.isEmpty());
        bvrj.UI_THREAD.c();
        final btlu j = this.b.j();
        if (j == null || !j.l()) {
            o();
            return dehk.a;
        }
        dbsk.a(j.l());
        return deew.h(deha.e(new Runnable(this, j, set) { // from class: bvvd
            private final bvve a;
            private final btlu b;
            private final Set c;

            {
                this.a = this;
                this.b = j;
                this.c = set;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bvve bvveVar = this.a;
                btlu btluVar = this.b;
                Set<String> set2 = this.c;
                try {
                    cmrp a2 = bvveVar.c.a();
                    Account s = btluVar.s();
                    dccx F = dcdc.F();
                    for (String str : set2) {
                        F.g(new Uri.Builder().scheme("https").authority(str).toString());
                    }
                    dcdc f = F.f();
                    boolean z = false;
                    String[] strArr = (String[]) f.toArray(new String[0]);
                    int i = 1;
                    if (strArr != null && strArr.length > 0) {
                        z = true;
                    }
                    cnwc.e(z, "Must have at least one URL.");
                    cmrn cmrnVar = a2.b;
                    try {
                        cmun cmunVar = (cmun) dsqw.cr(cmun.c, Base64.decode(cmrh.f(a2.a, s, cmrp.a(strArr)), 9), dsqa.c());
                        if (cmunVar == null || (cmunVar.a & 1) == 0) {
                            throw new cmra("Invalid response.");
                        }
                        cmuv cmuvVar = cmunVar.b;
                        if (cmuvVar == null) {
                            cmuvVar = cmuv.d;
                        }
                        int a3 = cmuu.a(cmuvVar.a);
                        if (a3 == 0) {
                            a3 = 1;
                        }
                        int i2 = a3 - 1;
                        if (i2 != 1) {
                            if (i2 == 2) {
                                throw new IOException("Request failed, but server said RETRY.");
                            } else {
                                if (i2 == 5) {
                                    a2.b(cmuvVar.b);
                                    for (cmus cmusVar : cmuvVar.c) {
                                        int a4 = cmur.a(cmusVar.a);
                                        if (a4 == 0) {
                                            a4 = 1;
                                        }
                                        int i3 = a4 - 1;
                                        if (i3 != 1) {
                                            if (i3 == 2) {
                                                String str2 = cmusVar.b;
                                                throw new cmrm();
                                            } else if (i3 != 3) {
                                                int a5 = cmur.a(cmusVar.a);
                                                if (a5 == 0) {
                                                    a5 = 1;
                                                }
                                                StringBuilder sb = new StringBuilder(47);
                                                sb.append("Unrecognized failed account status: ");
                                                sb.append(a5 - 1);
                                                sb.toString();
                                            }
                                        }
                                    }
                                    throw new cmra("Authorization failed, but no recoverable accounts.");
                                }
                                String valueOf = String.valueOf(cmuvVar);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 21);
                                sb2.append("Unexpected response: ");
                                sb2.append(valueOf);
                                sb2.toString();
                                int a6 = cmuu.a(cmuvVar.a);
                                if (a6 != 0) {
                                    i = a6;
                                }
                                StringBuilder sb3 = new StringBuilder(36);
                                sb3.append("Unknown response status: ");
                                sb3.append(i - 1);
                                throw new cmra(sb3.toString());
                            }
                        }
                        a2.b(cmuvVar.b);
                    } catch (dsrm e) {
                        throw new cmra(e, null);
                    }
                } catch (cmra | cmrm | IOException e2) {
                    throw new RuntimeException("Failed to fetch and set auth cookies", e2);
                }
            }
        }, this.f), new dbrn(this, j, set) { // from class: bvvc
            private final bvve a;
            private final btlu b;
            private final Set c;

            {
                this.a = this;
                this.b = j;
                this.c = set;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                bvve bvveVar = this.a;
                btlu btluVar = this.b;
                Set set2 = this.c;
                Void r4 = (Void) obj;
                if (!btluVar.equals(bvveVar.b.j())) {
                    bvveVar.o();
                    throw new IllegalStateException("Accounts have changed since auth cookies were requested.");
                }
                dbsk.l(btluVar.equals(bvveVar.b.j()));
                dcen N = dcep.N();
                N.i(bvveVar.d);
                N.i(set2);
                bvveVar.d = N.f();
                return null;
            }
        }, this.h);
    }

    @Override // defpackage.bvvw
    public final void i(String str) {
        this.i.a().a(str);
    }

    @Override // defpackage.bvvw
    public final void j(bvxu bvxuVar, @dzsi WebViewCallbacks webViewCallbacks, ddho ddhoVar) {
        this.o.a().a(bvxuVar.h, bwdd.OPEN_DIALOG);
        gga ggaVar = this.e;
        bvtp bvtpVar = new bvtp();
        bvtr.a(bvxuVar, webViewCallbacks, ddhoVar, bvtpVar);
        gei.a(ggaVar, bvtpVar);
    }

    @Override // defpackage.bvvw
    public final void k(bvxu bvxuVar, @dzsi WebViewCallbacks webViewCallbacks, ddho ddhoVar) {
        this.o.a().a(bvxuVar.h, bwdd.OPEN_FRAGMENT);
        this.e.D(bvtq.g(bvxuVar, webViewCallbacks, ddhoVar));
    }

    @Override // defpackage.bvvw
    @dzsi
    public final bvxh l(bvxu bvxuVar, WebViewCallbacks webViewCallbacks, boolean z) {
        this.o.a().a(bvxuVar.h, bwdd.START_PRELOADING);
        bvvr e = bvvs.e();
        e.b(bvxuVar);
        ((bvvn) e).b = webViewCallbacks;
        return this.k.a().a(e.a(), true, z, null);
    }

    @Override // defpackage.bvvw
    @dzsi
    public final bvxh m(bvvs bvvsVar, boolean z) {
        this.o.a().a(bvvsVar.a().h, bwdd.START_PRELOADING);
        return this.k.a().a(bvvsVar, true, z, null);
    }

    @Override // defpackage.bvvw
    public final void n(bvxh bvxhVar, ddho ddhoVar) {
        bwce bwceVar = (bwce) bvxhVar;
        this.o.a().b(bwceVar.b().h, bwdd.OPEN_PRELOADED_IN_DIALOG, 0);
        gga ggaVar = this.e;
        bvtp bvtpVar = new bvtp();
        bvtpVar.c = bwceVar;
        bvtr.b(bwceVar, ddhoVar, bvtpVar);
        gei.a(ggaVar, bvtpVar);
    }

    public final void o() {
        this.j.a().a();
        this.d = dcmr.a;
    }

    @Override // defpackage.bvvw
    public final void p(bvxu bvxuVar, @dzsi WebViewCallbacks webViewCallbacks, ddho ddhoVar, @dzsi int i) {
        this.o.a().b(bvxuVar.h, bwdd.OPEN_FRAGMENT, i);
        this.e.D(bvtq.g(bvxuVar, webViewCallbacks, ddhoVar));
    }

    @Override // defpackage.bvvw
    public final void q(bvxh bvxhVar, ddho ddhoVar) {
        bwce bwceVar = (bwce) bvxhVar;
        this.o.a().b(bwceVar.b().h, bwdd.OPEN_PRELOADED_IN_FRAGMENT, 0);
        gga ggaVar = this.e;
        bvtq bvtqVar = new bvtq();
        bvtqVar.c = bwceVar;
        bvtr.b(bwceVar, ddhoVar, bvtqVar);
        ggaVar.D(bvtqVar);
    }

    @Override // defpackage.bvvw
    public final void r(bvvs bvvsVar, ddho ddhoVar) {
        this.o.a().b(bvvsVar.a().h, bwdd.OPEN_FRAGMENT, 0);
        gga ggaVar = this.e;
        bvtq bvtqVar = new bvtq();
        bvtr.c(bvvsVar, ddhoVar, bvtqVar);
        ggaVar.D(bvtqVar);
    }
}

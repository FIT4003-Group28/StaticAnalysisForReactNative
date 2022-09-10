package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.google.android.apps.gmm.location.rawlocationevents.HardBrakeEvent;
import com.google.android.apps.gmm.location.rawlocationevents.ProjectedSensorStateEvent;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.libraries.geo.navcore.service.logging.ActivityRecognitionForLoggingBroadcastReceiver;
import com.google.ar.core.ImageMetadata;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: crnz  reason: default package */
/* loaded from: classes5.dex */
public final class crnz implements crgy {
    public static final dcdc<bzqb> a;
    private static final dcqe j = dcqe.c("crnz");
    private static final int[] k;
    private final dbsg<atbs> A;
    @dzsi
    private PendingIntent B;
    @dzsi
    private cojh C;
    private final crns D;
    @dzsi
    private crnr F;
    public final akfa b;
    public final dehq c;
    @dzsi
    public crpi d;
    public crpm e;
    public int f;
    final dbsg g;
    public final int h;
    private final Context l;
    private final btpc m;
    private final crem n;
    private final bvjj o;
    private final cqat p;
    private final btrm q;
    private final btvo r;
    private final String s;
    private final dehq t;
    private final ckcw u;
    private final buwv v;
    private final ahjq w;
    private final jzv x;
    private final btyy y;
    private final dzsj<dbsg<ddlj>> z;
    public int i = 3;
    private final cpeq G = cpdo.d;
    private final corc E = coqk.b;

    static {
        dcdc<bzqb> h = dcdc.h(bzqb.WEB_AND_APP_ACTIVITY, bzqb.LOCATION_HISTORY, bzqb.LOCATION_REPORTING);
        a = h;
        k = new int[h.size()];
        int i = 0;
        while (true) {
            dcdc<bzqb> dcdcVar = a;
            if (i < dcdcVar.size()) {
                k[i] = dcdcVar.get(i).d;
                i++;
            } else {
                return;
            }
        }
    }

    public crnz(Context context, btpc btpcVar, crem cremVar, bvjj bvjjVar, btvo btvoVar, String str, dehq dehqVar, dehq dehqVar2, akfa akfaVar, ckcw ckcwVar, cqat cqatVar, btrm btrmVar, buwv buwvVar, ahjq ahjqVar, jzv jzvVar, dbsg dbsgVar, btyy btyyVar, dzsj<dbsg<ddlj>> dzsjVar, dbsg<atbs> dbsgVar2) {
        this.l = context;
        this.m = btpcVar;
        this.n = cremVar;
        this.o = bvjjVar;
        this.p = cqatVar;
        this.q = btrmVar;
        this.r = btvoVar;
        this.s = str;
        this.c = dehqVar;
        this.t = dehqVar2;
        this.b = akfaVar;
        this.u = ckcwVar;
        this.v = buwvVar;
        this.z = dzsjVar;
        this.A = dbsgVar2;
        this.D = new crns(context);
        this.w = ahjqVar;
        dbsk.t(jzvVar, "projectedModeController");
        this.x = jzvVar;
        this.g = dbsgVar;
        this.y = btyyVar;
        this.h = 1;
        this.f = -1;
    }

    private static String m(String str) {
        if (!str.isEmpty()) {
            try {
                URI uri = new URI(str);
                String scheme = uri.getScheme();
                return (scheme == null || !scheme.equals("android-app")) ? "" : new URI("android-app", uri.getHost(), null, null).toASCIIString();
            } catch (URISyntaxException unused) {
                return "";
            }
        }
        return "";
    }

    private final void n(int i) {
        crnr crnrVar = this.F;
        this.F = null;
        k(crnrVar);
    }

    @Override // defpackage.crgy
    public final void a(crgz crgzVar) {
        String str;
        amsy amsyVar;
        crfo crfoVar = crgzVar.c;
        String str2 = null;
        if (crfoVar != null) {
            str = crfoVar.i;
            if (crfoVar.a == arym.GUIDED_NAV && (amsyVar = crfoVar.a().a) != null) {
                dwas dwasVar = amsyVar.a.e;
                if (dwasVar == null) {
                    dwasVar = dwas.d;
                }
                if ((dwasVar.a & 2) != 0) {
                    dwas dwasVar2 = amsyVar.a.e;
                    if (dwasVar2 == null) {
                        dwasVar2 = dwas.d;
                    }
                    str2 = dwasVar2.c;
                }
                bvrt<dwaw> bvrtVar = crfoVar.a().h;
                if (bvrtVar != null) {
                    bvrtVar.e((dssr) dwaw.j.cu(7), dwaw.j);
                }
            }
        } else {
            str = "";
        }
        l(crgzVar.b, crgzVar.a, str, str2);
    }

    @Override // defpackage.crgy
    public final void b(boolean z) {
        bvrj.NAVIGATION_INTERNAL.c();
        int i = this.f;
        this.f = i + 1;
        hashCode();
        c(z, i);
        bvrj.NAVIGATION_INTERNAL.c();
        hashCode();
        this.g.a();
    }

    public final void c(boolean z, final int i) {
        bvrj.NAVIGATION_INTERNAL.c();
        cojh cojhVar = this.C;
        if (cojhVar != null) {
            this.C = null;
            dbsk.s(this.B);
            cojhVar.b(this.B);
        }
        this.g.a();
        this.i = 3;
        crpi crpiVar = this.d;
        if (crpiVar != null) {
            final crnr crnrVar = this.F;
            this.F = null;
            Runnable runnable = new Runnable(this, i, crnrVar) { // from class: crnk
                private final crnz a;
                private final int b;
                private final crnr c;

                {
                    this.a = this;
                    this.b = i;
                    this.c = crnrVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.k(this.c);
                }
            };
            bvrj.NAVIGATION_INTERNAL.c();
            crpiVar.b.a(crpiVar);
            if (crpiVar.m()) {
                ddwo bZ = ddwp.c.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddwp ddwpVar = (ddwp) bZ.b;
                ddwpVar.a |= 1;
                ddwpVar.b = z;
                ddvr bZ2 = ddvs.g.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddvs ddvsVar = (ddvs) bZ2.b;
                ddwp bK = bZ.bK();
                bK.getClass();
                ddvsVar.c = bK;
                ddvsVar.b = 21;
                crpiVar.e.c(bZ2);
                GmmLocation a2 = crpiVar.n.a();
                if (a2 != null) {
                    crpiVar.e.e(a2, true);
                }
            }
            crpl crplVar = crpiVar.e;
            if (crplVar.e != Long.MAX_VALUE) {
                crplVar.g(runnable, crplVar.b(crplVar.a.e()));
            }
            crpiVar.q.clear();
            this.d = null;
            crpiVar.d.l = false;
            return;
        }
        n(i);
    }

    public final dehn<Boolean> d(@dzsi final crny crnyVar, final ddww ddwwVar) {
        cnoh<cper> cnohVar;
        bvrj.NAVIGATION_INTERNAL.c();
        final deig d = deig.d();
        final ckcm ckcmVar = (ckcm) this.u.a(ckhj.q);
        UdcCacheRequest udcCacheRequest = new UdcCacheRequest(k);
        try {
            crnr crnrVar = this.F;
            dbsk.s(crnrVar);
            cnohVar = cpeq.b(crnrVar.a, udcCacheRequest);
        } catch (IllegalStateException e) {
            if (String.valueOf(e.getMessage()).length() == 0) {
                new String("NAVLOG: GmsCore getCachedSettings threw: ");
            }
            bvoo.j(e);
            cnohVar = null;
        }
        if (cnohVar == null) {
            ckcmVar.a(false);
            d.j(false);
            return d;
        }
        cnohVar.i(new cnon(ckcmVar, crnyVar, ddwwVar, d) { // from class: crnn
            private final ckcm a;
            private final crny b;
            private final ddww c;
            private final deig d;

            {
                this.a = ckcmVar;
                this.b = crnyVar;
                this.c = ddwwVar;
                this.d = d;
            }

            /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x00b9  */
            @Override // defpackage.cnon
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void Om(defpackage.cnom r18) {
                /*
                    Method dump skipped, instructions count: 203
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.crnn.Om(cnom):void");
            }
        });
        return d;
    }

    public final dehn<Boolean> e(Account account, @dzsi final crny crnyVar) {
        cnoh<cora> cnohVar;
        bvrj.NAVIGATION_INTERNAL.c();
        final deig d = deig.d();
        final ckcm ckcmVar = (ckcm) this.u.a(ckhj.r);
        try {
            crnr crnrVar = this.F;
            dbsk.s(crnrVar);
            cnohVar = corc.c(crnrVar.a, account);
        } catch (IllegalStateException e) {
            if (String.valueOf(e.getMessage()).length() == 0) {
                new String("NAVLOG: ULR getReportingState threw: ");
            }
            bvoo.j(e);
            cnohVar = null;
        }
        if (cnohVar == null) {
            ckcmVar.a(false);
            d.j(false);
            return d;
        }
        cnohVar.i(new cnon(ckcmVar, crnyVar, d) { // from class: crno
            private final ckcm a;
            private final crny b;
            private final deig c;

            {
                this.a = ckcmVar;
                this.b = crnyVar;
                this.c = d;
            }

            @Override // defpackage.cnon
            public final void Om(cnom cnomVar) {
                ckcm ckcmVar2 = this.a;
                crny crnyVar2 = this.b;
                deig deigVar = this.c;
                cora coraVar = (cora) cnomVar;
                dcdc<bzqb> dcdcVar = crnz.a;
                boolean z = false;
                if (!coraVar.a.d()) {
                    int i = coraVar.a.g;
                    ckcmVar2.a(false);
                } else {
                    ckcmVar2.a(true);
                    z = coraVar.g();
                    if (crnyVar2 != null) {
                        crnyVar2.e(z);
                    }
                    dbsb d2 = dbsc.d("NAVLOG: ReportingStateResult");
                    d2.c();
                    d2.h("isAllowed", coraVar.f());
                    d2.h("isReportingEnabled", coraVar.c());
                    d2.h("isHistoryEnabled", coraVar.e());
                    d2.h("isStarted", coraVar.g());
                    d2.h("isOptedIn", coraVar.h());
                    d2.f("expectedOptInStatusCode", coraVar.i());
                    d2.h("shouldOptIn", coraVar.j());
                }
                deigVar.j(Boolean.valueOf(z));
            }
        });
        return d;
    }

    @dzsi
    public final dwaq f(boolean z) {
        bvrj.NAVIGATION_INTERNAL.c();
        crpi crpiVar = this.d;
        if (crpiVar == null) {
            return null;
        }
        bvrj.NAVIGATION_INTERNAL.c();
        long e = crpiVar.c.e();
        int i = 0;
        while (i < crpiVar.s.size()) {
            crph crphVar = crpiVar.s.get(i);
            if (e >= crphVar.f) {
                int i2 = crphVar.a;
                crpiVar.s.remove(i);
                i--;
            }
            i++;
        }
        int a2 = ddwv.a(crpiVar.d.a.E);
        dbsk.l(a2 != 0 && a2 == 2);
        if (!crpiVar.m()) {
            return null;
        }
        ddww ddwwVar = crpiVar.d.a;
        boolean z2 = ddwwVar.d;
        boolean z3 = ddwwVar.c && ddwwVar.k > 0 && !crpiVar.f.g();
        if (!z2) {
            if (!z3) {
                return null;
            }
            z3 = true;
        }
        int andIncrement = crpiVar.r.getAndIncrement();
        int b = crpiVar.f.a() ? crpiVar.f.b() : -1;
        boolean z4 = z || crpiVar.p;
        crpo b2 = z2 ? crpiVar.h.b(z4) : crpiVar.h.clone();
        crpo b3 = z3 ? crpiVar.g.b(z4) : crpiVar.g.clone();
        crpiVar.s.add(new crph(andIncrement, b2, b3, (!z2 || z4) ? b2.clone() : b2.b(true), b, e + crpi.a));
        dixs bZ = dixt.n.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dixt dixtVar = (dixt) bZ.b;
        int i3 = dixtVar.a | 1;
        dixtVar.a = i3;
        dixtVar.d = z2;
        crpm crpmVar = crpiVar.d;
        boolean z5 = crpmVar.h;
        int i4 = i3 | 2;
        dixtVar.a = i4;
        dixtVar.e = z5;
        boolean z6 = crpmVar.i;
        dixtVar.a = i4 | 4;
        dixtVar.f = z6;
        dqvj c = dqvj.c(crpmVar.a.F);
        if (c == null) {
            c = dqvj.DRIVE;
        }
        boolean z7 = c == dqvj.TRANSIT;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dixt dixtVar2 = (dixt) bZ.b;
        dixtVar2.b = 12;
        dixtVar2.c = Boolean.valueOf(z7);
        int i5 = b2.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dixt dixtVar3 = (dixt) bZ.b;
        int i6 = dixtVar3.a | 128;
        dixtVar3.a = i6;
        dixtVar3.k = i5;
        int i7 = b2.b;
        int i8 = i6 | 256;
        dixtVar3.a = i8;
        dixtVar3.l = i7;
        long j2 = crpiVar.e.d;
        int i9 = i8 | 8;
        dixtVar3.a = i9;
        dixtVar3.g = j2;
        ddww ddwwVar2 = crpiVar.d.a;
        int i10 = ddwwVar2.n;
        int i11 = i9 | 16;
        dixtVar3.a = i11;
        dixtVar3.h = i10;
        int i12 = ddwwVar2.y;
        dixtVar3.a = i11 | 1024;
        dixtVar3.m = i12;
        dixt bK = bZ.bK();
        dixo bZ2 = dixr.g.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dixr dixrVar = (dixr) bZ2.b;
        int i13 = dixrVar.a | 1;
        dixrVar.a = i13;
        dixrVar.b = z3;
        int i14 = b3.a;
        int i15 = i13 | 4;
        dixrVar.a = i15;
        dixrVar.d = i14;
        int i16 = b3.b;
        dixrVar.a = i15 | 8;
        dixrVar.e = i16;
        dixp bZ3 = dixq.e.bZ();
        int i17 = crpiVar.d.a.k;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dixq dixqVar = (dixq) bZ3.b;
        int i18 = dixqVar.a | 1;
        dixqVar.a = i18;
        dixqVar.b = i17;
        ddww ddwwVar3 = crpiVar.d.a;
        int i19 = ddwwVar3.l;
        int i20 = i18 | 2;
        dixqVar.a = i20;
        dixqVar.c = i19;
        int i21 = ddwwVar3.m;
        dixqVar.a = i20 | 4;
        dixqVar.d = i21;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dixr dixrVar2 = (dixr) bZ2.b;
        dixq bK2 = bZ3.bK();
        bK2.getClass();
        dixrVar2.f = bK2;
        dixrVar2.a |= 16;
        dixr bK3 = bZ2.bK();
        dwap bZ4 = dwaq.i.bZ();
        long a3 = crpiVar.d.a();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dwaq dwaqVar = (dwaq) bZ4.b;
        int i22 = dwaqVar.a | 2;
        dwaqVar.a = i22;
        dwaqVar.c = a3;
        long j3 = crpiVar.d.c;
        int i23 = i22 | 4;
        dwaqVar.a = i23;
        dwaqVar.d = j3;
        dwaqVar.a = i23 | 128;
        dwaqVar.h = andIncrement;
        dixn bZ5 = dixu.d.bZ();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dixu dixuVar = (dixu) bZ5.b;
        bK.getClass();
        dixuVar.b = bK;
        int i24 = dixuVar.a | 1;
        dixuVar.a = i24;
        bK3.getClass();
        dixuVar.c = bK3;
        dixuVar.a = i24 | 2;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dwaq dwaqVar2 = (dwaq) bZ4.b;
        dixu bK4 = bZ5.bK();
        bK4.getClass();
        dwaqVar2.b = bK4;
        dwaqVar2.a |= 1;
        crpb crpbVar = crpiVar.f;
        int max = !crpbVar.a() ? crpbVar.a.e : crpbVar.g ? 0 : z ? crpbVar.a.e : Math.max(crpbVar.a.e - crpbVar.f, 0);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dwaq dwaqVar3 = (dwaq) bZ4.b;
        int i25 = dwaqVar3.a | 32;
        dwaqVar3.a = i25;
        dwaqVar3.f = max;
        crpm crpmVar2 = crpiVar.d;
        int i26 = crpmVar2.f;
        int i27 = i25 | 64;
        dwaqVar3.a = i27;
        dwaqVar3.g = i26;
        String str = crpmVar2.l ? crpmVar2.d : null;
        if (str != null) {
            str.getClass();
            dwaqVar3.a = i27 | 8;
            dwaqVar3.e = str;
        }
        return bZ4.bK();
    }

    public final void g() {
        bvqd.a(this.c.d(new Runnable(this) { // from class: crnq
            private final crnz a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                crnz crnzVar = this.a;
                bvrj.NAVIGATION_INTERNAL.c();
                crpi crpiVar = crnzVar.d;
                if (crpiVar == null || crnzVar.i != 1) {
                    return;
                }
                Account m = crnzVar.b.m();
                int i = crnzVar.f;
                if (m == null) {
                    crnzVar.c(true, i);
                    return;
                }
                crps crpsVar = crpiVar.e.c;
                Account account = crpsVar == null ? null : crpsVar.a;
                if (account == null || !account.equals(m)) {
                    crnzVar.c(true, i);
                } else {
                    deha.q(deha.i(crnzVar.d(null, crpiVar.d.a), crnzVar.e(m, null)), new crnx(crnzVar, i), crnzVar.c);
                }
            }
        }, 1L, TimeUnit.MINUTES), this.c);
    }

    public final void h(final int i, @dzsi final btlu btluVar, final crny crnyVar, final crpm crpmVar) {
        if (bvrj.NAVIGATION_INTERNAL.b()) {
            i(i, btluVar, crnyVar, crpmVar);
        } else {
            this.c.execute(new Runnable(this, crnyVar, i, btluVar, crpmVar) { // from class: crnp
                private final crnz a;
                private final crny b;
                private final btlu c;
                private final crpm d;
                private final int e;

                {
                    this.a = this;
                    this.b = crnyVar;
                    this.e = i;
                    this.c = btluVar;
                    this.d = crpmVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    crnz crnzVar = this.a;
                    crny crnyVar2 = this.b;
                    int i2 = this.e;
                    btlu btluVar2 = this.c;
                    crpm crpmVar2 = this.d;
                    bvrj.NAVIGATION_INTERNAL.c();
                    if (crnyVar2.a != crnzVar.f) {
                        crnzVar.hashCode();
                    } else {
                        crnzVar.i(i2, btluVar2, crnyVar2, crpmVar2);
                    }
                }
            });
        }
    }

    public final void i(int i, @dzsi btlu btluVar, crny crnyVar, crpm crpmVar) {
        bvrj.NAVIGATION_INTERNAL.c();
        this.i = i;
        int a2 = ddwv.a(crnyVar.i().E);
        if (a2 == 0) {
            a2 = 1;
        }
        if (i != 1) {
            n(crnyVar.a);
            dqvj c = dqvj.c(crnyVar.i().F);
            if (c == null) {
                c = dqvj.DRIVE;
            }
            if (c == dqvj.TRANSIT) {
                return;
            }
        }
        ckco ckcoVar = (ckco) this.u.a(ckhj.a);
        dqvj c2 = dqvj.c(crnyVar.i().F);
        if (c2 == null) {
            c2 = dqvj.DRIVE;
        }
        ckcoVar.a(c2.k);
        ((ckcn) this.u.a(i == 1 ? ckhj.c : ckhj.b)).a();
        ((ckcn) this.u.a(a2 == 2 ? ckhj.e : ckhj.f)).a();
        hashCode();
        dbsk.l(this.d == null);
        crnr crnrVar = this.F;
        Context context = this.l;
        btpc btpcVar = this.m;
        crem cremVar = this.n;
        bvjj bvjjVar = this.o;
        buwv buwvVar = this.v;
        btrm btrmVar = this.q;
        cqat cqatVar = this.p;
        dehq dehqVar = this.t;
        ckcw ckcwVar = this.u;
        GoogleApiClient googleApiClient = crnrVar == null ? null : crnrVar.a;
        corc corcVar = this.E;
        crnyVar.i();
        crpi crpiVar = new crpi(context, btpcVar, cremVar, bvjjVar, buwvVar, btrmVar, cqatVar, dehqVar, ckcwVar, btluVar, googleApiClient, corcVar, i == 1, this.w, this.x, this.z, this.r.getNavigationParameters(), crpmVar, this.A);
        this.d = crpiVar;
        int a3 = ddwv.a(crpiVar.d.a.E);
        if (a3 != 0 && a3 == 2) {
            croz crozVar = croz.a;
            crpiVar.d.a();
            crozVar.b();
        }
        btrm btrmVar2 = crpiVar.b;
        dceq a4 = dcet.a();
        a4.b(crhc.class, new crpj(0, crhc.class, crpiVar, bvrj.NAVIGATION_INTERNAL));
        a4.b(crir.class, new crpj(1, crir.class, crpiVar, bvrj.NAVIGATION_INTERNAL));
        a4.b(crmh.class, new crpj(2, crmh.class, crpiVar, bvrj.NAVIGATION_INTERNAL));
        a4.b(amqo.class, new crpj(3, amqo.class, crpiVar, bvrj.NAVIGATION_INTERNAL));
        a4.b(crmn.class, new crpj(4, crmn.class, crpiVar, bvrj.NAVIGATION_INTERNAL));
        a4.b(crmq.class, new crpj(5, crmq.class, crpiVar, bvrj.NAVIGATION_INTERNAL));
        a4.b(crmj.class, new crpj(6, crmj.class, crpiVar, bvrj.NAVIGATION_INTERNAL));
        a4.b(crlv.class, new crpj(7, crlv.class, crpiVar, bvrj.NAVIGATION_INTERNAL));
        a4.b(crlu.class, new crpj(8, crlu.class, crpiVar, bvrj.NAVIGATION_INTERNAL));
        a4.b(crlt.class, new crpj(9, crlt.class, crpiVar, bvrj.NAVIGATION_INTERNAL));
        a4.b(cror.class, new crpj(10, cror.class, crpiVar, bvrj.NAVIGATION_INTERNAL));
        a4.b(crmi.class, new crpj(11, crmi.class, crpiVar, bvrj.NAVIGATION_INTERNAL));
        a4.b(crex.class, new crpj(12, crex.class, crpiVar, bvrj.NAVIGATION_INTERNAL));
        a4.b(crev.class, new crpj(13, crev.class, crpiVar, bvrj.NAVIGATION_INTERNAL));
        a4.b(crmk.class, new crpj(14, crmk.class, crpiVar, bvrj.NAVIGATION_INTERNAL));
        a4.b(crmr.class, new crpj(15, crmr.class, crpiVar, bvrj.NAVIGATION_INTERNAL));
        a4.b(HardBrakeEvent.class, new crpj(16, HardBrakeEvent.class, crpiVar, bvrj.NAVIGATION_INTERNAL));
        a4.b(ProjectedSensorStateEvent.class, new crpj(17, ProjectedSensorStateEvent.class, crpiVar, bvrj.NAVIGATION_INTERNAL));
        a4.b(aswf.class, new crpj(18, aswf.class, crpiVar, bvrj.NAVIGATION_INTERNAL));
        a4.b(ahju.class, new crpj(19, ahju.class, crpiVar, bvrj.NAVIGATION_INTERNAL));
        a4.b(ascc.class, new crpj(20, ascc.class, crpiVar, bvrj.NAVIGATION_INTERNAL));
        a4.b(cria.class, new crpj(21, cria.class, crpiVar, bvrj.NAVIGATION_INTERNAL));
        a4.b(ahjy.class, new crpj(22, ahjy.class, crpiVar, bvrj.NAVIGATION_INTERNAL));
        a4.b(crhd.class, new crpj(23, crhd.class, crpiVar, bvrj.NAVIGATION_INTERNAL));
        a4.b(crih.class, new crpj(24, crih.class, crpiVar, bvrj.NAVIGATION_INTERNAL));
        a4.b(ahkc.class, new crpj(25, ahkc.class, crpiVar, bvrj.NAVIGATION_INTERNAL));
        a4.b(crot.class, new crpj(26, crot.class, crpiVar, bvrj.NAVIGATION_INTERNAL));
        btrmVar2.g(crpiVar, a4.a());
        g();
    }

    public final crpm j(int i, crny crnyVar) {
        ddww i2 = crnyVar.i();
        String c = bvnz.c(bvoc.a(this.l));
        String b = bvnz.b();
        String str = this.s;
        String str2 = crnyVar.c;
        List<Integer> list = crnyVar.b;
        boolean z = i == 1;
        String str3 = crnyVar.d;
        long b2 = this.p.b();
        long e = this.p.e();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        long nextLong2 = secureRandom.nextLong();
        int i3 = i2.j;
        int i4 = i2.i;
        int i5 = (i3 - i4) + 1;
        return new crpm(i2, nextLong, nextLong2, str3, secureRandom.nextInt(i5) + i4, i2.i + secureRandom.nextInt(i5), c, b, str, str2, list, z, false, b2, e);
    }

    public final void k(@dzsi crnr crnrVar) {
        if (crnrVar == null) {
            return;
        }
        hashCode();
        ckcm ckcmVar = (ckcm) this.u.a(ckhj.p);
        try {
            crnrVar.a.disconnect();
            ckcmVar.a(true);
        } catch (IllegalStateException e) {
            if (String.valueOf(e.getMessage()).length() == 0) {
                new String("NAVLOG: GmsCore disconnect threw: ");
            }
            bvoo.j(e);
            ckcmVar.a(false);
        }
    }

    public final void l(dqvj dqvjVar, arym arymVar, String str, @dzsi String str2) {
        int i;
        int a2;
        int a3;
        int i2;
        boolean z;
        int i3 = this.f + 1;
        this.f = i3;
        hashCode();
        dbsk.l(this.F == null);
        dbsk.l(this.d == null);
        dbsk.l(true);
        btwd navigationParameters = this.r.getNavigationParameters();
        dwob transitTrackingParameters = this.r.getTransitTrackingParameters();
        ArrayList a4 = dchl.a();
        a4.addAll(this.r.getLoggingParameters().j);
        a4.addAll(this.r.getTriggerExperimentIdParameters().a);
        a4.addAll(this.y.b());
        btlu j2 = this.b.j();
        String m = m(str);
        ddws bZ = ddww.U.bZ();
        int j3 = navigationParameters.j();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddww ddwwVar = (ddww) bZ.b;
        ddwwVar.a |= 4194304;
        ddwwVar.y = j3;
        int i4 = navigationParameters.i();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddww ddwwVar2 = (ddww) bZ.b;
        ddwwVar2.a |= 2097152;
        ddwwVar2.x = i4;
        bzqb bzqbVar = bzqb.WEB_AND_APP_ACTIVITY;
        arym arymVar2 = arym.FREE_NAV;
        int ordinal = arymVar.ordinal();
        if (ordinal == 0) {
            i = 3;
        } else if (ordinal != 1) {
            bvoo.h("NAVLOG: Unrecognized navigation mode: %s", arymVar);
            i = 1;
        } else {
            i = 2;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddww ddwwVar3 = (ddww) bZ.b;
        ddwwVar3.E = i - 1;
        int i5 = ddwwVar3.a | 268435456;
        ddwwVar3.a = i5;
        ddwwVar3.F = dqvjVar.k;
        int i6 = i5 | 536870912;
        ddwwVar3.a = i6;
        dvek dvekVar = navigationParameters.a;
        boolean z2 = dvekVar.aa;
        int i7 = i6 | 1;
        ddwwVar3.a = i7;
        ddwwVar3.c = z2;
        boolean z3 = dvekVar.ab;
        ddwwVar3.a = i7 | 2;
        ddwwVar3.d = z3;
        int max = Math.max(1, dvekVar.ac);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddww ddwwVar4 = (ddww) bZ.b;
        ddwwVar4.a |= 4;
        ddwwVar4.e = max;
        int max2 = Math.max(0, navigationParameters.a.ad);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddww ddwwVar5 = (ddww) bZ.b;
        ddwwVar5.a |= 8;
        ddwwVar5.f = max2;
        int max3 = Math.max(1, navigationParameters.a.ae);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddww ddwwVar6 = (ddww) bZ.b;
        ddwwVar6.a |= 16;
        ddwwVar6.g = max3;
        int max4 = Math.max(1, navigationParameters.a.af);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddww ddwwVar7 = (ddww) bZ.b;
        ddwwVar7.a |= 32;
        ddwwVar7.h = max4;
        int F = navigationParameters.F();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddww ddwwVar8 = (ddww) bZ.b;
        ddwwVar8.a |= 64;
        ddwwVar8.i = F;
        int max5 = Math.max(navigationParameters.F() + 100, navigationParameters.a.ah);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddww ddwwVar9 = (ddww) bZ.b;
        ddwwVar9.a |= 128;
        ddwwVar9.j = max5;
        int max6 = Math.max(0, navigationParameters.a.ai);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddww ddwwVar10 = (ddww) bZ.b;
        ddwwVar10.a |= 256;
        ddwwVar10.k = max6;
        int max7 = Math.max(1, navigationParameters.a.aj);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddww ddwwVar11 = (ddww) bZ.b;
        ddwwVar11.a |= 512;
        ddwwVar11.l = max7;
        int max8 = Math.max(1, navigationParameters.a.ak);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddww ddwwVar12 = (ddww) bZ.b;
        ddwwVar12.a |= 1024;
        ddwwVar12.m = max8;
        int max9 = Math.max(0, navigationParameters.a.al);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddww ddwwVar13 = (ddww) bZ.b;
        ddwwVar13.a |= 2048;
        ddwwVar13.n = max9;
        int max10 = Math.max(0, navigationParameters.a.am);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddww ddwwVar14 = (ddww) bZ.b;
        int i8 = ddwwVar14.a | 4096;
        ddwwVar14.a = i8;
        ddwwVar14.o = max10;
        dvek dvekVar2 = navigationParameters.a;
        boolean z4 = dvekVar2.an;
        int i9 = i8 | 8192;
        ddwwVar14.a = i9;
        ddwwVar14.p = z4;
        boolean z5 = dvekVar2.ao;
        int i10 = i9 | 16384;
        ddwwVar14.a = i10;
        ddwwVar14.q = z5;
        boolean z6 = dvekVar2.ap;
        ddwwVar14.a = i10 | 32768;
        ddwwVar14.r = z6;
        int min = Math.min(100, Math.max(0, dvekVar2.aq));
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddww ddwwVar15 = (ddww) bZ.b;
        ddwwVar15.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        ddwwVar15.s = min;
        int max11 = Math.max(0, navigationParameters.a.ar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddww ddwwVar16 = (ddww) bZ.b;
        int i11 = ddwwVar16.a | 131072;
        ddwwVar16.a = i11;
        ddwwVar16.t = max11;
        dvek dvekVar3 = navigationParameters.a;
        boolean z7 = dvekVar3.as;
        ddwwVar16.a = i11 | 262144;
        ddwwVar16.u = z7;
        int max12 = Math.max(0, dvekVar3.at);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddww ddwwVar17 = (ddww) bZ.b;
        int i12 = ddwwVar17.a | ImageMetadata.LENS_APERTURE;
        ddwwVar17.a = i12;
        ddwwVar17.v = max12;
        dvek dvekVar4 = navigationParameters.a;
        boolean z8 = dvekVar4.au;
        ddwwVar17.a = i12 | ImageMetadata.SHADING_MODE;
        ddwwVar17.w = z8;
        int max13 = Math.max(1, dvekVar4.av);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddww ddwwVar18 = (ddww) bZ.b;
        ddwwVar18.a |= 1073741824;
        ddwwVar18.G = max13;
        int max14 = Math.max(1, navigationParameters.a.aw);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddww ddwwVar19 = (ddww) bZ.b;
        ddwwVar19.a |= Integer.MIN_VALUE;
        ddwwVar19.H = max14;
        int max15 = Math.max(0, navigationParameters.a.ax);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddww ddwwVar20 = (ddww) bZ.b;
        ddwwVar20.b |= 1;
        ddwwVar20.I = max15;
        int max16 = Math.max(0, navigationParameters.a.ay);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddww ddwwVar21 = (ddww) bZ.b;
        ddwwVar21.b |= 4;
        ddwwVar21.J = max16;
        int max17 = Math.max(0, navigationParameters.a.az);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddww ddwwVar22 = (ddww) bZ.b;
        int i13 = ddwwVar22.b | 8;
        ddwwVar22.b = i13;
        ddwwVar22.K = max17;
        dvek dvekVar5 = navigationParameters.a;
        boolean z9 = dvekVar5.aA;
        int i14 = i13 | 16;
        ddwwVar22.b = i14;
        ddwwVar22.L = z9;
        boolean z10 = dvekVar5.aB;
        ddwwVar22.b = i14 | 32;
        ddwwVar22.M = z10;
        boolean U = navigationParameters.U();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddww ddwwVar23 = (ddww) bZ.b;
        ddwwVar23.b |= 128;
        ddwwVar23.O = U;
        float f = navigationParameters.V().a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddww ddwwVar24 = (ddww) bZ.b;
        ddwwVar24.b |= 256;
        ddwwVar24.P = f;
        float f2 = navigationParameters.V().b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddww ddwwVar25 = (ddww) bZ.b;
        ddwwVar25.b |= 512;
        ddwwVar25.Q = f2;
        float f3 = navigationParameters.V().e;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddww ddwwVar26 = (ddww) bZ.b;
        ddwwVar26.b |= 1024;
        ddwwVar26.R = f3;
        float f4 = navigationParameters.V().f;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddww ddwwVar27 = (ddww) bZ.b;
        ddwwVar27.b |= 2048;
        ddwwVar27.S = f4;
        if (dqvjVar == dqvj.TRANSIT) {
            boolean z11 = ((ddww) bZ.b).d && transitTrackingParameters.w;
            if (bZ.c) {
                bZ.bF();
                z = false;
                bZ.c = false;
            } else {
                z = false;
            }
            ddww ddwwVar28 = (ddww) bZ.b;
            int i15 = ddwwVar28.a | 2;
            ddwwVar28.a = i15;
            ddwwVar28.d = z11;
            ddwwVar28.a = i15 | 1;
            ddwwVar28.c = z;
        }
        if (navigationParameters.G()) {
            dbsg<ddlj> a5 = this.z.a();
            if (this.z.a().a()) {
                if (navigationParameters.H()) {
                    ddlj a6 = crov.a(a5.b());
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ddww ddwwVar29 = (ddww) bZ.b;
                    a6.getClass();
                    ddwwVar29.N = a6;
                    ddwwVar29.b |= 64;
                } else {
                    ddky bZ2 = ddlj.i.bZ();
                    ddlg b = ddlg.b(a5.b().b);
                    if (b == null) {
                        b = ddlg.UNKNOWN;
                    }
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    ddlj ddljVar = (ddlj) bZ2.b;
                    ddljVar.b = b.f;
                    ddljVar.a |= 1;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ddww ddwwVar30 = (ddww) bZ.b;
                    ddlj bK = bZ2.bK();
                    bK.getClass();
                    ddwwVar30.N = bK;
                    ddwwVar30.b |= 64;
                }
            }
        }
        Resources resources = this.l.getResources();
        int identifier = resources.getIdentifier("config_navBarInteractionMode", "integer", "android");
        if (identifier != 0) {
            int integer = resources.getInteger(identifier);
            if (integer == 0) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddww ddwwVar31 = (ddww) bZ.b;
                ddwwVar31.T = 1;
                ddwwVar31.b |= 4096;
            } else if (integer == 1) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddww ddwwVar32 = (ddww) bZ.b;
                ddwwVar32.T = 2;
                ddwwVar32.b |= 4096;
            } else if (integer == 2) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddww ddwwVar33 = (ddww) bZ.b;
                ddwwVar33.T = 3;
                ddwwVar33.b |= 4096;
            } else {
                if (bZ.c) {
                    bZ.bF();
                    i2 = 0;
                    bZ.c = false;
                } else {
                    i2 = 0;
                }
                ddww ddwwVar34 = (ddww) bZ.b;
                ddwwVar34.T = i2;
                ddwwVar34.b |= 4096;
            }
        }
        crny crnyVar = new crny(i3, bZ, a4, m, str2);
        if ((crnyVar.f() || crnyVar.g()) && (a2 = ddwv.a(crnyVar.i().E)) != 0 && a2 == 2) {
            if (btsj.b(this.l) && (a3 = ddwv.a(crnyVar.i().E)) != 0 && a3 == 2) {
                long millis = TimeUnit.SECONDS.toMillis(crnyVar.i().J);
                if (millis > 0) {
                    if (this.B == null) {
                        Context context = this.l;
                        this.B = PendingIntent.getBroadcast(context, 0, new Intent(context, ActivityRecognitionForLoggingBroadcastReceiver.class), 134217728);
                    }
                    dbsk.l(this.C == null);
                    cojh a7 = coje.a(this.l);
                    this.C = a7;
                    dbsk.s(a7);
                    cojh cojhVar = this.C;
                    PendingIntent pendingIntent = this.B;
                    dbsk.s(pendingIntent);
                    cpcq<Void> a8 = cojhVar.a(millis, pendingIntent);
                    a8.s(crnl.a);
                    a8.r(crnm.a);
                }
            }
            if (crnyVar.h() && btsj.b(this.l)) {
                crnyVar.a(j2 != null && j2.u());
                if (j2 != null && j2.u()) {
                    dbsk.l(this.F == null);
                    deig d = deig.d();
                    crns crnsVar = this.D;
                    crnsVar.a(coqk.a);
                    crnsVar.a(cpdo.c);
                    Account s = j2.s();
                    GoogleApiClient.Builder builder = crnsVar.a;
                    builder.setAccount(s);
                    crnsVar.a = builder;
                    crnu crnuVar = new crnu(this, d);
                    GoogleApiClient.Builder builder2 = crnsVar.a;
                    builder2.addConnectionCallbacks(crnuVar);
                    crnsVar.a = builder2;
                    crnt crntVar = new crnt(this, d);
                    GoogleApiClient.Builder builder3 = crnsVar.a;
                    builder3.addOnConnectionFailedListener(crntVar);
                    crnsVar.a = builder3;
                    this.F = new crnr(crnsVar.a.build());
                    deha.q(d, new crnv(this, crnyVar, j2), this.c);
                    hashCode();
                    ckcm ckcmVar = (ckcm) this.u.a(ckhj.o);
                    try {
                        crnr crnrVar = this.F;
                        dbsk.s(crnrVar);
                        crnrVar.a.connect();
                        ckcmVar.a(true);
                        return;
                    } catch (IllegalStateException e) {
                        if (String.valueOf(e.getMessage()).length() == 0) {
                            new String("NAVLOG: GmsCore connect threw: ");
                        }
                        bvoo.j(e);
                        ckcmVar.a(false);
                        this.F = null;
                    }
                }
            }
            crpm j4 = j(2, crnyVar);
            this.e = j4;
            h(2, j2, crnyVar, j4);
        }
    }
}

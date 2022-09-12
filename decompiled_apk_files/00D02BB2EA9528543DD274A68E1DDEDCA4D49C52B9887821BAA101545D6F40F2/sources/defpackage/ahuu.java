package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ahuu  reason: default package */
/* loaded from: classes2.dex */
public final class ahuu extends itb implements ahwf, ahvp {
    private final aidm A;
    private final efc B;
    private final ahvo C;
    private final ajsu D;
    private final ajtc E;
    private final ajtg F;
    private final ajri G;
    private final ajku H;
    private final dcdc<ailb<?>> I;
    private final bwqv J;
    private final Executor K;
    public final gga b;
    public final cqkj c;
    public final cjqy d;
    public final akfc e;
    public final cqat f;
    public final btvo g;
    public final ajsc h;
    public final aiki i;
    public final aija j;
    public final ajsj k;
    public final aijz o;
    public final ahwc p;
    public final bvrb q;
    public final aimy r;
    public final ajup s;
    public final aihe<aimj, aiig> t;
    @dzsi
    private final ahwo w;
    private final btrm x;
    private final aikh y;
    private final dxio<akfa> z;
    public boolean a = false;
    private final ahup M = new ahup(this);
    private final Object v = new Object();
    private final crzp<btlu> L = new ahuq(this);
    private final ahut u = new ahut(this);

    public ahuu(gga ggaVar, cqkj cqkjVar, cjqy cjqyVar, dxio<akfa> dxioVar, ajsj ajsjVar, akfc akfcVar, cqat cqatVar, btvo btvoVar, @dzsi ahwo ahwoVar, btrm btrmVar, ajsc ajscVar, aijz aijzVar, aija aijaVar, aiki aikiVar, aikh aikhVar, aidm aidmVar, ahwc ahwcVar, bvrb bvrbVar, efc efcVar, aimy aimyVar, ahvo ahvoVar, ajsu ajsuVar, ajtc ajtcVar, ajtg ajtgVar, ajri ajriVar, ajku ajkuVar, Executor executor, dcdc<ailb<?>> dcdcVar, bwqv bwqvVar, ajup ajupVar, aihe<aimj, aiig> aiheVar) {
        this.b = ggaVar;
        this.c = cqkjVar;
        this.d = cjqyVar;
        this.z = dxioVar;
        this.k = ajsjVar;
        this.e = akfcVar;
        this.f = cqatVar;
        this.g = btvoVar;
        this.w = ahwoVar;
        this.x = btrmVar;
        this.h = ajscVar;
        this.o = aijzVar;
        this.j = aijaVar;
        this.i = aikiVar;
        this.y = aikhVar;
        this.A = aidmVar;
        this.p = ahwcVar;
        this.q = bvrbVar;
        this.B = efcVar;
        this.r = aimyVar;
        this.C = ahvoVar;
        this.D = ajsuVar;
        this.E = ajtcVar;
        this.F = ajtgVar;
        this.G = ajriVar;
        this.H = ajkuVar;
        this.K = executor;
        this.I = dcdcVar;
        this.J = bwqvVar;
        this.s = ajupVar;
        this.t = aiheVar;
    }

    @dzsi
    private final ajuj L() {
        ajuj ajujVar = (ajuj) this.b.g().H("LOCATION_SHARING_NAVIGATION_FRAGMENT_TAG");
        if (ajujVar != null) {
            ajujVar.a(this);
        }
        return ajujVar;
    }

    private final void M(final int i) {
        this.q.b(new Runnable(this, i) { // from class: ahuf
            private final ahuu a;
            private final int b;

            {
                this.a = this;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ahuu ahuuVar = this.a;
                int i2 = this.b;
                btlu b = ahuuVar.k.b();
                if (b == null) {
                    return;
                }
                ajup ajupVar = ahuuVar.s;
                gga ggaVar = ahuuVar.b;
                ajur ajurVar = (ajur) ajupVar;
                cxrj c = ajurVar.c();
                boolean z = i2 == 26;
                String t = b.t();
                dbsk.s(t);
                PeopleKitConfig a = ajurVar.a(ggaVar, z, t);
                ajurVar.b();
                c.b(ggaVar, a, ajurVar.d);
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }

    @Override // defpackage.ahwf
    public final void B(final ahwe ahweVar) {
        I(new Runnable(this, ahweVar) { // from class: ahuc
            private final ahuu a;
            private final ahwe b;

            {
                this.a = this;
                this.b = ahweVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aimy aimyVar = this.a.r;
                if (!aimyVar.c.e(aiws.class)) {
                    gn g = aimyVar.a.g();
                    aiws aU = aiws.aU(aimyVar.b.d());
                    String str = gfu.ACTIVITY_FRAGMENT.c;
                    gz b = g.b();
                    b.y(aU, str);
                    b.z(gfu.c(aU));
                    fd H = g.H(str);
                    if (H != null) {
                        b.u(H);
                    }
                    b.f();
                }
            }
        });
    }

    @Override // defpackage.ahwf
    public final void C(final cray crayVar, final ahvk ahvkVar) {
        I(new Runnable(this, crayVar, ahvkVar) { // from class: ahud
            private final ahuu a;
            private final cray b;
            private final ahvk c;

            {
                this.a = this;
                this.b = crayVar;
                this.c = ahvkVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ahuu ahuuVar = this.a;
                cray crayVar2 = this.b;
                ahvk ahvkVar2 = this.c;
                dkof dkofVar = ahuuVar.g.getLocationSharingParameters().q;
                if (dkofVar == null) {
                    dkofVar = dkof.s;
                }
                if (dkofVar.d) {
                    crayVar2.a();
                } else {
                    crayVar2.b();
                }
                ahuuVar.J(ahvkVar2);
            }
        });
    }

    @Override // defpackage.ahwf
    @dzsi
    public final ahvq D() {
        ajuj ajujVar;
        if (!e() || !w() || this.k.f()) {
            return null;
        }
        synchronized (this.v) {
            gn g = this.b.g();
            ajujVar = (ajuj) g.H("LOCATION_SHARING_NAVIGATION_FRAGMENT_TAG");
            if (ajujVar == null) {
                gz b = g.b();
                btlu b2 = this.k.b();
                dbsk.l(b2 != null);
                dbsk.s(b2);
                String str = b2.d;
                ajuj ajujVar2 = new ajuj();
                Bundle bundle = new Bundle();
                bundle.putString("account_id", str);
                ajujVar2.B(bundle);
                b.y(ajujVar2, "LOCATION_SHARING_NAVIGATION_FRAGMENT_TAG");
                b.g();
                ajujVar2.a(this);
                ajujVar = ajujVar2;
            }
        }
        return ajujVar;
    }

    @Override // defpackage.ahwf
    public final void E() {
        M(26);
    }

    @Override // defpackage.ahwf
    public final void F() {
        M(19);
    }

    @Override // defpackage.ahvp
    public final void G() {
        synchronized (this.v) {
            ajuj L = L();
            dbsk.l(L != null);
            if (L.a != 2) {
                return;
            }
            gn g = this.b.g();
            if (g.J()) {
                return;
            }
            gz b = g.b();
            b.u(L);
            b.f();
        }
    }

    @Override // defpackage.ahwf
    public final void H(boolean z) {
        if (!e() || this.k.f()) {
            return;
        }
        this.A.b(z);
    }

    public final void I(Runnable runnable) {
        if (!e() || !w()) {
            return;
        }
        if (this.k.f()) {
            gga ggaVar = this.b;
            bwqv bwqvVar = this.J;
            afdr i = afdt.i();
            i.g(R.string.LOCATION_SHARING_FEATURE_TITLE_VARIANT_LOCATION_SHARING);
            i.b(R.string.LOCATION_SHARING_NOT_AVAILABLE_IN_INCOGNITO);
            i.c(ahub.a);
            ggaVar.D(afaw.aR(bwqvVar, i.a()));
            return;
        }
        runnable.run();
    }

    public final void J(final ahvk ahvkVar) {
        I(new Runnable(this, ahvkVar) { // from class: ahue
            private final ahuu a;
            private final ahvk b;

            {
                this.a = this;
                this.b = ahvkVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ahuu ahuuVar = this.a;
                ahvk ahvkVar2 = this.b;
                aimy aimyVar = ahuuVar.r;
                btlu b = ahuuVar.k.b();
                ajei ajeiVar = aimyVar.d;
                if (!ajsj.k(b)) {
                    ajeiVar.b.j(b, ajeiVar.a);
                    return;
                }
                dbsk.s(b);
                dbsk.l(ahvkVar2 != ahvk.STANDARD_NAVIGATION);
                ajcr a = ajcn.a(b, ajco.TRANSIT_SHARE, R.string.SMS_SHARE_TEXT_JOURNEY_SHARE);
                String str = gfu.ACTIVITY_FRAGMENT.c;
                gn g = ajeiVar.a.g();
                gz b2 = g.b();
                b2.y(a, str);
                b2.z(gfu.c(a));
                fd H = g.H(str);
                if (H != null) {
                    b2.u(H);
                }
                b2.f();
            }
        });
    }

    @Override // defpackage.ahwf
    public final void K(ahvk ahvkVar) {
        J(ahvkVar);
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        this.y.C(this.k.b(), 1);
        this.i.a();
        this.j.a();
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        this.y.C(this.k.b(), 2);
        this.H.h(1);
        if (e() && !this.k.f()) {
            f();
        }
        btrm btrmVar = this.x;
        ahut ahutVar = this.u;
        dceq a = dcet.a();
        a.b(btvr.class, new ahuv(btvr.class, ahutVar, bvrj.UI_THREAD));
        btrmVar.g(ahutVar, a.a());
        this.z.a().C().d(this.L, this.K);
    }

    @Override // defpackage.itb
    public final void Po() {
        this.y.C(this.k.b(), 3);
        this.H.h(2);
        if (this.a) {
            i();
        }
        this.x.a(this.u);
        this.z.a().C().c(this.L);
        super.Po();
    }

    public final boolean e() {
        return this.g.getEnableFeatureParameters().z;
    }

    public final void f() {
        bvrj.UI_THREAD.c();
        dbsk.l(!this.a);
        this.a = true;
        this.A.f(this.M);
        btlu b = this.k.b();
        if (b != null) {
            this.p.b(b);
            ajuj L = L();
            if (L != null) {
                L.f();
            }
        }
        aijz aijzVar = this.o;
        bvrj.UI_THREAD.c();
        int i = aijzVar.o + 1;
        aijzVar.o = i;
        if (i == 1) {
            aijzVar.c(aijzVar.q, false);
        }
        egu c = this.B.c();
        if (c != null) {
            H(!c.d().r);
        }
    }

    public final void i() {
        bvrj.UI_THREAD.c();
        dbsk.l(this.a);
        this.a = false;
        this.A.a();
        aijz aijzVar = this.o;
        bvrj.UI_THREAD.c();
        dbsk.l(aijzVar.o > 0);
        int i = aijzVar.o - 1;
        aijzVar.o = i;
        if (i == 0) {
            for (aijw aijwVar : aijzVar.m.values()) {
                aijwVar.g = 0;
            }
            bvpk bvpkVar = aijzVar.p;
            if (bvpkVar != null) {
                bvpkVar.b();
                aijzVar.p = null;
            }
        }
        this.j.b();
    }

    @Override // defpackage.ahwf
    public final void j(@dzsi final String str, final String str2, @dzsi final String str3, final boolean z) {
        I(new Runnable(this, str, str2, str3, z) { // from class: ahtz
            private final ahuu a;
            private final String b;
            private final String c;
            private final String d;
            private final boolean e;

            {
                this.a = this;
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ahuu ahuuVar = this.a;
                String str4 = this.b;
                String str5 = this.c;
                String str6 = this.d;
                boolean z2 = this.e;
                cjqy cjqyVar = ahuuVar.d;
                cjsx i = cjsy.i();
                i.b(ddda.cS);
                cjqyVar.k(i.a());
                new ahtt(ahuuVar.b, ahuuVar, ahuuVar.j, ahuuVar.k, ahuuVar.e, ahuuVar.i, ahuuVar.o, ahuuVar.q, ahuuVar.d, ahuuVar.t, ahuuVar.f).a(str4, str5, dbpy.a, false, str6, z2);
            }
        });
    }

    @Override // defpackage.ahwf
    public final void k(@dzsi final String str, final String str2, final dbsg<Profile> dbsgVar, final boolean z) {
        I(new Runnable(this, str, str2, dbsgVar, z) { // from class: ahug
            private final ahuu a;
            private final String b;
            private final String c;
            private final dbsg d;
            private final boolean e;

            {
                this.a = this;
                this.b = str;
                this.c = str2;
                this.d = dbsgVar;
                this.e = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ahuu ahuuVar = this.a;
                String str3 = this.b;
                String str4 = this.c;
                dbsg<Profile> dbsgVar2 = this.d;
                boolean z2 = this.e;
                ahuuVar.e.p(false);
                cjqy cjqyVar = ahuuVar.d;
                cjsx i = cjsy.i();
                i.b(ddda.da);
                cjqyVar.k(i.a());
                new ahtt(ahuuVar.b, ahuuVar, ahuuVar.j, ahuuVar.k, ahuuVar.e, ahuuVar.i, ahuuVar.o, ahuuVar.q, ahuuVar.d, ahuuVar.t, ahuuVar.f).a(str3, str4, dbsgVar2, true, null, z2);
            }
        });
    }

    @Override // defpackage.ahwf
    public final void l() {
        I(new Runnable(this) { // from class: ahuh
            private final ahuu a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ahuu ahuuVar = this.a;
                aimy aimyVar = ahuuVar.r;
                aimyVar.d.a(ahuuVar.k.b());
            }
        });
    }

    @Override // defpackage.ahwf
    public final void m(final dbsg<String> dbsgVar, final ahwe ahweVar) {
        I(new Runnable(this, dbsgVar, ahweVar) { // from class: ahui
            private final ahuu a;
            private final dbsg b;
            private final ahwe c;

            {
                this.a = this;
                this.b = dbsgVar;
                this.c = ahweVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ahuu ahuuVar = this.a;
                dbsg dbsgVar2 = this.b;
                ahwe ahweVar2 = this.c;
                if (dbsgVar2.a()) {
                    ahuuVar.p((String) dbsgVar2.b(), ahweVar2);
                } else {
                    ahuuVar.r(ahweVar2);
                }
            }
        });
    }

    @Override // defpackage.ahwf
    public final void n(final dbsg<String> dbsgVar, final PersonId personId, final ahwe ahweVar) {
        I(new Runnable(this, dbsgVar, ahweVar, personId) { // from class: ahuj
            private final ahuu a;
            private final dbsg b;
            private final ahwe c;
            private final PersonId d;

            {
                this.a = this;
                this.b = dbsgVar;
                this.c = ahweVar;
                this.d = personId;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final ahuu ahuuVar = this.a;
                dbsg dbsgVar2 = this.b;
                final ahwe ahweVar2 = this.c;
                final PersonId personId2 = this.d;
                if (dbsgVar2.a()) {
                    final String str = (String) dbsgVar2.b();
                    ahuuVar.I(new Runnable(ahuuVar, str, personId2, ahweVar2) { // from class: ahum
                        private final ahuu a;
                        private final String b;
                        private final PersonId c;
                        private final ahwe d;

                        {
                            this.a = ahuuVar;
                            this.b = str;
                            this.c = personId2;
                            this.d = ahweVar2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ahuu ahuuVar2 = this.a;
                            ahuuVar2.e.f(this.b, new ahus(ahuuVar2, this.c, this.d));
                        }
                    });
                    return;
                }
                ahuuVar.s(dbsg.i(personId2), ahweVar2, false);
            }
        });
    }

    @Override // defpackage.ahwf
    public final void o(String str) {
        p(str, ahwe.SIDE_MENU);
    }

    public final void p(final String str, final ahwe ahweVar) {
        I(new Runnable(this, str, ahweVar) { // from class: ahuk
            private final ahuu a;
            private final String b;
            private final ahwe c;

            {
                this.a = this;
                this.b = str;
                this.c = ahweVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ahuu ahuuVar = this.a;
                ahuuVar.e.f(this.b, new ahur(ahuuVar, this.c));
            }
        });
    }

    @Override // defpackage.ahwf
    public final void q() {
        r(ahwe.SIDE_MENU);
    }

    public final void r(final ahwe ahweVar) {
        I(new Runnable(this, ahweVar) { // from class: ahul
            private final ahuu a;
            private final ahwe b;

            {
                this.a = this;
                this.b = ahweVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.s(dbpy.a, this.b, false);
            }
        });
    }

    @Override // defpackage.ahwf
    public final void s(final dbsg<PersonId> dbsgVar, final ahwe ahweVar, final boolean z) {
        I(new Runnable(this, dbsgVar, z, ahweVar) { // from class: ahua
            private final ahuu a;
            private final dbsg b;
            private final boolean c;
            private final ahwe d;

            {
                this.a = this;
                this.b = dbsgVar;
                this.c = z;
                this.d = ahweVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ahuu ahuuVar = this.a;
                dbsg dbsgVar2 = this.b;
                boolean z2 = this.c;
                ahwe ahweVar2 = this.d;
                bvrj.UI_THREAD.c();
                if (dbsgVar2.a()) {
                    aimy aimyVar = ahuuVar.r;
                    PersonId personId = (PersonId) dbsgVar2.b();
                    if (!aimyVar.c.e(airr.class)) {
                        gn g = aimyVar.a.g();
                        dbsg<btlu> d = aimyVar.b.d();
                        int a = ahwe.a(ahweVar2);
                        airr airrVar = new airr();
                        Bundle bundle = new Bundle();
                        if (d.a()) {
                            bundle.putString("account_id", d.b().d);
                        }
                        bundle.putParcelable("person_id", personId);
                        bundle.putBoolean("open_requested_location_dialog", z2);
                        airrVar.B(bundle);
                        airrVar.aS = d;
                        airrVar.be = a;
                        String str = gfu.ACTIVITY_FRAGMENT.c;
                        gz b = g.b();
                        b.y(airrVar, str);
                        b.z(gfu.c(airrVar));
                        fd H = g.H(str);
                        if (H != null) {
                            b.u(H);
                        }
                        b.f();
                        return;
                    }
                    aimyVar.a.g().h(aimyVar.c.h(aimyVar.c.f(airr.class)), 0);
                    airr airrVar2 = (airr) aimyVar.c.d();
                    dbsk.s(airrVar2);
                    int a2 = ahwe.a(ahweVar2);
                    airrVar2.bo();
                    airrVar2.aT = personId;
                    airrVar2.aU = null;
                    airrVar2.aY.t();
                    airrVar2.bb = z2;
                    airrVar2.be = a2;
                    airrVar2.bn();
                    airrVar2.q();
                    if (airrVar2.ba) {
                        airrVar2.bq();
                    }
                    dro droVar = airrVar2.aW;
                    if (droVar == null) {
                        return;
                    }
                    droVar.d(personId);
                    return;
                }
                aimy aimyVar2 = ahuuVar.r;
                if (aimyVar2.c.e(airr.class)) {
                    aimyVar2.a.g().h(aimyVar2.c.h(aimyVar2.c.f(airr.class)), 1);
                }
                int f = aimyVar2.c.f(aiws.class);
                if (f < 0) {
                    aimyVar2.a.D(aiws.aU(aimyVar2.b.d()));
                    return;
                }
                aimyVar2.a.g().h(aimyVar2.c.h(f), 0);
                aiws aiwsVar = (aiws) aimyVar2.c.d();
                dbsk.s(aiwsVar);
                dbsg<btlu> d2 = aimyVar2.b.d();
                aiwsVar.q();
                aiwsVar.i(d2);
            }
        });
    }

    @Override // defpackage.ahwf
    public final void t(String str, boolean z, PendingIntent pendingIntent) {
        ahwv ahwvVar = null;
        for (fd fdVar : this.b.g().q()) {
            if (fdVar instanceof ahwv) {
                ahwvVar = (ahwv) fdVar;
            }
        }
        if (ahwvVar != null) {
            this.b.E(ahwvVar);
            ahwvVar.a = str;
            ahxx ahxxVar = ahwvVar.b;
            if (ahxxVar == null) {
                return;
            }
            ahxxVar.g(str, z, pendingIntent);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("obfuscatedGaiaIdKey", str);
        bundle.putBoolean("shouldEnableReportingKey", z);
        bundle.putParcelable("returnIntentKey", pendingIntent);
        ahwv ahwvVar2 = new ahwv();
        ahwvVar2.B(bundle);
        this.b.D(ahwvVar2);
    }

    @Override // defpackage.itb
    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(hexString).length());
        sb.append(str);
        sb.append("LocationSharingVeneer #");
        sb.append(hexString);
        printWriter.println(sb.toString());
        boolean z = this.a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 16);
        sb2.append(str);
        sb2.append("  turnedOn=");
        sb2.append(z);
        printWriter.println(sb2.toString());
        String concat = String.valueOf(str).concat("  ");
        this.A.e(concat, printWriter);
        ajsu ajsuVar = this.D;
        String hexString2 = Integer.toHexString(System.identityHashCode(ajsuVar));
        StringBuilder sb3 = new StringBuilder(String.valueOf(concat).length() + 24 + String.valueOf(hexString2).length());
        sb3.append(concat);
        sb3.append("CancelSharesController #");
        sb3.append(hexString2);
        printWriter.println(sb3.toString());
        printWriter.println(String.valueOf(concat).concat("  recent results:"));
        Iterator<ajst> it = ajsuVar.g.iterator();
        while (it.hasNext()) {
            ajst next = it.next();
            long b = next.b();
            StringBuilder sb4 = new StringBuilder(String.valueOf(concat).length() + 34);
            sb4.append(concat);
            sb4.append("    timestamp=");
            sb4.append(b);
            printWriter.print(sb4.toString());
            String valueOf = String.valueOf(next.a().d);
            printWriter.print(valueOf.length() != 0 ? " account=".concat(valueOf) : new String(" account="));
            String valueOf2 = String.valueOf(Integer.toHexString(System.identityHashCode(next.c())));
            printWriter.print(valueOf2.length() != 0 ? " personId=#".concat(valueOf2) : new String(" personId=#"));
            int d = next.d();
            StringBuilder sb5 = new StringBuilder(19);
            sb5.append(" result=");
            sb5.append(d);
            printWriter.println(sb5.toString());
        }
        this.i.l(concat, printWriter);
        ajtc ajtcVar = this.E;
        String hexString3 = Integer.toHexString(System.identityHashCode(ajtcVar));
        StringBuilder sb6 = new StringBuilder(String.valueOf(concat).length() + 24 + String.valueOf(hexString3).length());
        sb6.append(concat);
        sb6.append("CreateSharesController #");
        sb6.append(hexString3);
        printWriter.println(sb6.toString());
        printWriter.println(String.valueOf(concat).concat("  recent results:"));
        Iterator<ajtb> it2 = ajtcVar.k.iterator();
        while (it2.hasNext()) {
            ajtb next2 = it2.next();
            long b2 = next2.b();
            StringBuilder sb7 = new StringBuilder(String.valueOf(concat).length() + 34);
            sb7.append(concat);
            sb7.append("    timestamp=");
            sb7.append(b2);
            printWriter.print(sb7.toString());
            String valueOf3 = String.valueOf(next2.a().d);
            printWriter.print(valueOf3.length() != 0 ? " account=".concat(valueOf3) : new String(" account="));
            int c = next2.c();
            StringBuilder sb8 = new StringBuilder(19);
            sb8.append(" result=");
            sb8.append(c);
            printWriter.println(sb8.toString());
        }
        ajtg ajtgVar = this.F;
        String hexString4 = Integer.toHexString(System.identityHashCode(ajtgVar));
        StringBuilder sb9 = new StringBuilder(String.valueOf(concat).length() + 24 + String.valueOf(hexString4).length());
        sb9.append(concat);
        sb9.append("UpdateSharesController #");
        sb9.append(hexString4);
        printWriter.println(sb9.toString());
        printWriter.println(String.valueOf(concat).concat("  recent results:"));
        Iterator<ajtf> it3 = ajtgVar.d.iterator();
        while (it3.hasNext()) {
            ajtf next3 = it3.next();
            long b3 = next3.b();
            StringBuilder sb10 = new StringBuilder(String.valueOf(concat).length() + 34);
            sb10.append(concat);
            sb10.append("    timestamp=");
            sb10.append(b3);
            printWriter.print(sb10.toString());
            String valueOf4 = String.valueOf(next3.a().d);
            printWriter.print(valueOf4.length() != 0 ? " account=".concat(valueOf4) : new String(" account="));
            String valueOf5 = String.valueOf(next3.c());
            StringBuilder sb11 = new StringBuilder(String.valueOf(valueOf5).length() + 14);
            sb11.append(" requestedAcl=");
            sb11.append(valueOf5);
            printWriter.print(sb11.toString());
            String valueOf6 = String.valueOf(next3.d());
            StringBuilder sb12 = new StringBuilder(String.valueOf(valueOf6).length() + 13);
            sb12.append(" receivedAcl=");
            sb12.append(valueOf6);
            printWriter.println(sb12.toString());
        }
        ajri ajriVar = this.G;
        String hexString5 = Integer.toHexString(System.identityHashCode(ajriVar));
        StringBuilder sb13 = new StringBuilder(String.valueOf(concat).length() + 25 + String.valueOf(hexString5).length());
        sb13.append(concat);
        sb13.append("RecordConsentController #");
        sb13.append(hexString5);
        printWriter.println(sb13.toString());
        printWriter.println(String.valueOf(concat).concat("  recent results:"));
        Iterator<ajrh> it4 = ajriVar.f.iterator();
        while (it4.hasNext()) {
            ajrh next4 = it4.next();
            long b4 = next4.b();
            StringBuilder sb14 = new StringBuilder(String.valueOf(concat).length() + 34);
            sb14.append(concat);
            sb14.append("    timestamp=");
            sb14.append(b4);
            printWriter.print(sb14.toString());
            String valueOf7 = String.valueOf(next4.a().d);
            printWriter.print(valueOf7.length() != 0 ? " account=".concat(valueOf7) : new String(" account="));
            int c2 = next4.c();
            StringBuilder sb15 = new StringBuilder(19);
            sb15.append(" result=");
            sb15.append(c2);
            printWriter.println(sb15.toString());
        }
        aija aijaVar = this.j;
        String hexString6 = Integer.toHexString(System.identityHashCode(aijaVar));
        StringBuilder sb16 = new StringBuilder(String.valueOf(concat).length() + 12 + String.valueOf(hexString6).length());
        sb16.append(concat);
        sb16.append("TokenCache #");
        sb16.append(hexString6);
        printWriter.println(sb16.toString());
        boolean z2 = aijaVar.f;
        StringBuilder sb17 = new StringBuilder(String.valueOf(concat).length() + 18);
        sb17.append(concat);
        sb17.append("  cacheDirty=");
        sb17.append(z2);
        printWriter.println(sb17.toString());
        for (Map.Entry<String, dcna<String, ajji>> entry : aijaVar.b.entrySet()) {
            String f = dbsj.f(entry.getKey());
            StringBuilder sb18 = new StringBuilder(String.valueOf(concat).length() + 20 + String.valueOf(f).length());
            sb18.append(concat);
            sb18.append("  cache for account ");
            sb18.append(f);
            printWriter.println(sb18.toString());
            for (Map.Entry<String, ajji> entry2 : entry.getValue().d()) {
                String key = entry2.getKey();
                ajji value = entry2.getValue();
                StringBuilder sb19 = new StringBuilder(String.valueOf(concat).length() + 21 + String.valueOf(key).length());
                sb19.append(concat);
                sb19.append("    requestedUserOid=");
                sb19.append(key);
                printWriter.print(sb19.toString());
                String str2 = value.b;
                StringBuilder sb20 = new StringBuilder(String.valueOf(concat).length() + 13 + String.valueOf(str2).length());
                sb20.append(concat);
                sb20.append(" recipientId=");
                sb20.append(str2);
                printWriter.print(sb20.toString());
                dobx dobxVar = value.c;
                if (dobxVar == null) {
                    dobxVar = dobx.d;
                }
                String str3 = dobxVar.b;
                StringBuilder sb21 = new StringBuilder(String.valueOf(concat).length() + 15 + String.valueOf(str3).length());
                sb21.append(concat);
                sb21.append(" requestedUser=");
                sb21.append(str3);
                printWriter.println(sb21.toString());
            }
        }
        ajku ajkuVar = this.H;
        String hexString7 = Integer.toHexString(System.identityHashCode(ajkuVar));
        StringBuilder sb22 = new StringBuilder(String.valueOf(concat).length() + 29 + String.valueOf(hexString7).length());
        sb22.append(concat);
        sb22.append("LocationReportingController #");
        sb22.append(hexString7);
        printWriter.println(sb22.toString());
        String a = ajks.a(ajkuVar.g.h());
        StringBuilder sb23 = new StringBuilder(String.valueOf(concat).length() + 19 + a.length());
        sb23.append(concat);
        sb23.append("\tapplicationState: ");
        sb23.append(a);
        printWriter.println(sb23.toString());
        int d2 = ajkuVar.g.d();
        StringBuilder sb24 = new StringBuilder(String.valueOf(concat).length() + 37);
        sb24.append(concat);
        sb24.append("\tcurrentDetectedActivity: ");
        sb24.append(d2);
        printWriter.println(sb24.toString());
        String valueOf8 = String.valueOf(ajkuVar.g.e());
        StringBuilder sb25 = new StringBuilder(String.valueOf(concat).length() + 15 + String.valueOf(valueOf8).length());
        sb25.append(concat);
        sb25.append("\tcreationTime: ");
        sb25.append(valueOf8);
        printWriter.println(sb25.toString());
        String arrays = Arrays.toString(ajkuVar.g.f().bS());
        StringBuilder sb26 = new StringBuilder(String.valueOf(concat).length() + 19 + String.valueOf(arrays).length());
        sb26.append(concat);
        sb26.append("\tclientParameters: ");
        sb26.append(arrays);
        printWriter.println(sb26.toString());
        String valueOf9 = String.valueOf(ajkuVar.h);
        StringBuilder sb27 = new StringBuilder(String.valueOf(concat).length() + 30 + String.valueOf(valueOf9).length());
        sb27.append(concat);
        sb27.append("\tscheduledUpdateToTaskExecutor");
        sb27.append(valueOf9);
        printWriter.println(sb27.toString());
        dcpd<btlu> it5 = ajkuVar.g.a().iterator();
        while (it5.hasNext()) {
            btlu next5 = it5.next();
            String str4 = next5.d;
            StringBuilder sb28 = new StringBuilder(String.valueOf(concat).length() + 20 + String.valueOf(str4).length());
            sb28.append(concat);
            sb28.append("\tstate for account: ");
            sb28.append(str4);
            printWriter.println(sb28.toString());
            String valueOf10 = String.valueOf(ajkuVar.g.c().get(next5));
            StringBuilder sb29 = new StringBuilder(String.valueOf(concat).length() + 27 + String.valueOf(valueOf10).length());
            sb29.append(concat);
            sb29.append("\t\t reportingConfiguration: ");
            sb29.append(valueOf10);
            printWriter.println(sb29.toString());
            printWriter.println(String.valueOf(concat).concat("\t\t sharingStates:"));
            dcpd<ahwl> it6 = ajkuVar.g.b().h(next5).iterator();
            while (it6.hasNext()) {
                it6.next().F(String.valueOf(concat).concat("\t\t\t"), printWriter);
            }
        }
        printWriter.println(String.valueOf(concat).concat("\t reportingAccounts:"));
        dcpd<btlu> it7 = ajkuVar.g.i(new eapd(ajkuVar.b.a().b())).iterator();
        while (it7.hasNext()) {
            String str5 = it7.next().d;
            StringBuilder sb30 = new StringBuilder(String.valueOf(concat).length() + 11 + String.valueOf(str5).length());
            sb30.append(concat);
            sb30.append("\t\t account ");
            sb30.append(str5);
            printWriter.println(sb30.toString());
        }
        printWriter.println(String.valueOf(concat).concat("\t sharingAccounts:"));
        dcpd<btlu> it8 = ajkuVar.g.j(new eapd(ajkuVar.b.a().b())).iterator();
        while (it8.hasNext()) {
            String str6 = it8.next().d;
            StringBuilder sb31 = new StringBuilder(String.valueOf(concat).length() + 11 + String.valueOf(str6).length());
            sb31.append(concat);
            sb31.append("\t\t account ");
            sb31.append(str6);
            printWriter.println(sb31.toString());
        }
        printWriter.println(String.valueOf(concat).concat("\t accountsEligibleForApplicationForegroundReportAtCreation:"));
        dcpd<btlu> it9 = ajkuVar.g.k().iterator();
        while (it9.hasNext()) {
            String str7 = it9.next().d;
            StringBuilder sb32 = new StringBuilder(String.valueOf(concat).length() + 11 + String.valueOf(str7).length());
            sb32.append(concat);
            sb32.append("\t\t account ");
            sb32.append(str7);
            printWriter.println(sb32.toString());
        }
        ajlj ajljVar = ajkuVar.g;
        eapd eapdVar = new eapd(ajkuVar.b.a().b());
        ajkuVar.c.a();
        String valueOf11 = String.valueOf(ajljVar.o(eapdVar));
        StringBuilder sb33 = new StringBuilder(String.valueOf(concat).length() + 26 + String.valueOf(valueOf11).length());
        sb33.append(concat);
        sb33.append("\t activityRecognitionRate:");
        sb33.append(valueOf11);
        printWriter.println(sb33.toString());
        ajlj ajljVar2 = ajkuVar.g;
        eapd eapdVar2 = new eapd(ajkuVar.b.a().b());
        ajkuVar.c.a();
        String valueOf12 = String.valueOf(ajljVar2.p(eapdVar2));
        StringBuilder sb34 = new StringBuilder(String.valueOf(concat).length() + 14 + String.valueOf(valueOf12).length());
        sb34.append(concat);
        sb34.append("\t currentTask:");
        sb34.append(valueOf12);
        printWriter.println(sb34.toString());
        printWriter.println(String.valueOf(concat).concat("\t activeNavigationReportingSource:"));
        ajjn ajjnVar = ajkuVar.f;
        String concat2 = String.valueOf(concat).concat("\t\t");
        String hexString8 = Integer.toHexString(System.identityHashCode(ajjnVar));
        StringBuilder sb35 = new StringBuilder(String.valueOf(concat2).length() + 32 + String.valueOf(hexString8).length());
        sb35.append(concat2);
        sb35.append("ActiveNavigationLocationSource #");
        sb35.append(hexString8);
        printWriter.println(sb35.toString());
        String valueOf13 = String.valueOf(ajjnVar.j);
        StringBuilder sb36 = new StringBuilder(String.valueOf(concat2).length() + 17 + String.valueOf(valueOf13).length());
        sb36.append(concat2);
        sb36.append("\tlastUpdateTime: ");
        sb36.append(valueOf13);
        printWriter.println(sb36.toString());
        boolean z3 = ajjnVar.i;
        StringBuilder sb37 = new StringBuilder(String.valueOf(concat2).length() + 25);
        sb37.append(concat2);
        sb37.append("\tisGuidanceRunning: ");
        sb37.append(z3);
        printWriter.println(sb37.toString());
        String valueOf14 = String.valueOf(ajjnVar.h);
        StringBuilder sb38 = new StringBuilder(String.valueOf(concat2).length() + 25 + String.valueOf(valueOf14).length());
        sb38.append(concat2);
        sb38.append("\tactiveNavReportingRate: ");
        sb38.append(valueOf14);
        printWriter.println(sb38.toString());
        ahwc ahwcVar = this.p;
        String hexString9 = Integer.toHexString(System.identityHashCode(ahwcVar));
        StringBuilder sb39 = new StringBuilder(String.valueOf(concat).length() + 22 + String.valueOf(hexString9).length());
        sb39.append(concat);
        sb39.append("ServiceStatusChecker #");
        sb39.append(hexString9);
        printWriter.println(sb39.toString());
        printWriter.println(String.valueOf(concat).concat("  recent results:"));
        Iterator<ahvz> it10 = ahwcVar.h.iterator();
        while (it10.hasNext()) {
            ahvz next6 = it10.next();
            long b5 = next6.b();
            StringBuilder sb40 = new StringBuilder(String.valueOf(concat).length() + 34);
            sb40.append(concat);
            sb40.append("    timestamp=");
            sb40.append(b5);
            printWriter.print(sb40.toString());
            String valueOf15 = String.valueOf(next6.a().d);
            printWriter.print(valueOf15.length() != 0 ? " account=".concat(valueOf15) : new String(" account="));
            int c3 = next6.c();
            StringBuilder sb41 = new StringBuilder(19);
            sb41.append(" result=");
            sb41.append(c3);
            printWriter.println(sb41.toString());
        }
        aijz aijzVar = this.o;
        String hexString10 = Integer.toHexString(System.identityHashCode(aijzVar));
        StringBuilder sb42 = new StringBuilder(String.valueOf(concat).length() + 24 + String.valueOf(hexString10).length());
        sb42.append(concat);
        sb42.append("SharedLocationsUpdater #");
        sb42.append(hexString10);
        printWriter.println(sb42.toString());
        btlu btluVar = aijzVar.q;
        String str8 = btluVar == null ? null : btluVar.d;
        StringBuilder sb43 = new StringBuilder(String.valueOf(concat).length() + 23 + String.valueOf(str8).length());
        sb43.append(concat);
        sb43.append("  scheduledPollAccount=");
        sb43.append(str8);
        printWriter.println(sb43.toString());
        int i = aijzVar.o;
        StringBuilder sb44 = new StringBuilder(String.valueOf(concat).length() + 29);
        sb44.append(concat);
        sb44.append("  pollingRefCount=");
        sb44.append(i);
        printWriter.println(sb44.toString());
        String valueOf16 = String.valueOf(aijzVar.p);
        StringBuilder sb45 = new StringBuilder(String.valueOf(concat).length() + 16 + String.valueOf(valueOf16).length());
        sb45.append(concat);
        sb45.append("  scheduledPoll=");
        sb45.append(valueOf16);
        printWriter.println(sb45.toString());
        for (Map.Entry<btlu, dehn<Boolean>> entry3 : aijzVar.n.entrySet()) {
            String h = btlu.h(entry3.getKey());
            StringBuilder sb46 = new StringBuilder(String.valueOf(concat).length() + 24 + String.valueOf(h).length());
            sb46.append(concat);
            sb46.append("  pending response for ");
            sb46.append(h);
            sb46.append(":");
            printWriter.println(sb46.toString());
            String valueOf17 = String.valueOf(entry3.getValue());
            StringBuilder sb47 = new StringBuilder(String.valueOf(concat).length() + 26 + String.valueOf(valueOf17).length());
            sb47.append(concat);
            sb47.append("    pendingResponseFuture=");
            sb47.append(valueOf17);
            printWriter.println(sb47.toString());
        }
        for (Map.Entry<btlu, aijw> entry4 : aijzVar.m.entrySet()) {
            String str9 = entry4.getKey().d;
            StringBuilder sb48 = new StringBuilder(String.valueOf(concat).length() + 13 + String.valueOf(str9).length());
            sb48.append(concat);
            sb48.append("  state for ");
            sb48.append(str9);
            sb48.append(":");
            printWriter.println(sb48.toString());
            aijw value2 = entry4.getValue();
            int i2 = value2.h;
            StringBuilder sb49 = new StringBuilder(String.valueOf(concat).length() + 44);
            sb49.append(concat);
            sb49.append("    contiguousFailedRequestCount=");
            sb49.append(i2);
            printWriter.println(sb49.toString());
            String valueOf18 = String.valueOf(value2.b.e(new eaow(new eapd(aijzVar.c.e()), new eapd(aijzVar.c.b()))));
            StringBuilder sb50 = new StringBuilder(String.valueOf(concat).length() + 34 + String.valueOf(valueOf18).length());
            sb50.append(concat);
            sb50.append("    lastSuccessfulReadTimestampMs=");
            sb50.append(valueOf18);
            printWriter.println(sb50.toString());
            String arrays2 = Arrays.toString(value2.c.G());
            StringBuilder sb51 = new StringBuilder(String.valueOf(concat).length() + 21 + String.valueOf(arrays2).length());
            sb51.append(concat);
            sb51.append("    readRequestToken=");
            sb51.append(arrays2);
            printWriter.println(sb51.toString());
            int i3 = value2.f;
            StringBuilder sb52 = new StringBuilder(String.valueOf(concat).length() + 51);
            sb52.append(concat);
            sb52.append("    successfulUpdatesSinceAppStartCount=");
            sb52.append(i3);
            printWriter.println(sb52.toString());
            String valueOf19 = String.valueOf(value2.d);
            StringBuilder sb53 = new StringBuilder(String.valueOf(concat).length() + 35 + String.valueOf(valueOf19).length());
            sb53.append(concat);
            sb53.append("    durationBetweenRequestsDefault=");
            sb53.append(valueOf19);
            printWriter.println(sb53.toString());
            String valueOf20 = String.valueOf(value2.e);
            StringBuilder sb54 = new StringBuilder(String.valueOf(concat).length() + 51 + String.valueOf(valueOf20).length());
            sb54.append(concat);
            sb54.append("    durationBetweenRequestsWhenJourneyShareVisible=");
            sb54.append(valueOf20);
            printWriter.println(sb54.toString());
        }
        printWriter.println(String.valueOf(concat).concat("  recent results:"));
        Iterator<aijy> it11 = aijzVar.l.iterator();
        while (it11.hasNext()) {
            aijy next7 = it11.next();
            btlu a2 = next7.a();
            String str10 = a2 == null ? null : a2.d;
            StringBuilder sb55 = new StringBuilder(String.valueOf(concat).length() + 12 + String.valueOf(str10).length());
            sb55.append(concat);
            sb55.append("    account=");
            sb55.append(str10);
            printWriter.print(sb55.toString());
            String valueOf21 = String.valueOf(next7.b());
            StringBuilder sb56 = new StringBuilder(String.valueOf(valueOf21).length() + 11);
            sb56.append(" startTime=");
            sb56.append(valueOf21);
            printWriter.print(sb56.toString());
            String valueOf22 = String.valueOf(next7.c());
            StringBuilder sb57 = new StringBuilder(String.valueOf(valueOf22).length() + 16);
            sb57.append(" completionTime=");
            sb57.append(valueOf22);
            printWriter.print(sb57.toString());
            boolean f2 = next7.f();
            StringBuilder sb58 = new StringBuilder(19);
            sb58.append(" forceRefresh=");
            sb58.append(f2);
            printWriter.print(sb58.toString());
            boolean d3 = next7.d();
            StringBuilder sb59 = new StringBuilder(16);
            sb59.append(" succeeded=");
            sb59.append(d3);
            printWriter.print(sb59.toString());
            boolean e = next7.e();
            StringBuilder sb60 = new StringBuilder(16);
            sb60.append(" cancelled=");
            sb60.append(e);
            printWriter.println(sb60.toString());
        }
        ahvo ahvoVar = this.C;
        String hexString11 = Integer.toHexString(System.identityHashCode(ahvoVar));
        StringBuilder sb61 = new StringBuilder(String.valueOf(concat).length() + 26 + String.valueOf(hexString11).length());
        sb61.append(concat);
        sb61.append("JourneySharingController #");
        sb61.append(hexString11);
        printWriter.println(sb61.toString());
        printWriter.println(String.valueOf(concat).concat("  currentSession:"));
        aibo aiboVar = (aibo) ahvoVar;
        String valueOf23 = String.valueOf(aiboVar.f);
        StringBuilder sb62 = new StringBuilder(String.valueOf(concat).length() + 4 + String.valueOf(valueOf23).length());
        sb62.append(concat);
        sb62.append("    ");
        sb62.append(valueOf23);
        printWriter.println(sb62.toString());
        printWriter.println(String.valueOf(concat).concat("  ongoingCreationFlow:"));
        String valueOf24 = String.valueOf(aiboVar.g);
        StringBuilder sb63 = new StringBuilder(String.valueOf(concat).length() + 4 + String.valueOf(valueOf24).length());
        sb63.append(concat);
        sb63.append("    ");
        sb63.append(valueOf24);
        printWriter.println(sb63.toString());
        dcdc<ailb<?>> dcdcVar = this.I;
        int size = dcdcVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            dcdcVar.get(i4).e(concat, printWriter);
        }
        ahwo ahwoVar = this.w;
        if (ahwoVar != null) {
            ahwoVar.a();
        }
    }
}

package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.maps.R;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: acgb  reason: default package */
/* loaded from: classes2.dex */
public final class acgb extends itb implements ache {
    public static final dcqe a = dcqe.c("acgb");
    private final bvrb A;
    private final ahjq B;
    private final dxio<cref> C;
    private final dxio<araj> D;
    private final btpa E;
    private final acyp F;
    private final btyy G;
    private final ccie H;
    private final gce I;
    private final acgs J;
    private final ckoq N;
    public final gga b;
    public final akox c;
    public final btrm d;
    public final cjqy e;
    public final akfa f;
    public final eeu g;
    public final bvjj h;
    public final bttf i;
    public final dxio<afwt> j;
    public final dxio<boxa> k;
    public final dxio<afha> o;
    public final dxio<bzmi> p;
    public final cklf q;
    public volatile boolean r;
    public boolean s;
    @dzsi
    public acfi t;
    public final bvtd x;
    private final cjqq y;
    private final btvo z;
    public boolean u = false;
    public boolean v = false;
    public int w = 0;
    @dzsi
    private btsf K = null;
    private final acfu M = new acfu(this);
    private final acga L = new acga(this);

    public acgb(gga ggaVar, akox akoxVar, btrm btrmVar, cjqy cjqyVar, cjqq cjqqVar, btvo btvoVar, akfa akfaVar, bvrb bvrbVar, ahjq ahjqVar, dxio dxioVar, eeu eeuVar, ckoq ckoqVar, bvjj bvjjVar, bttf bttfVar, bvtd bvtdVar, dxio dxioVar2, dxio dxioVar3, dxio dxioVar4, dxio dxioVar5, dxio dxioVar6, acgs acgsVar, btpa btpaVar, btyy btyyVar, acyp acypVar, cklf cklfVar, ccie ccieVar, gce gceVar) {
        this.b = ggaVar;
        this.c = akoxVar;
        this.d = btrmVar;
        this.e = cjqyVar;
        this.y = cjqqVar;
        this.z = btvoVar;
        this.f = akfaVar;
        this.A = bvrbVar;
        this.B = ahjqVar;
        this.C = dxioVar;
        this.g = eeuVar;
        this.N = ckoqVar;
        this.h = bvjjVar;
        this.i = bttfVar;
        this.x = bvtdVar;
        this.j = dxioVar2;
        this.D = dxioVar3;
        this.k = dxioVar4;
        this.o = dxioVar5;
        this.p = dxioVar6;
        this.J = acgsVar;
        this.E = btpaVar;
        this.F = acypVar;
        this.G = btyyVar;
        this.q = cklfVar;
        this.H = ccieVar;
        this.I = gceVar;
    }

    private final achc E(@dzsi achc achcVar) {
        fd K = this.b.K();
        if (K instanceof achd) {
            return ((achd) K).bl(achcVar);
        }
        return achcVar == null ? achc.MAP : achcVar;
    }

    private final void F() {
        j(null);
    }

    public static Account e(@dzsi Account account) {
        return account != null ? account : new Account("anonymous", "com.example");
    }

    @Override // defpackage.ache
    public final void B(@dzsi achf achfVar) {
        acgp.d(achfVar, this.b, this.c, this.A);
    }

    @Override // defpackage.ache
    public final void C() {
        GoogleHelp a2 = GoogleHelp.a("consumer_info_Android");
        a2.c = e(this.f.m());
        a2.q = Uri.parse(cjxr.g());
        a2.s = this.q.d();
        a2.H = r();
        try {
            final Intent b = a2.b();
            this.o.a().G(new Runnable(this, b) { // from class: acft
                private final acgb a;
                private final Intent b;

                {
                    this.a = this;
                    this.b = b;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.s(this.b);
                }
            });
        } catch (NullPointerException e) {
            j(e);
        }
    }

    @Override // defpackage.ache
    public final void D(@dzsi achg achgVar, achc achcVar, @dzsi achb achbVar) {
        this.r = true;
        acfi acfiVar = new acfi(this.b, achbVar, achcVar, this.c, this.d, this.B, this.C, this.h, this.N, this.A, null, false, false, this.D.a(), this.z, this.E, achgVar, this.G, this.H);
        this.t = acfiVar;
        acfiVar.b();
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        if (this.K == null) {
            this.K = btsf.a(this.b, this.M, this.y, this.I);
        }
        btrm btrmVar = this.d;
        acga acgaVar = this.L;
        dceq a2 = dcet.a();
        a2.b(afws.class, new acgc(0, afws.class, acgaVar, bvrj.UI_THREAD));
        a2.b(crhp.class, new acgc(crhp.class, acgaVar));
        a2.b(acgq.class, new acgc(2, acgq.class, acgaVar, bvrj.UI_THREAD));
        a2.b(acfl.class, new acgc(3, acfl.class, acgaVar, bvrj.UI_THREAD));
        btrmVar.g(acgaVar, a2.a());
        acgs acgsVar = this.J;
        if (acgsVar.a() != null) {
            acgsVar.a.registerListener(acgsVar, acgsVar.a(), 2);
        }
        this.k.a().e(acfq.class);
    }

    @Override // defpackage.itb
    public final void Nu() {
        super.Nu();
        this.K = null;
    }

    @Override // defpackage.itb
    public final void Po() {
        this.d.a(this.L);
        if (this.r) {
            this.d.b(new acfl(acfk.FLOW_STOPPED_STARTED, this.t));
        }
        acgs acgsVar = this.J;
        if (acgsVar.a() != null) {
            acgsVar.a.unregisterListener(acgsVar, acgsVar.a());
        }
        super.Po();
    }

    public final dnqe f(achc achcVar) {
        dnqb dnqbVar;
        acfi acfiVar = this.t;
        if (acfiVar != null && acfiVar.c) {
            dnqbVar = dnqb.PHONE_SHAKE;
        } else {
            achc achcVar2 = achc.AR_CALIBRATOR;
            acfk acfkVar = acfk.INACTIVE;
            int ordinal = achcVar.ordinal();
            if (ordinal == 4) {
                dnqbVar = dnqb.ACCOUNT_PARTICLE;
            } else if (ordinal == 12) {
                dnqbVar = dnqb.DRAWER_MENU;
            } else if (ordinal == 22) {
                dnqbVar = dnqb.HOME_SCREEN_CONTRIBUTE_TAB;
            } else if (ordinal == 38) {
                dnqbVar = dnqb.SETTINGS;
            } else {
                dnqbVar = dnqb.SEARCH_RESULT;
            }
        }
        dnps bZ = dnqe.i.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqe dnqeVar = (dnqe) bZ.b;
        dnqeVar.b = dnqbVar.ah;
        dnqeVar.a |= 1;
        dnqe dnqeVar2 = (dnqe) bZ.b;
        dnqeVar2.c = 1;
        dnqeVar2.a |= 2;
        return bZ.bK();
    }

    public final void j(@dzsi Throwable th) {
        gga ggaVar = this.b;
        cjxu.j(ggaVar, this.A, ggaVar.getString(R.string.UNKNOWN_ERROR));
        this.K = btsf.a(this.b, this.M, this.y, this.I);
        if (th != null) {
            bvoo.f(new RuntimeException(th));
        } else {
            bvoo.h("Feedback failure", new Object[0]);
        }
    }

    @Override // defpackage.ache
    public final void k(boolean z, boolean z2, achc achcVar, @dzsi achb achbVar) {
        this.r = true;
        acfi acfiVar = new acfi(this.b, achbVar, achcVar, this.c, this.d, this.B, this.C, this.h, this.N, this.A, null, z, z2, this.D.a(), this.z, this.E, null, this.G, this.H);
        this.t = acfiVar;
        acfiVar.b();
    }

    @Override // defpackage.ache
    public final void l(String str) {
        if (this.K == null) {
            F();
            return;
        }
        this.r = true;
        acfi acfiVar = new acfi(this.b, null, achc.LOCATION_QUALITY_FEEDBACK, this.c, this.d, this.B, this.C, this.h, this.N, this.A, str, false, false, this.D.a(), this.z, this.E, null, this.G, this.H);
        this.t = acfiVar;
        acfiVar.b();
    }

    @Override // defpackage.ache
    public final void m(String str) {
        if (this.K == null) {
            F();
            return;
        }
        this.r = true;
        acgz b = achb.b();
        b.c("NotificationFeature", str);
        acfi acfiVar = new acfi(this.b, b.b(), achc.NOTIFICATION, this.c, this.d, this.B, this.C, this.h, this.N, this.A, null, false, false, this.D.a(), this.z, this.E, null, this.G, this.H);
        this.t = acfiVar;
        acfiVar.b();
    }

    @Override // defpackage.ache
    public final void n() {
        gga ggaVar = this.b;
        acgh acghVar = new acgh();
        acghVar.aJ();
        ggaVar.D(acghVar);
    }

    @Override // defpackage.ache
    public final void o(boolean z, @dzsi achc achcVar) {
        achc E = E(achcVar);
        fd K = this.b.K();
        if (!(K instanceof achd) || !((achd) K).bm(z, E)) {
            k(z, true, E, null);
        }
    }

    @Override // defpackage.ache
    public final void p() {
        acfh acfhVar;
        achg achgVar;
        Map hashMap;
        gcd f;
        acfi acfiVar = this.t;
        Bitmap bitmap = null;
        String c = acfiVar == null ? null : acfiVar.c();
        acfi acfiVar2 = this.t;
        Bitmap a2 = (acfiVar2 == null || (acfhVar = acfiVar2.b) == null || (achgVar = acfhVar.c) == null) ? null : achgVar.a();
        acfi acfiVar3 = this.t;
        if (acfiVar3 == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            acfh acfhVar2 = acfiVar3.b;
            if (acfhVar2 != null) {
                alad aladVar = acfhVar2.b;
                if (aladVar != null) {
                    acfi.d(hashMap, "CameraPosition", aladVar.toString());
                    acfi.d(hashMap, "Viewport link url", acfiVar3.a.X(null));
                }
                achb achbVar = acfiVar3.b.d;
                if (achbVar != null) {
                    dcdc<acha> a3 = achbVar.a();
                    int size = a3.size();
                    for (int i = 0; i < size; i++) {
                        acha achaVar = a3.get(i);
                        acfi.d(hashMap, achaVar.a, achaVar.b);
                    }
                }
                achc achcVar = acfiVar3.b.e;
                if (achcVar != null && achcVar.U) {
                    acfi.d(hashMap, "ReportState", achcVar.toString());
                }
                acfi.d(hashMap, "LocationSpeed", acfiVar3.b.f);
                acfi.d(hashMap, "LocationState", acfiVar3.b.g);
                acfi.d(hashMap, "LocationScanState", acfiVar3.b.h);
                acfi.d(hashMap, "LocationRadius", acfiVar3.b.i);
                acfi.d(hashMap, "LocationFeedback", acfiVar3.b.j);
                acfi.d(hashMap, "Versions", acfiVar3.b.k);
                acfi.d(hashMap, "Connectivity", acfiVar3.b.l);
                acfi.d(hashMap, "OrientationAccuracy", acfiVar3.b.m);
                acfi.d(hashMap, "Gservices", acfiVar3.b.n);
                acfi.d(hashMap, "FLPSource", acfiVar3.b.o);
                acfi.d(hashMap, "WIFI", acfiVar3.b.p);
                acfi.d(hashMap, "Graydot", acfiVar3.b.q);
                acfi.d(hashMap, "e", acfiVar3.b.r);
                acfi.d(hashMap, "TextToSpeechStats", acfiVar3.b.s);
                acfi.d(hashMap, "MuteLevel", acfiVar3.b.t);
                acfi.d(hashMap, "PlayVoiceOverBluetooth", acfiVar3.b.u);
                acfi.d(hashMap, "BluetoothConnected", acfiVar3.b.v);
                acfi.d(hashMap, "LocalGuideLevel", acfiVar3.b.w);
            }
        }
        String o = this.f.o();
        if (true == dbsj.d(o)) {
            o = "anonymous";
        }
        btsf btsfVar = this.K;
        if (btsfVar != null) {
            try {
                acfw acfwVar = new acfw(this);
                if (a2 != null) {
                    a2.getWidth();
                    a2.getHeight();
                    bitmap = a2;
                }
                ThemeSettings themeSettings = new ThemeSettings();
                gce gceVar = btsfVar.b;
                if (gceVar == null) {
                    f = gcd.FOLLOW_SYSTEM;
                } else {
                    f = gceVar.f();
                }
                gcd gcdVar = gcd.FOLLOW_SYSTEM;
                int ordinal = f.ordinal();
                if (ordinal == 0) {
                    themeSettings.a = 3;
                } else if (ordinal == 1) {
                    themeSettings.a = 2;
                } else if (ordinal == 2) {
                    themeSettings.a = 0;
                }
                cocv cocvVar = new cocv();
                cocvVar.c = dbsj.e(c);
                cocvVar.a = o;
                cocvVar.f = themeSettings;
                cocvVar.d = "";
                if (bitmap != null) {
                    cocvVar.d(bitmap);
                }
                if (hashMap == null) {
                    hashMap = dcmn.a;
                }
                cocvVar.a(false);
                for (Map.Entry entry : hashMap.entrySet()) {
                    cocvVar.b.putString((String) entry.getKey(), (String) entry.getValue());
                }
                cnwb.c(coct.a(btsfVar.a.i, cocvVar.b())).m(new btse(btsfVar, acfwVar));
                return;
            } catch (Throwable th) {
                j(th);
                return;
            }
        }
        F();
    }

    @Override // defpackage.ache
    public final void q(String str) {
        B(new acfy(this, str));
    }

    public final codq r() {
        return new acfz(this);
    }

    public final void s(Intent intent) {
        new codt(this.b).a(intent);
    }

    @Override // defpackage.ache
    public final void t(boolean z) {
        this.w = z ? this.w + 1 : this.w - 1;
    }

    public final void i() {
        Runnable runnable;
        acfi acfiVar = this.t;
        final bwrs<ilo> bwrsVar = null;
        final achc E = E(acfiVar == null ? null : acfiVar.d);
        achc achcVar = achc.AR_CALIBRATOR;
        acfk acfkVar = acfk.INACTIVE;
        int ordinal = E.ordinal();
        if (ordinal == 5 || ordinal == 6 || ordinal == 17 || ordinal == 18) {
            fd K = this.b.K();
            if (K instanceof ges) {
                if (K instanceof befy) {
                    bwrsVar = ((befy) K).bp();
                }
            } else {
                bvoo.h("Topfragment should be a GmmActivityFragment", new Object[0]);
            }
        }
        if (!this.F.a.a().a || E != achc.ACCOUNT_PARTICLE_MENU) {
            runnable = new Runnable(this, bwrsVar, E) { // from class: acfr
                private final acgb a;
                private final bwrs b;
                private final achc c;

                {
                    this.a = this;
                    this.b = bwrsVar;
                    this.c = E;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    acgb acgbVar = this.a;
                    acgbVar.k.a().I(this.b, acgbVar.f(this.c));
                }
            };
        } else {
            dnqe f = f(E);
            Bundle bundle = new Bundle();
            bvrs.l(bundle, f);
            final acfq acfqVar = new acfq();
            acfqVar.B(bundle);
            runnable = new Runnable(this, acfqVar) { // from class: acfs
                private final acgb a;
                private final acfq b;

                {
                    this.a = this;
                    this.b = acfqVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    acgb acgbVar = this.a;
                    acgbVar.b.D(this.b);
                }
            };
        }
        this.A.b(new acfv(this, runnable), bvrj.UI_THREAD);
    }
}

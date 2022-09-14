package defpackage;

import android.app.Application;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.util.DisplayMetrics;
import com.google.android.filament.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: aeqy  reason: default package */
/* loaded from: classes2.dex */
public final class aeqy implements aequ, btzi {
    private static final String c = "aeqy";
    private static final dcdc<dvxj> d = dcdc.g(dvxj.SVG_LIGHT, dvxj.SVG_DARK);
    private static final dspd e = dspd.b;
    private static final dnqh f;
    public final Application a;
    private final bvrb g;
    private final dxio<vtn> h;
    private final dxio<amfi> i;
    private final cqat j;
    private final bvjj k;
    private final akfa l;
    private final ckcw m;
    private final dbty<dvsq> n;
    @dzsi
    private btzc o;
    private boolean q;
    private final buxx s;
    public aeui b = aeui.b;
    private final List<aerz> r = dchl.a();
    @dzsi
    private ahnc p = null;

    static {
        dnqg bZ = dnqh.p.bZ();
        int i = ddda.Kx.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        f = bZ.bK();
    }

    public aeqy(final btvo btvoVar, bvrb bvrbVar, dxio dxioVar, dxio dxioVar2, cqat cqatVar, bvjj bvjjVar, Application application, akfa akfaVar, buxx buxxVar, ckcw ckcwVar) {
        this.g = bvrbVar;
        this.h = dxioVar;
        this.i = dxioVar2;
        this.j = cqatVar;
        this.k = bvjjVar;
        this.a = application;
        this.l = akfaVar;
        this.s = buxxVar;
        this.m = ckcwVar;
        btvoVar.getClass();
        this.n = dbud.a(new dbty(btvoVar) { // from class: aeqv
            private final btvo a;

            {
                this.a = btvoVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.getSemanticLocationParameters();
            }
        });
    }

    private static akqq i(ahnc ahncVar) {
        return new akqq(ahncVar.getLatitude(), ahncVar.getLongitude());
    }

    private final dccx<String> j(ahnc ahncVar) {
        String concat;
        dccx<String> F = dcdc.F();
        if (ahncVar != null) {
            this.p = ahncVar;
            String o = this.l.o();
            double latitude = ahncVar.getLatitude();
            double longitude = ahncVar.getLongitude();
            int accuracy = (int) ahncVar.getAccuracy();
            int i = this.n.a().b;
            long time = ahncVar.getTime();
            if (o == null) {
                concat = "";
            } else {
                concat = o.length() != 0 ? "&email=".concat(o) : new String("&email=");
            }
            String str = o == null ? "true" : "0";
            StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 267 + str.length());
            sb.append("https://hulk-debug-tool.corp.google.com/?lat=");
            sb.append(latitude);
            sb.append("&lng=");
            sb.append(longitude);
            sb.append("&precision=");
            sb.append(accuracy);
            sb.append("&num=");
            sb.append(i);
            sb.append("&timestamp=");
            sb.append(time);
            sb.append(concat);
            sb.append("&stp_env=%2Fbns%2Fvd%2Fborg%2Fvd%2Fbns%2Fwww-pinhole%2Fpinhole.batch.stubby-bastion%2F");
            sb.append("&is_anonymous=");
            sb.append(str);
            F.g(sb.toString());
        }
        return F;
    }

    private static aeui k(@dzsi bttq bttqVar) {
        if (bttqVar == null) {
            return aeui.c;
        }
        aeqt aeqtVar = aeqt.REFRESH;
        int ordinal = bttqVar.ordinal();
        if (ordinal != 7) {
            if (ordinal == 9) {
                return aeui.e;
            }
            if (ordinal != 13) {
                return aeui.c;
            }
        }
        return aeui.d;
    }

    private final synchronized void l(aeui aeuiVar) {
        this.b = aeuiVar;
        n();
    }

    private final void m(boolean z, @dzsi dwjf dwjfVar, @dzsi aeuh aeuhVar) {
        if (!this.k.m(bvjk.aR, false)) {
            return;
        }
        this.g.b(new aeqw(this, z, dwjfVar, aeuhVar), bvrj.UI_THREAD);
    }

    private final synchronized void n() {
        for (aerz aerzVar : this.r) {
            this.g.b(new aeqx(this, aerzVar), bvrj.UI_THREAD);
        }
    }

    @Override // defpackage.btzi
    public final synchronized void QY(btzr<dwjd> btzrVar, btzy btzyVar) {
        if (btzyVar.equals(btzy.d)) {
            return;
        }
        this.q = false;
        ahnc ahncVar = btzrVar.d;
        dccx<String> j = j(ahncVar);
        dtaq dtaqVar = null;
        m(true, null, null);
        aeui k = k(btzyVar.p);
        if (ahncVar != null) {
            dtaqVar = ahncVar.a();
        }
        l(k.a(dtaqVar, j.f()));
    }

    @Override // defpackage.aequ
    public final synchronized void c(aerz aerzVar) {
        this.r.add(aerzVar);
    }

    @Override // defpackage.aequ
    public final synchronized void d(aerz aerzVar) {
        this.r.remove(aerzVar);
    }

    @Override // defpackage.aequ
    public final aeui e() {
        return this.b;
    }

    @Override // defpackage.aequ
    public final synchronized void f(int i) {
        this.q = false;
        btzc btzcVar = this.o;
        if (btzcVar != null) {
            btzcVar.a();
        }
        this.b = aeui.b;
        n();
        g(this.p, aeqt.REFRESH, i);
        this.p = null;
    }

    @Override // defpackage.aequ
    public final void g(@dzsi ahnc ahncVar, aeqt aeqtVar, int i) {
        ckgz ckgzVar;
        dspd dspdVar;
        ahnc ahncVar2;
        int i2 = 1;
        dbsk.g(ahncVar != null || aeqtVar == aeqt.REFRESH, "currentXGeoLocation is allowed to be null only for requestType == REFRESH, but was: %s", aeqtVar);
        if (this.q) {
            ((ckco) this.m.a(ckkc.a)).a(ckkb.a(i));
            return;
        }
        bttq bttqVar = bttq.PROTOCOL_ERROR_INVALID_CONTENT_TYPE;
        aeqt aeqtVar2 = aeqt.REFRESH;
        int ordinal = aeqtVar.ordinal();
        boolean z = ordinal == 0 || (ordinal == 1 && (ahnb.a(ahncVar, this.j) || (ahncVar2 = this.p) == null || akqo.e(i(ahncVar2), i(ahncVar)) >= ((double) this.n.a().a) || !this.b.j()));
        if (z) {
            this.q = true;
            btzc btzcVar = this.o;
            if (btzcVar != null) {
                btzcVar.a();
            }
            buxx buxxVar = this.s;
            WifiManager wifiManager = (WifiManager) this.a.getSystemService("wifi");
            try {
                if (wifiManager == null) {
                    dspdVar = e;
                } else {
                    List<ScanResult> scanResults = wifiManager.getScanResults();
                    if (scanResults != null && !scanResults.isEmpty()) {
                        dspb L = dspd.L();
                        aery aeryVar = new aery(L);
                        try {
                            StringBuilder sb = new StringBuilder();
                            for (ScanResult scanResult : scanResults) {
                                if (!aery.a.contains(Character.valueOf(scanResult.BSSID.length() == 17 ? scanResult.BSSID.charAt(i2) : ' ')) && !aery.b(scanResult.SSID)) {
                                    String str = scanResult.BSSID;
                                    int i3 = scanResult.level;
                                    int i4 = scanResult.frequency;
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 33);
                                    sb2.append(str);
                                    sb2.append(",");
                                    sb2.append("UNKNOWN");
                                    sb2.append(",");
                                    sb2.append(i3);
                                    sb2.append(",");
                                    sb2.append(i4);
                                    sb2.append(" ");
                                    sb.append(sb2.toString());
                                    i2 = 1;
                                }
                            }
                            aeryVar.c(aeryVar.d(), "wifi", sb.toString());
                            aeryVar.a();
                            dspdVar = L.a();
                        } catch (NullPointerException e2) {
                            bvoo.j(e2);
                            dspdVar = dspd.b;
                            aeryVar.a();
                        }
                    }
                    dspdVar = e;
                }
            } catch (SecurityException unused) {
                dspdVar = e;
            }
            DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
            int a = jmj.a(this.a, R.styleable.AppCompatTheme_windowFixedHeightMajor);
            dwjc bZ = dwjd.i.bZ();
            dnqh dnqhVar = f;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwjd dwjdVar = (dwjd) bZ.b;
            dnqhVar.getClass();
            dwjdVar.e = dnqhVar;
            dwjdVar.a |= 32;
            int i5 = this.n.a().b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwjd dwjdVar2 = (dwjd) bZ.b;
            int i6 = dwjdVar2.a | 2;
            dwjdVar2.a = i6;
            dwjdVar2.b = i5;
            dspdVar.getClass();
            dwjdVar2.a = i6 | 128;
            dwjdVar2.g = dspdVar;
            dnyc bZ2 = dnzj.Z.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnzj.b((dnzj) bZ2.b);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwjd dwjdVar3 = (dwjd) bZ.b;
            dnzj bK = bZ2.bK();
            bK.getClass();
            dwjdVar3.f = bK;
            dwjdVar3.a |= 64;
            dcdc<dvxj> dcdcVar = d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwjd dwjdVar4 = (dwjd) bZ.b;
            dsrf dsrfVar = dwjdVar4.h;
            if (!dsrfVar.a()) {
                dwjdVar4.h = dsqw.cg(dsrfVar);
            }
            for (dvxj dvxjVar : dcdcVar) {
                dwjdVar4.h.h(dvxjVar.u);
            }
            dvxo bZ3 = dvxt.e.bZ();
            dvxr bZ4 = dvxs.f.bZ();
            int i7 = displayMetrics.widthPixels;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dvxs dvxsVar = (dvxs) bZ4.b;
            int i8 = dvxsVar.a | 1;
            dvxsVar.a = i8;
            dvxsVar.b = i7;
            int i9 = i8 | 2;
            dvxsVar.a = i9;
            dvxsVar.c = a;
            dvxsVar.a = i9 | 4;
            dvxsVar.d = 1;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dvxt dvxtVar = (dvxt) bZ3.b;
            dvxs bK2 = bZ4.bK();
            bK2.getClass();
            dvxtVar.b = bK2;
            dvxtVar.a |= 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwjd dwjdVar5 = (dwjd) bZ.b;
            dvxt bK3 = bZ3.bK();
            bK3.getClass();
            dwjdVar5.d = bK3;
            dwjdVar5.a |= 16;
            this.o = buxxVar.a(bZ.bK(), this, bvrj.BACKGROUND_THREADPOOL);
            m(false, null, null);
        } else {
            n();
        }
        ckcw ckcwVar = this.m;
        if (!z) {
            ckgzVar = ckkc.a;
        } else {
            int ordinal2 = aeqtVar.ordinal();
            if (ordinal2 == 0) {
                ckgzVar = ckkc.d;
            } else if (ordinal2 == 1) {
                ckgzVar = ckkc.c;
            } else if (ordinal2 == 2) {
                ckgzVar = ckkc.b;
            } else {
                String valueOf = String.valueOf(aeqtVar);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 25);
                sb3.append("Unexpected request type: ");
                sb3.append(valueOf);
                throw new AssertionError(sb3.toString());
            }
        }
        ((ckco) ckcwVar.a(ckgzVar)).a(ckkb.a(i));
    }

    @Override // defpackage.btzi
    /* renamed from: h */
    public final synchronized void QZ(btzr<dwjd> btzrVar, dwjf dwjfVar) {
        this.q = false;
        ahnc ahncVar = btzrVar.d;
        dccx<String> j = j(ahncVar);
        dtaq dtaqVar = null;
        if (dwjfVar.b.size() == 0) {
            m(true, null, null);
            aeui k = k(null);
            if (ahncVar != null) {
                dtaqVar = ahncVar.a();
            }
            l(k.a(dtaqVar, j.f()));
            return;
        }
        aeui f2 = aeui.f(dwjfVar, this.n.a().c, ahncVar == null ? null : ahncVar.a(), j.f(), new eapd(this.j.b()));
        for (aeue aeueVar : f2.g) {
            String d2 = aeueVar.d();
            if (!dbsj.d(d2)) {
                this.i.a().a(d2, "IAmHereStateRetrieverImpl#onResponse", null);
            }
        }
        this.h.a().k(dwjfVar.e);
        m(true, dwjfVar, f2.f);
        l(f2);
    }
}

package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import java.util.Date;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dpb  reason: default package */
/* loaded from: classes3.dex */
public abstract class dpb implements qgj, qhb, qgn, qgt, qgr {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private pyy adLoader;
    protected pzc mAdView;
    public qgf mInterstitialAd;

    public pza buildAdRequest(Context context, qgh qghVar, Bundle bundle, Bundle bundle2) {
        pyz pyzVar = new pyz();
        Date d = qghVar.d();
        if (d != null) {
            pyzVar.a.g = d;
        }
        int a = qghVar.a();
        if (a != 0) {
            pyzVar.a.i = a;
        }
        Set<String> e = qghVar.e();
        if (e != null) {
            for (String str : e) {
                pyzVar.a.a.add(str);
            }
        }
        Location c = qghVar.c();
        if (c != null) {
            pyzVar.a.j = c;
        }
        if (qghVar.g()) {
            qar.c();
            pyzVar.a.a(qga.h(context));
        }
        if (qghVar.b() != -1) {
            int i = 1;
            if (qghVar.b() != 1) {
                i = 0;
            }
            pyzVar.a.k = i;
        }
        pyzVar.a.l = qghVar.f();
        Bundle buildExtrasBundle = buildExtrasBundle(bundle, bundle2);
        pyzVar.a.b.putBundle(AdMobAdapter.class.getName(), buildExtrasBundle);
        if (AdMobAdapter.class.equals(AdMobAdapter.class) && buildExtrasBundle.getBoolean("_emulatorLiveAds")) {
            pyzVar.a.d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return new pza(pyzVar);
    }

    protected abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // defpackage.qgj
    public View getBannerView() {
        return this.mAdView;
    }

    qgf getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @Override // defpackage.qhb
    public Bundle getInterstitialAdapterInfo() {
        bang bangVar = new bang();
        bangVar.a = 1;
        Bundle bundle = new Bundle();
        bundle.putInt("capabilities", bangVar.a);
        return bundle;
    }

    @Override // defpackage.qgt
    public qcg getVideoController() {
        pzc pzcVar = this.mAdView;
        if (pzcVar != null) {
            return pzcVar.a.c.a();
        }
        return null;
    }

    public pyx newAdLoader(Context context, String str) {
        qnm.n(context, "context cannot be null");
        return new pyx(context, (qbi) new qao(qar.a(), context, str, new qem()).d(context));
    }

    @Override // defpackage.qgi
    public void onDestroy() {
        pzc pzcVar = this.mAdView;
        if (pzcVar != null) {
            try {
                qbm qbmVar = pzcVar.a.f;
                if (qbmVar != null) {
                    qbmVar.h();
                }
            } catch (RemoteException e) {
                qfl.h("#007 Could not call remote method.", e);
            }
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    @Override // defpackage.qgr
    public void onImmersiveModeUpdated(boolean z) {
        qgf qgfVar = this.mInterstitialAd;
        if (qgfVar != null) {
            qgfVar.b(z);
        }
    }

    @Override // defpackage.qgi
    public void onPause() {
        pzc pzcVar = this.mAdView;
        if (pzcVar != null) {
            try {
                qbm qbmVar = pzcVar.a.f;
                if (qbmVar == null) {
                    return;
                }
                qbmVar.j();
            } catch (RemoteException e) {
                qfl.h("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // defpackage.qgi
    public void onResume() {
        pzc pzcVar = this.mAdView;
        if (pzcVar != null) {
            try {
                qbm qbmVar = pzcVar.a.f;
                if (qbmVar == null) {
                    return;
                }
                qbmVar.k();
            } catch (RemoteException e) {
                qfl.h("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // defpackage.qgj
    public void requestBannerAd(Context context, qgk qgkVar, Bundle bundle, pzb pzbVar, qgh qghVar, Bundle bundle2) {
        qbm qbmVar;
        pzc pzcVar = new pzc(context);
        this.mAdView = pzcVar;
        pzb pzbVar2 = new pzb(pzbVar.c, pzbVar.d);
        qcl qclVar = pzcVar.a;
        pzb[] pzbVarArr = {pzbVar2};
        if (qclVar.e == null) {
            qclVar.e = pzbVarArr;
            try {
                qbm qbmVar2 = qclVar.f;
                if (qbmVar2 != null) {
                    qbmVar2.n(qcl.b(qclVar.h.getContext(), qclVar.e));
                }
            } catch (RemoteException e) {
                qfl.h("#007 Could not call remote method.", e);
            }
            qclVar.h.requestLayout();
            pzc pzcVar2 = this.mAdView;
            String adUnitId = getAdUnitId(bundle);
            qcl qclVar2 = pzcVar2.a;
            if (qclVar2.g == null) {
                qclVar2.g = adUnitId;
                pzc pzcVar3 = this.mAdView;
                doy doyVar = new doy(qgkVar);
                qas qasVar = pzcVar3.a.d;
                synchronized (qasVar.a) {
                    qasVar.b = doyVar;
                }
                qcl qclVar3 = pzcVar3.a;
                try {
                    qclVar3.i = doyVar;
                    qbm qbmVar3 = qclVar3.f;
                    if (qbmVar3 != null) {
                        qbmVar3.l(new qav(doyVar));
                    }
                } catch (RemoteException e2) {
                    qfl.h("#007 Could not call remote method.", e2);
                }
                qcl qclVar4 = pzcVar3.a;
                try {
                    qclVar4.j = doyVar;
                    qbm qbmVar4 = qclVar4.f;
                    if (qbmVar4 != null) {
                        qbmVar4.o(new qbq(doyVar));
                    }
                } catch (RemoteException e3) {
                    qfl.h("#007 Could not call remote method.", e3);
                }
                pzc pzcVar4 = this.mAdView;
                pza buildAdRequest = buildAdRequest(context, qghVar, bundle2, bundle);
                qcl qclVar5 = pzcVar4.a;
                qcj qcjVar = buildAdRequest.a;
                try {
                    if (qclVar5.f == null) {
                        if (qclVar5.e == null || qclVar5.g == null) {
                            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                        }
                        Context context2 = qclVar5.h.getContext();
                        AdSizeParcel b = qcl.b(context2, qclVar5.e);
                        if ("search_v2".equals(b.a)) {
                            qbmVar = (qbm) new qam(qar.a(), context2, b, qclVar5.g).d(context2);
                        } else {
                            qbmVar = (qbm) new qal(qar.a(), context2, b, qclVar5.g, qclVar5.a).d(context2);
                        }
                        qclVar5.f = qbmVar;
                        qclVar5.f.m(new qay(qclVar5.d, null, null));
                        doy doyVar2 = qclVar5.i;
                        if (doyVar2 != null) {
                            qclVar5.f.l(new qav(doyVar2));
                        }
                        doy doyVar3 = qclVar5.j;
                        if (doyVar3 != null) {
                            qclVar5.f.o(new qbq(doyVar3));
                        }
                        qclVar5.f.r(new qcb());
                        qclVar5.f.u();
                        qbm qbmVar5 = qclVar5.f;
                        if (qbmVar5 != null) {
                            try {
                                rad g = qbmVar5.g();
                                if (g != null) {
                                    qclVar5.h.addView((View) rac.b(g));
                                }
                            } catch (RemoteException e4) {
                                qfl.h("#007 Could not call remote method.", e4);
                            }
                        }
                    }
                    qbm qbmVar6 = qclVar5.f;
                    qbmVar6.getClass();
                    if (!qbmVar6.t(qclVar5.b.a(qclVar5.h.getContext(), qcjVar))) {
                        return;
                    }
                    qclVar5.a.a = qcjVar.g;
                    return;
                } catch (RemoteException e5) {
                    qfl.h("#007 Could not call remote method.", e5);
                    return;
                }
            }
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    @Override // defpackage.qgl
    public void requestInterstitialAd(Context context, qgm qgmVar, Bundle bundle, qgh qghVar, Bundle bundle2) {
        String adUnitId = getAdUnitId(bundle);
        pza buildAdRequest = buildAdRequest(context, qghVar, bundle2, bundle);
        doz dozVar = new doz(this, qgmVar);
        qnm.n(context, "Context cannot be null.");
        qnm.n(adUnitId, "AdUnitId cannot be null.");
        qnm.n(buildAdRequest, "AdRequest cannot be null.");
        pzl pzlVar = new pzl(context, adUnitId);
        qcj qcjVar = buildAdRequest.a;
        try {
            qbm qbmVar = pzlVar.c;
            if (qbmVar == null) {
                return;
            }
            pzlVar.d.a = qcjVar.g;
            qbmVar.i(pzlVar.b.a(pzlVar.a, qcjVar), new qbb(dozVar, pzlVar, null, null));
        } catch (RemoteException e) {
            qfl.h("#007 Could not call remote method.", e);
            dozVar.a(new pzg(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v3, types: [qdx] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [qbi] */
    @Override // defpackage.qgn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void requestNativeAd(android.content.Context r21, defpackage.qgo r22, android.os.Bundle r23, defpackage.qgp r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpb.requestNativeAd(android.content.Context, qgo, android.os.Bundle, qgp, android.os.Bundle):void");
    }

    @Override // defpackage.qgl
    public void showInterstitial() {
        qgf qgfVar = this.mInterstitialAd;
        if (qgfVar != null) {
            qgfVar.c();
        }
    }
}

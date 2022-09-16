package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CustomEventAdapter implements qgj, qgl, qgn {
    static final pyw a = new pyw(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads");
    qgv b;
    qgx c;
    qgy d;

    private static Object a(Class cls, String str) {
        try {
            str.getClass();
            return cls.cast(Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            qfl.e(sb.toString());
            return null;
        }
    }

    @Override // defpackage.qgj
    public final View getBannerView() {
        return null;
    }

    @Override // defpackage.qgi
    public final void onDestroy() {
        qgv qgvVar = this.b;
        if (qgvVar != null) {
            qgvVar.a();
        }
        qgx qgxVar = this.c;
        if (qgxVar != null) {
            qgxVar.a();
        }
        qgy qgyVar = this.d;
        if (qgyVar != null) {
            qgyVar.a();
        }
    }

    @Override // defpackage.qgi
    public final void onPause() {
        qgv qgvVar = this.b;
        if (qgvVar != null) {
            qgvVar.b();
        }
        qgx qgxVar = this.c;
        if (qgxVar != null) {
            qgxVar.b();
        }
        qgy qgyVar = this.d;
        if (qgyVar != null) {
            qgyVar.b();
        }
    }

    @Override // defpackage.qgi
    public final void onResume() {
        qgv qgvVar = this.b;
        if (qgvVar != null) {
            qgvVar.c();
        }
        qgx qgxVar = this.c;
        if (qgxVar != null) {
            qgxVar.c();
        }
        qgy qgyVar = this.d;
        if (qgyVar != null) {
            qgyVar.c();
        }
    }

    @Override // defpackage.qgj
    public final void requestBannerAd(Context context, qgk qgkVar, Bundle bundle, pzb pzbVar, qgh qghVar, Bundle bundle2) {
        qgv qgvVar = (qgv) a(qgv.class, bundle.getString("class_name"));
        this.b = qgvVar;
        if (qgvVar == null) {
            qgkVar.g(a);
            return;
        }
        if (bundle2 != null) {
            bundle2.getBundle(bundle.getString("class_name"));
        }
        qgv qgvVar2 = this.b;
        qgvVar2.getClass();
        bundle.getString("parameter");
        qgvVar2.d();
    }

    @Override // defpackage.qgl
    public final void requestInterstitialAd(Context context, qgm qgmVar, Bundle bundle, qgh qghVar, Bundle bundle2) {
        qgx qgxVar = (qgx) a(qgx.class, bundle.getString("class_name"));
        this.c = qgxVar;
        if (qgxVar == null) {
            qgmVar.h(a);
            return;
        }
        if (bundle2 != null) {
            bundle2.getBundle(bundle.getString("class_name"));
        }
        qgx qgxVar2 = this.c;
        qgxVar2.getClass();
        bundle.getString("parameter");
        qgxVar2.e();
    }

    @Override // defpackage.qgn
    public final void requestNativeAd(Context context, qgo qgoVar, Bundle bundle, qgp qgpVar, Bundle bundle2) {
        qgy qgyVar = (qgy) a(qgy.class, bundle.getString("class_name"));
        this.d = qgyVar;
        if (qgyVar == null) {
            qgoVar.i(a);
            return;
        }
        if (bundle2 != null) {
            bundle2.getBundle(bundle.getString("class_name"));
        }
        qgy qgyVar2 = this.d;
        qgyVar2.getClass();
        bundle.getString("parameter");
        qgyVar2.d();
    }

    @Override // defpackage.qgl
    public final void showInterstitial() {
        qgx qgxVar = this.c;
        if (qgxVar != null) {
            qgxVar.d();
        }
    }
}

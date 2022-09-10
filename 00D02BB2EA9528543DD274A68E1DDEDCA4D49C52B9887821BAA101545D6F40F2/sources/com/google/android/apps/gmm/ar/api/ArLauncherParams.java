package com.google.android.apps.gmm.ar.api;

import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ImageView;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ArLauncherParams implements Parcelable {
    public static ArLauncherParams p(czh czhVar, boolean z, Iterable<dcvs> iterable) {
        dcdc f;
        czb czbVar = new czb();
        if (czhVar != null) {
            czbVar.a = czhVar;
            if (iterable != null) {
                czbVar.b = iterable;
                if (z) {
                    f = dcdc.e();
                } else {
                    dccx F = dcdc.F();
                    if (czhVar != czh.CALIBRATOR) {
                        F.g(czq.DIRECTIONS_OVERLAY);
                    }
                    F.g(czq.ACCESS_CAMERA);
                    F.g(czq.AWARENESS);
                    f = F.f();
                }
                czbVar.l(f);
                czbVar.k(false);
                czbVar.h(false);
                czbVar.g(false);
                czbVar.f(false);
                czbVar.e(false);
                czbVar.m(false);
                czbVar.j(doi.ONBOARDING_ARWN);
                czbVar.c = null;
                return czbVar.d();
            }
            throw new NullPointerException("Null latLngs");
        }
        throw new NullPointerException("Null featureType");
    }

    public static ArLauncherParams r(Bundle bundle) {
        ArLauncherParams arLauncherParams = (ArLauncherParams) bundle.getParcelable("ar_launcher_params");
        dbsk.s(arLauncherParams);
        return arLauncherParams;
    }

    public abstract czh a();

    public abstract Iterable<dcvs> b();

    public abstract dcdc<czq> c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract doi j();

    @dzsi
    public abstract ImageView.ScaleType k();

    public abstract dcdn<czq, String> l();

    public abstract dcdn<czq, String> m();

    public abstract dcdn<czq, String> n();

    public abstract czp o();

    public final void q(Bundle bundle) {
        bundle.putParcelable("ar_launcher_params", this);
    }
}

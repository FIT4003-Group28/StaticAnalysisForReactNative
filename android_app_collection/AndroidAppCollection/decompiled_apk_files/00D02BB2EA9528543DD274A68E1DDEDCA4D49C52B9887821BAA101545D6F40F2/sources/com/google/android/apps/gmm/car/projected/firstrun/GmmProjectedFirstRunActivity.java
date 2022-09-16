package com.google.android.apps.gmm.car.projected.firstrun;

import android.content.Intent;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GmmProjectedFirstRunActivity extends affn implements mvr, mvm {
    public bttf k;
    public axru l;

    private final void l() {
        if (!this.l.a("android.permission.ACCESS_FINE_LOCATION") || !this.l.a("com.google.android.gms.permission.CAR_SPEED")) {
            p(new mvs());
        } else if (!o()) {
            p(mvn.d());
        } else {
            q();
        }
    }

    private final boolean o() {
        return ((LocationManager) getSystemService("location")).isProviderEnabled("gps");
    }

    private final void p(fd fdVar) {
        fdVar.getClass();
        gz b = g().b();
        b.C(R.id.fragment_container, fdVar, fdVar.getClass().getSimpleName());
        b.f();
    }

    private final void q() {
        setResult(-1);
        finish();
    }

    @Override // defpackage.mvr
    public final void j(boolean z) {
        if (!z) {
            setResult(0);
            finish();
        } else if (!o()) {
            p(mvn.d());
        } else {
            q();
        }
    }

    @Override // defpackage.mvm
    public final void k() {
        q();
    }

    @Override // defpackage.ff, defpackage.agi, android.app.Activity
    public final void onActivityResult(int i, int i2, @dzsi Intent intent) {
        if (i == 0) {
            l();
            return;
        }
        fd H = g().H(mvn.class.getSimpleName());
        if (H == null) {
            return;
        }
        H.Z(i, i2, intent);
        super.onActivityResult(i2, i2, intent);
    }

    @Override // defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    public final void onCreate(@dzsi Bundle bundle) {
        dxiq.a(this);
        super.onCreate(bundle);
        if (bundle == null) {
            if (!bycr.a(this.k)) {
                this.k.e();
                l();
            } else if (!this.k.b()) {
                startActivityForResult(afft.a(getApplicationContext()).setAction("android.intent.action.VIEW").setData(Uri.fromParts("google.maps.oob", "", null)), 0);
            } else {
                l();
            }
        }
        setContentView(R.layout.frx_activity);
    }
}

package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: awfw  reason: default package */
/* loaded from: classes3.dex */
public final class awfw extends bszv implements ggg {
    public Context ad;
    public bvjj ae;
    public awfh af;
    public btvo ag;
    public cklf ah;
    public dxio<akfa> ai;
    public cjqy aj;
    public ite ak;
    public dzsj<awga> al;
    public dzsj<awfk> am;
    public avza an;
    public dehp ao;
    public Executor ap;

    @Override // defpackage.bszv, defpackage.ggg
    public final gfu Nx() {
        return gfu.ACTIVITY_FRAGMENT;
    }

    @Override // defpackage.bszv, defpackage.gfr
    public final fd Ny() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bszv
    public final jib aJ() {
        jhz e = super.aJ().e();
        e.f(new jmn(getClass()));
        return e.b();
    }

    @Override // defpackage.bszv
    protected final String aQ() {
        return Rp(R.string.OFFLINE_MAPS_SETTINGS_TITLE);
    }

    @Override // defpackage.bszv
    public final ddho aR() {
        return dtxx.bp;
    }

    public final boolean aS() {
        return this.af.h(this.ai.a().j());
    }

    public final void aT(awfv awfvVar, boolean z) {
        cjtd cjtdVar = awfvVar.c;
        TextView textView = awfvVar.d;
        cjql e = textView == null ? null : cjqg.e(textView);
        if (cjtdVar == null || e == null) {
            return;
        }
        cjqy cjqyVar = this.aj;
        cjte cjteVar = new cjte(deaf.TAP);
        cjta c = cjtd.c(cjtdVar);
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = z ? deaa.TOGGLE_OFF : deaa.TOGGLE_ON;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        c.a = bZ.bK();
        cjqyVar.n(e, cjteVar, c.a());
    }

    public final int aU() {
        return this.af.f() ? R.string.OFFLINE_MAPS_SETTINGS_DOWNLOAD_PREFERENCE_WIFI_ONLY : R.string.OFFLINE_MAPS_SETTINGS_DOWNLOAD_PREFERENCE_WIFI_OR_NETWORK;
    }

    public final int aV() {
        return this.ae.o(bvjk.ei, this.ai.a().j(), true) ? R.string.OFFLINE_MAPS_SETTINGS_STORAGE_SETTINGS_PHONE_TITLE : R.string.OFFLINE_MAPS_SETTINGS_STORAGE_SETTINGS_SD_TITLE;
    }

    public final awfu aW() {
        return new awfu(this.ad, this.ak);
    }

    public final awfv aX() {
        return new awfv(this.ad, this.ak);
    }

    @Override // defpackage.aup
    public final void p(Bundle bundle) {
        PreferenceScreen b = this.b.b(this.ad);
        e(b);
        deha.q(this.an.a(), new awft(this, b), this.ao);
    }

    @Override // defpackage.bszv
    public final void w() {
        dxix.a(this);
    }
}

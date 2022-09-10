package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: sxn  reason: default package */
/* loaded from: classes7.dex */
public class sxn implements sun {
    public sur a = sur.SERVICE_ONLINE;
    private final Activity b;
    private final sus c;
    private final btvo d;

    public sxn(Activity activity, cqhn cqhnVar, btvo btvoVar, Executor executor, sus susVar) {
        this.b = activity;
        this.d = btvoVar;
        this.c = susVar;
        deha.q(susVar.b(), new sxm(this), executor);
    }

    private final void h(int i) {
        View findViewById = this.b.findViewById(16908290);
        if (findViewById == null) {
            return;
        }
        ckos.b(findViewById, i, 0).c();
    }

    @Override // defpackage.sun
    public cqtd a() {
        return cqrt.f(2131232778);
    }

    @Override // defpackage.sun
    public String b() {
        if (this.d.getEnableFeatureParameters().aH) {
            return this.b.getString(R.string.ARWN_LIVE_VIEW);
        }
        return this.b.getString(R.string.ARWN_START_AR);
    }

    @Override // defpackage.sun
    public String c() {
        return sum.a(this);
    }

    @Override // defpackage.sun
    @dzsi
    public cjtd d() {
        return cjtd.a(dtxn.ah);
    }

    @Override // defpackage.sun
    public cqkl e() {
        sur c = this.c.c();
        if (c == sur.DEVICE_OFFLINE) {
            h(R.string.ARWN_SNACKBAR_NO_NETWORK_CONNECTIVITY);
        } else if (c != sur.SERVICE_ONLINE) {
            h(R.string.ARWN_UNAVAILABLE_AREA_DIRECTIONS);
        }
        if (this.a != c) {
            this.a = c;
            cqkx.p(this);
        }
        return cqkl.a;
    }

    @Override // defpackage.sun
    public Boolean f() {
        return sum.c();
    }

    @Override // defpackage.sun
    public Boolean g() {
        return Boolean.valueOf(this.a != sur.SERVICE_ONLINE);
    }
}

package defpackage;

import com.google.android.apps.youtube.app.settings.OfflinePrefsFragment;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lgk  reason: default package */
/* loaded from: classes3.dex */
public final class lgk implements afzf {
    final /* synthetic */ String a;
    final /* synthetic */ Boolean b;
    final /* synthetic */ OfflinePrefsFragment c;

    public lgk(OfflinePrefsFragment offlinePrefsFragment, String str, Boolean bool) {
        this.c = offlinePrefsFragment;
        this.a = str;
        this.b = bool;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.c.aL(R.string.pref_cross_device_offline_error);
        this.c.ov("cross_device_offline").G(true);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        aser aserVar = (aser) obj;
        ylx.k(this.c.ai.a.b(new fct(this.a, 1)), anjk.a, jou.q, lgj.a);
        ylx.k(this.c.ai.a.b(new ehf(this.b.booleanValue(), 4)), anjk.a, jou.r, lgj.c);
        this.c.aL(R.string.pref_cross_device_offline_success);
        this.c.ov("cross_device_offline").G(true);
    }
}

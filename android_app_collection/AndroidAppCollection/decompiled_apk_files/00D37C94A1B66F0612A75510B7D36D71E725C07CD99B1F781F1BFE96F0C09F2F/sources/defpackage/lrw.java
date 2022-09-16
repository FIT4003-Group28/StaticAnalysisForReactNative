package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lrw  reason: default package */
/* loaded from: classes3.dex */
public final class lrw extends BroadcastReceiver {
    public final Activity a;
    public final fvf b;
    public final yve c;
    public final apy d;
    public boolean e;
    public PowerManager f;
    public fvl g;
    public final aacz h;
    private final fqd i;
    private final gfu j;

    public lrw(oa oaVar, apy apyVar, aacz aaczVar, fvf fvfVar, fqd fqdVar, gfu gfuVar, yve yveVar) {
        oaVar.getSavedStateRegistry().b("auto_dark_theme_bundle", new bli() { // from class: lrv
            @Override // defpackage.bli
            public final Bundle a() {
                lrw lrwVar = lrw.this;
                Bundle bundle = new Bundle();
                if (!emn.C(lrwVar.c)) {
                    bundle.putBoolean("auto_dark_theme_user_toggle", true);
                }
                return bundle;
            }
        });
        Bundle a = oaVar.getSavedStateRegistry().a("auto_dark_theme_bundle");
        this.a = oaVar;
        this.d = apyVar;
        this.h = aaczVar;
        this.b = fvfVar;
        this.i = fqdVar;
        fvl fvlVar = null;
        if (a != null && a.getBoolean("auto_dark_theme_snackbar_msg", false)) {
            fvg d = fvl.d();
            d.k(oaVar.getString(R.string.auto_switched_to_dark_theme));
            d.m(oaVar.getString(R.string.settings_button), new lru(this, 1));
            fvlVar = d.b();
        }
        this.g = fvlVar;
        this.j = gfuVar;
        this.c = yveVar;
        if ((a == null || !a.getBoolean("auto_dark_theme_user_toggle", false)) && ((gft) yveVar.c()).h) {
            ylx.n(apyVar, yveVar.b(lhh.n), lcz.t, ylx.b);
        }
    }

    public final boolean a() {
        PowerManager powerManager = this.f;
        return powerManager != null && powerManager.isPowerSaveMode();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!this.e || !"android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction()) || !this.i.b) {
            return;
        }
        if (this.j.a() == (a() ? gfs.DARK : gfs.LIGHT) || !a()) {
            return;
        }
        fvf fvfVar = this.b;
        fvg d = fvl.d();
        d.k(this.a.getString(R.string.switch_to_dark_theme));
        d.m(this.a.getString(R.string.settings_button), new lru(this));
        fvfVar.i(d.b());
    }
}

package defpackage;

import android.app.Activity;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abji  reason: default package */
/* loaded from: classes.dex */
public final class abji implements aafl {
    private final Activity a;
    private final afvn b;
    private final afwc c;

    public abji(Activity activity, afvn afvnVar, afwc afwcVar) {
        this.a = activity;
        this.b = afvnVar;
        this.c = afwcVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (!this.b.t()) {
            this.c.c(this.a, null, null);
            return;
        }
        assu assuVar = (assu) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", assu.class);
        eo supportFragmentManager = ((dt) this.a).getSupportFragmentManager();
        dp f = supportFragmentManager.f("purchase_dialog_fragment");
        if (f == null) {
            abse.e(apzgVar, assuVar, null).qv(supportFragmentManager, "purchase_dialog_fragment");
        } else {
            ((ablp) f).aG(abse.f(apzgVar, assuVar, null));
        }
    }
}

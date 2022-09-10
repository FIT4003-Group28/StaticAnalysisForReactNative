package defpackage;

import android.widget.ImageView;
import com.google.android.apps.gmm.ar.api.ArLauncherParams;
import com.google.android.apps.maps.R;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: dpd  reason: default package */
/* loaded from: classes6.dex */
final class dpd implements degu<dsw> {
    final /* synthetic */ drq a;
    final /* synthetic */ dpe b;

    public dpd(dpe dpeVar, drq drqVar) {
        this.b = dpeVar;
        this.a = drqVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dsw dswVar) {
        czp o = ArLauncherParams.p(czh.LIGHTHOUSE, dswVar.b, Collections.emptyList()).o();
        o.j(doi.ONBOARDING_LIGHTHOUSE);
        o.i(ImageView.ScaleType.CENTER_INSIDE);
        o.o(czq.DIRECTIONS_OVERLAY, this.b.b.a.getString(R.string.LH_CONSENT_DIRECTIONS_OVERLAY_TITLE));
        o.n(czq.DIRECTIONS_OVERLAY, this.b.b.a.getString(R.string.LH_CONSENT_DIRECTIONS_OVERLAY_DESCRIPTION));
        drq drqVar = this.a;
        dpg dpgVar = this.b.b;
        if (dph.e(dpgVar.b, dpgVar.f) && this.b.a.a()) {
            dpe dpeVar = this.b;
            if (dpeVar.b.b(dpeVar.a.b())) {
                o.h(true);
                o.f(true);
                if (drqVar.g() == 1) {
                    drp e = drqVar.e();
                    e.b(true);
                    drqVar = e.a();
                }
            }
        }
        this.b.b.d.b().b(o.d(), drqVar);
    }
}

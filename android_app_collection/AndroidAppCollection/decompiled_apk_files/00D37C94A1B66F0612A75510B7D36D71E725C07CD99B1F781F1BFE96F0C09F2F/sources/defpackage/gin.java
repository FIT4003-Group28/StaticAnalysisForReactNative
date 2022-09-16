package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gin  reason: default package */
/* loaded from: classes3.dex */
public final class gin implements aafl {
    private final Activity a;
    private final yni b;
    private final emp c;
    private final evm d;
    private final aadd e;
    private final ohp f;

    public gin(Activity activity, yni yniVar, emp empVar, ohp ohpVar, evm evmVar, aadd aaddVar) {
        this.a = activity;
        this.b = yniVar;
        this.c = empVar;
        this.f = ohpVar;
        this.d = evmVar;
        this.e = aaddVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        asxp asxpVar = this.e.a().e;
        if (asxpVar == null) {
            asxpVar = asxp.a;
        }
        acvg a = asxpVar.ah ? this.d.a() : null;
        aijl d = PlaybackStartDescriptor.d();
        d.a = apzgVar;
        PlaybackStartDescriptor a2 = d.a();
        fec fecVar = (fec) zew.K(map, "PLAYBACK_START_DESCRIPTOR_MUTATOR", fec.class);
        if (fecVar != null) {
            fecVar.a(a2);
        }
        int i = 0;
        int intValue = ((Integer) zew.J(map, "com.google.android.apps.youtube.app.endpoint.flags", 0)).intValue();
        Bundle bundle = (Bundle) zew.K(map, "com.google.android.libraries.youtube.innertube.bundle", Bundle.class);
        boolean z = true;
        boolean z2 = (intValue & 32) != 0;
        boolean booleanValue = ((Boolean) zew.J(map, "force_fullscreen", false)).booleanValue();
        boolean booleanValue2 = ((Boolean) zew.J(map, "OVERRIDE_EXIT_FULLSCREEN_TO_MAXIMIZED", false)).booleanValue();
        boolean z3 = (intValue & 2) != 0;
        int i2 = intValue & 1;
        if ((intValue & 8) == 0) {
            z = false;
        }
        ezt b = ezu.b();
        WatchDescriptor watchDescriptor = new WatchDescriptor(a2);
        watchDescriptor.e(z3);
        watchDescriptor.f(z);
        watchDescriptor.d(booleanValue);
        if (i2 != 0 && bundle != null) {
            watchDescriptor.c(bundle);
        }
        b.f(watchDescriptor);
        b.b(booleanValue2);
        b.g((View) zew.I(map, "VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY"));
        b.a = (avhn) zew.I(map, "VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY");
        b.c(z2);
        if (a2.a.z || ((Boolean) zew.J(map, "ALLOW_RELOAD", false)).booleanValue()) {
            i = 3;
        } else if (!a2.t() && a2.c() > 0) {
            i = 2;
        }
        b.d(i);
        b.e(((Boolean) zew.J(map, "START_SHUFFLED", false)).booleanValue());
        ezu a3 = b.a();
        this.b.d(new ewr());
        emp empVar = this.c;
        if (empVar != null) {
            empVar.pt(a3, ampq.i(a));
            return;
        }
        Intent a4 = this.f.a();
        a4.setFlags(67108864);
        a4.putExtra("watch", a3.a);
        this.a.startActivity(a4);
    }
}

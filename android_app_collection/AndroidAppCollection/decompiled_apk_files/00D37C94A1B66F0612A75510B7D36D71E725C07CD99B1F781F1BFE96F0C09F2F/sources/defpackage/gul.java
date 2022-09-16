package defpackage;

import android.os.Bundle;
import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gul  reason: default package */
/* loaded from: classes3.dex */
public final class gul implements aafl {
    private final dt a;
    private final SfvAudioItemPlaybackController b;
    private final aafo c;
    private final gtm d;
    private final igr e;
    private final Map f;
    private final acth g;
    private final zrg h;

    public gul(dt dtVar, SfvAudioItemPlaybackController sfvAudioItemPlaybackController, aafo aafoVar, gtm gtmVar, igr igrVar, zrg zrgVar, Map map, acth acthVar, byte[] bArr) {
        this.a = dtVar;
        this.b = sfvAudioItemPlaybackController;
        this.c = aafoVar;
        this.d = gtmVar;
        this.e = igrVar;
        this.f = map;
        this.h = zrgVar;
        this.g = acthVar;
    }

    private static boolean b(apnv apnvVar) {
        String str = apnvVar.c;
        return str.equals("FEsfv_audio_pivot") || str.equals("FEsfv_hashtag_pivot") || str.equals("FEsfv_channel_pivot") || str.equals("FEsfv_analytics_screen") || str.equals("FEproduct_details") || str.equals("FEcommerce_cart");
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aqxo.p(apzgVar.qn(BrowseEndpointOuterClass.browseEndpoint));
        apnv apnvVar = (apnv) apzgVar.qm(BrowseEndpointOuterClass.browseEndpoint);
        if (this.e.I()) {
            this.e.z();
        }
        if (b(apnvVar) || apnvVar.c.equals("FEsfv_audio_picker")) {
            if (b(apnvVar)) {
                this.g.oi().t();
                this.d.e(apzgVar, new Bundle());
                return;
            }
            guo aG = guo.aG(apzgVar);
            eo supportFragmentManager = this.a.getSupportFragmentManager();
            aG.X.c(this.b);
            amzs it = amvn.p(this.h.a).iterator();
            while (it.hasNext()) {
                aG.X.c((apx) it.next());
            }
            ex l = supportFragmentManager.l();
            if (this.f.containsKey(this.a.getClass())) {
                gyy gyyVar = (gyy) ((azqb) this.f.get(this.a.getClass())).get();
                l.q(R.id.accessibility_layer_container, aG, "ReelBrowseFragmentTag");
            } else {
                l.u(16908290, aG, "ReelBrowseFragmentTag");
            }
            l.s();
            l.a();
            supportFragmentManager.ab();
            return;
        }
        this.c.a(apzgVar);
    }
}

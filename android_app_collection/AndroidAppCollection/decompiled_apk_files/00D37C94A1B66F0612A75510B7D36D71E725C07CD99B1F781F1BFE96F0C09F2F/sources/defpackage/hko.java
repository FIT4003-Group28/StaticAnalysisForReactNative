package defpackage;

import android.os.Bundle;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.LightweightCameraEndpointOuterClass$LightweightCameraEndpoint;
import com.google.protos.youtube.api.innertube.ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint;
import com.google.protos.youtube.api.innertube.ReelEditVideoRendererOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: hko  reason: default package */
/* loaded from: classes3.dex */
public final class hko implements aafl {
    private final hnv a;

    public hko(hnv hnvVar) {
        this.a = hnvVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        RecordingInfo recordingInfo = (RecordingInfo) zew.K(map, "recording_info", RecordingInfo.class);
        apzg apzgVar2 = (apzg) zew.K(map, "destination_endpoint", apzg.class);
        String str = (String) zew.K(map, "fragment_tag", String.class);
        zsn zsnVar = (zsn) zew.K(map, "kazoo_effects_loader", zsn.class);
        axbm axbmVar = (axbm) zew.K(map, "comment_sticker", axbm.class);
        hnv hnvVar = this.a;
        aunb aunbVar = ((ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint) apzgVar.qm(ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.reelEditVideoEndpoint)).b;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        aula aulaVar = (aula) aunbVar.qm(ReelEditVideoRendererOuterClass.reelEditVideoRenderer);
        if (hnvVar.a != null) {
            hnu hnuVar = new hnu();
            zsnVar.getClass();
            Bundle bundle = new Bundle();
            bundle.putParcelable("RECORDING_INFO", recordingInfo);
            if (apzgVar2 != null) {
                bundle.putByteArray("NAVIGATION_ENDPOINT", apzgVar2.toByteArray());
            }
            if (apzgVar != null) {
                bundle.putByteArray("REEL_EDIT_VIDEO_ENDPOINT_KEY", apzgVar.toByteArray());
            }
            if (aulaVar != null) {
                bundle.putByteArray("VIDEO_EDIT_RENDERER", aulaVar.toByteArray());
            }
            if (axbmVar != null) {
                bundle.putByteArray("comment_sticker", axbmVar.toByteArray());
            }
            if (zsnVar.i() == null) {
                zsnVar.e(null);
            }
            hnuVar.bd(zsnVar.a(avxv.EFFECTS_FEATURE_KAZOO_TEXT_REELS_EDIT), zsnVar.a(avxv.EFFECTS_FEATURE_ADVANCED_TEXT_REELS_EDIT), zsnVar.a(avxv.EFFECTS_FEATURE_TEXT_BG_ROUNDED_CORNERS));
            hnuVar.a = zsnVar.a(avxv.EFFECTS_FEATURE_KAZOO_OUTPUT_EVENTS);
            hnuVar.bB(zsnVar);
            hnuVar.bA(zsnVar);
            hnuVar.bI(zsnVar.i(), zsnVar.b);
            hnuVar.aQ = true;
            hnuVar.aR = 2;
            hnuVar.aP = 1;
            if (apzgVar2 != null && apzgVar2.qn(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint)) {
                hnuVar.bC(((LightweightCameraEndpointOuterClass$LightweightCameraEndpoint) apzgVar2.qm(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint)).c * 1000000);
            }
            hnuVar.ae(bundle);
            ex l = hnvVar.a.l();
            l.u(R.id.reel_container, hnuVar, str);
            l.a();
            return;
        }
        zep.b("fragmentManager is null");
    }
}

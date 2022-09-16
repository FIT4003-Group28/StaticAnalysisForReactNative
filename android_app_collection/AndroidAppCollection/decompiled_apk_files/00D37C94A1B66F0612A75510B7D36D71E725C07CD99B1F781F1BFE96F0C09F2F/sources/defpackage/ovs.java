package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ovs  reason: default package */
/* loaded from: classes4.dex */
public final class ovs implements Runnable {
    final /* synthetic */ oun a;
    final /* synthetic */ ovx b;

    public ovs(ovx ovxVar, oun ounVar) {
        this.b = ovxVar;
        this.a = ounVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aanm aanmVar;
        ovx ovxVar = this.b;
        ovt ovtVar = ovxVar.a;
        int i = ovxVar.b;
        oun ounVar = this.a;
        afdv afdvVar = (afdv) ovtVar;
        VideoStreamingData videoStreamingData = afdvVar.t;
        boolean z = (videoStreamingData == null || (aanmVar = videoStreamingData.k) == null || aanmVar.l == null) ? false : true;
        if (i != afdvVar.u() || !z) {
            return;
        }
        try {
            VideoStreamingData videoStreamingData2 = ((afdv) ovtVar).t;
            PlayerConfigModel playerConfigModel = ((afdv) ovtVar).x;
            long[] b = ounVar.b();
            b[1] = Math.max(b[0], b[1] - (((owf) videoStreamingData2.k.l).c ? afdv.A(videoStreamingData2) : 0L));
            ((afdv) ovtVar).f.k(b[0], b[1]);
        } catch (afdk unused) {
            afdvVar.V(new afkn("manifest.unparseable", afdvVar.g()));
        }
    }
}

package defpackage;

import android.os.Bundle;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: hye  reason: default package */
/* loaded from: classes3.dex */
public final class hye implements aafl {
    private final igh a;
    private final zey b;
    private final amqo c;
    private final gtm d;

    public hye(igh ighVar, zey zeyVar, amqo amqoVar, gtm gtmVar) {
        this.a = ighVar;
        this.b = zeyVar;
        this.c = amqoVar;
        this.d = gtmVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aqxo.p(apzgVar.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
        aijl d = PlaybackStartDescriptor.d();
        d.a = apzgVar;
        PlaybackStartDescriptor a = d.a();
        Object obj = this.c.get();
        if (obj != null && ((aull) obj).j) {
            this.a.d(apzgVar, a.h(this.b), false, false, afzj.a);
        }
        apzg b = this.d.b();
        if (b == null || !b.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            gtm gtmVar = this.d;
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.google.android.apps.youtube.PlaybackStartDescriptor", a);
            gtmVar.e(apzgVar, bundle);
        }
    }
}

package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: iwx  reason: default package */
/* loaded from: classes3.dex */
public final class iwx implements aafl {
    private final Context a;
    private final adoa b;

    public iwx(Context context, adoa adoaVar) {
        this.a = context;
        adoaVar.getClass();
        this.b = adoaVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        String str = ((RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint) apzgVar.qm(RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.removeFromRemoteQueueEndpoint)).b;
        adnt e = this.b.e();
        if (e == null || e.a() != 1) {
            return;
        }
        e.O(str);
        zag.q(this.a, R.string.video_removed_from_tv_queue, 0);
    }
}

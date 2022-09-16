package defpackage;

import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UnsubscribeEndpointOuterClass$UnsubscribeEndpoint;
/* compiled from: PG */
/* renamed from: xzx  reason: default package */
/* loaded from: classes4.dex */
public final class xzx implements xzw {
    private final Runnable a;
    private final /* synthetic */ int b;

    public xzx(Runnable runnable) {
        this.a = runnable;
    }

    public xzx(Runnable runnable, int i) {
        this.b = i;
        this.a = runnable;
    }

    @Override // defpackage.xzw
    public final void a(apzg apzgVar) {
        if (this.b == 0) {
            if (apzgVar == null || !apzgVar.qn(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint)) {
                return;
            }
            this.a.run();
        } else if (apzgVar == null || !apzgVar.qn(BrowseEndpointOuterClass.browseEndpoint)) {
        } else {
            this.a.run();
        }
    }
}

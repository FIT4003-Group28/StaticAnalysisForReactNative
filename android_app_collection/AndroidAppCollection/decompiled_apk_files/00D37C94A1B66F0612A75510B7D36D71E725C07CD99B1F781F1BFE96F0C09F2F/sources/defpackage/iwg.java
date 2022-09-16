package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint;
/* compiled from: PG */
/* renamed from: iwg  reason: default package */
/* loaded from: classes3.dex */
public final class iwg extends iww {
    private final niz e;
    private final nxh f;
    private final boolean g;

    public iwg(adoa adoaVar, ailf ailfVar, yzj yzjVar, Context context, aios aiosVar, niz nizVar, nxh nxhVar, aacz aaczVar) {
        super(adoaVar, ailfVar, yzjVar, context, aiosVar);
        this.e = nizVar;
        this.f = nxhVar;
        atcj atcjVar = aaczVar.b().n;
        this.g = (atcjVar == null ? atcj.a : atcjVar).k;
    }

    @Override // defpackage.iww
    protected final String b(apzg apzgVar) {
        AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint addToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint = (AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint) apzgVar.qm(AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.addToRemoteQueueEndpoint);
        if (apzgVar.qn(AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.addToRemoteQueueEndpoint)) {
            return addToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.c;
        }
        throw new aafy("AddToRemoteQueueEndpoint not present in the given Command.");
    }

    @Override // defpackage.iww
    protected final String c(apzg apzgVar) {
        AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint addToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint = (AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint) apzgVar.qm(AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.addToRemoteQueueEndpoint);
        if (apzgVar.qn(AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.addToRemoteQueueEndpoint)) {
            return addToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.b;
        }
        throw new aafy("AddToRemoteQueueEndpoint not present in the given Command.");
    }

    @Override // defpackage.iww
    protected final void d(String str) {
        adnt f = f();
        if (f == null || f.a() != 1) {
            return;
        }
        f.y(str);
        if (this.g && this.f.c()) {
            this.e.r(1, 2);
        }
        zag.q(this.b, R.string.videos_added_to_tv_queue, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.iww
    public final void e(String str) {
        adnt f = f();
        if (f == null || f.a() != 1) {
            return;
        }
        f().A(str);
        if (this.g && this.f.c()) {
            this.e.r(1, 2);
        }
        zag.q(this.b, R.string.video_added_to_tv_queue, 0);
    }
}

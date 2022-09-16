package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint;
/* compiled from: PG */
/* renamed from: iwh  reason: default package */
/* loaded from: classes3.dex */
public final class iwh extends iww {
    public iwh(adoa adoaVar, ailf ailfVar, yzj yzjVar, Context context, aios aiosVar) {
        super(adoaVar, ailfVar, yzjVar, context, aiosVar);
    }

    @Override // defpackage.iww
    protected final String b(apzg apzgVar) {
        InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint insertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint = (InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint) apzgVar.qm(InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.insertInRemoteQueueEndpoint);
        if (apzgVar.qn(InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.insertInRemoteQueueEndpoint)) {
            return insertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.c;
        }
        throw new aafy("InsertInRemoteQueueEndpoint not present in the given Command.");
    }

    @Override // defpackage.iww
    protected final String c(apzg apzgVar) {
        InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint insertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint = (InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint) apzgVar.qm(InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.insertInRemoteQueueEndpoint);
        if (apzgVar.qn(InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.insertInRemoteQueueEndpoint)) {
            return insertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.b;
        }
        throw new aafy("InsertInRemoteQueueEndpoint not present in the given Command.");
    }

    @Override // defpackage.iww
    protected final void d(String str) {
        adnt f = f();
        if (f == null || f.a() != 1) {
            return;
        }
        f.F(str);
        zag.q(this.b, R.string.videos_added_to_tv_queue, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.iww
    public final void e(String str) {
        adnt f = f();
        if (f == null || f.a() != 1) {
            return;
        }
        f().G(str);
        zag.q(this.b, R.string.video_added_to_tv_queue, 0);
    }
}

package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;
/* compiled from: PG */
/* renamed from: ytg  reason: default package */
/* loaded from: classes4.dex */
final class ytg extends yrt {
    final /* synthetic */ yth b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ytg(yth ythVar, String str, yqm yqmVar, Executor executor) {
        super(yqmVar, executor);
        this.b = ythVar;
        this.a = str;
    }

    @Override // defpackage.yrt, org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        String str;
        if (this.b.a.b()) {
            super.onRequestFinished(requestFinishedInfo);
            str = "RequestFinishedListener is notified by Cronet. Notified wrapped listener.";
        } else {
            this.b.f = requestFinishedInfo;
            str = "RequestFinishedListener is notified by Cronet. Cached requestFinishedInfo.";
        }
        yth ythVar = this.b;
        ythVar.e.a(ythVar.d, requestFinishedInfo.getUrl(), str, requestFinishedInfo.getException());
    }
}

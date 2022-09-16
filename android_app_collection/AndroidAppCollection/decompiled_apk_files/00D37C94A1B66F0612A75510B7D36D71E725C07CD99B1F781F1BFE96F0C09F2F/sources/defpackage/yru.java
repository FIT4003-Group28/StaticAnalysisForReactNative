package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;
/* compiled from: PG */
/* renamed from: yru  reason: default package */
/* loaded from: classes4.dex */
public final class yru extends yrt {
    public yru(yqm yqmVar, Executor executor) {
        super(yqmVar, executor);
    }

    @Override // defpackage.yrt, org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        if (!requestFinishedInfo.getUrl().contains("initplayback")) {
            return;
        }
        super.onRequestFinished(requestFinishedInfo);
    }
}

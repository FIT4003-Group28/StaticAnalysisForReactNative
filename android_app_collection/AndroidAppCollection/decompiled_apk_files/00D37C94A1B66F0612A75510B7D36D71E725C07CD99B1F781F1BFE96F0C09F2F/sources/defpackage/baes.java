package defpackage;

import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.impl.CronetUrlRequest;
/* compiled from: PG */
/* renamed from: baes  reason: default package */
/* loaded from: classes2.dex */
public final class baes implements Runnable {
    final /* synthetic */ RequestFinishedInfo a;
    final /* synthetic */ CronetUrlRequest b;

    public baes(CronetUrlRequest cronetUrlRequest, RequestFinishedInfo requestFinishedInfo) {
        this.b = cronetUrlRequest;
        this.a = requestFinishedInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.e.onRequestFinished(this.a);
    }
}

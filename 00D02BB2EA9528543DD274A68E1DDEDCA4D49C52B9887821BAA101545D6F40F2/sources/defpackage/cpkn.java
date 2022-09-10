package defpackage;

import org.chromium.net.UrlRequest;
/* compiled from: PG */
/* renamed from: cpkn  reason: default package */
/* loaded from: classes5.dex */
public final class cpkn {
    public cpkj a;

    public final /* bridge */ /* synthetic */ UrlRequest.Callback a() {
        cpkj cpkjVar = this.a;
        if (cpkjVar != null) {
            return new cpko(cpkjVar);
        }
        throw new IllegalStateException("Handler argument may not be null.");
    }
}

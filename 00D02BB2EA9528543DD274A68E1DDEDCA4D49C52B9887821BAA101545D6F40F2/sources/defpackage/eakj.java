package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;
/* compiled from: PG */
/* renamed from: eakj  reason: default package */
/* loaded from: classes6.dex */
public abstract class eakj extends ExperimentalCronetEngine {
    /* JADX INFO: Access modifiers changed from: protected */
    public abstract eamg a(String str, UrlRequest.Callback callback, Executor executor, boolean z, boolean z2, int i, boolean z3, int i2);

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    /* renamed from: newUrlRequestBuilder */
    public final ExperimentalUrlRequest.Builder mo29newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return new eamh(str, callback, executor, this);
    }
}

package defpackage;

import org.chromium.net.UrlResponseInfo;
/* compiled from: PG */
/* renamed from: che  reason: default package */
/* loaded from: classes2.dex */
final class che extends chh {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ chf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public che(chf chfVar, cfv cfvVar, UrlResponseInfo urlResponseInfo) {
        super(cfvVar);
        this.b = chfVar;
        this.a = urlResponseInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.a, null, true, null);
    }
}

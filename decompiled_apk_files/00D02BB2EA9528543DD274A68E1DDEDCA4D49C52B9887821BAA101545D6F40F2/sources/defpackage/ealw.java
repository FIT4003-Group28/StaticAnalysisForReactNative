package defpackage;

import org.chromium.net.UrlResponseInfo;
/* compiled from: PG */
/* renamed from: ealw  reason: default package */
/* loaded from: classes6.dex */
final class ealw implements Runnable {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ ealy b;

    public ealw(ealy ealyVar, UrlResponseInfo urlResponseInfo) {
        this.b = ealyVar;
        this.a = urlResponseInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ealy ealyVar = this.b;
            ealyVar.a.onSucceeded(ealyVar.d, this.a);
        } catch (Exception unused) {
        }
    }
}

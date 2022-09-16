package defpackage;

import org.chromium.net.UrlRequest;
/* compiled from: PG */
/* renamed from: atm  reason: default package */
/* loaded from: classes2.dex */
final class atm extends UrlRequest.StatusListener {
    final /* synthetic */ int[] a;
    final /* synthetic */ pvt b;

    public atm(int[] iArr, pvt pvtVar) {
        this.a = iArr;
        this.b = pvtVar;
    }

    @Override // org.chromium.net.UrlRequest.StatusListener
    public final void onStatus(int i) {
        this.a[0] = i;
        this.b.e();
    }
}

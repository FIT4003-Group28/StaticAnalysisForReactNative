package defpackage;

import org.chromium.net.UrlResponseInfo;
/* compiled from: PG */
/* renamed from: bafv  reason: default package */
/* loaded from: classes2.dex */
final class bafv implements bage {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ String b;
    final /* synthetic */ baga c;

    public bafv(baga bagaVar, UrlResponseInfo urlResponseInfo, String str) {
        this.c = bagaVar;
        this.a = urlResponseInfo;
        this.b = str;
    }

    @Override // defpackage.bage
    public final void a() {
        baga bagaVar = this.c;
        bagaVar.a.onRedirectReceived(bagaVar.d, this.a, this.b);
    }
}

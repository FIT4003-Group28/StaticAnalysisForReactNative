package defpackage;

import org.chromium.net.UrlResponseInfo;
/* compiled from: PG */
/* renamed from: bta  reason: default package */
/* loaded from: classes4.dex */
final class bta extends btd {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ btb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bta(btb btbVar, bro broVar, UrlResponseInfo urlResponseInfo) {
        super(broVar);
        this.b = btbVar;
        this.a = urlResponseInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.a, null, true, null);
    }
}

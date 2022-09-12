package defpackage;

import org.chromium.net.UrlResponseInfo;
/* compiled from: PG */
/* renamed from: eals  reason: default package */
/* loaded from: classes6.dex */
final class eals implements eamd {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ String b;
    final /* synthetic */ ealy c;

    public eals(ealy ealyVar, UrlResponseInfo urlResponseInfo, String str) {
        this.c = ealyVar;
        this.a = urlResponseInfo;
        this.b = str;
    }

    @Override // defpackage.eamd
    public final void a() {
        ealy ealyVar = this.c;
        ealyVar.a.onRedirectReceived(ealyVar.d, this.a, this.b);
    }
}

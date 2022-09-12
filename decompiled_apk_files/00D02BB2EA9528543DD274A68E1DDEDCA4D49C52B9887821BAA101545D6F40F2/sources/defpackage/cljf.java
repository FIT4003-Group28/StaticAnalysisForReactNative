package defpackage;

import org.chromium.net.UrlRequest;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cljf  reason: default package */
/* loaded from: classes5.dex */
public final class cljf implements cllg {
    public final UrlRequest.Builder a;
    public final dehn<clli> b;

    public cljf(UrlRequest.Builder builder, dehn<clli> dehnVar) {
        this.a = builder;
        this.b = dehnVar;
    }

    @Override // defpackage.cllg
    public final cllh a() {
        return new clje(this);
    }

    @Override // defpackage.cllg
    public final void b(String str, String str2) {
        this.a.mo41addHeader(str, str2);
    }
}

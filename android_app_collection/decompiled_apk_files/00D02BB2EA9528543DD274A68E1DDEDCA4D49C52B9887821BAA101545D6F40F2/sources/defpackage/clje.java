package defpackage;

import org.chromium.net.UrlRequest;
/* compiled from: PG */
/* renamed from: clje  reason: default package */
/* loaded from: classes5.dex */
final class clje implements cllh {
    public final UrlRequest a;
    public final dehn<clli> b;

    public clje(cljf cljfVar) {
        this.a = cljfVar.a.mo43build();
        dehn<clli> dehnVar = cljfVar.b;
        this.b = dehnVar;
        dehnVar.Pk(new Runnable(this) { // from class: cljd
            private final clje a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                clje cljeVar = this.a;
                if (cljeVar.b.isCancelled()) {
                    cljeVar.a.cancel();
                }
            }
        }, dege.a);
    }

    @Override // defpackage.cllh
    public final dehn<clli> a() {
        this.a.start();
        return this.b;
    }
}

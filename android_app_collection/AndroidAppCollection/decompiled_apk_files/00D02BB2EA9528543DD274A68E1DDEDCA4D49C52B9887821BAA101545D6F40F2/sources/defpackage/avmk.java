package defpackage;
/* compiled from: PG */
/* renamed from: avmk  reason: default package */
/* loaded from: classes3.dex */
public final class avmk implements avnr {
    public final dbty<? extends awck> a;
    private final awmu b;

    public avmk(awmu awmuVar, dbty<? extends awck> dbtyVar) {
        this.b = awmuVar;
        this.a = dbtyVar;
    }

    @Override // defpackage.avnr
    public final dehn<dwbc> a(final dlvc dlvcVar, final dvgi dvgiVar, final dwaw dwawVar, final dwbc dwbcVar, final int i) {
        return deee.h(degp.q(this.b.b("getReroute", new awmt(this, dlvcVar, dvgiVar, dwawVar, dwbcVar, i) { // from class: avmi
            private final avmk a;
            private final dlvc b;
            private final dvgi c;
            private final dwaw d;
            private final dwbc e;
            private final int f;

            {
                this.a = this;
                this.b = dlvcVar;
                this.c = dvgiVar;
                this.d = dwawVar;
                this.e = dwbcVar;
                this.f = i;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                avmk avmkVar = this.a;
                dlvc dlvcVar2 = this.b;
                dvgi dvgiVar2 = this.c;
                dwaw dwawVar2 = this.d;
                dwbc dwbcVar2 = this.e;
                byte[] k = avmkVar.a.a().k(dlvcVar2.bS(), dvgiVar2.bS(), dwawVar2.bS(), dwbcVar2.bS(), this.f);
                if (k != null) {
                    try {
                        return (dwbc) dsqw.cq(dwbc.g, k);
                    } catch (dsrm e) {
                        throw new avlo(drtc.INTERNAL, e);
                    }
                }
                throw new avlo(drtc.INTERNAL, "null response from backend");
            }
        })), awmq.class, avmj.a, this.b.a);
    }
}

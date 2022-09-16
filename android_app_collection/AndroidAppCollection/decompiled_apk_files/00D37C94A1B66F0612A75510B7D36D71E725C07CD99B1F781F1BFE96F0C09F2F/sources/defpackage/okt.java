package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: okt  reason: default package */
/* loaded from: classes3.dex */
public final class okt implements akev {
    final /* synthetic */ oku a;
    private final /* synthetic */ int b;

    public okt(oku okuVar) {
        this.a = okuVar;
    }

    public okt(oku okuVar, int i) {
        this.b = i;
        this.a = okuVar;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void le(Object obj, int i) {
        if (this.b == 0) {
            akfq akfqVar = (akfq) obj;
        } else {
            akfq akfqVar2 = (akfq) obj;
        }
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void lf(Object obj) {
        if (this.b == 0) {
            akfq akfqVar = (akfq) obj;
            oku okuVar = this.a;
            ylx.n(okuVar.c, ((yve) okuVar.b.get()).b(new ampg() { // from class: oks
                @Override // defpackage.ampg
                public final Object apply(Object obj2) {
                    okt oktVar = okt.this;
                    aopa mo52toBuilder = ((okz) obj2).mo52toBuilder();
                    long c = oktVar.a.a.c();
                    mo52toBuilder.copyOnWrite();
                    okz okzVar = (okz) mo52toBuilder.instance;
                    okzVar.b |= 4;
                    okzVar.e = c;
                    return (okz) mo52toBuilder.mo39build();
                }
            }), mbi.k, ylx.b);
            return;
        }
        akfq akfqVar2 = (akfq) obj;
        oku okuVar2 = this.a;
        ylx.n(okuVar2.c, ((yve) okuVar2.b.get()).b(meo.o), mbi.j, ylx.b);
    }
}

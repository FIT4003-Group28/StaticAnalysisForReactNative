package defpackage;
/* compiled from: PG */
/* renamed from: kju  reason: default package */
/* loaded from: classes3.dex */
final class kju implements ampg {
    private final long a;

    public kju(long j) {
        this.a = j;
    }

    @Override // defpackage.ampg
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        kkb kkbVar = (kkb) obj;
        aopa mo52toBuilder = kkbVar.mo52toBuilder();
        long j = this.a;
        mo52toBuilder.copyOnWrite();
        kkb kkbVar2 = (kkb) mo52toBuilder.instance;
        kkbVar2.b |= 4;
        kkbVar2.e = j;
        long j2 = kkbVar.f;
        mo52toBuilder.copyOnWrite();
        kkb kkbVar3 = (kkb) mo52toBuilder.instance;
        kkbVar3.b |= 8;
        kkbVar3.f = j2 + 1;
        return (kkb) mo52toBuilder.mo39build();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: vpc  reason: default package */
/* loaded from: classes4.dex */
final class vpc implements voz {
    long a = 0;

    @Override // defpackage.voz
    public final aoej a() {
        aopa createBuilder = aoej.a.createBuilder();
        long j = this.a;
        createBuilder.copyOnWrite();
        aoej aoejVar = (aoej) createBuilder.instance;
        aoejVar.b = 1;
        aoejVar.c = Long.valueOf(j);
        return (aoej) createBuilder.mo39build();
    }

    @Override // defpackage.voz
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a += ((Long) obj).longValue();
    }

    public final String toString() {
        return Long.toString(this.a);
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: alea  reason: default package */
/* loaded from: classes.dex */
final class alea implements akzs {
    private final long a;
    private final long b;

    public alea(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.akzs
    public final alcw a(alcw alcwVar) {
        if (alcwVar != null) {
            aopa mo52toBuilder = alcwVar.mo52toBuilder();
            long j = this.a;
            mo52toBuilder.copyOnWrite();
            alcw alcwVar2 = (alcw) mo52toBuilder.instance;
            alcwVar2.b |= 268435456;
            alcwVar2.A = j;
            long j2 = this.b;
            mo52toBuilder.copyOnWrite();
            alcw alcwVar3 = (alcw) mo52toBuilder.instance;
            alcwVar3.b |= 536870912;
            alcwVar3.B = j2;
            return (alcw) mo52toBuilder.mo39build();
        }
        return null;
    }
}

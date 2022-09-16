package defpackage;
/* compiled from: PG */
/* renamed from: aleb  reason: default package */
/* loaded from: classes.dex */
final class aleb implements akzs {
    private final long a;

    public aleb(long j) {
        this.a = j;
    }

    @Override // defpackage.akzs
    public final alcw a(alcw alcwVar) {
        if (alcwVar != null) {
            aopa mo52toBuilder = alcwVar.mo52toBuilder();
            long j = this.a;
            mo52toBuilder.copyOnWrite();
            alcw alcwVar2 = (alcw) mo52toBuilder.instance;
            alcwVar2.b |= 1073741824;
            alcwVar2.C = j;
            return (alcw) mo52toBuilder.mo39build();
        }
        return null;
    }
}

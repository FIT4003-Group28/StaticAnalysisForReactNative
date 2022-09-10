package defpackage;
/* compiled from: PG */
/* renamed from: crod  reason: default package */
/* loaded from: classes5.dex */
final class crod {
    @dzsi
    public final ckcp a;
    @dzsi
    public final ckcp b;
    public long c;

    public crod(ckcw ckcwVar, croc crocVar) {
        croc crocVar2 = croc.IDLE;
        ckha ckhaVar = crocVar.h;
        ckcp ckcpVar = null;
        this.a = ckhaVar != null ? (ckcp) ckcwVar.a(ckhaVar) : null;
        ckha ckhaVar2 = crocVar.i;
        this.b = ckhaVar2 != null ? (ckcp) ckcwVar.a(ckhaVar2) : ckcpVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(crod crodVar, long j) {
        crodVar.c += j;
    }
}

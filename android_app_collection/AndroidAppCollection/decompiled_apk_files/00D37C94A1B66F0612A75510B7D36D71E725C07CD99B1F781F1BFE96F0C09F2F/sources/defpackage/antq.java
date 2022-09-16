package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: antq  reason: default package */
/* loaded from: classes.dex */
public final class antq extends antp {
    private final long[] d;

    antq() {
        super(new long[10], new long[10], new long[10]);
        this.d = new long[10];
    }

    @Override // defpackage.antp
    public final void b(long[] jArr, long[] jArr2) {
        anue.a(jArr, jArr2, this.d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public antq(antt anttVar) {
        super(new long[10], new long[10], new long[10]);
        long[] jArr = new long[10];
        this.d = jArr;
        long[] jArr2 = this.a;
        ants antsVar = anttVar.a;
        anue.f(jArr2, antsVar.b, antsVar.a);
        long[] jArr3 = this.b;
        ants antsVar2 = anttVar.a;
        anue.e(jArr3, antsVar2.b, antsVar2.a);
        System.arraycopy(anttVar.a.c, 0, jArr, 0, 10);
        anue.a(this.c, anttVar.b, antw.b);
    }
}

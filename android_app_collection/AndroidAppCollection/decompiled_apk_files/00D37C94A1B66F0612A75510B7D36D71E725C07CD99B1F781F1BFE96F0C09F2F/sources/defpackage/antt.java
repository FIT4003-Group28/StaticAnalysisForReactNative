package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: antt  reason: default package */
/* loaded from: classes.dex */
public final class antt {
    final ants a;
    final long[] b;

    public antt() {
        this(new ants(), new long[10]);
    }

    public antt(ants antsVar, long[] jArr) {
        this.a = antsVar;
        this.b = jArr;
    }

    public static void a(antt anttVar, antr antrVar) {
        anue.a(anttVar.a.a, antrVar.a.a, antrVar.b);
        long[] jArr = anttVar.a.b;
        ants antsVar = antrVar.a;
        anue.a(jArr, antsVar.b, antsVar.c);
        anue.a(anttVar.a.c, antrVar.a.c, antrVar.b);
        long[] jArr2 = anttVar.b;
        ants antsVar2 = antrVar.a;
        anue.a(jArr2, antsVar2.a, antsVar2.b);
    }

    public antt(antr antrVar) {
        this();
        a(this, antrVar);
    }
}

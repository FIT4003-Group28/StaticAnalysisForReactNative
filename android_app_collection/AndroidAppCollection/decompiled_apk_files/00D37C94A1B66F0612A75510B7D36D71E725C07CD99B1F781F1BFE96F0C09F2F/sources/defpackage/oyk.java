package defpackage;
/* compiled from: PG */
/* renamed from: oyk  reason: default package */
/* loaded from: classes4.dex */
abstract class oyk {
    protected final oyf a;
    public long b = -1;

    /* JADX INFO: Access modifiers changed from: protected */
    public oyk(oyf oyfVar) {
        this.a = oyfVar;
    }

    protected abstract void a(pct pctVar, long j);

    protected abstract boolean b(pct pctVar);

    public final void c(pct pctVar, long j) {
        if (b(pctVar)) {
            a(pctVar, j);
        }
    }
}

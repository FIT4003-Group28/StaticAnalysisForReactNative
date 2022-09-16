package defpackage;
/* compiled from: PG */
/* renamed from: amkm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class amkm implements amlw {
    public final /* synthetic */ amkr a;
    private final /* synthetic */ int b;

    public /* synthetic */ amkm(amkr amkrVar, int i) {
        this.b = i;
        this.a = amkrVar;
    }

    @Override // defpackage.amlw, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.b;
        if (i == 0) {
            amkr amkrVar = this.a;
            amkrVar.o();
            amkrVar.m();
            amkrVar.a = null;
        } else if (i == 1) {
            amkr amkrVar2 = this.a;
            amkrVar2.o();
            amkrVar2.m();
        } else if (i == 2) {
            amkr amkrVar3 = this.a;
            amkrVar3.a = null;
            amna.e(amkrVar3.b);
            amkrVar3.b = null;
        } else {
            this.a.o();
        }
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: bqak  reason: default package */
/* loaded from: classes4.dex */
final class bqak implements Runnable {
    final /* synthetic */ bqam a;

    public bqak(bqam bqamVar) {
        this.a = bqamVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final bqca bqcaVar = this.a.ai;
        akqq a = bqcaVar.d.a();
        if (a != null) {
            bqcaVar.j.m(a);
            bqcaVar.f.execute(new Runnable(bqcaVar) { // from class: bqbo
                private final bqca a;

                {
                    this.a = bqcaVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.g();
                }
            });
        }
        this.a.ak.d();
        this.a.e.b(this);
    }
}

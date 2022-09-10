package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vlx  reason: default package */
/* loaded from: classes7.dex */
public final class vlx<I, O> implements btzp<I, O> {
    private final btpc a;
    private final bvrb b;
    private final btzp<I, O> c;

    public vlx(btpc btpcVar, bvrb bvrbVar, btzp<I, O> btzpVar) {
        this.a = btpcVar;
        this.b = bvrbVar;
        this.c = btzpVar;
    }

    @Override // defpackage.btzp
    public final btzc a(I i, btzi<I, O> btziVar, bvrj bvrjVar) {
        return b(i, btziVar, bvgr.a(this.b, bvrjVar));
    }

    @Override // defpackage.btzp
    public final btzc b(final I i, final btzi<I, O> btziVar, Executor executor) {
        if (!this.a.i()) {
            executor.execute(new Runnable(btziVar, i) { // from class: vlv
                private final btzi a;
                private final Object b;

                {
                    this.a = btziVar;
                    this.b = i;
                }

                /* JADX WARN: Type inference failed for: r1v0, types: [I, java.lang.Object] */
                @Override // java.lang.Runnable
                public final void run() {
                    btzi btziVar2 = this.a;
                    ?? r1 = this.b;
                    btzq a = btzr.a();
                    a.a = r1;
                    a.e = new btzw(null);
                    btzq.b(1);
                    btziVar2.QY(a.a(), btzy.k);
                }
            });
            return vlw.a;
        }
        return this.c.b(i, btziVar, executor);
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }
}

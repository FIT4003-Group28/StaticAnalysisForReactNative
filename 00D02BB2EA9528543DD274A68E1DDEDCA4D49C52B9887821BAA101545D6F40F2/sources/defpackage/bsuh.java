package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bsuh  reason: default package */
/* loaded from: classes.dex */
public final class bsuh implements bvkz {
    public final Executor a;
    public final cqat b;
    public final bvjj c;
    public final dxio<bsvn> d;
    public final dxio<akfa> e;
    public final btvo f;
    public btlu g = btlu.a;

    public bsuh(Executor executor, cqat cqatVar, bvjj bvjjVar, dxio<bsvn> dxioVar, dxio<akfa> dxioVar2, btvo btvoVar) {
        this.a = executor;
        this.b = cqatVar;
        this.c = bvjjVar;
        this.d = dxioVar;
        this.e = dxioVar2;
        this.f = btvoVar;
    }

    @Override // defpackage.bvkz
    public final Executor a() {
        return this.a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f.getUserPreferencesLoggingParameters().c) {
            this.e.a().l().Pk(new Runnable(this) { // from class: bsuf
                private final bsuh a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final bsuh bsuhVar = this.a;
                    bsuhVar.e.a().C().d(new crzp(bsuhVar) { // from class: bsug
                        private final bsuh a;

                        {
                            this.a = bsuhVar;
                        }

                        @Override // defpackage.crzp
                        public final void On(crzm crzmVar) {
                            bsuh bsuhVar2 = this.a;
                            btlu btluVar = (btlu) crzmVar.l();
                            if (btlu.p(btluVar) || btlu.g(btluVar, bsuhVar2.g)) {
                                return;
                            }
                            dbsk.s(btluVar);
                            long b = bsuhVar2.b.b() - bsuhVar2.c.x(bvjk.jU, btluVar, 0L);
                            int i = bsuhVar2.f.getUserPreferencesLoggingParameters().d;
                            if (b > 0 && b <= TimeUnit.HOURS.toMillis(i)) {
                                return;
                            }
                            bsuhVar2.d.a().a();
                            bsuhVar2.g = btluVar;
                        }
                    }, bsuhVar.a);
                }
            }, this.a);
        }
    }
}

package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cwow  reason: default package */
/* loaded from: classes5.dex */
public final class cwow {
    public static <ResultT extends cnom, FunctionT> dehn<FunctionT> a(final cnoh<ResultT> cnohVar, final dbrn<ResultT, FunctionT> dbrnVar, final Executor executor) {
        final deig d = deig.d();
        cnohVar.j(new cnon(d, executor, dbrnVar) { // from class: cwos
            private final deig a;
            private final Executor b;
            private final dbrn c;

            {
                this.a = d;
                this.b = executor;
                this.c = dbrnVar;
            }

            @Override // defpackage.cnon
            public final void Om(final cnom cnomVar) {
                final deig deigVar = this.a;
                Executor executor2 = this.b;
                final dbrn dbrnVar2 = this.c;
                Status a = cnomVar.a();
                if (a.g != 14) {
                    if (!a.d()) {
                        deigVar.k(new cwok(cnomVar, a));
                        cwow.b(cnomVar);
                        return;
                    }
                    executor2.execute(new Runnable(deigVar, dbrnVar2, cnomVar) { // from class: cwou
                        private final deig a;
                        private final dbrn b;
                        private final cnom c;

                        {
                            this.a = deigVar;
                            this.b = dbrnVar2;
                            this.c = cnomVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            deig deigVar2 = this.a;
                            dbrn dbrnVar3 = this.b;
                            cnom cnomVar2 = this.c;
                            try {
                                deigVar2.j(dbrnVar3.a(cnomVar2));
                            } catch (RuntimeException e) {
                                deigVar2.k(e);
                            } finally {
                                cwow.b(cnomVar2);
                            }
                        }
                    });
                    return;
                }
                String valueOf = String.valueOf(cnomVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                sb.append("We never use the blocking API for these calls: ");
                sb.append(valueOf);
                throw new AssertionError(sb.toString());
            }
        }, 3L, TimeUnit.SECONDS);
        d.Pk(dazv.b(new Runnable(d, cnohVar) { // from class: cwot
            private final deig a;
            private final cnoh b;

            {
                this.a = d;
                this.b = cnohVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                deig deigVar = this.a;
                cnoh cnohVar2 = this.b;
                if (deigVar.isCancelled()) {
                    cnohVar2.h();
                }
            }
        }), dege.a);
        return d;
    }

    public static void b(cnom cnomVar) {
        if (cnomVar instanceof cnoj) {
            ((cnoj) cnomVar).b();
        }
    }
}

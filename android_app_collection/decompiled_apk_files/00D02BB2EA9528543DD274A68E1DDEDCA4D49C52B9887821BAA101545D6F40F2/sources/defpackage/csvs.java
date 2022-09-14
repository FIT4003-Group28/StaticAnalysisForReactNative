package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: csvs  reason: default package */
/* loaded from: classes5.dex */
public final class csvs {
    public static cswf a;

    public static <T> dehn<T> a(final long j, final dbty<dehn<T>> dbtyVar, dehp dehpVar) {
        return deew.g(dehpVar.c(new Callable(j) { // from class: csvr
            private final long a;

            {
                this.a = j;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                long j2 = this.a;
                try {
                    if (csvs.a == null) {
                        csvs.a = cswf.a();
                    }
                    Thread.sleep(j2);
                    return null;
                } catch (InterruptedException e) {
                    cstl.a("FutureUtils");
                    throw e;
                }
            }
        }), new defg(dbtyVar) { // from class: csvp
            private final dbty a;

            {
                this.a = dbtyVar;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                Void r2 = (Void) obj;
                return (dehn) this.a.a();
            }
        }, dehpVar);
    }

    public static <T> dehn<T> b(final Callable<T> callable) {
        return deha.f(new deff(callable) { // from class: csvq
            private final Callable a;

            {
                this.a = callable;
            }

            @Override // defpackage.deff
            public final dehn a() {
                return deha.a(this.a.call());
            }
        }, dege.a);
    }
}

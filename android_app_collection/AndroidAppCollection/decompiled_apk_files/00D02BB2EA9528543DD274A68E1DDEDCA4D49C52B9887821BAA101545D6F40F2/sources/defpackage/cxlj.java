package defpackage;

import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: cxlj  reason: default package */
/* loaded from: classes5.dex */
final class cxlj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(final dehn<?> dehnVar) {
        dehnVar.Pk(new Runnable(dehnVar) { // from class: cxlf
            private final dehn a;

            {
                this.a = dehnVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    deha.r(this.a);
                } catch (ExecutionException e) {
                    czhz.e(new Runnable(e) { // from class: cxli
                        private final ExecutionException a;

                        {
                            this.a = e;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            throw new RuntimeException(this.a.getCause());
                        }
                    });
                }
            }
        }, dege.a);
    }
}

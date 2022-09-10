package defpackage;

import androidx.work.WorkerParameters;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: akaw  reason: default package */
/* loaded from: classes2.dex */
public final class akaw implements irw {
    public final akas a;
    public final akfa b;
    public final Executor c;
    private final Executor d;

    public akaw(akas akasVar, akfa akfaVar, Executor executor, Executor executor2) {
        this.a = akasVar;
        this.b = akfaVar;
        this.d = executor;
        this.c = executor2;
    }

    @Override // defpackage.irw
    public final dehn<bbx> a(WorkerParameters workerParameters) {
        final deig d = deig.d();
        this.d.execute(new Runnable(this, d) { // from class: akau
            private final akaw a;
            private final deig b;

            {
                this.a = this;
                this.b = d;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final akaw akawVar = this.a;
                final deig deigVar = this.b;
                final List<btlu> t = akawVar.b.t();
                akawVar.c.execute(new Runnable(akawVar, t, deigVar) { // from class: akav
                    private final akaw a;
                    private final List b;
                    private final deig c;

                    {
                        this.a = akawVar;
                        this.b = t;
                        this.c = deigVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        List list = this.b;
                        deig deigVar2 = this.c;
                        akas.b(list);
                        deigVar2.j(bbx.a());
                    }
                });
            }
        });
        return d;
    }
}

package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arcm  reason: default package */
/* loaded from: classes.dex */
public final class arcm extends akvn<aksx> {
    final /* synthetic */ alhm a;
    final /* synthetic */ btrm b;
    final /* synthetic */ Executor c;
    final /* synthetic */ arcq d;

    public arcm(arcq arcqVar, alhm alhmVar, btrm btrmVar, Executor executor) {
        this.d = arcqVar;
        this.a = alhmVar;
        this.b = btrmVar;
        this.c = executor;
    }

    @Override // defpackage.akvo
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        aksx aksxVar = (aksx) obj;
        alhm alhmVar = this.a;
        if (alhmVar == null || this.b == null) {
            return;
        }
        final alhn a = alhmVar.a(this.d.c.a().d().a);
        a.b = arcq.a;
        Executor executor = this.c;
        final btrm btrmVar = this.b;
        executor.execute(new Runnable(btrmVar, a) { // from class: arcl
            private final btrm a;
            private final alhn b;

            {
                this.a = btrmVar;
                this.b = a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b(this.b);
            }
        });
    }
}

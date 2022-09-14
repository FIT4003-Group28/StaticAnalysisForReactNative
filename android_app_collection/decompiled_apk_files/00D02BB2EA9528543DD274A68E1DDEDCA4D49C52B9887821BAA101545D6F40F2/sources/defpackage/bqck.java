package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bqck  reason: default package */
/* loaded from: classes4.dex */
public final class bqck extends akvn<aksx> {
    final /* synthetic */ akra a;
    final /* synthetic */ int b;
    final /* synthetic */ bqcn c;

    public bqck(bqcn bqcnVar, akra akraVar, int i) {
        this.c = bqcnVar;
        this.a = akraVar;
        this.b = i;
    }

    @Override // defpackage.akvo
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        aksx aksxVar = (aksx) obj;
        Executor executor = this.c.a;
        final akra akraVar = this.a;
        final int i = this.b;
        executor.execute(new Runnable(this, akraVar, i) { // from class: bqcj
            private final bqck a;
            private final akra b;
            private final int c;

            {
                this.a = this;
                this.b = akraVar;
                this.c = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bqck bqckVar = this.a;
                bqckVar.c.m(this.b, this.c);
            }
        });
    }
}

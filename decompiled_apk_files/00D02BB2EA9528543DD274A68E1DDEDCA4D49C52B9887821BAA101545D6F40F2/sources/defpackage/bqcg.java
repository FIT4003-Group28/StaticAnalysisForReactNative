package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bqcg  reason: default package */
/* loaded from: classes4.dex */
final class bqcg extends akvn<aksx> {
    final /* synthetic */ dbsg a;
    final /* synthetic */ boolean b;
    final /* synthetic */ bqcn c;

    public bqcg(bqcn bqcnVar, dbsg dbsgVar, boolean z) {
        this.c = bqcnVar;
        this.a = dbsgVar;
        this.b = z;
    }

    @Override // defpackage.akvo
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        aksx aksxVar = (aksx) obj;
        Executor executor = this.c.a;
        final dbsg dbsgVar = this.a;
        final boolean z = this.b;
        executor.execute(new Runnable(this, dbsgVar, z) { // from class: bqcf
            private final bqcg a;
            private final dbsg b;
            private final boolean c;

            {
                this.a = this;
                this.b = dbsgVar;
                this.c = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bqcg bqcgVar = this.a;
                bqcgVar.c.l(this.b, this.c);
            }
        });
    }
}

package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aiob  reason: default package */
/* loaded from: classes2.dex */
final class aiob implements akag {
    final /* synthetic */ Executor a;
    final /* synthetic */ aioh b;

    public aiob(aioh aiohVar, Executor executor) {
        this.b = aiohVar;
        this.a = executor;
    }

    @Override // defpackage.akag
    public final void a(final btlu btluVar) {
        this.a.execute(new Runnable(this, btluVar) { // from class: aioa
            private final aiob a;
            private final btlu b;

            {
                this.a = this;
                this.b = btluVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.j(dbsg.i(this.b));
            }
        });
    }

    @Override // defpackage.akag
    public final void b() {
        this.a.execute(new Runnable(this) { // from class: ainz
            private final aiob a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.i();
            }
        });
    }
}

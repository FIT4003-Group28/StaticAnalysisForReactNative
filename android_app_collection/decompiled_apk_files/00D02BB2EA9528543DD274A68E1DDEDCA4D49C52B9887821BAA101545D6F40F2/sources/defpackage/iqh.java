package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: iqh  reason: default package */
/* loaded from: classes6.dex */
final class iqh implements akzt {
    final /* synthetic */ iql a;

    public iqh(iql iqlVar) {
        this.a = iqlVar;
    }

    @Override // defpackage.akzt
    public final void a() {
        if (!this.a.c.a()) {
            iql iqlVar = this.a;
            iqlVar.j.c(iqlVar.c);
        }
    }

    @Override // defpackage.akzt
    public final void b() {
        this.a.c.b();
    }

    @Override // defpackage.akzt
    public final void c() {
        iql iqlVar = this.a;
        Executor executor = iqlVar.i;
        final cjxz cjxzVar = iqlVar.c;
        cjxzVar.getClass();
        executor.execute(new Runnable(cjxzVar) { // from class: iqg
            private final cjxz a;

            {
                this.a = cjxzVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b();
            }
        });
    }
}

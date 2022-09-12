package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avpy  reason: default package */
/* loaded from: classes3.dex */
public final class avpy {
    final dltz a;
    final /* synthetic */ avpz b;
    private final crzd<avei> c = new crzd<>();

    public avpy(avpz avpzVar, dltz dltzVar) {
        this.b = avpzVar;
        this.a = dltzVar;
    }

    public final void a(dbsz<avei> dbszVar) {
        this.b.c(this, dbszVar);
        synchronized (this) {
            this.c.d(dbszVar);
            this.c.f();
        }
    }

    public final synchronized void b(avei aveiVar, Executor executor) {
        this.c.a(aveiVar, executor);
    }

    public final void c() {
        a(new dbsz() { // from class: avpx
            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                ((avei) obj).a.b(false);
            }
        });
    }
}

package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahxq  reason: default package */
/* loaded from: classes2.dex */
public final class ahxq implements akey {
    final /* synthetic */ z a;
    final /* synthetic */ ahxx b;

    public ahxq(ahxx ahxxVar, z zVar) {
        this.b = ahxxVar;
        this.a = zVar;
    }

    @Override // defpackage.akey
    public final void a(final boolean z) {
        Executor executor = this.b.f;
        final z zVar = this.a;
        executor.execute(new Runnable(this, z, zVar) { // from class: ahxp
            private final ahxq a;
            private final boolean b;
            private final z c;

            {
                this.a = this;
                this.b = z;
                this.c = zVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ahxq ahxqVar = this.a;
                boolean z2 = this.b;
                z zVar2 = this.c;
                ahxx ahxxVar = ahxqVar.b;
                btlu n = ahxxVar.e.n(ahxxVar.n);
                if (n == null || (ahxqVar.b.r == 4 && z2)) {
                    zVar2.f(ajpz.b(new ahwp()));
                } else {
                    zVar2.f(ajpz.a(n));
                }
            }
        });
    }

    @Override // defpackage.akey
    public final void b() {
        this.a.f(ajpz.b(new ahwp()));
    }
}

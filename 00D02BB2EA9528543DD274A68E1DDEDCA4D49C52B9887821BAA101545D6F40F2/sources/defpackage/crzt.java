package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: crzt  reason: default package */
/* loaded from: classes5.dex */
public final class crzt<T> {
    private crzm<T> b;
    private final Executor c;
    private final crzp<T> d = new crzp(this) { // from class: crzs
        private final crzt a;

        {
            this.a = this;
        }

        @Override // defpackage.crzp
        public final void On(crzm crzmVar) {
            this.a.c(crzmVar);
        }
    };
    public final crzo<T> a = new crzo<>();

    public crzt(Executor executor) {
        this.c = executor;
    }

    private final synchronized void d() {
        crzm<T> crzmVar = this.b;
        if (crzmVar != null) {
            crzmVar.c(this.d);
            this.b = null;
        }
    }

    public final synchronized void a() {
        d();
        if (this.a.a.k()) {
            this.a.a(null);
        }
    }

    public final synchronized void b(crzm<T> crzmVar) {
        d();
        this.b = crzmVar;
        if (crzmVar.k()) {
            this.a.b(this.b.l());
        }
        this.b.a(this.d, this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(crzm<T> crzmVar) {
        crzm<T> crzmVar2 = this.b;
        if (crzmVar != crzmVar2) {
            return;
        }
        this.a.b(crzmVar2.l());
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: cusj  reason: default package */
/* loaded from: classes5.dex */
public final class cusj<T, U> extends cusy<T> {
    private final cuss<U> a;
    private final dbrn<U, cuss<T>> b;
    private cuss<T> c;

    public cusj(cuss<U> cussVar, dbrn<U, cuss<T>> dbrnVar) {
        this.a = cussVar;
        this.b = dbrnVar;
    }

    @Override // defpackage.cuss
    protected final synchronized void b() {
        this.a.q(new cusr(this) { // from class: cuse
            private final cusj a;

            {
                this.a = this;
            }

            @Override // defpackage.cusr
            public final void a(Object obj) {
                this.a.d((cusj) obj);
            }
        });
    }

    @Override // defpackage.cuss
    protected final synchronized void c() {
        this.a.g(new cusr(this) { // from class: cusf
            private final cusj a;

            {
                this.a = this;
            }

            @Override // defpackage.cusr
            public final void a(Object obj) {
                this.a.d((cusj) obj);
            }
        });
        cuss<T> cussVar = this.c;
        if (cussVar != null) {
            cussVar.g(new cusr(this) { // from class: cusg
                private final cusj a;

                {
                    this.a = this;
                }

                @Override // defpackage.cusr
                public final void a(Object obj) {
                    this.a.a(obj);
                }
            });
        }
    }

    public final synchronized void d(U u) {
        cuss<T> cussVar = this.c;
        if (cussVar != null) {
            cussVar.g(new cusr(this) { // from class: cush
                private final cusj a;

                {
                    this.a = this;
                }

                @Override // defpackage.cusr
                public final void a(Object obj) {
                    this.a.a(obj);
                }
            });
        }
        cuss<T> a = this.b.a(u);
        this.c = a;
        if (a == null) {
            return;
        }
        a.q(new cusr(this) { // from class: cusi
            private final cusj a;

            {
                this.a = this;
            }

            @Override // defpackage.cusr
            public final void a(Object obj) {
                this.a.a(obj);
            }
        });
    }
}

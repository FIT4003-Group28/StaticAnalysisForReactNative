package defpackage;
/* compiled from: PG */
/* renamed from: dfcm  reason: default package */
/* loaded from: classes6.dex */
final class dfcm<T> extends dyew<T> {
    public final dyew<T> a;
    private final dazw b = new dazw(dbaa.f());

    public dfcm(dyew<T> dyewVar) {
        this.a = dyewVar;
    }

    private final void e(Runnable runnable) {
        if (!dbaa.h(dbab.a)) {
            dazv.a(this.b.a, runnable).run();
        } else {
            runnable.run();
        }
    }

    @Override // defpackage.dyew
    public final void a(final dyhw dyhwVar) {
        e(new Runnable(this, dyhwVar) { // from class: dfci
            private final dfcm a;
            private final dyhw b;

            {
                this.a = this;
                this.b = dyhwVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dfcm dfcmVar = this.a;
                dfcmVar.a.a(this.b);
            }
        });
    }

    @Override // defpackage.dyew
    public final void b(final dyjb dyjbVar, final dyhw dyhwVar) {
        e(new Runnable(this, dyjbVar, dyhwVar) { // from class: dfck
            private final dfcm a;
            private final dyjb b;
            private final dyhw c;

            {
                this.a = this;
                this.b = dyjbVar;
                this.c = dyhwVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dfcm dfcmVar = this.a;
                dfcmVar.a.b(this.b, this.c);
            }
        });
    }

    @Override // defpackage.dyew
    public final void c(final T t) {
        e(new Runnable(this, t) { // from class: dfcj
            private final dfcm a;
            private final Object b;

            {
                this.a = this;
                this.b = t;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dfcm dfcmVar = this.a;
                dfcmVar.a.c(this.b);
            }
        });
    }

    @Override // defpackage.dyew
    public final void i() {
        final dyew<T> dyewVar = this.a;
        dyewVar.getClass();
        e(new Runnable(dyewVar) { // from class: dfcl
            private final dyew a;

            {
                this.a = dyewVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.i();
            }
        });
    }
}

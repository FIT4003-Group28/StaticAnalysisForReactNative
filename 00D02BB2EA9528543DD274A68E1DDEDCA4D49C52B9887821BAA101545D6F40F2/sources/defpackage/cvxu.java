package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cvxu  reason: default package */
/* loaded from: classes5.dex */
public final class cvxu extends cvxj {
    final /* synthetic */ cvxw a;

    public cvxu(cvxw cvxwVar) {
        this.a = cvxwVar;
    }

    @Override // defpackage.cvxj
    public final void a(final Object obj) {
        cwjf.a(new Runnable(this, obj) { // from class: cvxt
            private final cvxu a;
            private final Object b;

            {
                this.a = this;
                this.b = obj;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                cvxu cvxuVar = this.a;
                ?? r1 = this.b;
                cvxw cvxwVar = cvxuVar.a;
                cvxwVar.a = r1;
                cvxwVar.a();
            }
        });
    }

    @Override // defpackage.cvxj
    public final void c(final dcdc dcdcVar) {
        cwjf.a(new Runnable(this, dcdcVar) { // from class: cvxs
            private final cvxu a;
            private final dcdc b;

            {
                this.a = this;
                this.b = dcdcVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cvxu cvxuVar = this.a;
                dcdc<T> dcdcVar2 = this.b;
                cvxw cvxwVar = cvxuVar.a;
                cvxwVar.e = dcdcVar2;
                cvxwVar.a();
            }
        });
    }
}

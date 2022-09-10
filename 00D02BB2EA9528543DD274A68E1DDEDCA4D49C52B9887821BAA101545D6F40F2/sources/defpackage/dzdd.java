package defpackage;
/* compiled from: PG */
/* renamed from: dzdd  reason: default package */
/* loaded from: classes6.dex */
final class dzdd<T> extends dzbr<T, T> {
    final dzbb<? super T> e;

    public dzdd(dyzw<? super T> dyzwVar, dzbb<? super T> dzbbVar) {
        super(dyzwVar);
        this.e = dzbbVar;
    }

    @Override // defpackage.dzbq
    public final T SP() {
        T SP;
        do {
            SP = this.c.SP();
            if (SP == null) {
                break;
            }
        } while (!this.e.a(SP));
        return SP;
    }

    @Override // defpackage.dyzw
    public final void c(T t) {
        try {
            if (!this.e.a(t)) {
                return;
            }
            this.a.c(t);
        } catch (Throwable th) {
            i(th);
        }
    }

    @Override // defpackage.dzbo
    public final int h() {
        return 0;
    }
}

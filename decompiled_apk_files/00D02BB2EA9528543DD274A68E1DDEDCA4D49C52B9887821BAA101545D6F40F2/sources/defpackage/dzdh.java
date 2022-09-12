package defpackage;
/* compiled from: PG */
/* renamed from: dzdh  reason: default package */
/* loaded from: classes6.dex */
final class dzdh<T, U> extends dzbr<T, U> {
    final dzba<? super T, ? extends U> e;

    public dzdh(dyzw<? super U> dyzwVar, dzba<? super T, ? extends U> dzbaVar) {
        super(dyzwVar);
        this.e = dzbaVar;
    }

    @Override // defpackage.dzbq
    public final U SP() {
        T SP = this.c.SP();
        if (SP != null) {
            U a = this.e.a(SP);
            dzbm.a(a, "The mapper function returned a null value.");
            return a;
        }
        return null;
    }

    @Override // defpackage.dyzw
    public final void c(T t) {
        if (!this.d) {
            try {
                U a = this.e.a(t);
                dzbm.a(a, "The mapper function returned a null value.");
                this.a.c(a);
            } catch (Throwable th) {
                i(th);
            }
        }
    }

    @Override // defpackage.dzbo
    public final int h() {
        return 0;
    }
}

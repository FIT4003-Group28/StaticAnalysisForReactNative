package defpackage;
/* compiled from: PG */
/* renamed from: ayyb  reason: default package */
/* loaded from: classes2.dex */
final class ayyb extends aznx {
    private static final long serialVersionUID = -3740826063558713822L;
    final ayqe a;

    public ayyb(bame bameVar, ayqe ayqeVar) {
        super(bameVar);
        this.a = ayqeVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        try {
            Object obj = ((ayqy) this.a).a;
            ayrd.b(obj, "The valueSupplier returned a null value");
            long j = this.e;
            if (j != 0) {
                ayno.e(this, j);
            }
            while (true) {
                long j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    return;
                }
                if ((j2 & Long.MAX_VALUE) == 0) {
                    this.d = obj;
                    if (compareAndSet(0L, Long.MIN_VALUE)) {
                        return;
                    }
                    this.d = null;
                } else {
                    lazySet(-9223372036854775807L);
                    this.b.c(obj);
                    this.b.sm();
                    return;
                }
            }
        } catch (Throwable th2) {
            bapv.j(th2);
            this.b.b(new aypo(th, th2));
        }
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        this.e++;
        this.b.c(obj);
    }

    @Override // defpackage.bame
    public final void sm() {
        this.b.sm();
    }
}

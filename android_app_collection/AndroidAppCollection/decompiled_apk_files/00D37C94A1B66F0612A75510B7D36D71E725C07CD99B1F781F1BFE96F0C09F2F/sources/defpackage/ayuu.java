package defpackage;
/* compiled from: PG */
/* renamed from: ayuu  reason: default package */
/* loaded from: classes2.dex */
final class ayuu extends ayup {
    private static final long serialVersionUID = 3776720187248809713L;

    public ayuu(bame bameVar) {
        super(bameVar);
    }

    @Override // defpackage.aynw
    public final void a(Object obj) {
        long j;
        if (l()) {
            return;
        }
        if (obj != null) {
            this.a.c(obj);
            do {
                j = get();
                if (j == 0) {
                    return;
                }
            } while (!compareAndSet(j, (-1) + j));
            return;
        }
        h(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
    }
}

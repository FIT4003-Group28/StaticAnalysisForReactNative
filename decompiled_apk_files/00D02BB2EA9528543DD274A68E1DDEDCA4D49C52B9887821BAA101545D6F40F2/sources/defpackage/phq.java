package defpackage;
/* compiled from: PG */
/* renamed from: phq  reason: default package */
/* loaded from: classes7.dex */
final class phq<V> implements pfh<V> {
    private final pfh<? super V> a;
    @dzsi
    private pfg b;
    private long c;

    public phq(pfh<? super V> pfhVar, long j) {
        this.c = j;
        this.a = pfhVar;
    }

    @Override // defpackage.pfh
    public final void c(pfg pfgVar) {
        this.b = pfgVar;
        if (this.c == 0) {
            e();
        } else {
            this.a.c(pfgVar);
        }
    }

    @Override // defpackage.pfh
    public final void d(V v) {
        long j = this.c;
        long j2 = (-1) + j;
        this.c = j2;
        if (j > 0) {
            this.a.d(v);
            if (j2 != 0) {
                return;
            }
            e();
        }
    }

    @Override // defpackage.pfh
    public final void e() {
        pfg pfgVar = this.b;
        if (pfgVar != null) {
            pfgVar.a();
        }
        this.a.e();
    }
}

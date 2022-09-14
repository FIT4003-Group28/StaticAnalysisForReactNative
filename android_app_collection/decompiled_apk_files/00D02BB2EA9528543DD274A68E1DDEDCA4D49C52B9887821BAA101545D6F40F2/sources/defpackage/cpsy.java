package defpackage;
/* compiled from: PG */
/* renamed from: cpsy  reason: default package */
/* loaded from: classes5.dex */
final class cpsy<T, D> extends cpsw<T, D, Integer> {
    public final cpve<T, Integer> c;
    private final cpss d;

    public cpsy(cpve<T, Integer> cpveVar, cpve<T, D> cpveVar2, cpss cpssVar) {
        super(cpveVar2);
        this.c = cpveVar;
        this.d = cpssVar;
    }

    @Override // defpackage.cpve
    public final /* bridge */ /* synthetic */ Object a(Object obj, int i, cpvi cpviVar) {
        int h;
        if (this.b == null) {
            h = 2;
        } else {
            h = this.b.h(cpviVar, obj == null ? null : this.a.a(obj, i, cpviVar));
        }
        cpve<T, Integer> cpveVar = this.c;
        int intValue = cpveVar == null ? -16776961 : cpveVar.a(obj, i, cpviVar).intValue();
        int i2 = h - 1;
        if (h != 0) {
            if (i2 == 0) {
                acrg acrgVar = ((acqz) this.d).a;
                if (intValue == akm.c(acrgVar.c, acrg.a)) {
                    intValue = akm.c(acrgVar.c, acrg.b);
                }
            }
            return Integer.valueOf(intValue);
        }
        throw null;
    }
}

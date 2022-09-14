package defpackage;
/* compiled from: PG */
/* renamed from: cusl  reason: default package */
/* loaded from: classes5.dex */
public final class cusl<ValueT, LinkedValueT> extends cuss<ValueT> {
    private cuss<LinkedValueT> a;
    private cusr<LinkedValueT> b;

    public static <ValueT, LinkedValueT> cuss<ValueT> d(cuss<LinkedValueT> cussVar, final dbrn<LinkedValueT, ValueT> dbrnVar) {
        final cusl cuslVar = new cusl();
        cuslVar.a = cussVar;
        cuslVar.b = new cusr(cuslVar, dbrnVar) { // from class: cusk
            private final cusl a;
            private final dbrn b;

            {
                this.a = cuslVar;
                this.b = dbrnVar;
            }

            @Override // defpackage.cusr
            public final void a(Object obj) {
                this.a.a(this.b.a(obj));
            }
        };
        return cuslVar;
    }

    @Override // defpackage.cuss
    protected final synchronized void b() {
        this.a.q(this.b);
    }

    @Override // defpackage.cuss
    protected final synchronized void c() {
        this.a.g(this.b);
    }
}

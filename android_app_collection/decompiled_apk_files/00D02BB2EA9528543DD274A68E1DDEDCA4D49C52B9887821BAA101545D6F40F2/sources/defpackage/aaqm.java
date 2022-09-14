package defpackage;
/* compiled from: PG */
/* renamed from: aaqm  reason: default package */
/* loaded from: classes2.dex */
public final class aaqm implements aaks<aawy> {
    private final aawy a;

    public aaqm(final aayf aayfVar, aaku aakuVar) {
        this.a = aayfVar;
        aayfVar.getClass();
        aakuVar.d(new mw(aayfVar) { // from class: aaql
            private final aayf a;

            {
                this.a = aayfVar;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                this.a.g((diwb) obj);
            }
        });
    }

    @Override // defpackage.aaks
    public final cqix<aawy> a() {
        return cqgr.fT(new aawi(), this.a);
    }
}

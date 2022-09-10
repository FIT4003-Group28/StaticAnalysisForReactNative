package defpackage;
/* compiled from: PG */
/* renamed from: aayh  reason: default package */
/* loaded from: classes2.dex */
public final class aayh implements aaks<aayw> {
    private final aayw a;

    public aayh(final aayz aayzVar, aaku aakuVar) {
        this.a = aayzVar;
        aayzVar.getClass();
        aakuVar.d(new mw(aayzVar) { // from class: aayg
            private final aayz a;

            {
                this.a = aayzVar;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                this.a.h((diwb) obj);
            }
        });
    }

    @Override // defpackage.aaks
    public final cqix<aayw> a() {
        return cqgr.fT(new aayn(), this.a);
    }
}

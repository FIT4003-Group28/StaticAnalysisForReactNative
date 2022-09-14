package defpackage;
/* compiled from: PG */
/* renamed from: aaqg  reason: default package */
/* loaded from: classes2.dex */
public final class aaqg implements aaks<aawq> {
    private final aaxl a;

    public aaqg(final aaxl aaxlVar, aaku aakuVar) {
        this.a = aaxlVar;
        aaxlVar.getClass();
        aakuVar.b(new Runnable(aaxlVar) { // from class: aaqe
            private final aaxl a;

            {
                this.a = aaxlVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.f();
            }
        });
        aaxlVar.getClass();
        aakuVar.d(new mw(aaxlVar) { // from class: aaqf
            private final aaxl a;

            {
                this.a = aaxlVar;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                this.a.e((diwb) obj);
            }
        });
    }

    @Override // defpackage.aaks
    public final cqix<aawq> a() {
        return cqgr.fT(new aash(), this.a);
    }
}

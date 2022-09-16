package defpackage;
/* compiled from: PG */
/* renamed from: aapz  reason: default package */
/* loaded from: classes2.dex */
public final class aapz implements aaks<aawn> {
    private final aawn a;

    public aapz(final aaxg aaxgVar, aaku aakuVar) {
        this.a = aaxgVar;
        aaxgVar.getClass();
        aakuVar.b(new Runnable(aaxgVar) { // from class: aapx
            private final aaxg a;

            {
                this.a = aaxgVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.i();
            }
        });
        aaxgVar.getClass();
        aakuVar.d(new mw(aaxgVar) { // from class: aapy
            private final aaxg a;

            {
                this.a = aaxgVar;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                this.a.d((diwb) obj);
            }
        });
    }

    @Override // defpackage.aaks
    public final cqix<aawn> a() {
        return cqgr.fT(new aars(), this.a);
    }
}

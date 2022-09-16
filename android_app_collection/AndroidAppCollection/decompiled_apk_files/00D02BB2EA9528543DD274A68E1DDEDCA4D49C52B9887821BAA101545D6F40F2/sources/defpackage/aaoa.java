package defpackage;
/* compiled from: PG */
/* renamed from: aaoa  reason: default package */
/* loaded from: classes2.dex */
public final class aaoa implements aaks<aaof> {
    private final aaoh a;
    private final cqiw<aaof> b = new aaoe();

    public aaoa(final aaoh aaohVar, aaku aakuVar) {
        this.a = aaohVar;
        aaohVar.getClass();
        aakuVar.d(new mw(aaohVar) { // from class: aanx
            private final aaoh a;

            {
                this.a = aaohVar;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                this.a.e((diwb) obj);
            }
        });
        aaohVar.getClass();
        final mw mwVar = new mw(aaohVar) { // from class: aany
            private final aaoh a;

            {
                this.a = aaohVar;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                this.a.d((dbsg) obj);
            }
        };
        aagi aagiVar = (aagi) aakuVar;
        aagiVar.c.a.a(new crzp(mwVar) { // from class: aagg
            private final mw a;

            {
                this.a = mwVar;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                mw mwVar2 = this.a;
                dbsg dbsgVar = (dbsg) crzmVar.l();
                dbsk.s(dbsgVar);
                mwVar2.a(dbsgVar);
            }
        }, dege.a);
        aagb aagbVar = aagiVar.e;
        aaohVar.getClass();
        final Runnable runnable = new Runnable(aaohVar) { // from class: aanz
            private final aaoh a;

            {
                this.a = aaohVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.f();
            }
        };
        aagbVar.a.a.a(new crzp(runnable) { // from class: aaga
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                this.a.run();
            }
        }, dege.a);
    }

    @Override // defpackage.aaks
    public final cqix<aaof> a() {
        return cqgr.fT(this.b, this.a);
    }
}

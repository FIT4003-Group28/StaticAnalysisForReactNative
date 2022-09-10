package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: awkv  reason: default package */
/* loaded from: classes3.dex */
public final class awkv {
    private final Executor a;
    private final akfa b;
    @dzsi
    private crzp<btlu> c;

    public awkv(Executor executor, akfa akfaVar) {
        this.a = executor;
        this.b = akfaVar;
    }

    public final synchronized void a() {
        if (this.c != null) {
            return;
        }
        this.c = new crzp() { // from class: awku
            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                btlu btluVar = (btlu) crzmVar.l();
            }
        };
        crzm<btlu> C = this.b.C();
        crzp<btlu> crzpVar = this.c;
        dbsk.s(crzpVar);
        C.d(crzpVar, this.a);
    }

    public final synchronized void b() {
        if (this.c != null) {
            crzm<btlu> C = this.b.C();
            crzp<btlu> crzpVar = this.c;
            dbsk.s(crzpVar);
            C.c(crzpVar);
            this.c = null;
        }
    }
}

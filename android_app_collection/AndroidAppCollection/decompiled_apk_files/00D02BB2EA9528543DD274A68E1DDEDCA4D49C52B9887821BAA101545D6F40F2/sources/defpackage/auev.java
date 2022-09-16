package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: auev  reason: default package */
/* loaded from: classes.dex */
public final class auev implements crzp<aufb> {
    public final Executor a;
    public boolean b = false;
    @dzsi
    public aufb c;
    private final Runnable d;

    public auev(Runnable runnable, Executor executor) {
        this.d = runnable;
        this.a = executor;
    }

    @Override // defpackage.crzp
    public final void On(crzm<aufb> crzmVar) {
        if (!this.b) {
            return;
        }
        bvrj.UI_THREAD.c();
        aufb l = crzmVar.l();
        dbsk.s(l);
        if (dbsd.a(this.c, l)) {
            return;
        }
        this.c = l;
        this.d.run();
    }
}

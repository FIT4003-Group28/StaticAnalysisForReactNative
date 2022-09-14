package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: awup  reason: default package */
/* loaded from: classes.dex */
public final class awup {
    public final dxio<akfa> a;
    public final Executor b;
    @dzsi
    public Runnable d;
    public volatile boolean c = false;
    private btlu g = btlu.a;
    public boolean e = false;
    public final crzp<btlu> f = new crzp(this) { // from class: awuo
        private final awup a;

        {
            this.a = this;
        }

        @Override // defpackage.crzp
        public final void On(crzm crzmVar) {
            this.a.a(btlu.q((btlu) crzmVar.l()));
        }
    };

    public awup(dxio<akfa> dxioVar, Executor executor) {
        this.a = dxioVar;
        this.b = executor;
    }

    public final void a(btlu btluVar) {
        if (!this.c || !btluVar.equals(this.g)) {
            bvmn bvmnVar = bvmo.a;
            this.c = true;
            this.g = btluVar;
            Runnable runnable = this.d;
            if (runnable == null) {
                return;
            }
            runnable.run();
        }
    }
}

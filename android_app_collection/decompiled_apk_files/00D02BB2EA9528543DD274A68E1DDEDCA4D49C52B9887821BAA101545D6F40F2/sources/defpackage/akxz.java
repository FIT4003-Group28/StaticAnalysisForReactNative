package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: akxz  reason: default package */
/* loaded from: classes.dex */
public final class akxz implements Runnable, akub, akts {
    private final akxv a;
    private final Executor b;
    private final dzsj<duxm> c;

    public akxz(dxio<akox> dxioVar, dxio<akzh> dxioVar2, btrm btrmVar, ckcw ckcwVar, Executor executor, dbty<Boolean> dbtyVar, akwu akwuVar, anat anatVar, dzsj<duxm> dzsjVar) {
        this.a = new akxv(dxioVar, dxioVar2, btrmVar, ckcwVar, dbtyVar, akwuVar, anatVar);
        this.b = executor;
        this.c = dzsjVar;
    }

    @Override // defpackage.akts
    public final void Py() {
        if (this.c.a().H) {
            Executor executor = this.b;
            final akxv akxvVar = this.a;
            akxvVar.getClass();
            executor.execute(new Runnable(akxvVar) { // from class: akxy
                private final akxv a;

                {
                    this.a = akxvVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b();
                }
            });
        }
    }

    @Override // defpackage.akub
    public final void b(akuc akucVar) {
        this.a.a = akucVar;
    }

    public final synchronized void c() {
        final akxv akxvVar = this.a;
        btrm btrmVar = akxvVar.c;
        akxs akxsVar = akxvVar.b;
        dceq a = dcet.a();
        a.b(alhg.class, new akxw(alhg.class, akxsVar, bvrj.UI_THREAD));
        btrmVar.g(akxsVar, a.a());
        akxvVar.e.f(new dbty(akxvVar) { // from class: akxr
            private final akxv a;

            {
                this.a = akxvVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                akxv akxvVar2 = this.a;
                alim d = akxvVar2.d(ddda.Ku, akxvVar2.e(akxvVar2.f()));
                akxvVar2.c.b(d);
                return d;
            }
        });
    }

    public final synchronized void d() {
        this.a.a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor = this.b;
        final akxv akxvVar = this.a;
        akxvVar.getClass();
        executor.execute(new Runnable(akxvVar) { // from class: akxx
            private final akxv a;

            {
                this.a = akxvVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b();
            }
        });
    }
}

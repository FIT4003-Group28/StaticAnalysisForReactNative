package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: lyp  reason: default package */
/* loaded from: classes7.dex */
public final class lyp {
    public final btrm a;
    private final cjvm c;
    private final dehq d;
    private final ckcp f;
    private final lyo e = new lyo();
    public boolean b = false;
    private boolean g = false;

    public lyp(ckcw ckcwVar, cjvm cjvmVar, btrm btrmVar, dehq dehqVar) {
        this.c = cjvmVar;
        this.d = dehqVar;
        this.a = btrmVar;
        this.f = (ckcp) ckcwVar.a(ckhi.aW);
    }

    public final synchronized void a() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.c.a(this.e);
        this.d.d(new Runnable(this) { // from class: lyn
            private final lyp a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b();
            }
        }, 5000L, TimeUnit.MILLISECONDS);
    }

    public final synchronized void b() {
        this.c.b(this.e);
        Long a = asjx.a(this.e.b());
        if (a != null) {
            this.f.a(a.longValue());
        }
        this.e.c();
        this.g = false;
    }
}

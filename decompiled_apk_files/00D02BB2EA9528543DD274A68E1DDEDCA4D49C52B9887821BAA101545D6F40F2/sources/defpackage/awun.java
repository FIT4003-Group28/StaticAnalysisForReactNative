package defpackage;
/* compiled from: PG */
/* renamed from: awun  reason: default package */
/* loaded from: classes.dex */
public final class awun {
    public final btpc a;
    public final dxio<awwq> b;
    @dzsi
    bvpk c;
    private final dxio<bvrb> d;
    private final dxio<dkux> e;

    public awun(btpc btpcVar, dxio<bvrb> dxioVar, dxio<awwq> dxioVar2, dxio<dkux> dxioVar3) {
        this.a = btpcVar;
        this.d = dxioVar;
        this.b = dxioVar2;
        this.e = dxioVar3;
    }

    private final synchronized void c() {
        int c = this.e.a().c();
        if (c <= 0) {
            return;
        }
        this.c = bvpk.a(new Runnable(this) { // from class: awum
            private final awun a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                awun awunVar = this.a;
                if (awunVar.a.j()) {
                    awunVar.b.a().j(awwm.SCHEDULED_CACHE_REEVALUATION);
                } else {
                    awunVar.a();
                }
            }
        });
        this.d.a().a(this.c, bvrj.BACKGROUND_THREADPOOL, c * 1000);
    }

    public final void a() {
        b();
        c();
    }

    public final synchronized void b() {
        bvpk bvpkVar = this.c;
        if (bvpkVar != null) {
            bvpkVar.b();
            this.c = null;
        }
    }
}

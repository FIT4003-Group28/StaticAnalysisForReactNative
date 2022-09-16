package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: crcx  reason: default package */
/* loaded from: classes5.dex */
public final class crcx implements crgy {
    public final dxio<cref> a;
    public final btrm b;
    public final crer c;
    public final dxio<ckoq> d;
    public final arne e;
    private final crem h;
    private final Executor i;
    private boolean j = false;
    public boolean f = false;
    public boolean g = false;

    public crcx(dxio<cref> dxioVar, crem cremVar, btrm btrmVar, crer crerVar, dxio<ckoq> dxioVar2, arne arneVar, Executor executor) {
        this.a = dxioVar;
        this.h = cremVar;
        this.b = btrmVar;
        this.c = crerVar;
        this.d = dxioVar2;
        this.e = arneVar;
        this.i = executor;
    }

    @Override // defpackage.crgy
    public final void a(crgz crgzVar) {
        this.i.execute(new Runnable(this) { // from class: crcu
            private final crcx a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                crcx crcxVar = this.a;
                int i = crcxVar.e.e;
                if (i != 0) {
                    int i2 = i - 1;
                    if (i2 == 2) {
                        crcxVar.d();
                        return;
                    } else if (i2 != 3) {
                        return;
                    } else {
                        crcxVar.d();
                        return;
                    }
                }
                throw null;
            }
        });
        btrm btrmVar = this.b;
        dceq a = dcet.a();
        boolean z = false;
        a.b(crmj.class, new crcy(0, crmj.class, this, bvrj.UI_THREAD));
        a.b(cqzx.class, new crcy(1, cqzx.class, this, bvrj.UI_THREAD));
        a.b(cqzy.class, new crcy(2, cqzy.class, this, bvrj.UI_THREAD));
        a.b(ahju.class, new crcy(3, ahju.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
        this.j = true;
        this.g = true;
        crem cremVar = this.h;
        if (crgzVar.a == arym.GUIDED_NAV && vxx.h(crgzVar.b)) {
            z = true;
        }
        cremVar.l(z);
    }

    @Override // defpackage.crgy
    public final void b(boolean z) {
        this.a.a().k(this.g);
        if (this.j) {
            this.b.a(this);
            this.j = false;
        }
    }

    public final crfe c() {
        return this.a.a().q();
    }

    public final void d() {
        arne arneVar = this.e;
        if (arneVar.a()) {
            arneVar.e = 5;
            arneVar.a.c(0, arneVar);
        }
        long j = this.e.d;
        this.a.a().t();
        this.a.a().b(crfj.d(crfi.DELAY, String.valueOf(j)), crej.GUIDANCE, new crcw());
    }
}

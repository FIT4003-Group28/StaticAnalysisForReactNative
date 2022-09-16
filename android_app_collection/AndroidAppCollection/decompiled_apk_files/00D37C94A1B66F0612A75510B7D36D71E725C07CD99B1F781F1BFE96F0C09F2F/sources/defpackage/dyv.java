package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: dyv  reason: default package */
/* loaded from: classes3.dex */
public final class dyv {
    public final aksv a;
    public volatile int b;
    public final long c;
    public final AtomicInteger d;
    private final azqb e;
    private final azqb f;

    public dyv(azqb azqbVar, azqb azqbVar2, aksv aksvVar, efz efzVar) {
        this.e = azqbVar;
        this.f = azqbVar2;
        this.a = aksvVar;
        long c = aksvVar.a().c(ywk.F);
        this.c = c;
        if ((16 & c) != 0) {
            this.b = 1;
        } else if ((2 & c) != 0) {
            this.b = (c & 4) != 0 ? 2 : 0;
            efzVar.b().R(new aypv() { // from class: dyt
                @Override // defpackage.aypv
                public final void a() {
                    dyv.this.b = 1;
                }
            });
        } else {
            this.b = 1;
        }
        this.d = new AtomicInteger();
    }

    public final void a(int i) {
        if (i >= 5) {
            ((ajmr) this.f.get()).d();
        }
    }

    public final void b(int i) {
        if (i == 15 || ((this.c & 8) != 0 && i >= 15)) {
            ((ces) this.e.get()).b();
        }
    }
}

package defpackage;

import java.io.Serializable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: fyx  reason: default package */
/* loaded from: classes3.dex */
public final class fyx {
    public final yni a;
    public final yrj b;
    public final AtomicInteger c;
    public volatile boolean d;
    public volatile boolean e;
    private final aadd f;
    private final yve g;
    private final Executor h;
    private volatile int i = 1;

    public fyx(yni yniVar, yrj yrjVar, aadd aaddVar, yve yveVar, aynx aynxVar, Executor executor, ayor ayorVar, ayor ayorVar2) {
        yniVar.getClass();
        this.a = yniVar;
        yrjVar.getClass();
        this.b = yrjVar;
        aaddVar.getClass();
        this.f = aaddVar;
        yveVar.getClass();
        this.g = yveVar;
        this.c = new AtomicInteger(-1);
        this.d = yrjVar.r();
        this.e = yrjVar.o();
        this.h = executor;
        yveVar.d().I().G(ayorVar).Z(new fyt(this, 1));
        aynxVar.G(ayorVar2).Z(new fyt(this));
    }

    public static int a(aadd aaddVar) {
        asxp asxpVar = aaddVar.a().e;
        if (asxpVar == null) {
            asxpVar = asxp.a;
        }
        int c = arey.c(asxpVar.u);
        if (c == 0) {
            c = 1;
        }
        int i = c - 1;
        if (i != 2) {
            return i != 3 ? 2 : 0;
        }
        return 1;
    }

    private final void i() {
        ampq ampqVar;
        if (this.c.get() == -1) {
            if ((((fgu) this.g.c()).b & 4) != 0) {
                ampqVar = ampq.j(Integer.valueOf(((fgu) this.g.c()).e));
            } else {
                ampqVar = amon.a;
            }
            int a = a(this.f);
            this.c.set(ampqVar.h() ? ((Integer) ampqVar.c()).intValue() : a);
            int i = this.c.get();
            String valueOf = String.valueOf(ampqVar.h() ? (Serializable) ampqVar.c() : "UNSET");
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64);
            sb.append("initialized to ");
            sb.append(i);
            sb.append(" settingStore: ");
            sb.append(valueOf);
            sb.append(" hotConfig: ");
            sb.append(a);
            zep.h("InlineMuted", sb.toString());
        }
    }

    public final int b() {
        i();
        return this.c.get();
    }

    public final void c(final boolean z) {
        this.h.execute(new Runnable() { // from class: fyu
            @Override // java.lang.Runnable
            public final void run() {
                fyx.this.a.d(new fyw(z, null));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(final int i) {
        i();
        final int i2 = this.c.get();
        if (i2 == i) {
            return;
        }
        ylx.i(this.g.b(new fgn(i, 2)), new ylw() { // from class: fys
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                fyx fyxVar = fyx.this;
                int i3 = i;
                int i4 = i2;
                Void r4 = (Void) obj;
                fyxVar.c.set(i3);
                boolean g = fyxVar.g(i4);
                boolean g2 = fyxVar.g(i3);
                if (g != g2) {
                    fyxVar.c(g2);
                }
            }
        });
    }

    public final synchronized void e(int i) {
        int i2 = ((fgu) this.g.c()).b & 4;
        if (i == 0) {
            this.i = i2 != 0 ? 3 : 11;
        } else if (i != 1) {
            if (i != 2) {
                this.i = 1;
            } else {
                this.i = i2 != 0 ? 5 : 6;
            }
        } else if (this.d) {
            this.i = i2 != 0 ? 7 : 8;
        } else {
            this.i = i2 != 0 ? 9 : 10;
        }
    }

    public final boolean f() {
        return g(b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g(int i) {
        if (i == 2) {
            return this.b.o();
        }
        if (i != 1) {
            return false;
        }
        return this.b.r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int h() {
        if (this.i == 1) {
            e(b());
        }
        return this.i;
    }
}

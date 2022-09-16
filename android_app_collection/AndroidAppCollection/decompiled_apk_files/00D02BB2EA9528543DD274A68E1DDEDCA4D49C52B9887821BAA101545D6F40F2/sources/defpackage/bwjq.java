package defpackage;

import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bwjq  reason: default package */
/* loaded from: classes4.dex */
public final class bwjq implements bwjj {
    @dzsi
    public final bwjw a;
    final /* synthetic */ bwjr b;
    private final bwno c;

    public bwjq(bwjr bwjrVar, @dzsi bwno bwnoVar, bwjw bwjwVar) {
        this.b = bwjrVar;
        this.c = bwnoVar;
        this.a = bwjwVar;
    }

    private final void c() {
        if (this.a != null) {
            bwjp bwjpVar = new bwjp(this);
            if (bvrj.UI_THREAD.b()) {
                bwjpVar.run();
            } else {
                this.b.e.b(bwjpVar, bvrj.UI_THREAD);
            }
        }
    }

    private static final void d(bwno bwnoVar) {
        if (bwnoVar.a.b == null) {
            dtnd dtndVar = dtnd.l;
        }
    }

    @Override // defpackage.bwjj
    public final void a() {
        d(this.c);
        c();
    }

    @Override // defpackage.bwjj
    public final void b(@dzsi dvts dvtsVar, @dzsi bttq bttqVar) {
        bvrj.UI_THREAD.c();
        this.c.e = dvtsVar;
        d(this.c);
        if (bttqVar != null) {
            bwno bwnoVar = this.c;
            if (this.a == null) {
                return;
            }
            bwnp a = bwnq.a();
            a.b(bwnoVar);
            a.c = bttqVar;
            dtnd dtndVar = bwnoVar.a.b;
            if (dtndVar == null) {
                dtndVar = dtnd.l;
            }
            dtjb dtjbVar = dtndVar.e;
            if (dtjbVar == null) {
                dtjbVar = dtjb.h;
            }
            for (dtja dtjaVar : new dsrh(dtjbVar.b, dtjb.c)) {
                bwjw bwjwVar = this.a;
                a.a = dtjaVar;
                bwjwVar.a(a.a());
            }
        } else if (dvtsVar == null) {
            c();
        } else {
            this.b.h.a().k(dvtsVar.c);
            dtnh dtnhVar = dvtsVar.a;
            if (dtnhVar == null) {
                dtnhVar = dtnh.g;
            }
            btlu j = this.b.i.a().j();
            if (j == null) {
                j = btlu.b;
            }
            if (!btlu.g(this.c.i, j)) {
                c();
                return;
            }
            this.b.g.e(this.c, this.b.c.e() / 1000);
            bwjl bwjlVar = this.b.j;
            btlu btluVar = this.c.i;
            dtis dtisVar = dtnhVar.d;
            if (dtisVar == null) {
                dtisVar = dtis.d;
            }
            if (dtisVar != null && (dtisVar.a & 1) != 0) {
                bwjlVar.c.ad(bvjk.dV, btluVar, dtisVar.b);
            }
            this.b.b.b(new cjqs(dtnhVar.e));
            if (this.a == null) {
                return;
            }
            bwnp a2 = bwnq.a();
            a2.b(this.c);
            a2.b = dtnhVar;
            a2.f = dvtsVar.b;
            dtjh dtjhVar = dtnhVar.f;
            if (dtjhVar == null) {
                dtjhVar = dtjh.c;
            }
            if ((dtjhVar.a & 1) != 0) {
                dtjh dtjhVar2 = dtnhVar.f;
                if (dtjhVar2 == null) {
                    dtjhVar2 = dtjh.c;
                }
                String str = dtjhVar2.b;
            }
            dtnd dtndVar2 = this.c.a.b;
            if (dtndVar2 == null) {
                dtndVar2 = dtnd.l;
            }
            dtjb dtjbVar2 = dtndVar2.e;
            if (dtjbVar2 == null) {
                dtjbVar2 = dtjb.h;
            }
            for (dtja dtjaVar2 : new dsrh(dtjbVar2.b, dtjb.c)) {
                List<dtmr> g = bwnd.g(dtnhVar, bwnd.h(dtjaVar2, this.c));
                bwjw bwjwVar2 = this.a;
                a2.a = dtjaVar2;
                a2.e = g;
                bwjwVar2.a(a2.a());
            }
        }
    }

    public final boolean equals(@dzsi Object obj) {
        return obj != null && obj.getClass() == getClass() && dbsd.a(((bwjq) obj).a, this.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}

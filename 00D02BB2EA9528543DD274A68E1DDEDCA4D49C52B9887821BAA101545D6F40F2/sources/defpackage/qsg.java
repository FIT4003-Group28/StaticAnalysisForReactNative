package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: qsg  reason: default package */
/* loaded from: classes7.dex */
public class qsg {
    public final HashMap<srv, deig<amte>> a = new HashMap<>();
    final qsf b = new qsf(this);
    private final btrm c;
    private final dzsj<srv> d;

    public qsg(btrm btrmVar, dzsj<srv> dzsjVar) {
        this.c = btrmVar;
        this.d = dzsjVar;
    }

    private final synchronized void d() {
        for (deig<amte> deigVar : this.a.values()) {
            deigVar.cancel(true);
        }
        this.a.clear();
    }

    public final void a() {
        btrm btrmVar = this.c;
        qsf qsfVar = this.b;
        dceq a = dcet.a();
        a.b(srf.class, new qsh(srf.class, qsfVar, bvrj.UI_THREAD));
        btrmVar.g(qsfVar, a.a());
    }

    public final void b() {
        d();
        this.c.a(this.b);
    }

    public final synchronized dehn<amte> c(vun vunVar) {
        deig<amte> d;
        d = deig.d();
        srv a = this.d.a();
        this.a.put(a, d);
        a.k(vunVar, true);
        return d;
    }
}

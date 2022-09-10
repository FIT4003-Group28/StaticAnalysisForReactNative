package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: hwq  reason: default package */
/* loaded from: classes.dex */
public final class hwq {
    public final btrm a;
    public final hwp b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    private final akox d;

    public hwq(btrm btrmVar, akox akoxVar) {
        this.a = btrmVar;
        this.d = akoxVar;
        this.b = new hwp(akoxVar);
    }

    @dzsi
    @Deprecated
    public static cjtd c(@dzsi akqi akqiVar, boolean z, aksh akshVar, dmrh dmrhVar) {
        cjtd c;
        decs a = akqiVar != null ? decs.a(akqiVar.c) : null;
        if (z) {
            c = akshVar.b(a);
        } else {
            c = akshVar.c(a);
        }
        if ((dmrhVar.a & 16) != 0) {
            cjta c2 = cjtd.c(c);
            ddji bZ = ddjj.c.bZ();
            String str = dmrhVar.e;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddjj ddjjVar = (ddjj) bZ.b;
            str.getClass();
            ddjjVar.a |= 1;
            ddjjVar.b = str;
            c2.k(bZ.bK());
            return c2.a();
        }
        return c;
    }

    public final void a() {
        bvqj.c(this.d.k, new bvqg(this) { // from class: hwm
            private final hwq a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                hwq hwqVar = this.a;
                akoq akoqVar = (akoq) obj;
                btrm btrmVar = hwqVar.a;
                hwp hwpVar = hwqVar.b;
                dceq a = dcet.a();
                a.b(gds.class, new hwr(0, gds.class, hwpVar));
                a.b(amwe.class, new hwr(1, amwe.class, hwpVar, bvrj.UI_THREAD));
                a.b(bvkc.class, new hwr(2, bvkc.class, hwpVar));
                a.b(btvr.class, new hwr(3, btvr.class, hwpVar));
                a.b(amqo.class, new hwr(4, amqo.class, hwpVar, bvrj.UI_THREAD));
                btrmVar.g(hwpVar, a.a());
                hwqVar.c.set(true);
                hwp hwpVar2 = hwqVar.b;
                hwpVar2.b = new hwn(hwqVar.a);
                hwpVar2.a.aj().aC().k(hwpVar2.b);
                hwp hwpVar3 = hwqVar.b;
                hwpVar3.c = new hwo(hwqVar.a);
                hwpVar3.a.aj().aC().m(hwpVar3.c);
            }
        }, dege.a);
    }

    public final void b() {
        if (this.c.compareAndSet(true, false)) {
            hwp hwpVar = this.b;
            hwpVar.a.aj().aC().l(hwpVar.b);
            if (hwpVar.c != null) {
                hwpVar.a.aj().aC().n(hwpVar.c);
            }
            this.a.a(this.b);
        }
    }
}

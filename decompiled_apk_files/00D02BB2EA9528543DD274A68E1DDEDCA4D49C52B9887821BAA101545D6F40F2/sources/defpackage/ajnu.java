package defpackage;
/* compiled from: PG */
/* renamed from: ajnu  reason: default package */
/* loaded from: classes2.dex */
public final class ajnu {
    public final dehn<Boolean> a;
    public boolean b;
    public dehn<Long> c;
    final /* synthetic */ ajnv d;
    private final long e;
    private final long f;
    private final boolean g;
    private final dcep<ckgc> h;
    private final dbsg<String> i;

    public ajnu(ajnv ajnvVar, long j, long j2, boolean z, dcep<ckgc> dcepVar, long j3, dbsg<String> dbsgVar) {
        this.d = ajnvVar;
        this.b = false;
        this.e = j;
        this.f = j2;
        this.g = z;
        this.h = dcepVar;
        this.c = deha.a(Long.valueOf(j3));
        this.i = dbsgVar;
        this.a = deha.a(false);
    }

    public final synchronized void a() {
        if (this.b) {
            return;
        }
        this.b = true;
        dehn<Long> dehnVar = this.c;
        if (dehnVar == null || !dehnVar.isDone()) {
            return;
        }
        b();
    }

    public final synchronized void b() {
        dehn<Long> dehnVar = this.c;
        dbsk.s(dehnVar);
        Long l = (Long) deha.s(dehnVar);
        if (l == null) {
            return;
        }
        dcdn<dqym, ckgc> dcdnVar = ajnv.a;
        this.d.d(l);
        this.d.d.q(l.longValue());
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.h("isCancelled", this.b);
        b.h("becomePrimaryDevice", this.g);
        b.g("durationMs", this.e);
        b.g("uploadIntervalMs", this.f);
        b.b("uploadJustifications", this.h);
        b.b("ovenfreshIdentifier", this.i);
        return b.toString();
    }

    public ajnu(ajnv ajnvVar, final btlu btluVar, final long j, final long j2, final boolean z, final dcep<ckgc> dcepVar, final dbsg<String> dbsgVar) {
        this.d = ajnvVar;
        this.b = false;
        this.e = j;
        this.f = j2;
        this.g = z;
        this.h = dcepVar;
        this.i = dbsgVar;
        final deig d = deig.d();
        this.a = d;
        final dehn<Boolean> e = ajnvVar.d.e(btluVar);
        e.Pk(new Runnable(this, e, j, j2, dcepVar, btluVar, z, dbsgVar, d) { // from class: ajns
            private final ajnu a;
            private final dehn b;
            private final long c;
            private final long d;
            private final dcep e;
            private final btlu f;
            private final boolean g;
            private final dbsg h;
            private final deig i;

            {
                this.a = this;
                this.b = e;
                this.c = j;
                this.d = j2;
                this.e = dcepVar;
                this.f = btluVar;
                this.g = z;
                this.h = dbsgVar;
                this.i = d;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final ajnu ajnuVar = this.a;
                dehn dehnVar = this.b;
                final long j3 = this.c;
                final long j4 = this.d;
                final dcep dcepVar2 = this.e;
                btlu btluVar2 = this.f;
                boolean z2 = this.g;
                dbsg dbsgVar2 = this.h;
                final deig deigVar = this.i;
                if (!((Boolean) deha.s(dehnVar)).booleanValue()) {
                    dcdn<dqym, ckgc> dcdnVar = ajnv.a;
                    ajnuVar.b = true;
                    return;
                }
                dcpd it = dcepVar2.iterator();
                while (it.hasNext()) {
                    ((ckco) ajnuVar.d.b.a(ckgd.g)).a(((ckgc) it.next()).n);
                }
                ajnuVar.c = ajnuVar.d.d.p(btluVar2, ajnv.f(z2, dcepVar2, dbsgVar2), j3, j4);
                ajnuVar.c.Pk(new Runnable(ajnuVar, j3, j4, deigVar, dcepVar2) { // from class: ajnt
                    private final ajnu a;
                    private final long b;
                    private final long c;
                    private final deig d;
                    private final dcep e;

                    {
                        this.a = ajnuVar;
                        this.b = j3;
                        this.c = j4;
                        this.d = deigVar;
                        this.e = dcepVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ajnu ajnuVar2 = this.a;
                        long j5 = this.b;
                        long j6 = this.c;
                        deig deigVar2 = this.d;
                        dcep dcepVar3 = this.e;
                        synchronized (ajnuVar2) {
                            dehn<Long> dehnVar2 = ajnuVar2.c;
                            dbsk.s(dehnVar2);
                            Long l = (Long) deha.s(dehnVar2);
                            if (l == null) {
                                dcdn<dqym, ckgc> dcdnVar2 = ajnv.a;
                                ((ckco) ajnuVar2.d.b.a(ckgd.c)).a(ckfy.a(2));
                                deigVar2.j(false);
                                return;
                            }
                            dcdn<dqym, ckgc> dcdnVar3 = ajnv.a;
                            ((ckco) ajnuVar2.d.b.a(ckgd.c)).a(ckfy.a(1));
                            deigVar2.j(true);
                            dccx F = dcdc.F();
                            dcpd it2 = dcepVar3.iterator();
                            while (it2.hasNext()) {
                                F.g(((ckgc) it2.next()).name());
                            }
                            ajny bZ = ajnz.g.bZ();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            ajnz ajnzVar = (ajnz) bZ.b;
                            int i = 2 | ajnzVar.a;
                            ajnzVar.a = i;
                            ajnzVar.c = j5;
                            ajnzVar.a = i | 4;
                            ajnzVar.d = j6;
                            dcdc f = F.f();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            ajnz ajnzVar2 = (ajnz) bZ.b;
                            dsrj<String> dsrjVar = ajnzVar2.e;
                            if (!dsrjVar.a()) {
                                ajnzVar2.e = dsqw.cl(dsrjVar);
                            }
                            dsod.bv(f, ajnzVar2.e);
                            long longValue = l.longValue();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            ajnz ajnzVar3 = (ajnz) bZ.b;
                            ajnzVar3.a |= 1;
                            ajnzVar3.b = longValue;
                            ajnuVar2.d.c(bZ.bK());
                            if (ajnuVar2.b) {
                                ajnuVar2.b();
                            }
                        }
                    }
                }, ajnuVar.d.c.h());
            }
        }, ajnvVar.c.h());
    }
}

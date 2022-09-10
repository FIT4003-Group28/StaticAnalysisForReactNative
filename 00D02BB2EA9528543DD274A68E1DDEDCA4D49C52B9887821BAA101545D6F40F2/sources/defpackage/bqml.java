package defpackage;

import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
/* renamed from: bqml  reason: default package */
/* loaded from: classes4.dex */
public final class bqml implements bqli {
    private static final dcqe a = dcqe.c("bqml");
    private final dxio<bqlc> b;
    private final dxio<ckcw> c;
    private final ConcurrentMap<akqi, bqmk> d = dcjz.j();

    public bqml(dxio<bqlc> dxioVar, dxio<ckcw> dxioVar2) {
        this.b = dxioVar;
        this.c = dxioVar2;
    }

    private final synchronized void c(bqmi bqmiVar) {
        bqla a2 = bqmiVar.a();
        bqkx a3 = a2.a();
        akqi a4 = a3.a();
        dqgr d = a3.d();
        dnqh a5 = a2.b().a();
        ily ilyVar = new ily();
        ilyVar.j(a4);
        bwrs<ilo> a6 = bwrs.a(ilyVar.d());
        bqmg bqmgVar = new bqmg(this, a4, bqmiVar);
        if (a3.b() == 0) {
            this.b.a().d(a4, d, a5, a6, bqmgVar);
        } else {
            this.b.a().b(a2, a6, bqmgVar);
        }
    }

    @Override // defpackage.bqli
    public final synchronized void a(bqla bqlaVar, bqlb bqlbVar, long j) {
        akqi a2 = bqlaVar.a().a();
        ConcurrentMap<akqi, bqmk> concurrentMap = this.d;
        bqll bqllVar = new bqll();
        bqllVar.d(Long.MIN_VALUE);
        concurrentMap.putIfAbsent(a2, bqllVar.a());
        bqmk bqmkVar = this.d.get(a2);
        dbsk.s(bqmkVar);
        if (j < bqmkVar.c()) {
            ((ckco) this.c.a().a(ckdz.aw)).a(ckdy.a(2));
            return;
        }
        bqlj bqljVar = new bqlj();
        if (bqlaVar != null) {
            bqljVar.a = bqlaVar;
            bqljVar.b = bqlbVar;
            String str = bqljVar.a == null ? " reviewRequest" : "";
            if (bqljVar.b == null) {
                str = str.concat(" callback");
            }
            if (!str.isEmpty()) {
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
            }
            bqlk bqlkVar = new bqlk(bqljVar.a, bqljVar.b);
            bqmj d = bqmkVar.d();
            d.d(j);
            if (bqmkVar.a() == null) {
                if (bqmkVar.b() != null) {
                    ((ckco) this.c.a().a(ckdz.aw)).a(ckdy.a(3));
                    bvoo.h("Bad state whereby currentlySendingRequest is null but nextRequestToSend was not!", new Object[0]);
                    d.c(null);
                }
                d.b(bqlkVar);
                c(bqlkVar);
                this.d.put(a2, d.a());
                return;
            }
            if (bqmkVar.b() != null) {
                ((ckco) this.c.a().a(ckdz.aw)).a(ckdy.a(1));
            }
            d.c(bqlkVar);
            this.d.put(a2, d.a());
            return;
        }
        throw new NullPointerException("Null reviewRequest");
    }

    public final synchronized void b(akqi akqiVar) {
        bqmk bqmkVar = this.d.get(akqiVar);
        if (bqmkVar == null) {
            bvoo.h("state for featureId %s is null when it should not be!", akqiVar);
            return;
        }
        if (bqmkVar.a() == null) {
            bvoo.h("currentlySendingRequest is null when it should not be!", new Object[0]);
        } else {
            dbsk.s(bqmkVar.a());
        }
        bqmj d = bqmkVar.d();
        d.b(bqmkVar.b());
        d.c(null);
        bqmk a2 = d.a();
        bqmi a3 = a2.a();
        if (a3 != null) {
            c(a3);
        }
        this.d.put(akqiVar, a2);
    }
}

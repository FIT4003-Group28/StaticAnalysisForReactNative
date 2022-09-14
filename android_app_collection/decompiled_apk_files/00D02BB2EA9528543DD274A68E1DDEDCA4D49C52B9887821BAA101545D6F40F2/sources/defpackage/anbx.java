package defpackage;

import com.google.android.apps.maps.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: anbx  reason: default package */
/* loaded from: classes2.dex */
public final class anbx {
    public final pfc a;
    public final btvo b;
    public final dxio<pff> c;
    public final dxio<akpq> d;
    public final dxio<akzh> e;
    public final anbo f;
    public final int i;
    public anbw k;
    private final cqat l;
    public final Map<akqi, anbn> j = new LinkedHashMap();
    public final AtomicReference<pfg> g = new AtomicReference<>();
    public final AtomicBoolean h = new AtomicBoolean();

    public anbx(cqat cqatVar, pfc pfcVar, btvo btvoVar, dxio<pff> dxioVar, dxio<akpq> dxioVar2, dxio<akzh> dxioVar3, anbo anboVar) {
        this.l = cqatVar;
        this.a = pfcVar;
        this.b = btvoVar;
        this.c = dxioVar;
        this.d = dxioVar2;
        this.e = dxioVar3;
        this.f = anboVar;
        this.i = btvoVar.getExploreMapParametersWithoutLogging().q;
    }

    public static dfoe d(pfo<dfoe> pfoVar) {
        pfm<dfoe> pfmVar = pfoVar.a;
        dbsk.s(pfmVar);
        dfoe dfoeVar = pfmVar.e;
        dbsk.s(dfoeVar);
        return dfoeVar;
    }

    public final void a() {
        this.c.a().d(pfb.a, this.l.b() - TimeUnit.DAYS.toMillis(7L)).l(anbp.a).l(anbq.a).j(anbr.a).i(this.i).k(new dbrn(this) { // from class: anbs
            private final anbx a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                anbo anboVar = this.a.f;
                dfoe dfoeVar = (dfoe) ((pfm) obj).e;
                dbsk.s(dfoeVar);
                return anboVar.a(dfoeVar);
            }
        }).h(new anbu(this));
    }

    public final void c() {
        synchronized (this.j) {
            for (anbn anbnVar : this.j.values()) {
                anbnVar.b();
            }
            this.j.clear();
        }
    }

    public final void b(anbn anbnVar) {
        synchronized (this.j) {
            if (!anbnVar.g) {
                anbnVar.g = true;
                aksn a = anbnVar.b.a();
                akuh n = anbnVar.c.a().n(2);
                dmos bZ = dmot.f.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dmot dmotVar = (dmot) bZ.b;
                dmotVar.a |= 1;
                dmotVar.b = 19;
                dmou bZ2 = dmov.d.bZ();
                dbsk.s(n);
                dmpc e = n.e();
                String string = anbnVar.a.getString(R.string.RECENTLY_VIEWED);
                if (e.c) {
                    e.bF();
                    e.c = false;
                }
                dmpd dmpdVar = (dmpd) e.b;
                dmpd dmpdVar2 = dmpd.h;
                string.getClass();
                dmpdVar.a |= 1;
                dmpdVar.b = string;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dmov dmovVar = (dmov) bZ2.b;
                dmpd dmpdVar3 = (dmpd) e.bK();
                dmpdVar3.getClass();
                dmovVar.b();
                dmovVar.b.add(dmpdVar3);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dmot dmotVar2 = (dmot) bZ.b;
                dmov bK = bZ2.bK();
                bK.getClass();
                dmotVar2.c = bK;
                dmotVar2.a |= 2;
                dmoq bZ3 = dmor.c.bZ();
                int intValue = anbnVar.e.a().intValue();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dmor dmorVar = (dmor) bZ3.b;
                dmorVar.a |= 1;
                dmorVar.b = intValue;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dmot dmotVar3 = (dmot) bZ.b;
                dmor bK2 = bZ3.bK();
                bK2.getClass();
                dmotVar3.e = bK2;
                dmotVar3.a |= 8;
                dmot bK3 = bZ.bK();
                dmrs dmrsVar = (dmrs) dmrt.k.bZ();
                dmry bZ4 = dmrz.d.bZ();
                long j = anbnVar.c().c;
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                dmrz dmrzVar = (dmrz) bZ4.b;
                dmrzVar.a |= 1;
                dmrzVar.b = j;
                if (dmrsVar.c) {
                    dmrsVar.bF();
                    dmrsVar.c = false;
                }
                dmrt dmrtVar = (dmrt) dmrsVar.b;
                dmrz bK4 = bZ4.bK();
                bK4.getClass();
                dmrtVar.b = bK4;
                dmrtVar.a = 1 | dmrtVar.a;
                if (dmrsVar.c) {
                    dmrsVar.bF();
                    dmrsVar.c = false;
                }
                dmrt dmrtVar2 = (dmrt) dmrsVar.b;
                bK3.getClass();
                dmrtVar2.c = bK3;
                dmrtVar2.a |= 2;
                dmru bZ5 = dmrv.d.bZ();
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                dmrv dmrvVar = (dmrv) bZ5.b;
                dsrf dsrfVar = dmrvVar.a;
                if (!dsrfVar.a()) {
                    dmrvVar.a = dsqw.cg(dsrfVar);
                }
                dmrvVar.a.h(1378759);
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                dmrv dmrvVar2 = (dmrv) bZ5.b;
                dsrf dsrfVar2 = dmrvVar2.c;
                if (!dsrfVar2.a()) {
                    dmrvVar2.c = dsqw.cg(dsrfVar2);
                }
                dmrvVar2.c.h(1378758);
                if (dmrsVar.c) {
                    dmrsVar.bF();
                    dmrsVar.c = false;
                }
                dmrt dmrtVar3 = (dmrt) dmrsVar.b;
                dmrv bK5 = bZ5.bK();
                bK5.getClass();
                dmrtVar3.d = bK5;
                dmrtVar3.a |= 4;
                anbnVar.h = a.a((dmrt) dmrsVar.bK());
                dbsg<dmpn> d = anbnVar.d();
                if (d.a()) {
                    anbnVar.f = anbnVar.a(d.b());
                }
            }
            this.j.put(anbnVar.c(), anbnVar);
        }
    }
}

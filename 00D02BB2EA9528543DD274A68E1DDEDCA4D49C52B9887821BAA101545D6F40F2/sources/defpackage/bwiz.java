package defpackage;

import android.app.Application;
import android.util.Base64;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bwiz  reason: default package */
/* loaded from: classes4.dex */
public final class bwiz implements btph {
    public btlu a;
    public bwnx b;
    @dzsi
    private dtis c;
    private final btnc<bwiy, bwnv> d;
    private final bwrg<bwnx> e;

    public bwiz(Application application, btmv btmvVar, Executor executor) {
        bwrg<bwnx> bwrgVar = new bwrg<>((dssr) bwnx.d.cu(7), application, bwre.PERSISTENT_FILE, "odelay_cache", executor);
        this.a = btlu.a;
        this.b = bwnx.d;
        this.d = new btnc<>(100, btmz.ODELAY, btmvVar);
        this.e = bwrgVar;
    }

    private final synchronized boolean i(bwno bwnoVar) {
        return btlu.g(bwnoVar.i, this.a);
    }

    @dzsi
    private final synchronized bwnv j(bwiy bwiyVar) {
        if (!bwiyVar.b()) {
            return null;
        }
        if (bwiyVar.c()) {
            if (!this.b.b.containsKey(Integer.valueOf(bwiyVar.a.A))) {
                return null;
            }
            bwnx bwnxVar = this.b;
            int i = bwiyVar.a.A;
            bwnv bwnvVar = bwnv.e;
            dssd<Integer, bwnv> dssdVar = bwnxVar.b;
            Integer valueOf = Integer.valueOf(i);
            if (!dssdVar.containsKey(valueOf)) {
                return bwnvVar;
            }
            return dssdVar.get(valueOf);
        }
        return this.d.a(bwiyVar);
    }

    private final synchronized void k(dtja dtjaVar, bwno bwnoVar, long j) {
        bwiy a = bwiy.a(dtjaVar, bwnoVar);
        if (a.b()) {
            dvts dvtsVar = bwnoVar.e;
            dbsk.s(dvtsVar);
            bwnu bZ = bwnv.e.bZ();
            dtnh dtnhVar = dvtsVar.a;
            if (dtnhVar == null) {
                dtnhVar = dtnh.g;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bwnv bwnvVar = (bwnv) bZ.b;
            dtnhVar.getClass();
            bwnvVar.b = dtnhVar;
            int i = bwnvVar.a | 1;
            bwnvVar.a = i;
            int i2 = i | 2;
            bwnvVar.a = i2;
            bwnvVar.c = j;
            boolean z = dvtsVar.b;
            bwnvVar.a = i2 | 4;
            bwnvVar.d = z;
            bwnv bK = bZ.bK();
            if (a.c()) {
                bwnt ca = bwnx.d.ca(this.b);
                int i3 = a.a.A;
                bK.getClass();
                if (ca.c) {
                    ca.bF();
                    ca.c = false;
                }
                bwnx bwnxVar = (bwnx) ca.b;
                dssd<Integer, bwnv> dssdVar = bwnxVar.b;
                if (!dssdVar.a) {
                    bwnxVar.b = dssdVar.a();
                }
                bwnxVar.b.put(Integer.valueOf(i3), bK);
                this.b = ca.bK();
                return;
            }
            this.d.Pz(a, bK);
        }
    }

    @Override // defpackage.btph
    public final synchronized void NX(String str, PrintWriter printWriter) {
        printWriter.println(str.concat("OdelayCache:"));
        printWriter.println(str.concat("  encoded primaryResponseCache [gmm.startpage.StartPageResponseCache]"));
        String encodeToString = Base64.encodeToString(this.b.bS(), 0);
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(encodeToString).length());
        sb.append(str);
        sb.append("  ");
        sb.append(encodeToString);
        printWriter.println(sb.toString());
        printWriter.println(str.concat("  encoded secondaryResponseCache [gmm.startpage.StartPageResponseCache.CachedData]"));
        for (bwnv bwnvVar : this.d.p()) {
            String encodeToString2 = Base64.encodeToString(bwnvVar.bS(), 0);
            StringBuilder sb2 = new StringBuilder(str.length() + 2 + String.valueOf(encodeToString2).length());
            sb2.append(str);
            sb2.append("  ");
            sb2.append(encodeToString2);
            printWriter.println(sb2.toString());
        }
    }

    @dzsi
    public final synchronized bwnv a(bwno bwnoVar) {
        dtnd dtndVar = bwnoVar.a.b;
        if (dtndVar == null) {
            dtndVar = dtnd.l;
        }
        dtjb dtjbVar = dtndVar.e;
        if (dtjbVar == null) {
            dtjbVar = dtjb.h;
        }
        dsrh dsrhVar = new dsrh(dtjbVar.b, dtjb.c);
        if (dsrhVar.size() != 1) {
            bvoo.f(new IllegalArgumentException("OdelayCache does not support multiple UI types"));
            return null;
        } else if (bwnoVar.n()) {
            return null;
        } else {
            if (!i(bwnoVar)) {
                return null;
            }
            return j(bwiy.a((dtja) dsrhVar.get(0), bwnoVar));
        }
    }

    public final synchronized dtkh b() {
        dtis dtisVar = this.c;
        if (dtisVar == null) {
            return dtkh.d;
        }
        dtkh dtkhVar = dtisVar.c;
        if (dtkhVar != null) {
            return dtkhVar;
        }
        return dtkh.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        this.c = null;
        if (!this.a.l()) {
            this.b = bwnx.d;
        } else {
            bwnt bZ = bwnx.d.bZ();
            String str = this.a.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bwnx bwnxVar = (bwnx) bZ.b;
            str.getClass();
            bwnxVar.a |= 1;
            bwnxVar.c = str;
            this.b = bZ.bK();
        }
        this.d.e();
    }

    public final synchronized void e(bwno bwnoVar, long j) {
        dtnd dtndVar = bwnoVar.a.b;
        if (dtndVar == null) {
            dtndVar = dtnd.l;
        }
        String str = dtndVar.i;
        if (i(bwnoVar)) {
            dvts dvtsVar = bwnoVar.e;
            dbsk.s(dvtsVar);
            dtnh dtnhVar = dvtsVar.a;
            if (dtnhVar == null) {
                dtnhVar = dtnh.g;
            }
            if ((dtnhVar.a & 8) != 0) {
                dtnh dtnhVar2 = dvtsVar.a;
                if (dtnhVar2 == null) {
                    dtnhVar2 = dtnh.g;
                }
                dtis dtisVar = dtnhVar2.d;
                if (dtisVar == null) {
                    dtisVar = dtis.d;
                }
                this.c = dtisVar;
            }
            dtjb dtjbVar = dtndVar.e;
            if (dtjbVar == null) {
                dtjbVar = dtjb.h;
            }
            for (dtja dtjaVar : new dsrh(dtjbVar.b, dtjb.c)) {
                k(dtjaVar, bwnoVar, j);
            }
        }
    }

    public final synchronized boolean f(@dzsi btlu btluVar) {
        dbsk.s(btluVar);
        if (btlu.g(this.a, btluVar)) {
            return false;
        }
        if (this.a.l() && this.e.b()) {
            this.e.g();
        }
        d();
        this.a = btluVar;
        return true;
    }

    public final synchronized void g() {
        this.e.h(new dbsz(this) { // from class: bwix
            private final bwiz a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                bwiz bwizVar = this.a;
                bwnx bwnxVar = (bwnx) obj;
                bvrj.UI_THREAD.d();
                if (bwnxVar == null) {
                    return;
                }
                synchronized (bwizVar) {
                    if (bwizVar.a.l() && bwizVar.a.d.equals(bwnxVar.c)) {
                        bwizVar.b = bwnxVar;
                    }
                }
            }
        });
    }

    public final synchronized void h() {
        bwnx bwnxVar;
        if (!this.a.l() || (bwnxVar = this.b) == null || !this.a.d.equals(bwnxVar.c)) {
            return;
        }
        this.e.e(this.b);
    }
}

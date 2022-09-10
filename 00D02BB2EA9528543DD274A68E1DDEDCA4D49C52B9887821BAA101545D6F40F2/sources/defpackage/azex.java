package defpackage;

import android.app.Application;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: azex  reason: default package */
/* loaded from: classes3.dex */
public final class azex implements pbu {
    private final dxio<akfa> a;
    private final buap b;
    private final buas c;
    private final bvjj d;
    private final long e;
    private final String f;

    public azex(dxio<akfa> dxioVar, buap buapVar, buas buasVar, bvjj bvjjVar, Application application) {
        this.a = dxioVar;
        this.b = buapVar;
        this.c = buasVar;
        this.d = bvjjVar;
        this.f = application.getPackageName();
        long j = 0;
        try {
            j = cpke.g(application.getContentResolver(), 0L);
        } catch (SecurityException unused) {
        }
        this.e = j;
    }

    private final <I extends dssj, O extends dssj> cvty<O> c(btzo<I, O> btzoVar, String str, I i) {
        dbsg dbsgVar;
        bvrj.UI_THREAD.d();
        Iterator<btlu> it = this.a.a().t().iterator();
        while (true) {
            if (it.hasNext()) {
                btlu next = it.next();
                if (next.s().name.equals(str)) {
                    dbsgVar = dbsg.i(next);
                    break;
                }
            } else {
                dbsgVar = dbpy.a;
                break;
            }
        }
        if (!dbsgVar.a() || btlu.i((btlu) dbsgVar.b()) != btlt.GOOGLE) {
            cvtv d = cvty.d();
            d.b = new RuntimeException("No currently logged-in account");
            d.b(false);
            return d.a();
        }
        btzoVar.a().e = (btlu) dbsgVar.b();
        deig d2 = deig.d();
        btzoVar.b().a(i, new azew(d2), bvrj.BACKGROUND_THREADPOOL);
        return (cvty) deha.s(d2);
    }

    private final dsay d(String str) {
        drxy bZ = drxz.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drxz drxzVar = (drxz) bZ.b;
        str.getClass();
        int i = drxzVar.a | 1;
        drxzVar.a = i;
        drxzVar.b = str;
        String str2 = this.f;
        str2.getClass();
        int i2 = i | 8;
        drxzVar.a = i2;
        drxzVar.d = str2;
        long j = this.e;
        if (j != 0) {
            drxzVar.a = i2 | 4;
            drxzVar.c = j;
        }
        dsax bZ2 = dsay.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dsay dsayVar = (dsay) bZ2.b;
        dsayVar.b = 3;
        dsayVar.a |= 1;
        drxr bZ3 = drxs.c.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        drxs drxsVar = (drxs) bZ3.b;
        drxz bK = bZ.bK();
        bK.getClass();
        drxsVar.b = bK;
        drxsVar.a = 1;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dsay dsayVar2 = (dsay) bZ2.b;
        drxs bK2 = bZ3.bK();
        bK2.getClass();
        dsayVar2.c = bK2;
        dsayVar2.a |= 2;
        return bZ2.bK();
    }

    @Override // defpackage.pbu
    public final void a(String str, List<String> list) {
        dbsk.b(!dbsj.d(str), "AccountName cannot be null or empty");
        dbsk.b(!list.isEmpty(), "No topics provided");
        String z = this.d.z(bvjk.gf, null);
        if (dbsj.d(z)) {
            cviw.c(new Exception("No GCM registration found"));
            return;
        }
        buap buapVar = this.b;
        drym bZ = dryn.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dryn drynVar = (dryn) bZ.b;
        drynVar.a |= 1;
        drynVar.b = "gmm";
        bZ.a(list);
        drxp bZ2 = drxq.d.bZ();
        dsay d = d(z);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drxq drxqVar = (drxq) bZ2.b;
        d.getClass();
        drxqVar.b = d;
        drxqVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dryn drynVar2 = (dryn) bZ.b;
        drxq bK = bZ2.bK();
        bK.getClass();
        drynVar2.b();
        drynVar2.d.add(bK);
        Throwable b = c(buapVar, str, bZ.bK()).b();
        if (b != null) {
            cviw.c(b);
        } else {
            cviw cviwVar = cviw.a;
        }
    }

    @Override // defpackage.pbu
    public final void b(String str, List<String> list) {
        dbsk.b(!dbsj.d(str), "AccountName cannot be null or empty");
        dbsk.b(!list.isEmpty(), "No topics provided");
        String z = this.d.z(bvjk.gf, null);
        if (dbsj.d(z)) {
            cviw.c(new Exception("No GCM registration found"));
            return;
        }
        buas buasVar = this.c;
        dryq bZ = dryr.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dryr dryrVar = (dryr) bZ.b;
        dryrVar.a |= 1;
        dryrVar.b = "gmm";
        bZ.a(list);
        bZ.b(d(z));
        Throwable b = c(buasVar, str, bZ.bK()).b();
        if (b != null) {
            cviw.c(b);
        } else {
            cviw cviwVar = cviw.a;
        }
    }
}

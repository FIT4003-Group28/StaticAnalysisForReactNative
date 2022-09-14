package defpackage;

import android.app.Application;
import android.util.DisplayMetrics;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: cgth  reason: default package */
/* loaded from: classes4.dex */
public final class cgth {
    public final ahtd a;
    public final cgsy b;
    public final cger c;
    public final cqat d;
    public final cgtn e;
    private final Application f;
    private final cgsz g;
    private final btvo h;
    private final buuu i;
    private final cguv j;

    public cgth(Application application, buuu buuuVar, ahtd ahtdVar, cgsy cgsyVar, cgeq cgeqVar, cqat cqatVar, cgsz cgszVar, cgtn cgtnVar, cguv cguvVar, btvo btvoVar) {
        this.f = application;
        this.i = buuuVar;
        this.a = ahtdVar;
        this.b = cgsyVar;
        cgeqVar.c.putIfAbsent("ugc_tasks_nearby_need_publisher_response_cache", new cger(cgeqVar.a, cgeqVar.b));
        cger cgerVar = cgeqVar.c.get("ugc_tasks_nearby_need_publisher_response_cache");
        int i = cgerVar.c;
        this.c = cgerVar;
        this.d = cqatVar;
        this.g = cgszVar;
        this.e = cgtnVar;
        this.j = cguvVar;
        this.h = btvoVar;
    }

    public static double a(GmmLocation gmmLocation, dhjz dhjzVar) {
        return gmmLocation.F(akqq.j(dhjzVar));
    }

    @dzsi
    public final dwsr b(GmmLocation gmmLocation) {
        alaa b = alad.b(akzd.a());
        b.d(gmmLocation.C());
        b.c = 18.0f;
        DisplayMetrics displayMetrics = this.f.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        cguu a = cguv.a(alad.d(b.a(), displayMetrics.density, 30.0f, i, i2));
        a.b = dpyv.UGC_TASKS_NEARBY_NEED;
        dnqg bZ = dnqh.p.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh.b((dnqh) bZ.b);
        a.f = bZ.bK();
        dwsn a2 = a.a();
        deig d = deig.d();
        this.i.a(a2, new cgtg(d), bvrj.BACKGROUND_THREADPOOL);
        try {
            dwta dwtaVar = this.h.getUgcTasksParameters().g;
            if (dwtaVar == null) {
                dwtaVar = dwta.c;
            }
            dwsr dwsrVar = (dwsr) d.get(dwtaVar.b, TimeUnit.SECONDS);
            if (dwsrVar == null) {
                this.g.a(3);
            } else {
                this.g.a(2);
            }
            return dwsrVar;
        } catch (InterruptedException unused) {
            this.g.a(6);
            return null;
        } catch (ExecutionException unused2) {
            this.g.a(5);
            return null;
        } catch (TimeoutException unused3) {
            this.g.a(4);
            return null;
        }
    }
}

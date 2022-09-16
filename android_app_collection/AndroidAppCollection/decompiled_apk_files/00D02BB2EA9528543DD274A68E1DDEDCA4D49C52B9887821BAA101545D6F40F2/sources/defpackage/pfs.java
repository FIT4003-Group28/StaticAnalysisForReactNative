package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: pfs  reason: default package */
/* loaded from: classes7.dex */
public final class pfs implements pey {
    public final Context a;
    public final dxio<ckcw> b;
    private final Executor c;
    private final cqat d;
    private final dxio<btvo> e;
    private final LinkedHashMap<String, pfr> f = new LinkedHashMap<>(8, 0.75f, true);

    public pfs(Context context, Executor executor, cqat cqatVar, dxio<btvo> dxioVar, dxio<ckcw> dxioVar2) {
        this.a = context;
        this.c = executor;
        this.d = cqatVar;
        this.e = dxioVar;
        this.b = dxioVar2;
    }

    public final void a(pex pexVar, ilo iloVar) {
        if (!akqi.d(iloVar.ai()) || iloVar.ai().b == 0 || !iloVar.f || iloVar.r) {
            return;
        }
        if (iloVar.be() != iln.BUSINESS && (iloVar.be() != iln.GEOCODE || !iloVar.h().ao)) {
            return;
        }
        this.c.execute(new pfq(this, pexVar, iloVar, ((ckcr) this.b.a().a(ckdf.a)).a()));
    }

    public final synchronized void b(String str, String str2, ilo iloVar) {
        String I;
        pfr pfrVar = new pfr(this.d, iloVar);
        pfr pfrVar2 = this.f.get(str2);
        if (pfrVar2 != null && ((!pfrVar.b || pfrVar2.b) && pfrVar.a <= pfrVar2.a + 1800000)) {
            return;
        }
        this.f.put(str2, pfrVar);
        while (this.f.size() > 100) {
            Iterator<Map.Entry<String, pfr>> it = this.f.entrySet().iterator();
            it.next();
            it.remove();
        }
        delp delpVar = delp.getInstance(this.a);
        demc demcVar = new demc("Place");
        demcVar.e(str2);
        demc a = demcVar.a(str);
        if (!TextUtils.isEmpty(iloVar.B())) {
            a.d("address", iloVar.B());
        }
        String str3 = iloVar.ah().c;
        if (!TextUtils.isEmpty(str3)) {
            a.d("sameAs", str3);
        }
        if (this.e.a().getUgcParameters().w()) {
            I = iloVar.J();
        } else {
            I = iloVar.I();
        }
        if (!TextUtils.isEmpty(I)) {
            a.d("telephone", I);
        }
        dwgn bF = iloVar.bF();
        String str4 = null;
        if (bF != null && bF.a.size() > 0) {
            str4 = bF.a.get(0).h;
        }
        if (!TextUtils.isEmpty(str4)) {
            a.d("image", str4);
        }
        try {
            akqq aj = iloVar.aj();
            if (aj != null) {
                demc demcVar2 = new demc("GeoCoordinates");
                demcVar2.d("latitude", Double.toString(aj.a));
                demcVar2.d("longitude", Double.toString(aj.b));
                a.c("geo", demcVar2.b());
            }
            float af = iloVar.af();
            if (!Float.isNaN(af)) {
                demc demcVar3 = new demc("AggregateRating");
                demcVar3.d("ratingValue", Float.toString(af));
                demt.putInBundle(demcVar3.a, "reviewCount", iloVar.X());
                a.c("aggregateRating", demcVar3.b());
            }
            String ar = iloVar.ar();
            if (!TextUtils.isEmpty(ar)) {
                demc demcVar4 = new demc("PropertyValue");
                demcVar4.d("name", "category");
                demcVar4.d("value", ar);
                a.c("additionalProperty", demcVar4.b());
            }
        } catch (delt e) {
            bvoo.f(new RuntimeException("Unexpected exception.", e));
        }
        try {
            cpda.d(delpVar.a(a.b()));
        } catch (InterruptedException | ExecutionException unused) {
        }
    }
}

package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bhls  reason: default package */
/* loaded from: classes3.dex */
public final class bhls extends cqiw<zcq> {
    public static final cqtv a;
    public static final cqtv b;
    public static final cqrp c;
    public static final cqrp d;
    public static final cqtv e;
    private static final cqrp f;
    private static final cqtv g;

    static {
        cqtb d2 = cqrt.d(R.dimen.station_place_page_chip_distance);
        a = d2;
        b = cqrt.d(R.dimen.station_place_page_chip_height);
        c = cqrp.d(16.0d);
        d = cqrp.d(12.0d);
        cqrp d3 = cqrp.d(208.0d);
        f = d3;
        cqtv f2 = cqsg.f(cqsg.d(d3, d2), Float.valueOf(0.25f));
        g = f2;
        e = cqsg.g(f2, d2);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> e(cqmp<T>... cqmpVarArr) {
        cqmj<T> gq = cqgr.gq(cqgr.aJ(17), cqgr.eI("···"), irn.j(), irn.v());
        gq.f(cqmpVarArr);
        return gq;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, zcq zcqVar, Context context, cqiv cqivVar) {
        bhlq bhlqVar;
        List<zef> a2 = zcqVar.a();
        if (a2.size() == 1) {
            cqivVar.f(new bhlq(e, f), a2);
            return;
        }
        cqrp cqrpVar = f;
        int e2 = cqsg.g(cqrpVar, e).e(context);
        int e3 = cqsg.d(cqrpVar, a).e(context);
        float f2 = 0.0f;
        boolean z = false;
        int i2 = 0;
        for (int i3 = 0; i3 < a2.size(); i3++) {
            f2 += (a2.get(i3).h() == null ? e : b).a(context);
            if (i2 == 0) {
                i2 = f2 > ((float) e2) ? i3 : 0;
            }
            z |= !(f2 <= ((float) e3));
        }
        if (z) {
            a2 = a2.subList(0, i2);
        }
        for (zef zefVar : a2) {
            if (zefVar.h() == null) {
                cqtv cqtvVar = e;
                bhlqVar = new bhlq(cqtvVar, cqtvVar);
            } else {
                cqtv cqtvVar2 = b;
                bhlqVar = new bhlq(cqtvVar2, cqtvVar2);
            }
            cqivVar.a(bhlqVar, zefVar);
        }
        if (!z) {
            return;
        }
        cqivVar.c(new bhlr());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<zcq> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.x(cqta.f()), cqgr.ck(C()));
    }
}

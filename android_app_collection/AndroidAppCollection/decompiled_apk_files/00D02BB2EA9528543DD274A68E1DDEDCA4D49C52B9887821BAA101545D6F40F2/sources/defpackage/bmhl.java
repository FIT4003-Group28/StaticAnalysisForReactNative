package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bmhl  reason: default package */
/* loaded from: classes3.dex */
public final class bmhl extends cqiw<zcq> {
    public static final cqtv a = cqrt.d(R.dimen.station_place_page_chip_distance);
    public static final cqtv b = cqrt.d(R.dimen.station_place_page_chip_height);
    private final bmhb c;

    public bmhl(bmhb bmhbVar) {
        super(5, 10, bmhbVar);
        this.c = bmhbVar;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> e(cqmp<T>... cqmpVarArr) {
        cqmj<T> gq = cqgr.gq(cqgr.aJ(17), cqgr.eI("···"), irn.j(), irn.v());
        gq.f(cqmpVarArr);
        return gq;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, zcq zcqVar, Context context, cqiv cqivVar) {
        bmhb bmhbVar = this.c;
        bmhbVar.c(context);
        int i2 = bmhbVar.b;
        double d = i2;
        Double.isNaN(d);
        int min = ((int) Math.min(Math.max(Math.round(10.0d / d), 1L), 5L)) * i2;
        List<zef> a2 = zcqVar.a();
        int size = a2.size();
        boolean z = false;
        if (size > min) {
            cqivVar.f(new bmhj(this.c, false), a2.subList(0, min - 1));
            cqivVar.c(new bmhk(this.c));
            return;
        }
        bmhb bmhbVar2 = this.c;
        if (size == 1) {
            z = true;
        }
        cqivVar.f(new bmhj(bmhbVar2, z), a2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<zcq> a() {
        return acnm.a(cqgr.cd(-1), cqgr.bp(-2), cqgr.x(cqta.f()), cqgr.ck(C()));
    }
}

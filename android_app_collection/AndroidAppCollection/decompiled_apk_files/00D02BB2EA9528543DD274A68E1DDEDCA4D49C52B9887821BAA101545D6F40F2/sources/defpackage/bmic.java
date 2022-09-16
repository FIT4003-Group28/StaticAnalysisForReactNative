package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bmic  reason: default package */
/* loaded from: classes3.dex */
public final class bmic extends cqiw<bmid> {
    private static final cqtv a;
    private static final bmhb b;
    private static final bmhb c;
    private static final bmhb d;

    static {
        cqtv g = cqsg.g(cqsz.c(), cqsg.d(irh.e(), irh.b()));
        a = g;
        b = new bmhb(cqrt.d(R.dimen.station_place_page_short_line_name_width), cqrt.d(R.dimen.station_place_page_chip_distance), g);
        c = new bmhb(cqrt.d(R.dimen.station_place_page_medium_line_name_width), cqrt.d(R.dimen.station_place_page_chip_distance), g);
        d = new bmhb(cqrt.d(R.dimen.station_place_page_long_line_name_width), cqrt.d(R.dimen.station_place_page_chip_distance), g);
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bmid bmidVar, Context context, cqiv cqivVar) {
        bmid bmidVar2 = bmidVar;
        dool c2 = bmidVar2.c();
        dool doolVar = dool.SHORT;
        int ordinal = c2.ordinal();
        cqivVar.a(new bmhl(ordinal != 0 ? ordinal != 1 ? d : c : b), bmidVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bmid> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.bV(irh.h()), cqgr.bD(cqrp.d(4.0d)), cqgr.dr(1), cqgr.cW(cqgr.q(bmhz.a)), cqgr.x(ibo.h()), itj.i(dtxy.hN), cqgr.gj(cqgr.cd(-1), cqgr.bp(-2), cqgr.x(cqta.f()), zxb.a(cqgr.cd(-2), cqgr.bq(irh.a()), cqgr.bR(irh.b()), cqgr.bY(cqjd.e(), cqjd.t()), zxb.b(bmia.a)), cqgr.gq(cqgr.cd(-1), cqgr.bp(-2), cqgr.bR(irh.e()), cqgr.bG(irh.b()), cqgr.bY(cqjd.e(), cqjd.f(), cqjd.t()), irn.m(), cqgr.eM(bmib.a))), cqgr.fY(cqgr.bR(irh.e()), cqgr.ck(C())));
    }
}

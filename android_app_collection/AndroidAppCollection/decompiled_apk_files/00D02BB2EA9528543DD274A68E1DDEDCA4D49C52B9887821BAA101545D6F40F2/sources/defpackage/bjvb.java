package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bjvb  reason: default package */
/* loaded from: classes3.dex */
public final class bjvb extends iph<bjwu> {
    public static final cqtv b;
    public static final cqtv c;
    private static final cqtv d;
    private static final cqtv e;

    static {
        cqtv d2 = cqsg.d(cqsg.k(cqrp.f(36.0d), cqrp.d(48.0d)), cqrp.f(72.0d), cqsg.k(cqrp.d(32.0d), cqrp.f(36.0d)), cqrp.f(40.0d));
        d = d2;
        cqrp d3 = cqrp.d(104.0d);
        e = d3;
        b = cqsg.d(d2, d3);
        c = cqrp.d(232.0d);
    }

    public bjvb() {
        super(R.id.area_qa_carousel, b, ibn.o(), c);
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cqkp cqkpVar, Context context, cqiv cqivVar) {
        bjwu bjwuVar = (bjwu) cqkpVar;
        cqivVar.f(new bjuv(), bjwuVar.i());
        bjwt j = bjwuVar.j();
        if (j != null) {
            cqivVar.a(new bjva(), j);
        }
    }
}

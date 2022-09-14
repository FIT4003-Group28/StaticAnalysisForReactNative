package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: abng  reason: default package */
/* loaded from: classes2.dex */
public final class abng extends iph<abnh> {
    public static final cqrp b;
    public static final cqtv c;
    public static final cqtv d;
    public static final cqrp e;
    private static final cqtv f;

    static {
        cqrp d2 = cqrp.d(132.0d);
        b = d2;
        c = cqsg.d(d2, cqrp.f(110.0d));
        d = cqsg.d(d2, cqrp.f(82.0d));
        e = cqrp.d(232.0d);
        f = cqsv.c(ibn.o(), ibn.o(), cqrp.d(48.0d), ibn.o());
    }

    public abng() {
        super(R.id.popular_areas_carousel, c, f, new Object[0]);
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cqkp cqkpVar, Context context, cqiv cqivVar) {
        abnh abnhVar = (abnh) cqkpVar;
        cqivVar.f(abnhVar.j().booleanValue() ? new abnc() : new abnd(), abnhVar.c());
        abiu i2 = abnhVar.i();
        if (i2 != null) {
            cqivVar.a(new abiz(), i2);
        }
    }
}

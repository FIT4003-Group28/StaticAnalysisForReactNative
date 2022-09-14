package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: ansm  reason: default package */
/* loaded from: classes2.dex */
public final class ansm implements bvwz {
    private final gga a;
    private final cjmt b;

    public ansm(gga ggaVar, cjmt cjmtVar) {
        this.a = ggaVar;
        this.b = cjmtVar;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new ansl(this);
    }

    @Override // defpackage.bvwz
    @dzsi
    public final dehn<Map<String, Object>> b(Object obj) {
        return null;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "gsbh";
    }

    public final double d() {
        double e = this.b.e();
        double d = this.a.getResources().getDisplayMetrics().densityDpi;
        Double.isNaN(d);
        Double.isNaN(e);
        return e / (d / 160.0d);
    }
}

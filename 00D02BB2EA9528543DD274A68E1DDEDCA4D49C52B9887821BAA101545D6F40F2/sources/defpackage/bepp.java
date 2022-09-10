package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bepp  reason: default package */
/* loaded from: classes3.dex */
public class bepp extends bgys {
    static final cqtv a = cqrp.d(18.0d);
    private final ff b;
    private final boolean c;

    public bepp(ff ffVar, boolean z) {
        this.b = ffVar;
        this.c = z;
    }

    @Override // defpackage.bgyn
    public cqtd a() {
        if (this.c) {
            cqtd g = cqrt.g(2131232193, ibm.o());
            cqtv cqtvVar = a;
            return cqtt.i(g, cqtvVar, cqtvVar);
        }
        cqtd g2 = cqrt.g(2131232192, ibm.D());
        cqtv cqtvVar2 = a;
        return cqtt.i(g2, cqtvVar2, cqtvVar2);
    }

    @Override // defpackage.bgyn
    public String b() {
        return this.b.getString(true != this.c ? R.string.MERCHANT_PANEL_CALLS_METRIC_MISSED : R.string.MERCHANT_PANEL_CALLS_METRIC_ANSWERED);
    }

    @Override // defpackage.bgyn
    public cqss c() {
        return ibm.t();
    }

    @Override // defpackage.bgyn
    public cqss d() {
        return this.c ? ibm.o() : ibm.D();
    }
}

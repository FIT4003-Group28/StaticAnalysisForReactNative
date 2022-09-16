package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.YpcOffersEndpoint$YPCOffersEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xyv  reason: default package */
/* loaded from: classes4.dex */
public class xyv implements aafl {
    public final acth a;
    public final yzj b;
    public final aafo c;
    public final yat d = new yat();
    private final Activity e;
    private final abem f;

    public xyv(Activity activity, abem abemVar, acth acthVar, yzj yzjVar, aafo aafoVar) {
        this.e = activity;
        this.f = abemVar;
        this.a = acthVar;
        this.b = yzjVar;
        this.c = aafoVar;
    }

    protected void b(apzg apzgVar) {
    }

    @Override // defpackage.aafl
    public void kD(apzg apzgVar, Map map) {
        YpcOffersEndpoint$YPCOffersEndpoint ypcOffersEndpoint$YPCOffersEndpoint = (YpcOffersEndpoint$YPCOffersEndpoint) apzgVar.qm(YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint);
        if (!ypcOffersEndpoint$YPCOffersEndpoint.c) {
            b(apzgVar);
            return;
        }
        abel a = this.f.a();
        a.t(ypcOffersEndpoint$YPCOffersEndpoint);
        a.j(apzgVar.c);
        this.d.show(this.e.getFragmentManager(), yat.a);
        this.f.b(a, new xyu(this));
    }
}

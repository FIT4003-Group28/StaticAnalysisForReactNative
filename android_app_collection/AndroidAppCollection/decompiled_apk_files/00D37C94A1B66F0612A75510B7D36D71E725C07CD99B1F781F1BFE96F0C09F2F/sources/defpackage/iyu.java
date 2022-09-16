package defpackage;

import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: iyu  reason: default package */
/* loaded from: classes3.dex */
public final class iyu implements aafo {
    private final aafo a;
    private final aafi b;
    private final axnm c;
    private final adoa d;

    public iyu(aafo aafoVar, aafi aafiVar, adoa adoaVar, axnm axnmVar) {
        this.a = aafoVar;
        this.b = aafiVar;
        this.c = axnmVar;
        this.d = adoaVar;
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void a(apzg apzgVar) {
        aafn.a(this, apzgVar);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void b(List list) {
        aafn.b(this, list);
    }

    @Override // defpackage.aafo
    public final void c(apzg apzgVar, Map map) {
        if (apzgVar == null) {
            return;
        }
        adnt e = this.d.e();
        awel awelVar = (awel) apzgVar.qm(WatchEndpointOuterClass.watchEndpoint);
        if (!apzgVar.qn(WatchEndpointOuterClass.watchEndpoint) || e == null || !e.t().equals(awelVar.d) || !e.x().equals(awelVar.c)) {
            try {
                this.b.f(apzgVar).kD(apzgVar, map);
                return;
            } catch (aafy unused) {
                this.a.c(apzgVar, map);
                return;
            }
        }
        ((iza) this.c.get()).pu(true);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void d(List list, Map map) {
        aafn.c(this, list, map);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void e(List list, Object obj) {
        aafn.d(this, list, obj);
    }
}

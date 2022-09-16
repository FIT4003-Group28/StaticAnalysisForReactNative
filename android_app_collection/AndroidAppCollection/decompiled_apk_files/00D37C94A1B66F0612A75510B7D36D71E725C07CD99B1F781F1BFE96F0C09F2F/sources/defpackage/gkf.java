package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import com.google.android.apps.youtube.app.ui.YpcOffersListDialogFragmentController;
import com.google.protos.youtube.api.innertube.YpcGetCartEndpoint$YPCGetCartEndpoint;
import j$.util.Collection;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gkf  reason: default package */
/* loaded from: classes3.dex */
public final class gkf extends ycw implements ybl {
    public static final /* synthetic */ int q = 0;
    public final Activity a;
    public final yni b;
    public final YpcOffersListDialogFragmentController c;
    public final Resources d;
    public final afvn e;
    public final afwc f;
    public final yrj g;
    public final agvq h;
    public final jpu i;
    public final xzs j;
    public final fkx k;
    public final acth l;
    public final ajqa m;
    public final aghg n;
    public final ahdf o;
    public final agrf p;

    public gkf(Activity activity, ybo yboVar, yzj yzjVar, yni yniVar, aafo aafoVar, YpcOffersListDialogFragmentController ypcOffersListDialogFragmentController, ydq ydqVar, afvn afvnVar, afwc afwcVar, agrf agrfVar, yrj yrjVar, agvq agvqVar, jpu jpuVar, xzs xzsVar, fkx fkxVar, acth acthVar, abff abffVar, ajqa ajqaVar, aaqp aaqpVar, aghg aghgVar, ahdf ahdfVar) {
        super(yboVar, yzjVar, aafoVar, ydqVar, abffVar, aaqpVar);
        this.a = activity;
        this.d = activity.getResources();
        this.b = yniVar;
        this.c = ypcOffersListDialogFragmentController;
        this.e = afvnVar;
        this.f = afwcVar;
        this.p = agrfVar;
        this.g = yrjVar;
        this.h = agvqVar;
        this.i = jpuVar;
        this.j = xzsVar;
        this.k = fkxVar;
        this.l = acthVar;
        this.m = ajqaVar;
        this.n = aghgVar;
        this.o = ahdfVar;
        yboVar.l = this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ycw
    public final void b(apzg apzgVar, Map map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("OnYpcTransactionListener", new gke(this, apzgVar, (ahcb) zew.K(hashMap, "VideoToSaveInfoContainerKey", ahcb.class), (ybm) zew.K(hashMap, "OnYpcTransactionListener", ybm.class), this.t));
        super.b(apzgVar, (amup) Collection.EL.stream(hashMap.entrySet()).filter(gka.a).collect(amsf.a(eoo.o, eoo.p)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ycw
    public final void c(ashp ashpVar, apzg apzgVar) {
        this.b.d(new eut());
        super.c(ashpVar, apzgVar);
    }

    @Override // defpackage.ybl
    public final void d() {
        this.b.d(new euw());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ycw
    public final void e(apzg apzgVar) {
        if (apzgVar != null && apzgVar.qn(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint) && !((YpcGetCartEndpoint$YPCGetCartEndpoint) apzgVar.qm(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint)).c.isEmpty()) {
            this.b.d(new eus());
        }
        super.e(apzgVar);
    }

    @Override // defpackage.ycw, defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        this.c.l();
        super.kD(apzgVar, map);
    }
}

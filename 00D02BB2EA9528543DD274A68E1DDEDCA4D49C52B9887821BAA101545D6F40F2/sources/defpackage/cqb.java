package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gmm.addaplace.webview.AddAPlaceWebViewCallbacks;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cqb  reason: default package */
/* loaded from: classes5.dex */
public final class cqb implements aket {
    private static final dcqe d = dcqe.c("cqb");
    public transient bovv a;
    public transient bvvw b;
    public transient cts c;
    private final cqf e;
    private final byte[] f;

    public cqb(cqf cqfVar, dpum dpumVar) {
        this.e = cqfVar;
        this.f = dpumVar.bS();
    }

    @Override // defpackage.akeo
    public final void a(gga ggaVar, btlu btluVar) {
        ((cqc) btsq.b(cqc.class, ggaVar)).a(this);
        boolean z = false;
        if (!this.c.a.getUgcParameters().X()) {
            dpum dpumVar = (dpum) bvrs.b(this.f, (dssr) dpum.d.cu(7));
            if (dpumVar == null) {
                bvoo.h("Login callback failed to parse map center!", new Object[0]);
                return;
            }
            cqf cqfVar = this.e;
            Bundle bundle = new Bundle();
            bundle.putSerializable("MODEL_KEY", cqfVar);
            bundle.putByteArray("MAP_CENTER_KEY", dpumVar.bS());
            cqt cqtVar = new cqt();
            cqtVar.B(bundle);
            ggaVar.D(cqtVar);
            return;
        }
        bvvr e = bvvs.e();
        cqf cqfVar2 = this.e;
        bovv bovvVar = this.a;
        cts ctsVar = this.c;
        Uri.Builder appendQueryParameter = Uri.parse(ctsVar.a.getUgcParameters().W()).buildUpon().appendQueryParameter("embedHost", "ANDROID_GMM").appendQueryParameter("gl", ctsVar.c.a().a()).appendQueryParameter("isCurrentLocationAvailable", String.valueOf(ctsVar.b.a() != null));
        akqq akqqVar = cqfVar2.c.b;
        if (akqqVar == null) {
            akqqVar = ctsVar.d.n().i;
        }
        if (akqqVar != null) {
            appendQueryParameter.appendQueryParameter("lat", String.valueOf(akqqVar.a)).appendQueryParameter("lng", String.valueOf(akqqVar.b));
        }
        if (!dbsj.d(cqfVar2.b.c())) {
            appendQueryParameter.appendQueryParameter("address", cqfVar2.b.c());
        } else if (!dbsj.d(cqfVar2.b.l)) {
            appendQueryParameter.appendQueryParameter("address", cqfVar2.b.l);
        } else {
            if (cqfVar2.c.b != null) {
                z = true;
            }
            appendQueryParameter.appendQueryParameter("prefillAddress", String.valueOf(z));
        }
        e.b(bovvVar.b(appendQueryParameter.build().toString(), "aGmm.AAP", cqfVar2.i, ggaVar.getString(R.string.AAP_TITLE)));
        bvvn bvvnVar = (bvvn) e;
        bvvnVar.b = new AddAPlaceWebViewCallbacks(this.e);
        bvvnVar.a = bovh.class;
        this.b.r(e.a(), dtxj.R);
    }

    @Override // defpackage.akeo
    public final void b(gga ggaVar, btlu btluVar) {
    }
}

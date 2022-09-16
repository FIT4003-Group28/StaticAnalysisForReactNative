package defpackage;

import android.os.Bundle;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: eoq  reason: default package */
/* loaded from: classes3.dex */
public final class eoq implements aafl {
    public wzu a;
    public eot b;
    private final yni c;
    private final Executor d;
    private final dt e;
    private final acti f;
    private final airr g;

    public eoq(xgp xgpVar, yni yniVar, dt dtVar, acti actiVar, airr airrVar, Executor executor) {
        this.c = yniVar;
        this.e = dtVar;
        this.f = actiVar;
        this.g = airrVar;
        this.d = executor;
        xgpVar.b(new eop(this));
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        boolean z;
        Object I = zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (apzgVar.qn(aovi.b)) {
            aunb aunbVar = ((aovi) apzgVar.qm(aovi.b)).d;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (!aunbVar.qn(aovk.a)) {
                return;
            }
            aovi aoviVar = (aovi) apzgVar.qm(aovi.b);
            acti actiVar = this.f;
            aunb aunbVar2 = aoviVar.d;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            actiVar.n(new acte(((aovj) aunbVar2.qm(aovk.a)).c));
            if (this.g.d()) {
                this.g.a();
                z = false;
            } else {
                z = true;
            }
            this.b = new eot(new eor(aoviVar, z, Optional.ofNullable(I).map(eoo.a)), this.a, this.c, this.d, this.g);
            aunb aunbVar3 = aoviVar.d;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            anea aneaVar = ((aovj) aunbVar3.qm(aovk.a)).b;
            if (aneaVar == null) {
                aneaVar = anea.a;
            }
            eot eotVar = this.b;
            Bundle bundle = new Bundle();
            xjo xjoVar = new xjo();
            bundle.putByteArray("about_this_ad_endpoint", aneaVar.toByteArray());
            xjoVar.ae(bundle);
            xjoVar.ai = eotVar;
            xjoVar.qv(this.e.getSupportFragmentManager(), "AboutThisAdWebViewDialogFragment");
        }
    }
}

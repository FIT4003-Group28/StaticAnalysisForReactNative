package defpackage;

import android.os.Bundle;
import com.google.android.apps.gmm.ar.api.ArLauncherParams;
import java.util.Map;
/* compiled from: PG */
/* renamed from: des  reason: default package */
/* loaded from: classes6.dex */
public abstract class des extends dev {
    public dbsg<czo> ad;
    public Map<czh, czl<?>> ae;
    public cjxo af;
    public ArLauncherParams ag;
    private czl<Object> ah;
    @dzsi
    private Object ai;

    private final czo aN() {
        dbsk.l(this.ad.a());
        return this.ad.b();
    }

    @Override // defpackage.dev
    protected final void aJ(@dzsi Bundle bundle) {
        Bundle bundle2 = this.o;
        if (bundle2 != null) {
            this.ag = ArLauncherParams.r(bundle2);
            czl<Object> aM = aM();
            this.ah = aM;
            this.ai = aM.o(bundle2);
        } else if (bundle != null) {
            this.ag = ArLauncherParams.r(bundle);
            czl<Object> aM2 = aM();
            this.ah = aM2;
            this.ai = aM2.o(bundle);
        } else {
            throw new IllegalStateException("Missing launcher params");
        }
    }

    public final void aK(ArLauncherParams arLauncherParams) {
        aN().b(arLauncherParams, this.ai);
    }

    public final void aL() {
        aN().c(this.ag.a());
    }

    public final czl<Object> aM() {
        czl<?> czlVar = this.ae.get(this.ag.a());
        dbsk.s(czlVar);
        return czlVar;
    }

    @Override // defpackage.ex, defpackage.fd
    public void s() {
        super.s();
        this.af.a(1);
    }

    @Override // defpackage.ex, defpackage.fd
    public final void t(Bundle bundle) {
        this.ag.q(bundle);
        Object obj = this.ai;
        if (obj != null) {
            this.ah.n(bundle, obj);
        }
        super.t(bundle);
    }

    @Override // defpackage.dev, defpackage.ex, defpackage.fd
    public final void u() {
        this.af.b();
        super.u();
    }
}

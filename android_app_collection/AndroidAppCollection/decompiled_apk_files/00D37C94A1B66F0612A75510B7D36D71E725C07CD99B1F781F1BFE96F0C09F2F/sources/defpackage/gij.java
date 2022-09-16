package defpackage;

import android.os.Bundle;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gij  reason: default package */
/* loaded from: classes3.dex */
public final class gij implements aafl {
    public final yzj a;
    private final dt b;
    private final afvn c;
    private final afwc d;
    private final axwo e;
    private final mdv f;

    public gij(dt dtVar, afvn afvnVar, afwc afwcVar, yzj yzjVar, mdv mdvVar, axwo axwoVar) {
        this.b = dtVar;
        this.c = afvnVar;
        this.d = afwcVar;
        this.a = yzjVar;
        this.f = mdvVar;
        this.e = axwoVar;
    }

    public final void b(apzg apzgVar) {
        this.f.a();
        iqa iqaVar = new iqa();
        Bundle bundle = iqaVar.m;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putByteArray("navigation_endpoint", apzgVar.toByteArray());
        iqaVar.ae(bundle);
        ex l = this.b.getSupportFragmentManager().l();
        l.r(iqaVar, "DialogFragmentFromNavigation");
        if (((Boolean) this.e.a().y(false).aE().e(0).aw()).booleanValue()) {
            l.e();
        } else {
            l.k();
        }
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (this.c.t()) {
            b(apzgVar);
        } else {
            this.d.c(this.b, null, new gii(this, apzgVar));
        }
    }
}

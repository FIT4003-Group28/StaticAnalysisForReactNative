package defpackage;

import android.os.Bundle;
import java.util.Map;
/* compiled from: PG */
/* renamed from: kph  reason: default package */
/* loaded from: classes3.dex */
public final class kph implements aafl {
    public final yzj a;
    private final dt b;
    private final afvn c;
    private final afwc d;
    private final axwo e;

    public kph(dt dtVar, afvn afvnVar, afwc afwcVar, yzj yzjVar, axwo axwoVar) {
        this.b = dtVar;
        this.c = afvnVar;
        this.d = afwcVar;
        this.a = yzjVar;
        this.e = axwoVar;
    }

    public final void b(apzg apzgVar) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("navigation_endpoint", apzgVar.toByteArray());
        kqr kqrVar = new kqr();
        kqrVar.ae(bundle);
        ex l = this.b.getSupportFragmentManager().l();
        l.r(kqrVar, "SuggestedPlaylistVideosFragment");
        if (((Boolean) this.e.a().y(false).aE().e(0).aw()).booleanValue()) {
            l.d();
        } else {
            l.a();
        }
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (this.c.t()) {
            b(apzgVar);
        } else {
            this.d.c(this.b, null, new kpg(this, apzgVar));
        }
    }
}

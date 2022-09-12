package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.List;
/* compiled from: PG */
/* renamed from: awvn  reason: default package */
/* loaded from: classes.dex */
final class awvn extends awvw {
    private dbsg<GmmLocation> a;
    private dbsg<dhjx> b;
    private dcdc<dnub> c;
    private awwt d;

    public awvn() {
        this.a = dbpy.a;
        this.b = dbpy.a;
    }

    public awvn(awvx awvxVar) {
        this.a = dbpy.a;
        this.b = dbpy.a;
        awvo awvoVar = (awvo) awvxVar;
        this.a = awvoVar.a;
        this.b = awvoVar.b;
        this.c = awvoVar.c;
        this.d = awvoVar.d;
    }

    @Override // defpackage.awvw
    public final void b(dhjx dhjxVar) {
        this.b = dbsg.i(dhjxVar);
    }

    @Override // defpackage.awvw
    public final void c(List<dnub> list) {
        this.c = dcdc.r(list);
    }

    @Override // defpackage.awvw
    public final void d(GmmLocation gmmLocation) {
        this.a = dbsg.i(gmmLocation);
    }

    @Override // defpackage.awvw
    public final void e(awwt awwtVar) {
        if (awwtVar != null) {
            this.d = awwtVar;
            return;
        }
        throw new NullPointerException("Null requestOptions");
    }

    @Override // defpackage.awvw
    public final awvx a() {
        String str = this.c == null ? " explicitTransitDestinations" : "";
        if (this.d == null) {
            str = str.concat(" requestOptions");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new awvo(this.a, this.b, this.c, this.d);
    }
}

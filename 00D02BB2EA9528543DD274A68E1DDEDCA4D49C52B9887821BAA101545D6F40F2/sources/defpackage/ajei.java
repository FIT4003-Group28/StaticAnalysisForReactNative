package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gmm.locationsharing.modui.shares.CreateSharesFlowFragment$TargetData;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ajei  reason: default package */
/* loaded from: classes2.dex */
public final class ajei {
    public final gga a;
    public final ajsj b;
    private final btvo c;
    private final dxio<afha> d;

    public ajei(btvo btvoVar, gga ggaVar, ajsj ajsjVar, dxio<afha> dxioVar) {
        this.c = btvoVar;
        this.a = ggaVar;
        this.b = ajsjVar;
        this.d = dxioVar;
    }

    private final boolean c() {
        dkof dkofVar = this.c.getLocationSharingParameters().q;
        if (dkofVar == null) {
            dkofVar = dkof.s;
        }
        if ((dkofVar.a & 1) != 0) {
            this.d.a().l(this.a, Uri.parse(dkofVar.b), 1);
            return true;
        }
        return false;
    }

    public final void a(@dzsi btlu btluVar) {
        if (!c()) {
            if (!ajsj.k(btluVar)) {
                this.b.j(btluVar, this.a);
                return;
            }
            dbsk.s(btluVar);
            ajcr a = ajcn.a(btluVar, ajco.LOCATION_SHARE, R.string.SMS_SHARE_TEXT);
            String str = gfu.ACTIVITY_FRAGMENT.c;
            gn g = this.a.g();
            gz b = g.b();
            b.y(a, str);
            b.z(gfu.c(a));
            fd H = g.H(str);
            if (H != null) {
                b.u(H);
            }
            b.f();
        }
    }

    public final void b(@dzsi btlu btluVar, aink ainkVar) {
        if (!c()) {
            if (!ajsj.k(btluVar)) {
                this.b.j(btluVar, this.a);
            } else if (ainkVar.u().a() || !ainkVar.a().a()) {
                ahwg b = ainkVar.u().b();
                dbsk.s(btluVar);
                ajdz ajdzVar = new ajdz();
                ajdzVar.ak = b.c();
                ajdzVar.aj = b.a();
                ajdzVar.ai = btluVar;
                ajdzVar.an = btluVar.d;
                String str = gfu.ACTIVITY_FRAGMENT.c;
                gn g = this.a.g();
                gz b2 = g.b();
                b2.y(ajdzVar, str);
                b2.z(gfu.c(ajdzVar));
                fd H = g.H(str);
                if (H != null) {
                    b2.u(H);
                }
                b2.f();
            } else {
                dbsk.s(btluVar);
                ajco ajcoVar = ajco.LOCATION_SHARE;
                ajcr ajcrVar = new ajcr();
                Bundle bundle = new Bundle();
                bundle.putInt("KEY_SHARE_MESSAGE_RESOURCE_ID", R.string.SMS_SHARE_TEXT);
                ajcp e = CreateSharesFlowFragment$TargetData.e();
                ajce ajceVar = (ajce) e;
                ajceVar.d = 3;
                ajceVar.c = ainkVar.a().b();
                bundle.putParcelable("target_data", e.a());
                bundle.putString("accountId", btluVar.d);
                bundle.putString("account_name", btluVar.t());
                bundle.putInt("mode", ajcoVar.ordinal());
                ajcrVar.B(bundle);
                String str2 = gfu.ACTIVITY_FRAGMENT.c;
                gn g2 = this.a.g();
                gz b3 = g2.b();
                b3.y(ajcrVar, str2);
                b3.z(gfu.c(ajcrVar));
                fd H2 = g2.H(str2);
                if (H2 != null) {
                    b3.u(H2);
                }
                b3.f();
            }
        }
    }
}

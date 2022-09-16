package defpackage;

import android.app.Activity;
import com.google.android.apps.gmm.directions.api.GmmNotice;
import java.util.List;
/* compiled from: PG */
/* renamed from: sve  reason: default package */
/* loaded from: classes7.dex */
public class sve implements suw {
    private final Activity a;
    private final akfa b;
    private final tkm c;
    private final jkf d;
    private final dxio<qbt> e;
    private final dxio<byej> f;
    private final dxio<ahwf> g;
    private final dxio<byym> h;

    public sve(Activity activity, akfa akfaVar, tkm tkmVar, jkf jkfVar, dxio<qbt> dxioVar, dxio<byej> dxioVar2, dxio<ahwf> dxioVar3, dxio<byym> dxioVar4) {
        this.a = activity;
        this.b = akfaVar;
        this.c = tkmVar;
        this.d = jkfVar;
        this.e = dxioVar;
        this.f = dxioVar2;
        this.g = dxioVar3;
        this.h = dxioVar4;
    }

    @Override // defpackage.suw
    public final void a() {
        if (this.h.a().c().h() == bzdj.STARTED) {
            this.h.a().e();
            this.g.a().K(ahvk.TRANSIT_NAVIGATION);
        }
    }

    public final void b(amve amveVar) {
        qbt a;
        List<pyx> d = pyy.d(amveVar);
        if (!d.isEmpty() && (a = this.e.a()) != null) {
            a.p(d);
        }
    }

    public final void c(List<GmmNotice> list, qda qdaVar) {
        qbt a;
        if (!list.isEmpty() && (a = this.e.a()) != null) {
            a.q(null, list, qdaVar, null);
        }
    }

    public final void d(tlv tlvVar, dbsg<amve> dbsgVar, tkn tknVar) {
        btlu j = this.b.j();
        if (j != null) {
            this.d.B(jjn.COLLAPSED);
            this.c.b(j, tlvVar, dbsgVar, tknVar);
        }
    }

    public final void e(tlv tlvVar, amve amveVar, amuo amuoVar) {
        qbt a;
        if (amveVar.z() == null || (a = this.e.a()) == null) {
            return;
        }
        a.D(tlvVar.B(this.a), tlvVar.A(amveVar, this.a).b().c, amveVar.z(), amuoVar);
    }

    public final void f(amwb amwbVar, akra akraVar, akqs akqsVar) {
        byej a = this.f.a();
        if (a != null) {
            a.i(amwbVar, akraVar, akqsVar);
        }
    }
}

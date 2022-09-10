package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: zom  reason: default package */
/* loaded from: classes7.dex */
public class zom extends acoi implements zdy, zdz {
    public final List<zod> a;
    public final List<Boolean> b;
    public boolean c;
    @dzsi
    public zol d;
    private final Activity e;
    private final znx f;
    private final voh g;
    private final zlx h;
    private final wto i;
    private final cqiw<zdx> j;
    @dzsi
    private zdr k;

    public zom(Activity activity, znx znxVar, voh vohVar, zlx zlxVar, wto wtoVar, cqiw<zdx> cqiwVar) {
        new zoi(this);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.e = activity;
        this.f = znxVar;
        this.g = vohVar;
        this.h = zlxVar;
        this.i = wtoVar;
        this.j = cqiwVar;
    }

    @dzsi
    private final Integer m() {
        int intValue = Os().intValue();
        if (this.d != null) {
            if (intValue == 0) {
                return null;
            }
            intValue--;
        }
        return Integer.valueOf(intValue);
    }

    @Override // defpackage.zdy
    public zdz a() {
        return this;
    }

    @Override // defpackage.zdz
    public View.OnLayoutChangeListener b() {
        return this.f;
    }

    @Override // defpackage.zdz
    public Boolean c() {
        return Boolean.valueOf(l() != null);
    }

    @Override // defpackage.zdz
    public cqkl d() {
        Integer m = m();
        if (m == null) {
            return cqkl.a;
        }
        this.b.set(m.intValue(), true);
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.zdz
    public CharSequence e() {
        Integer m = m();
        if (m == null) {
            return "";
        }
        btpf c = btpf.c(this.e);
        if (c.f && !c.e) {
            return "";
        }
        zod zodVar = this.a.get(m.intValue());
        if (this.b.get(m.intValue()).booleanValue() || zodVar == null) {
            return "";
        }
        String q = zodVar.q();
        dehn<Map<String, bxzt>> c2 = this.i.c();
        if (c2.isDone() && !c2.isCancelled()) {
            try {
                c2.get().get(q);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return bvpb.b(zodVar.i().u());
    }

    @Override // defpackage.zds
    public Boolean f() {
        return false;
    }

    @Override // defpackage.zds
    public List<zdr> g() {
        zdr zdrVar = this.k;
        if (zdrVar != null) {
            return dcbg.j(zdrVar, new zdr[0]).m(this.a).z();
        }
        return dcdc.r(this.a);
    }

    @Override // defpackage.zds
    public cqix<?> h() {
        zod l = l();
        if (l == null) {
            zol zolVar = this.d;
            dbsk.s(zolVar);
            return ((zgk) zolVar).c;
        }
        return cqgr.fT(this.j, l);
    }

    @Override // defpackage.zdz
    public String i() {
        zod l = l();
        if (l == null || bvpb.c(e())) {
            return "";
        }
        bvsi bvsiVar = new bvsi(this.e);
        bvsiVar.c(l.a());
        bvsiVar.c(e());
        bvsiVar.e();
        return bvsiVar.toString();
    }

    @Override // defpackage.zdz
    public CharSequence j() {
        zod l = l();
        vok vokVar = (vok) this.g;
        wuv b = vokVar.b(vokVar.m);
        return ((b == null || b.m() == null) && l != null) ? this.e.getString(R.string.DIRECTIONS_TAXI_NEARBY_CARS_NOT_AVAILABLE, new Object[]{l.i().t().b().a()}) : "";
    }

    public final void k(zol zolVar) {
        this.d = zolVar;
        zlx zlxVar = this.h;
        zgk zgkVar = (zgk) zolVar;
        String str = zgkVar.b;
        jhk jhkVar = zgkVar.e;
        ddho ddhoVar = zgkVar.d;
        Activity activity = (Activity) ((dxjd) zlxVar.a).a;
        zlx.a(activity, 1);
        zlx.a(this, 2);
        zlx.a(str, 3);
        zlx.a(ddhoVar, 5);
        this.k = new zlw(activity, this, str, jhkVar, ddhoVar);
    }

    @dzsi
    public final zod l() {
        Integer m = m();
        if (m != null) {
            return this.a.get(m.intValue());
        }
        return null;
    }
}

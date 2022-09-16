package defpackage;

import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: gbi  reason: default package */
/* loaded from: classes6.dex */
public class gbi implements gbe {
    public static final cqtv a = cqrp.d(12.0d);
    public static final cqtv b = cqrp.d(1.0d);
    private static final cqtv c = cqrp.d(24.0d);
    private dqsj d;
    private final dxio<afha> e;
    private final amfi f;
    private final gga g;
    private boolean h;

    public gbi(cqhn cqhnVar, dxio<afha> dxioVar, amfi amfiVar, gga ggaVar) {
        this.e = dxioVar;
        this.f = amfiVar;
        this.g = ggaVar;
    }

    private final String t(Long l) {
        return l.longValue() == 0 ? this.g.getString(R.string.ZERO_OR_UNPROVIDED_DATA) : String.format(Locale.getDefault(), "%,d", l);
    }

    @Override // defpackage.gbe
    public String a() {
        if (this.h) {
            return this.g.getString(R.string.TITLE_LOADING);
        }
        if (q() || r()) {
            return this.g.getString(R.string.TITLE_FAILED);
        }
        dqsj dqsjVar = this.d;
        return dqsjVar == null ? "" : dqsjVar.j;
    }

    @Override // defpackage.gbe
    public String b() {
        dqsj dqsjVar;
        return (this.h || (dqsjVar = this.d) == null) ? "" : dqsjVar.l;
    }

    @Override // defpackage.gbe
    public boolean d() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.g.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    @Override // defpackage.gbe
    public String e() {
        dqsj dqsjVar;
        return (this.h || (dqsjVar = this.d) == null) ? "" : dqsjVar.m;
    }

    @Override // defpackage.gbe
    public String f() {
        dqsj dqsjVar;
        return (this.h || (dqsjVar = this.d) == null) ? "" : dqsjVar.n;
    }

    @Override // defpackage.gbe
    public cqtd g() {
        dqsj dqsjVar;
        if (!this.h && (dqsjVar = this.d) != null) {
            dqsi dqsiVar = dqsjVar.o;
            if (dqsiVar == null) {
                dqsiVar = dqsi.c;
            }
            String name = gbi.class.getName();
            amfu h = this.f.h(dqsiVar.a, name, null);
            amfu h2 = this.f.h(dqsiVar.b, name, null);
            cqtd j = h == null ? null : h.j();
            cqtd j2 = h2 == null ? null : h2.j();
            if (j != null && j2 != null) {
                cqtv cqtvVar = c;
                return iva.e(cqtt.i(j, cqtvVar, cqtvVar), cqtt.i(j2, cqtvVar, cqtvVar));
            }
        }
        return null;
    }

    @Override // defpackage.gbe
    public String h() {
        dqsj dqsjVar;
        return (this.h || (dqsjVar = this.d) == null) ? "" : dqsjVar.c;
    }

    @Override // defpackage.gbe
    public String i() {
        dqsj dqsjVar;
        return (this.h || (dqsjVar = this.d) == null) ? "" : t(Long.valueOf(dqsjVar.d));
    }

    @Override // defpackage.gbe
    public String j() {
        dqsj dqsjVar;
        return (this.h || (dqsjVar = this.d) == null) ? "" : dqsjVar.e;
    }

    @Override // defpackage.gbe
    public String k() {
        dqsj dqsjVar;
        return (this.h || (dqsjVar = this.d) == null) ? "" : t(Long.valueOf(dqsjVar.f));
    }

    @Override // defpackage.gbe
    public String l() {
        dqsj dqsjVar;
        return (this.h || (dqsjVar = this.d) == null) ? "" : dqsjVar.g;
    }

    @Override // defpackage.gbe
    public String m() {
        dqsj dqsjVar;
        return (this.h || (dqsjVar = this.d) == null) ? "" : t(Long.valueOf(dqsjVar.h));
    }

    @Override // defpackage.gbe
    public CharSequence o() {
        if (this.h || this.d == null) {
            return "";
        }
        bvsi bvsiVar = new bvsi(this.g);
        for (dqsg dqsgVar : this.d.i) {
            if ((dqsgVar.a & 2) != 0) {
                bvsiVar.c(dqsgVar.c);
            }
        }
        return bvsiVar.toString();
    }

    @Override // defpackage.gbe
    public boolean p() {
        return this.h;
    }

    @Override // defpackage.gbe
    public boolean q() {
        return !this.h && this.d == null;
    }

    @Override // defpackage.gbe
    public boolean r() {
        dqsj dqsjVar;
        return !this.h && (dqsjVar = this.d) != null && dqsjVar.equals(dqsj.p);
    }

    public void s(awwb awwbVar) {
        this.d = (dqsj) awwbVar.a(awvv.N).f();
        this.h = awwbVar.c(awvv.N).b();
        cqkx.p(this);
    }

    @Override // defpackage.gbe
    public List<cqix<?>> c() {
        if (this.h || this.d == null) {
            return dcdc.e();
        }
        dccx F = dcdc.F();
        for (dqse dqseVar : this.d.k) {
            int i = dqseVar.a;
            if ((i & 8) != 0 && (i & 4) != 0) {
                F.g(cqgr.fT(new gba(), new gbh(dqseVar)));
            }
        }
        return F.f();
    }

    @Override // defpackage.gbe
    public List<cqix<?>> n() {
        if (this.h || this.d == null) {
            return dcdc.e();
        }
        dccx F = dcdc.F();
        for (dqsg dqsgVar : this.d.i) {
            F.g(cqgr.fT(new gax(), new gbg(dqsgVar, this.e, this.g)));
        }
        return F.f();
    }
}

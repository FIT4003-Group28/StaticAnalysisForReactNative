package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.preference.Preference;
/* compiled from: PG */
/* renamed from: auys  reason: default package */
/* loaded from: classes.dex */
public final class auys extends auum {
    private final dxio<bypd> c;
    private final dxio<byqh> d;
    private final dxio<bypa> e;
    private final dxio<axvy> f;
    private final dxio<axwq> g;

    public auys(dxio<bypd> dxioVar, dxio<byqh> dxioVar2, dxio<bypa> dxioVar3, dxio<axvy> dxioVar4, dxio<axwq> dxioVar5) {
        super(dpyv.TRAFFIC_TO_PLACE);
        this.c = dxioVar;
        this.d = dxioVar2;
        this.e = dxioVar3;
        this.f = dxioVar4;
        this.g = dxioVar5;
    }

    @Override // defpackage.aujb
    public final dcdc<Preference> c(Activity activity, Context context, btvo btvoVar) {
        return dcdc.e();
    }

    @Override // defpackage.aujb
    public final boolean g(btvo btvoVar) {
        bypd a = this.c.a();
        dkqn dkqnVar = btvoVar.getNotificationsParameters().l;
        if (dkqnVar == null) {
            dkqnVar = dkqn.i;
        }
        if (!dkqnVar.c || a.a.w(bvjk.cs, 0L) != 0) {
            boolean m = a.a.m(bvjk.cu, false);
            if (m || (dkqnVar.a & 1) == 0) {
                return m;
            }
            dkhd dkhdVar = dkqnVar.b;
            if (dkhdVar == null) {
                dkhdVar = dkhd.h;
            }
            if (!dkhdVar.b) {
                return m;
            }
            a.a.S(bvjk.cu, true);
            return true;
        }
        return false;
    }

    @Override // defpackage.aujb
    public final void i(btvo btvoVar, boolean z) {
        this.d.a().l();
        this.g.a().t(this.f.a().e(z));
    }

    @Override // defpackage.aujb
    public final boolean n(btvo btvoVar) {
        dkqn dkqnVar = btvoVar.getNotificationsParameters().l;
        if (dkqnVar == null) {
            dkqnVar = dkqn.i;
        }
        return dkqnVar.e;
    }

    @Override // defpackage.aujb
    public final void q(dlfv dlfvVar) {
        this.d.a().j();
    }

    @Override // defpackage.aujb
    public final boolean r(dlfv dlfvVar, btlu btluVar) {
        return this.e.a().b(qjj.TRAFFIC_TO_PLACE, dlfvVar);
    }

    @Override // defpackage.aujb
    public final void s(btlu btluVar, dlfv dlfvVar, boolean z) {
        this.e.a().a(btluVar, qjj.TRAFFIC_TO_PLACE, dlfvVar);
    }
}

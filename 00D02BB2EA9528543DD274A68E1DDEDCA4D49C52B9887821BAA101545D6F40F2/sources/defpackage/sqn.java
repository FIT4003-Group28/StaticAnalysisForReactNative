package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: sqn  reason: default package */
/* loaded from: classes7.dex */
public final class sqn {
    public static final dcep<dqek> a = dcep.D(dqek.LOCATION_HISTORY, dqek.RECENT_HISTORY, dqek.COMMUTE_SETTINGS);
    public static final dcdn<dqek, cqtd> b;
    public final cqix<?> c = cqgr.fT(ict.p(false, new cqmp[0]), cqkp.T);
    public final Activity d;
    public final squ e;
    public final sqz f;
    public final btvo g;

    static {
        dcdg dcdgVar = new dcdg();
        dcdgVar.f(dqek.EMAIL_EVENT, cqrt.g(2131232254, ibm.x()));
        dcdgVar.f(dqek.CALENDAR_EVENT, cqrt.g(2131232260, ibm.x()));
        dcdgVar.f(dqek.LOCATION_HISTORY, cqrt.g(2131232291, ibm.x()));
        dcdgVar.f(dqek.RECENT_HISTORY, cqrt.g(2131232410, ibm.x()));
        b = dcdgVar.b();
    }

    public sqn(Activity activity, squ squVar, sqz sqzVar, btvo btvoVar) {
        this.d = activity;
        this.e = squVar;
        this.f = sqzVar;
        this.g = btvoVar;
    }

    public static final cqix<cqkp> a() {
        return cqgr.fT(new smj(), cqkp.T);
    }

    public static amvh b(dpte dpteVar) {
        dptg dptgVar = dpteVar.b == 4 ? (dptg) dpteVar.c : dptg.q;
        akqi f = akqi.f(dptgVar.e);
        dpum dpumVar = dptgVar.f;
        if (dpumVar == null) {
            dpumVar = dpum.d;
        }
        akqq f2 = akqq.f(dpumVar);
        amvg amvgVar = new amvg();
        amvgVar.c = f;
        amvgVar.d = f2;
        amvgVar.b = dptgVar.b;
        amvgVar.j = dptgVar.c;
        amvgVar.z = (dpteVar.b == 4 ? (dptg) dpteVar.c : dptg.q).n;
        amvgVar.w = dpteVar.d;
        int a2 = dplr.a((dpteVar.b == 4 ? (dptg) dpteVar.c : dptg.q).h);
        if (a2 == 0) {
            a2 = 1;
        }
        dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
        dpjs dpjsVar = dpjs.ENTITY_TYPE_MY_LOCATION;
        int i = a2 - 2;
        dpjs dpjsVar2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : dpjs.ENTITY_TYPE_NICKNAME : dpjs.ENTITY_TYPE_CONTACT : dpjs.ENTITY_TYPE_WORK : dpjs.ENTITY_TYPE_HOME;
        if (dpjsVar2 != null) {
            amvgVar.a = dpjsVar2;
        }
        return amvgVar.a();
    }
}

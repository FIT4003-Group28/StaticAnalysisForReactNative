package defpackage;
/* compiled from: PG */
/* renamed from: cgtn  reason: default package */
/* loaded from: classes4.dex */
public class cgtn {
    public final auhi a;
    public final cjnx b;
    private final btvo c;
    private final axru d;
    private final akfa e;

    public cgtn(btvo btvoVar, axru axruVar, akfa akfaVar, auhi auhiVar, cjnx cjnxVar) {
        this.c = btvoVar;
        this.d = axruVar;
        this.e = akfaVar;
        this.a = auhiVar;
        this.b = cjnxVar;
    }

    public final cgti a() {
        dwta dwtaVar = this.c.getUgcTasksParameters().g;
        if (dwtaVar == null) {
            dwtaVar = dwta.c;
        }
        if (!dwtaVar.a) {
            return cgti.DISABLED_BY_CLIENT_PARAMETERS;
        }
        if (!this.d.a("android.permission.ACCESS_FINE_LOCATION")) {
            return cgti.NO_LOCATION_PERMISSIONS;
        }
        if (!this.e.c()) {
            return cgti.NOT_SIGNED_IN;
        }
        if (!this.b.f()) {
            return cgti.MAYBE_NO_USER_LOCATION_REPORTING;
        }
        return cgti.OK;
    }
}

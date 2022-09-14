package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aodc  reason: default package */
/* loaded from: classes2.dex */
public class aodc implements aocz {
    public final aodj a;
    public final aodj b;

    public aodc(Context context, cqat cqatVar, Runnable runnable) {
        this.a = new aodj(context, cqatVar, new aoda(this, runnable), context.getString(R.string.MAPS_ACTIVITY_DELETE_LOCATION_HISTORY_RANGE_START_HINT), dbpy.a, true, 4);
        this.b = new aodj(context, cqatVar, new aodb(this, runnable), context.getString(R.string.MAPS_ACTIVITY_DELETE_LOCATION_HISTORY_RANGE_END_HINT), dbpy.a, true, 4);
    }

    @Override // defpackage.aocz
    /* renamed from: c */
    public aodj a() {
        return this.a;
    }

    @Override // defpackage.aocz
    /* renamed from: d */
    public aodj b() {
        return this.b;
    }

    public boolean e() {
        return this.a.d().a() && this.b.d().a() && !this.a.d().b().B(this.b.d().b());
    }

    public dbsg<dpop> f() {
        if (!e()) {
            return dbpy.a;
        }
        dpoo bZ = dpop.d.bZ();
        long longValue = this.a.j().b().longValue();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpop dpopVar = (dpop) bZ.b;
        dpopVar.a |= 1;
        dpopVar.b = longValue;
        long longValue2 = this.b.k().b().longValue();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpop dpopVar2 = (dpop) bZ.b;
        dpopVar2.a |= 2;
        dpopVar2.c = longValue2;
        return dbsg.i(bZ.bK());
    }

    public dbsg<dngq> g() {
        if (!e()) {
            return dbpy.a;
        }
        eapg b = this.b.d().b();
        dngp bZ = dngq.d.bZ();
        dngs h = aogb.f(this.a.d().b()).h();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dngq dngqVar = (dngq) bZ.b;
        h.getClass();
        dngqVar.b = h;
        dngqVar.a |= 1;
        dngs h2 = aogb.f(b).h();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dngq dngqVar2 = (dngq) bZ.b;
        h2.getClass();
        dngqVar2.c = h2;
        dngqVar2.a |= 2;
        return dbsg.i(bZ.bK());
    }
}

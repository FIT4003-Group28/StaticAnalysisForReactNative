package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: wyz  reason: default package */
/* loaded from: classes7.dex */
public class wyz implements wyk {
    private final Activity a;
    private final djwq b;
    private drhg c = drhg.UNKNOWN_STATE;

    public wyz(cqhn cqhnVar, Activity activity, djwq djwqVar) {
        this.a = activity;
        this.b = djwqVar;
    }

    @Override // defpackage.wyk
    public String a() {
        drhh drhhVar = this.b.b;
        if (drhhVar == null) {
            drhhVar = drhh.k;
        }
        return drhhVar.c;
    }

    @Override // defpackage.wyk
    public String b() {
        drhg drhgVar = drhg.UNKNOWN_STATE;
        int ordinal = this.c.ordinal();
        if (ordinal != 0) {
            return ordinal != 1 ? ordinal != 2 ? a() : this.a.getResources().getString(R.string.TRANSIT_TRIP_ATTRIBUTES_UNAVAILABLE_DESCRIPTION, a()) : this.a.getResources().getString(R.string.TRANSIT_TRIP_ATTRIBUTES_AVAILABLE_DESCRIPTION, a());
        }
        return a();
    }

    @Override // defpackage.wyk
    public drhg c() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    @Override // defpackage.wyk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.cqkl d() {
        /*
            r3 = this;
            drhg r0 = defpackage.drhg.UNKNOWN_STATE
            drhg r0 = r3.c
            int r0 = r0.ordinal()
            if (r0 == 0) goto L17
            r1 = 1
            if (r0 == r1) goto L14
            r1 = 2
            if (r0 == r1) goto L11
            goto L1b
        L11:
            drhg r0 = defpackage.drhg.UNKNOWN_STATE
            goto L19
        L14:
            drhg r0 = defpackage.drhg.NEGATIVE
            goto L19
        L17:
            drhg r0 = defpackage.drhg.NEUTRAL
        L19:
            r3.c = r0
        L1b:
            defpackage.cqkx.p(r3)
            android.view.View r0 = defpackage.cqkx.o(r3)
            if (r0 == 0) goto L2d
            cpv r1 = defpackage.cpv.a
            java.lang.String r2 = r3.b()
            r1.b(r0, r2)
        L2d:
            cqkl r0 = defpackage.cqkl.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyz.d():cqkl");
    }

    @Override // defpackage.wyk
    public cjtd e() {
        return cjtd.c;
    }

    @Override // defpackage.wyk
    public cqtd f() {
        drhg drhgVar = drhg.UNKNOWN_STATE;
        int ordinal = this.c.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return cqrt.i(cqrt.f(2131232241), ibm.y());
            }
            if (ordinal == 2) {
                return cqrt.i(cqrt.f(2131232290), ibm.E());
            }
            return null;
        }
        return cqrt.i(cqrt.f(2131232137), ibm.x());
    }

    public void g(drhg drhgVar) {
        this.c = drhgVar;
    }

    public djwq h() {
        return this.b;
    }
}

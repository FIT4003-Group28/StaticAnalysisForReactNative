package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: twl  reason: default package */
/* loaded from: classes7.dex */
public class twl implements twb {
    private final zfo a;
    private final cqss b;

    public twl(Activity activity, amve amveVar) {
        this.a = new zqx(activity, amveVar);
        this.b = a(amveVar);
    }

    private static cqss a(amve amveVar) {
        dpej e = vyb.e(amveVar);
        dpej dpejVar = dpej.DELAY_NODATA;
        int ordinal = e.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return ibm.I();
            }
            if (ordinal == 3) {
                return ibm.M();
            }
            return ibm.p();
        }
        return ibm.E();
    }

    @Override // defpackage.twb
    @dzsi
    public String b() {
        return this.a.a();
    }

    @Override // defpackage.twb
    public cqss c() {
        return this.b;
    }

    public twl(Activity activity, amve amveVar, zfo zfoVar) {
        this.a = zfoVar;
        this.b = a(amveVar);
    }
}

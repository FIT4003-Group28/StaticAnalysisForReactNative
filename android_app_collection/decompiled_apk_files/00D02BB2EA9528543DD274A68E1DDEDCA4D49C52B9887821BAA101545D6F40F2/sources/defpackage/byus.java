package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: byus  reason: default package */
/* loaded from: classes4.dex */
public final class byus {
    public static final dcqe a = dcqe.c("byus");
    static final awvv<dnuw> b = awvv.g;
    static final awvv<dvjh> c = awvv.h;
    public final bytc d;
    private final awvy e;
    private final btvo f;
    private final byun g;

    public byus(bytc bytcVar, awvy awvyVar, btvo btvoVar, byun byunVar) {
        this.d = bytcVar;
        this.e = awvyVar;
        this.f = btvoVar;
        this.g = byunVar;
    }

    @dzsi
    public final awwb a(akqq akqqVar, boolean z, bzie bzieVar) {
        ahpo ahpoVar = new ahpo(this.f);
        amvs amvsVar = new amvs();
        amvsVar.v(akqqVar.a, akqqVar.b);
        amvsVar.n(1.0f);
        GmmLocation a2 = ahpoVar.a(amvsVar.d());
        awws u = awwt.u();
        u.t(dcdc.f("nearby_station_notif"));
        u.l(bzieVar.c);
        u.i(bzieVar.b);
        try {
            if (!this.g.a()) {
                dkqz dkqzVar = this.f.getNotificationsParameters().m;
                if (dkqzVar == null) {
                    dkqzVar = dkqz.ap;
                }
                if (!dkqzVar.ak) {
                    u.e(b);
                    awvy awvyVar = this.e;
                    awvw f = awvx.f();
                    f.d(a2);
                    f.e(u.a());
                    return awvyVar.a(f.a()).get(bzieVar.d, TimeUnit.SECONDS);
                }
            }
            return awvyVar.a(f.a()).get(bzieVar.d, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            deki.b(e);
            this.d.a(234);
            return null;
        } catch (ExecutionException e2) {
            deki.b(e2);
            this.d.a(233);
            return null;
        } catch (TimeoutException unused) {
            this.d.a(z ? 85 : 40);
            return null;
        }
        u.e(b, c);
        awvy awvyVar2 = this.e;
        awvw f2 = awvx.f();
        f2.d(a2);
        f2.e(u.a());
    }
}

package defpackage;

import com.google.android.gms.car.display.CarDisplayId;
/* renamed from: cnbd  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cnbd {
    private final cncb a;
    private final CarDisplayId b;

    public cnbd(cncb cncbVar, CarDisplayId carDisplayId) {
        this.a = cncbVar;
        this.b = carDisplayId;
    }

    public final cnew a() {
        cncb cncbVar = this.a;
        CarDisplayId carDisplayId = this.b;
        cmxn h = cncbVar.h();
        if (h == null) {
            return null;
        }
        if (cmwk.a("CAR.CLIENT", 3)) {
            int i = cnjc.a;
        }
        cnew e = h.u().e(carDisplayId);
        dbsk.s(e);
        return e;
    }
}

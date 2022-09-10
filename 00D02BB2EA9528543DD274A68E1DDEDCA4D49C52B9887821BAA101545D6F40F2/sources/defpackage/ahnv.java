package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: ahnv  reason: default package */
/* loaded from: classes2.dex */
public final class ahnv extends ahnn {
    public static final dcep<String> b = dcep.E("70.00.021", "70.00.100", "70.00.120", "70.00.200");
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    @dzsi
    ahqd g;

    public ahnv(btvo btvoVar, cqat cqatVar, ckcw ckcwVar) {
        super(btvoVar, cqatVar, ckcwVar);
        this.c = false;
        this.d = false;
        this.e = 0;
        this.f = false;
    }

    @Override // defpackage.ahnn
    @dzsi
    public final GmmLocation b(@dzsi GmmLocation gmmLocation) {
        ahqd ahqdVar;
        if (gmmLocation != null && !this.d) {
            if (this.f && Math.abs(gmmLocation.getLatitude() - 52.432109d) < 0.01d && Math.abs(gmmLocation.getLongitude() - 10.797449d) < 0.01d) {
                return null;
            }
            amvs amvsVar = new amvs();
            amvsVar.j(gmmLocation);
            if (this.c) {
                amvsVar.l();
            }
            GmmLocation b2 = super.b(amvsVar.d());
            int i = this.e;
            if ((i & 128) != 0 && (i & 80) != 0 && gmmLocation.hasSpeed() && ((b2 == null || !b2.hasSpeed()) && (ahqdVar = this.g) != null)) {
                long j = gmmLocation.j;
                float speed = gmmLocation.getSpeed();
                double d = ahqc.b;
                float speed2 = gmmLocation.getSpeed();
                double d2 = ahqc.a;
                double d3 = speed2;
                Double.isNaN(d3);
                ahqdVar.r(new ahqm(j, speed, d2 + d2 + (d * d3)));
            }
            return b2;
        }
        return null;
    }

    public final void d(@dzsi ahqd ahqdVar) {
        bvrj.LOCATION_DISPATCHER.c();
        this.g = ahqdVar;
    }
}

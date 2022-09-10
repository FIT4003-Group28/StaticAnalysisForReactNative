package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: zqd  reason: default package */
/* loaded from: classes7.dex */
public class zqd implements zfi {
    private final gga a;
    @dzsi
    private final amub b;
    private gen c;

    public zqd(gga ggaVar, @dzsi amub amubVar) {
        this.a = ggaVar;
        this.b = amubVar;
    }

    @Override // defpackage.zfi
    public cqtd a() {
        return cqrt.g(2131232273, ibm.x());
    }

    @Override // defpackage.zfi
    public cqkl b() {
        gen genVar;
        if (this.b == null || ((genVar = this.c) != null && genVar.aU())) {
            return cqkl.a;
        }
        amub amubVar = this.b;
        Bundle bundle = new Bundle();
        bundle.putInt("TRIP_INDEX_KEY", amubVar.c);
        bundle.putString("DIRECTIONS_EI_KEY", amubVar.f());
        dsuv.d(bundle, "TRANSIT_DETAILS_KEY", cjcj.a(amubVar).b());
        cjbz cjbzVar = new cjbz();
        cjbzVar.B(bundle);
        this.c = cjbzVar;
        this.a.D(cjbzVar);
        return cqkl.a;
    }

    @Override // defpackage.zfi
    @dzsi
    public cjtd c(zfh zfhVar) {
        dddv dddvVar;
        zfh zfhVar2 = zfh.BELOW_DIRECTIONS;
        int ordinal = zfhVar.ordinal();
        if (ordinal == 0) {
            dddvVar = dddv.KX;
        } else if (ordinal == 1) {
            dddvVar = dddv.KY;
        } else {
            throw new AssertionError();
        }
        return cjtd.a(dddvVar);
    }

    public boolean equals(@dzsi Object obj) {
        if (!(obj instanceof zqd)) {
            return false;
        }
        return dbsd.a(this.b, ((zqd) obj).b);
    }

    public int hashCode() {
        amub amubVar = this.b;
        return amubVar == null ? super.hashCode() : amubVar.hashCode();
    }
}

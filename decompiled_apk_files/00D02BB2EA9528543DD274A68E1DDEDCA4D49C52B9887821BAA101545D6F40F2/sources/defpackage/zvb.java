package defpackage;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: zvb  reason: default package */
/* loaded from: classes7.dex */
public class zvb implements Serializable {
    public static final zvb a = new zvb();
    public final vtj b;
    private final dcdc<bvrt<dpce>> c;

    public zvb() {
        this.c = dcdc.e();
        this.b = vtj.TRANSIT_AUTO;
    }

    public static <T extends cqkp> cqnf<T> a(@dzsi zvb zvbVar) {
        return cqjv.i(ztg.RENDERABLE_COMPONENTS, zvbVar, zth.a);
    }

    public static <T extends cqkp> cqnf<T> b(cqlc<T, zvb> cqlcVar) {
        return cqjv.g(ztg.RENDERABLE_COMPONENTS, cqlcVar, zth.a);
    }

    public final dcdc<dpce> c() {
        return (dcdc) bvrt.d(this.c, new dccx(), (dssr) dpce.f.cu(7), dpce.f);
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvb)) {
            return false;
        }
        zvb zvbVar = (zvb) obj;
        return dbsd.a(this.c, zvbVar.c) && dbsd.a(this.b, zvbVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.b});
    }

    public zvb(dcdc<dpce> dcdcVar) {
        this(dcdcVar, vtj.TRANSIT_AUTO);
    }

    public zvb(dcdc<dpce> dcdcVar, vtj vtjVar) {
        this.c = (dcdc) bvrt.c(dcdcVar, new dccx());
        this.b = vtjVar;
    }

    public zvb(dpce dpceVar) {
        this(dcdc.f(dpceVar));
    }
}

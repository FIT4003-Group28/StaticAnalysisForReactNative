package defpackage;
/* compiled from: PG */
/* renamed from: bqcw  reason: default package */
/* loaded from: classes4.dex */
public abstract class bqcw {
    public static bqcw f(dcdc<bqhj> dcdcVar, bqgw bqgwVar, bqcv bqcvVar, bqcv bqcvVar2) {
        return new bqcr(dcdcVar, bqgwVar, null, bqcvVar, bqcvVar2);
    }

    public static bqcw g(dcdc<bqhj> dcdcVar, cflx cflxVar, bqcv bqcvVar, bqcv bqcvVar2) {
        return new bqcr(dcdcVar, null, cflxVar, bqcvVar, bqcvVar2);
    }

    public abstract dcdc<bqhj> a();

    @dzsi
    public abstract bqgw b();

    @dzsi
    public abstract cflx c();

    public abstract bqcv d();

    public abstract bqcv e();

    public final bqcw h(dcdc<bqhj> dcdcVar) {
        return new bqcr(dcdcVar, b(), c(), d(), e());
    }
}

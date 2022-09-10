package defpackage;
/* compiled from: PG */
/* renamed from: bnwf  reason: default package */
/* loaded from: classes3.dex */
public final class bnwf {
    public static double a(amtm amtmVar, double d) {
        int round = (int) Math.round(Math.ceil(d));
        double e = amtmVar.e(round - 1);
        double e2 = amtmVar.e(round);
        double d2 = round;
        Double.isNaN(d2);
        return e2 + ((e - e2) * (d2 - d));
    }
}

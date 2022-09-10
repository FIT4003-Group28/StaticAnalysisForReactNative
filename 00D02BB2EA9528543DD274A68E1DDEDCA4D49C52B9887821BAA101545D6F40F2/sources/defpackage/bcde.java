package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bcde  reason: default package */
/* loaded from: classes3.dex */
public final class bcde extends cqiw<bcdf> {
    public static final cqrp a = cqrp.d(4.0d);
    public static final cqrp b = cqrp.d(2.0d);
    public static final cqrp c = cqrp.d(2.0d);
    public static final cqrp d = cqrp.d(75.0d);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] e(double[] dArr) {
        double d2 = dArr[0];
        double d3 = dArr[1];
        double d4 = dArr[2];
        double d5 = dArr[3];
        double d6 = dArr[4];
        int floor = (int) Math.floor(((((((-d6) * d3) - (d6 * d4)) + ((d6 * d3) * d4)) + (d3 * d5)) + (d4 * d5)) / (((d2 * d3) + (d2 * d4)) + (d4 * d3)));
        double d7 = floor;
        Double.isNaN(d7);
        int i = (int) (d7 * d2);
        int i2 = ((int) (d5 - d6)) - i;
        double d8 = i2;
        Double.isNaN(d8);
        int i3 = (int) (d8 / d3);
        return new int[]{i, floor, i2, i3, i2, (floor - i3) - ((int) d6)};
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bcdf bcdfVar, Context context, cqiv cqivVar) {
        dcdc<bcdh> a2 = bcdfVar.a();
        int size = a2.size();
        for (int i2 = 0; i2 < size; i2++) {
            a2.get(i2).a(cqivVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bcdf> a() {
        cqrp cqrpVar = a;
        return new cqmh(bcdd.class, cqgr.bR(cqrpVar), cqgr.bG(cqrpVar), cqgr.bU(0), cqgr.bD(b), new bcdc(), cqgr.ck(C()));
    }
}

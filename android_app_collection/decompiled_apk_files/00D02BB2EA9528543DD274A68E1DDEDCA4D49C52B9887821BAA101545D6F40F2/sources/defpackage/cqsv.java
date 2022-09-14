package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cqsv  reason: default package */
/* loaded from: classes.dex */
public final class cqsv extends cqsw<cqtv> implements cqtv {
    public cqsv(cqtv cqtvVar, cqtv cqtvVar2, cqtv cqtvVar3, cqtv cqtvVar4) {
        super(cqtvVar, cqtvVar2, cqtvVar3, cqtvVar4);
    }

    public static cqsv c(cqtv cqtvVar, cqtv cqtvVar2, cqtv cqtvVar3, cqtv cqtvVar4) {
        return new cqsv(cqtvVar, cqtvVar2, cqtvVar3, cqtvVar4);
    }

    public static cqsv d(cqtv cqtvVar, cqtv cqtvVar2) {
        return new cqsv(cqtvVar, cqtvVar, cqtvVar2, cqtvVar2);
    }

    public static cqsv f(double d, double d2, double d3, double d4) {
        return new cqsv(cqrp.d(d), cqrp.d(d2), cqrp.d(d3), cqrp.d(d4));
    }

    @Override // defpackage.cqtv
    public final int NR(Context context) {
        return g(context).NR(context);
    }

    @Override // defpackage.cqtv
    public final float a(Context context) {
        return g(context).a(context);
    }

    @Override // defpackage.cqtv
    public final int e(Context context) {
        return g(context).e(context);
    }
}

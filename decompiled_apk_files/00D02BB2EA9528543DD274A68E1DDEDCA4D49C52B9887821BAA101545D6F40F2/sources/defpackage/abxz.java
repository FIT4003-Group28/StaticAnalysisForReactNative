package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: abxz  reason: default package */
/* loaded from: classes2.dex */
public abstract class abxz implements cqtv {
    public static abxz f(int i) {
        return new abwu(i);
    }

    @Override // defpackage.cqtv
    public final int NR(Context context) {
        return d().NR(context);
    }

    @Override // defpackage.cqtv
    public final float a(Context context) {
        return d().a(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int c();

    protected cqtv d() {
        throw null;
    }

    @Override // defpackage.cqtv
    public final int e(Context context) {
        return d().e(context);
    }

    public final abxz g(abxz abxzVar) {
        return f(c() + ((abws) abxzVar).a);
    }

    public final abxz h(abxz abxzVar) {
        return f(c() - ((abws) abxzVar).a);
    }

    public final abxz i(double d) {
        double c = c();
        Double.isNaN(c);
        return f((int) (c * d));
    }
}

package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cqoy  reason: default package */
/* loaded from: classes5.dex */
abstract class cqoy implements cqoj {
    public abstract int a();

    public abstract int b();

    public abstract cqtv c();

    @Override // defpackage.cqoj
    public final void f(Context context, ds dsVar) {
        int a = a();
        int b = b();
        int NR = c().NR(context);
        dr n = dsVar.n(a);
        switch (b) {
            case 1:
                n.H = NR;
                return;
            case 2:
                n.J = NR;
                return;
            case 3:
                n.I = NR;
                return;
            case 4:
                n.K = NR;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                n.M = NR;
                return;
            case 7:
                n.L = NR;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }
}

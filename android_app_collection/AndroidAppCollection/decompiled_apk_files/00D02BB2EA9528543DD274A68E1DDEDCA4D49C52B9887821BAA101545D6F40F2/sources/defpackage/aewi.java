package defpackage;

import android.view.animation.Interpolator;
/* renamed from: aewi  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aewi implements cqlc {
    static final cqlc a = new aewi();

    private aewi() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        aexp aexpVar = (aexp) cqkpVar;
        Interpolator interpolator = aexn.a;
        boolean z = true;
        if (cqjv.v(aexpVar.d()).booleanValue() && !aexpVar.t().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

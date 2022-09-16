package defpackage;

import android.view.animation.Interpolator;
/* renamed from: aewu  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aewu implements cqlc {
    static final cqlc a = new aewu();

    private aewu() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        aexp aexpVar = (aexp) cqkpVar;
        Interpolator interpolator = aexn.a;
        boolean z = true;
        if (cqjv.v(aexpVar.c()).booleanValue() && cqjv.v(aexpVar.d()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

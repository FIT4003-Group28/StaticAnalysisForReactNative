package defpackage;

import android.view.animation.Interpolator;
/* renamed from: aewf  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aewf implements cqlc {
    static final cqlc a = new aewf();

    private aewf() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        aexp aexpVar = (aexp) cqkpVar;
        Interpolator interpolator = aexn.a;
        boolean z = true;
        if (cqjv.v(aexpVar.c()).booleanValue() && cqjv.v(aexpVar.d()).booleanValue() && cqjv.v(aexpVar.e()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

package defpackage;

import android.content.Context;
import android.view.animation.Interpolator;
/* renamed from: aeuz  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aeuz implements cqjb {
    static final cqjb a = new aeuz();

    private aeuz() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        aexp aexpVar = (aexp) cqkpVar;
        Interpolator interpolator = aexn.a;
        if (!aexpVar.b().booleanValue() || ((Boolean) aewg.a.a(aexpVar, context)).booleanValue()) {
            return cqrp.d(dcyn.a);
        }
        return cqrp.d(28.0d);
    }
}

package defpackage;

import android.content.Context;
/* renamed from: mnn  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class mnn implements cqjb {
    static final cqjb a = new mnn();

    private mnn() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        mpc mpcVar = (mpc) cqkpVar;
        if (!mns.d(context) || mpcVar.k().booleanValue() || !mns.e(mpcVar)) {
            return Integer.valueOf(nqo.ao.e(context));
        }
        return Integer.valueOf(nqo.aq.e(context));
    }
}

package defpackage;

import android.content.Context;
/* renamed from: mna  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class mna implements cqjb {
    static final cqjb a = new mna();

    private mna() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i;
        mpc mpcVar = (mpc) cqkpVar;
        if (npv.d(context)) {
            i = mns.e.a(mpcVar, context).booleanValue() ? mns.b : mns.d;
        } else {
            i = -1;
        }
        return Integer.valueOf(i);
    }
}

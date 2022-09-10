package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: mmb  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class mmb implements cqjb {
    static final cqjb a = new mmb();

    private mmb() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        mpc mpcVar = (mpc) cqkpVar;
        boolean z = false;
        if (mns.g.a(mpcVar, context).booleanValue()) {
            if (mpcVar.s().booleanValue() ^ mpcVar.t().booleanValue()) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}

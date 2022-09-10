package defpackage;

import android.content.Context;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: mnq  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class mnq implements cqjb {
    static final cqjb a = new mnq();

    private mnq() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        mpc mpcVar = (mpc) cqkpVar;
        boolean z = true;
        if (!mns.g.a(mpcVar, context).booleanValue() && !TextUtils.isEmpty(mpcVar.b()) && !TextUtils.isEmpty(mpcVar.a())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

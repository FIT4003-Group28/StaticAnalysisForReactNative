package defpackage;

import android.content.Context;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: mlx  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class mlx implements cqjb {
    static final cqjb a = new mlx();

    private mlx() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        mpc mpcVar = (mpc) cqkpVar;
        boolean z = true;
        if (mns.f.a(mpcVar, context).booleanValue() && !TextUtils.isEmpty(mpcVar.b()) && !TextUtils.isEmpty(mpcVar.a())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

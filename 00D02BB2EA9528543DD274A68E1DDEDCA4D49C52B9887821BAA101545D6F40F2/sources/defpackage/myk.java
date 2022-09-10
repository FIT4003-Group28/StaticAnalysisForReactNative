package defpackage;

import android.content.Context;
import android.text.TextUtils;
/* renamed from: myk  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class myk implements cqjb {
    static final cqjb a = new myk();

    private myk() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        mzc mzcVar = (mzc) cqkpVar;
        int i = myq.a;
        boolean z = false;
        if (!TextUtils.isEmpty(mzcVar.d()) && mzcVar.c().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

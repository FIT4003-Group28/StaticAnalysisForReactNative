package defpackage;

import android.content.Context;
import android.text.TextUtils;
/* renamed from: xir  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class xir implements cqjb {
    static final cqjb a = new xir();

    private xir() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        zcv zcvVar = (zcv) cqkpVar;
        bvsi bvsiVar = new bvsi(context);
        String f = xiu.f(zcvVar, context);
        if (!TextUtils.isEmpty(f)) {
            bvsiVar.c(f);
        }
        String g = zcvVar.g();
        if (!TextUtils.isEmpty(g)) {
            bvsiVar.c(g);
        }
        return bvsiVar.toString();
    }
}

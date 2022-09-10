package defpackage;

import android.content.Context;
import android.text.TextUtils;
/* renamed from: yhe  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class yhe implements cqjb {
    static final cqjb a = new yhe();

    private yhe() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        yvq yvqVar = (yvq) cqkpVar;
        int i = yhg.a;
        return TextUtils.join(" · ", dcbg.b(dchl.b(yvqVar.K(), yvqVar.L())).o(dbst.a(yhf.a)));
    }
}

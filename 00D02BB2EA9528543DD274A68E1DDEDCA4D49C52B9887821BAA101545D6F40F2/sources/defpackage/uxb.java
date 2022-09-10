package defpackage;

import android.content.Context;
/* renamed from: uxb  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class uxb implements cqjb {
    static final cqjb a = new uxb();

    private uxb() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        zct zctVar = (zct) cqkpVar;
        cqlc<zct, Boolean> cqlcVar = uxj.a;
        return Boolean.valueOf(context.getResources().getConfiguration().fontScale > 1.0f);
    }
}

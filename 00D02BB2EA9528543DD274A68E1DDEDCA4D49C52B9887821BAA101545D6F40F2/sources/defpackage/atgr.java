package defpackage;

import android.content.Context;
/* renamed from: atgr  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class atgr implements cqjb {
    static final cqjb a = new atgr();

    private atgr() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i = athe.header;
        boolean z = false;
        if (((atna) cqkpVar).ak().booleanValue() && cqhl.a(context)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

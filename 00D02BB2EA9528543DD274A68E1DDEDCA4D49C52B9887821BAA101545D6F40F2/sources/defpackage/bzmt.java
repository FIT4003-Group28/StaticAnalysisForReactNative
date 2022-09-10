package defpackage;

import android.content.Context;
/* renamed from: bzmt  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bzmt implements cqjb {
    static final cqjb a = new bzmt();

    private bzmt() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        bznq bznqVar = (bznq) cqkpVar;
        int i = bzna.a;
        boolean z = false;
        if (bznqVar.g() == null && bznqVar.c() != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

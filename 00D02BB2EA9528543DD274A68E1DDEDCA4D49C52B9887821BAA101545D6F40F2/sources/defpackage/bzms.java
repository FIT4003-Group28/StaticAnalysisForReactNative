package defpackage;

import android.content.Context;
/* renamed from: bzms  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bzms implements cqjb {
    static final cqjb a = new bzms();

    private bzms() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        bznq bznqVar = (bznq) cqkpVar;
        int i = bzna.a;
        boolean z = true;
        if (bznqVar.g() == null && bznqVar.c() == null) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

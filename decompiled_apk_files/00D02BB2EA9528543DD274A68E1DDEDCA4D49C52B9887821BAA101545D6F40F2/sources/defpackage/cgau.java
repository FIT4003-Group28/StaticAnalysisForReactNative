package defpackage;

import android.content.Context;
/* renamed from: cgau  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cgau implements cqjb {
    static final cqjb a = new cgau();

    private cgau() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        cgbf cgbfVar = (cgbf) cqkpVar;
        int i = 0;
        if (!cgbfVar.c().booleanValue() && cgbfVar.d().intValue() <= 0) {
            i = 8;
        }
        return Integer.valueOf(i);
    }
}

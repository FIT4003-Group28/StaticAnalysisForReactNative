package defpackage;

import android.content.Context;
/* renamed from: aevi  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aevi implements cqjb {
    static final cqjb a = new aevi();

    private aevi() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        aexp aexpVar = (aexp) cqkpVar;
        boolean z = false;
        if (((Boolean) aewg.a.a(aexpVar, context)).booleanValue() && ((Boolean) aewh.a.a(aexpVar)).booleanValue() && ((Boolean) aewi.a.a(aexpVar)).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

package defpackage;

import android.content.Context;
/* renamed from: hgh  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class hgh implements cqjb {
    static final cqjb a = new hgh();

    private hgh() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        jbr jbrVar = (jbr) cqkpVar;
        boolean z = true;
        if ((!cqhl.d(context) || !cqhl.a(context) || !jbrVar.b().booleanValue()) && !jbrVar.a().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

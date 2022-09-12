package defpackage;

import android.content.Context;
/* renamed from: jwr  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class jwr implements cqjb {
    static final cqjb a = new jwr();

    private jwr() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i = jwv.a;
        boolean z = false;
        if (((jym) cqkpVar).a().booleanValue() && npv.d(context)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

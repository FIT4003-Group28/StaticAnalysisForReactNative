package defpackage;

import android.content.Context;
/* renamed from: bcxq  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bcxq implements cqjb {
    static final cqjb a = new bcxq();

    private bcxq() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        boolean z = true;
        if (!cqjv.v(((bdao) cqkpVar).n()).booleanValue() && !cqhl.a(context)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

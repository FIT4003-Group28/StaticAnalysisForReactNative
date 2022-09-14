package defpackage;

import android.content.Context;
/* renamed from: mlk  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class mlk implements cqjb {
    static final cqjb a = new mlk();

    private mlk() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        boolean z = false;
        if (cqsz.d().a(context) < mlp.c.a(context) && ((mpe) cqkpVar).b().intValue() > 2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

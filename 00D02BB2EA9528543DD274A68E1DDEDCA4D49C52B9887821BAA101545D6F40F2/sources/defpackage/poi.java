package defpackage;

import android.content.Context;
/* renamed from: poi  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class poi implements cqjb {
    static final cqjb a = new poi();

    private poi() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        pov povVar = (pov) cqkpVar;
        cqtv f = cqsg.f(cqsz.d(), Float.valueOf(0.27f));
        if (f.a(context) > pos.a.a(context)) {
            return Integer.valueOf(pos.a.e(context));
        }
        return Integer.valueOf(f.e(context));
    }
}

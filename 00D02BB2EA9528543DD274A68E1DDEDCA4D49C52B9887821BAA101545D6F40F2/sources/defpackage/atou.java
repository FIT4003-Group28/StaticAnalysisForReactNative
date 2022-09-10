package defpackage;

import android.content.Context;
/* renamed from: atou  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class atou implements cqjb {
    static final cqjb a = new atou();

    private atou() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i = atpj.f;
        atxw O = ((atxz) cqkpVar).O();
        boolean z = false;
        if (O != null && O.r().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

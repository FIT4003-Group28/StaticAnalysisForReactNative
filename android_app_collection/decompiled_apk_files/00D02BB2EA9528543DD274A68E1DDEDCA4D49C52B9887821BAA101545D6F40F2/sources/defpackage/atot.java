package defpackage;

import android.content.Context;
/* renamed from: atot  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class atot implements cqjb {
    static final cqjb a = new atot();

    private atot() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        atxz atxzVar = (atxz) cqkpVar;
        int i = atpj.f;
        atxw O = atxzVar.O();
        atxr s = O != null ? O.s() : null;
        boolean z = false;
        if (atxzVar.c().booleanValue() || (s != null && s.e().booleanValue())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

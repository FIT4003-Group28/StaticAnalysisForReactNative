package defpackage;

import android.content.Context;
/* renamed from: bbxk  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bbxk implements cqjb {
    static final cqjb a = new bbxk();

    private bbxk() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        char c;
        cqjg cqjgVar = bbyf.a;
        String e = dbsj.e(((bbyg) cqkpVar).s());
        int hashCode = e.hashCode();
        if (hashCode != 3551) {
            if (hashCode == 3005871 && e.equals("auto")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (e.equals("on")) {
                c = 1;
            }
            c = 65535;
        }
        return bbyf.e(cqrt.f(c != 0 ? c != 1 ? 2131232682 : 2131232683 : 2131232681));
    }
}

package defpackage;

import android.content.Context;
/* renamed from: bwxh  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bwxh implements cqjb {
    static final cqjb a = new bwxh();

    private bwxh() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        bxcc bxccVar = (bxcc) cqkpVar;
        int i = -1;
        if (cqhl.a(context) && bxccVar.x().booleanValue()) {
            i = (int) (bxccVar.F() * context.getResources().getDisplayMetrics().widthPixels);
        }
        return Integer.valueOf(i);
    }
}

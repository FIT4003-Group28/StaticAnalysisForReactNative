package defpackage;

import android.content.Context;
/* renamed from: mln  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class mln implements cqjb {
    static final cqjb a = new mln();

    private mln() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        boolean booleanValue = ((Boolean) mlk.a.a((mpe) cqkpVar, context)).booleanValue();
        int i = 1;
        if (true != booleanValue) {
            i = 2;
        }
        return Integer.valueOf(i);
    }
}

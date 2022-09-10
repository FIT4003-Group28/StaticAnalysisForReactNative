package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: xjm  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class xjm implements cqjb {
    static final cqjb a = new xjm();

    private xjm() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int indexOf;
        String r = xjz.r(context);
        int i = 0;
        if (r != null && (indexOf = r.indexOf("{0}")) != -1) {
            i = dbrb.n('\n').r(r.substring(0, indexOf));
        }
        return Integer.valueOf(i);
    }
}

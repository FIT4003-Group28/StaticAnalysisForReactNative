package defpackage;

import android.content.Context;
/* renamed from: bhpj  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bhpj implements cqjb {
    static final cqjb a = new bhpj();

    private bhpj() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i = context.getResources().getConfiguration().screenHeightDp;
        return Integer.valueOf(jmj.c(context.getResources(), i < 640 ? 180 : i / 3) + ((int) ird.b().a(context)));
    }
}

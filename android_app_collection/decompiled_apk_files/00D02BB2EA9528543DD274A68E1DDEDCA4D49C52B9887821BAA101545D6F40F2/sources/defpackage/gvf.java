package defpackage;

import android.content.Context;
/* renamed from: gvf  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class gvf implements cqjb {
    static final cqjb a = new gvf();

    private gvf() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        jar jarVar = (jar) cqkpVar;
        return Boolean.valueOf(gvp.a.contains(context.getResources().getConfiguration().locale.getLanguage()));
    }
}

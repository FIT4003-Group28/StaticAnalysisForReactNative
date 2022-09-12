package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: hxn  reason: default package */
/* loaded from: classes6.dex */
public final class hxn {
    public static void a(View view, @dzsi cjtd cjtdVar, ite iteVar) {
        cjqg.h(view, cjtdVar);
        if (cjtdVar != null) {
            iteVar.c(view);
        } else {
            itf.a(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cjqm b(cjqy cjqyVar, View view) {
        cjql e;
        cjtd k = cjqg.k(view);
        if (k == null || (e = cjqg.e(view)) == null) {
            return cjqm.a;
        }
        return cjqyVar.j(e, k);
    }
}

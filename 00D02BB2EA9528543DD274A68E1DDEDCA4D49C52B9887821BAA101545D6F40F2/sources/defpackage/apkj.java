package defpackage;

import android.view.View;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: apkj  reason: default package */
/* loaded from: classes2.dex */
public final class apkj implements jkh {
    public static final cqjg a = cqjg.a();

    public static void a(View view) {
        ArrayList a2 = dchl.a();
        cqkx.f(view, a, a2);
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) a2.get(i);
            if (view2.isShown()) {
                jmw.f(view2);
            }
        }
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        View j = jkjVar.j();
        if (jjnVar2 == null || jjnVar2 == jjn.FULLY_EXPANDED || j == null) {
            return;
        }
        a(j);
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
    }
}

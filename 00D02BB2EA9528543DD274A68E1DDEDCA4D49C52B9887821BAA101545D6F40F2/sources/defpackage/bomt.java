package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
/* compiled from: PG */
/* renamed from: bomt  reason: default package */
/* loaded from: classes3.dex */
public class bomt {
    public final ges a;
    @dzsi
    public cqjg b;

    public bomt(fd fdVar) {
        this.a = (ges) fdVar;
    }

    public final void a() {
        this.b = null;
    }

    public final void b(cqjg cqjgVar) {
        View view;
        View d;
        ges gesVar = this.a;
        if (!gesVar.aD || (view = gesVar.P) == null || (d = cqkx.d(view, cqjgVar)) == null) {
            return;
        }
        d.requestFocus();
        ((InputMethodManager) this.a.J().getSystemService("input_method")).toggleSoftInput(2, 1);
        this.b = cqjgVar;
    }
}

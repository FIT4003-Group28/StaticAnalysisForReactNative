package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
/* compiled from: PG */
/* renamed from: cbct  reason: default package */
/* loaded from: classes4.dex */
public final class cbct implements cayn {
    @dzsi
    public View a;
    private final Activity b;

    public cbct(Activity activity) {
        this.b = activity;
    }

    @Override // defpackage.cayn
    public final void a(cqjg cqjgVar) {
        View a;
        View view = this.a;
        if (view == null || (a = cqhu.a(view, cqjgVar)) == null) {
            return;
        }
        b();
        a.requestFocus();
    }

    public final void b() {
        ((InputMethodManager) this.b.getSystemService("input_method")).hideSoftInputFromWindow(this.b.getWindow().getDecorView().getWindowToken(), 0);
    }
}

package defpackage;

import android.view.inputmethod.InputMethodManager;
/* compiled from: PG */
/* renamed from: cbdd  reason: default package */
/* loaded from: classes4.dex */
public class cbdd extends bxqh {
    private final gga k;

    public cbdd(bxqg bxqgVar, bxqd bxqdVar, gga ggaVar) {
        super(bxqdVar, bxqgVar);
        this.k = ggaVar;
    }

    @Override // defpackage.bxqh, defpackage.ivk
    public void f(CharSequence charSequence) {
        ((InputMethodManager) this.k.getSystemService("input_method")).hideSoftInputFromWindow(this.k.getWindow().getDecorView().getWindowToken(), 0);
    }
}

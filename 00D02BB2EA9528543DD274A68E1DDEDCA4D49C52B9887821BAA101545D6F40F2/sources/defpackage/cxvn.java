package defpackage;

import android.view.inputmethod.InputMethodManager;
/* compiled from: PG */
/* renamed from: cxvn  reason: default package */
/* loaded from: classes5.dex */
public final class cxvn implements cxwd {
    final /* synthetic */ cxvr a;

    public cxvn(cxvr cxvrVar) {
        this.a = cxvrVar;
    }

    @Override // defpackage.cxwd
    public final void a() {
        ((InputMethodManager) this.a.b.getSystemService("input_method")).hideSoftInputFromWindow(this.a.a.getWindowToken(), 0);
        cxvq cxvqVar = this.a.d;
        if (cxvqVar != null) {
            cxvqVar.p();
        }
    }
}

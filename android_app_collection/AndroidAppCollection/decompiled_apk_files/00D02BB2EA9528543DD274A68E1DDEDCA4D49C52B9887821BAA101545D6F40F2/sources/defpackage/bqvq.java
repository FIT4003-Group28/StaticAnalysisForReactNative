package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
/* compiled from: PG */
/* renamed from: bqvq  reason: default package */
/* loaded from: classes4.dex */
final class bqvq extends blkt {
    final /* synthetic */ bqvt a;
    private boolean b = false;

    public bqvq(bqvt bqvtVar) {
        this.a = bqvtVar;
    }

    @Override // defpackage.blkt
    public final void c() {
        this.b = true;
    }

    @Override // defpackage.blkt
    public final void d(int i) {
        if (this.b) {
            this.b = false;
            this.a.h.m(new cjte(deaf.SWIPE, i > 0 ? dead.UP : dead.DOWN), cjtd.a(dtyf.w));
        }
        bqvt bqvtVar = this.a;
        if (!bqvtVar.j) {
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) bqvtVar.d.getSystemService("input_method");
        View view = this.a.e.P;
        if (view == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}

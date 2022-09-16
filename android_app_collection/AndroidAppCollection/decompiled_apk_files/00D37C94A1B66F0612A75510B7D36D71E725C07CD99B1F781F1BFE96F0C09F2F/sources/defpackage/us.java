package defpackage;

import android.support.v7.widget.AppCompatSpinner;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: us  reason: default package */
/* loaded from: classes4.dex */
final class us implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ uu a;

    public us(uu uuVar) {
        this.a = uuVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        uu uuVar = this.a;
        AppCompatSpinner appCompatSpinner = uuVar.d;
        if (!lj.aj(appCompatSpinner) || !appCompatSpinner.getGlobalVisibleRect(uuVar.c)) {
            this.a.k();
            return;
        }
        this.a.n();
        super/*ww*/.s();
    }
}

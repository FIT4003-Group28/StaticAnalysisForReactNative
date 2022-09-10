package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ntx  reason: default package */
/* loaded from: classes7.dex */
final class ntx implements View.OnFocusChangeListener {
    final /* synthetic */ nud a;

    public ntx(nud nudVar) {
        this.a = nudVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (!z) {
            nud nudVar = this.a;
            if (nudVar.l) {
                nudVar.setActive(false);
            }
        }
        this.a.onFocusChanged(z, 2, null);
    }
}

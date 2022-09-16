package defpackage;

import android.view.View;
import android.widget.Spinner;
/* compiled from: PG */
/* renamed from: vxq  reason: default package */
/* loaded from: classes4.dex */
final class vxq implements View.OnFocusChangeListener {
    final /* synthetic */ Spinner a;

    public vxq(Spinner spinner) {
        this.a = spinner;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.a.performClick();
        }
    }
}

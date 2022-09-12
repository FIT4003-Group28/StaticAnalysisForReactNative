package defpackage;

import android.text.Editable;
import android.widget.AutoCompleteTextView;
/* compiled from: PG */
/* renamed from: dagv  reason: default package */
/* loaded from: classes5.dex */
final class dagv extends daay {
    final /* synthetic */ dahe a;

    public dagv(dahe daheVar) {
        this.a = daheVar;
    }

    @Override // defpackage.daay, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        AutoCompleteTextView g = dahe.g(this.a.k.a);
        if (this.a.i.isTouchExplorationEnabled() && dahe.h(g) && !this.a.m.hasFocus()) {
            g.dismissDropDown();
        }
        g.post(new dagt(this, g));
    }
}

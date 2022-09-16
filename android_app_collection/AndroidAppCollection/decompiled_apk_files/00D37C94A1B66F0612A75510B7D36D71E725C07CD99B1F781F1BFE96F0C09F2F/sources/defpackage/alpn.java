package defpackage;

import android.text.Editable;
import android.widget.AutoCompleteTextView;
/* compiled from: PG */
/* renamed from: alpn  reason: default package */
/* loaded from: classes.dex */
final class alpn extends allh {
    final /* synthetic */ alpx a;

    public alpn(alpx alpxVar) {
        this.a = alpxVar;
    }

    @Override // defpackage.allh, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        AutoCompleteTextView a = alpx.a(this.a.k.a);
        if (this.a.i.isTouchExplorationEnabled() && alpx.h(a) && !this.a.m.hasFocus()) {
            a.dismissDropDown();
        }
        a.post(new alpl(this, a));
    }
}

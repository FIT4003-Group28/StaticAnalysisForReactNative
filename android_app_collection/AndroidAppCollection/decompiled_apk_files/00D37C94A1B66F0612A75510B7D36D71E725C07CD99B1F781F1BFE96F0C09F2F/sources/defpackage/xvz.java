package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
/* compiled from: PG */
/* renamed from: xvz  reason: default package */
/* loaded from: classes4.dex */
final class xvz implements TextWatcher {
    final /* synthetic */ xwb a;

    public xvz(xwb xwbVar) {
        this.a = xwbVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        xwb xwbVar = this.a;
        xwbVar.aE(xwbVar.aJ());
        float lineSpacingExtra = this.a.ap.getLineSpacingExtra();
        float lineSpacingMultiplier = this.a.ap.getLineSpacingMultiplier();
        this.a.ap.setLineSpacing(0.0f, 1.0f);
        this.a.ap.setLineSpacing(lineSpacingExtra, lineSpacingMultiplier);
    }
}

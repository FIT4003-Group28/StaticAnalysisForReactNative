package defpackage;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
/* compiled from: PG */
/* renamed from: bcbh  reason: default package */
/* loaded from: classes3.dex */
final class bcbh implements TextWatcher {
    final /* synthetic */ bcbj a;

    public bcbh(bcbj bcbjVar) {
        this.a = bcbjVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        editable.toString();
        this.a.b = new SpannableStringBuilder(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.b = new SpannableStringBuilder(charSequence);
    }
}

package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.List;
/* compiled from: PG */
/* renamed from: dma  reason: default package */
/* loaded from: classes3.dex */
final class dma implements TextWatcher {
    private final List a;

    public dma(List list) {
        this.a = list;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        for (TextWatcher textWatcher : this.a) {
            textWatcher.afterTextChanged(editable);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        for (TextWatcher textWatcher : this.a) {
            textWatcher.beforeTextChanged(charSequence, i, i2, i3);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        for (TextWatcher textWatcher : this.a) {
            textWatcher.onTextChanged(charSequence, i, i2, i3);
        }
    }
}

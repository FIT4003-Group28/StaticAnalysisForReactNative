package defpackage;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
/* compiled from: PG */
/* renamed from: aon  reason: default package */
/* loaded from: classes.dex */
public final class aon implements TextWatcher {
    public int a = Integer.MAX_VALUE;
    private final EditText b;
    private hz c;

    public aon(EditText editText) {
        this.b = editText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.b.isInEditMode() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int a = anp.b().a();
            if (a != 0) {
                if (a == 1) {
                    anp.b().g((Spannable) charSequence, i, i3 + i, this.a);
                    return;
                } else if (a != 3) {
                    return;
                }
            }
            anp b = anp.b();
            if (this.c == null) {
                this.c = new aom(this.b);
            }
            b.i(this.c);
        }
    }
}

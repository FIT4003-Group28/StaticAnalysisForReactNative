package defpackage;

import android.os.Handler;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
/* compiled from: PG */
/* renamed from: xxr  reason: default package */
/* loaded from: classes4.dex */
public final class xxr implements TextWatcher {
    private final Handler a = new Handler();
    private ajwp[] b;
    private boolean c;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable == null || editable.length() == 0) {
            this.b = null;
            this.c = false;
            return;
        }
        Object[] objArr = this.b;
        if (objArr != null) {
            if (this.c) {
                for (ajwp ajwpVar : objArr) {
                    this.a.post(new afpa(editable, ajwpVar, 1));
                }
            } else {
                for (Object obj : objArr) {
                    editable.removeSpan(obj);
                }
            }
        }
        this.b = null;
        this.c = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence == null || charSequence.length() == 0 || !(charSequence instanceof Spanned)) {
            return;
        }
        Spanned spanned = (Spanned) charSequence;
        if (i2 > 0) {
            this.b = (ajwp[]) spanned.getSpans(i, i2 + i, ajwp.class);
            this.c = true;
        } else if (i3 <= 0 || i <= 0 || i >= spanned.length()) {
        } else {
            ajwp[] ajwpVarArr = (ajwp[]) spanned.getSpans(i - 1, i, ajwp.class);
            int i4 = i + 1;
            ajwp[] ajwpVarArr2 = (ajwp[]) spanned.getSpans(i, i4, ajwp.class);
            if (ajwpVarArr == null || ajwpVarArr.length == 0 || ajwpVarArr2 == null || ajwpVarArr2.length == 0) {
                return;
            }
            this.b = (ajwp[]) spanned.getSpans(i, i4, ajwp.class);
            this.c = false;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}

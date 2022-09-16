package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;
/* compiled from: PG */
/* renamed from: biw  reason: default package */
/* loaded from: classes2.dex */
public final class biw extends bjk {
    private EditText ae;
    private CharSequence af;
    private final Runnable ag = new biv(this);
    private long ah = -1;

    private final EditTextPreference aL() {
        return (EditTextPreference) aJ();
    }

    private final void aM(boolean z) {
        this.ah = z ? SystemClock.currentThreadTimeMillis() : -1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bjk
    public final void aE(View view) {
        super.aE(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.ae = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.ae.setText(this.af);
        EditText editText2 = this.ae;
        editText2.setSelection(editText2.getText().length());
        aL();
    }

    @Override // defpackage.bjk
    public final void aF(boolean z) {
        if (z) {
            String obj = this.ae.getText().toString();
            EditTextPreference aL = aL();
            if (!aL.Q(obj)) {
                return;
            }
            aL.i(obj);
        }
    }

    @Override // defpackage.bjk
    protected final void aG() {
        aM(true);
        aH();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aH() {
        long j = this.ah;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.ae;
        if (editText == null || !editText.isFocused()) {
            aM(false);
        } else if (((InputMethodManager) this.ae.getContext().getSystemService("input_method")).showSoftInput(this.ae, 0)) {
            aM(false);
        } else {
            this.ae.removeCallbacks(this.ag);
            this.ae.postDelayed(this.ag, 50L);
        }
    }

    @Override // defpackage.bjk
    protected final boolean aI() {
        return true;
    }

    @Override // defpackage.bjk, defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        if (bundle == null) {
            this.af = aL().g;
        } else {
            this.af = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // defpackage.bjk, defpackage.dh, defpackage.dp
    public final void oz(Bundle bundle) {
        super.oz(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.af);
    }
}

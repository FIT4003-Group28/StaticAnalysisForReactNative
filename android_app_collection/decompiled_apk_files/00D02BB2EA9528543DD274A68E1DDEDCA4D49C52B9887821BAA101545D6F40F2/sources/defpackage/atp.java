package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.preference.EditTextPreference;
/* compiled from: PG */
/* renamed from: atp  reason: default package */
/* loaded from: classes2.dex */
public class atp extends aug {
    private EditText ad;
    private CharSequence ae;

    private final EditTextPreference aO() {
        return (EditTextPreference) aN();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aug
    public void aJ(View view) {
        super.aJ(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.ad = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.ad.setText(this.ae);
        EditText editText2 = this.ad;
        editText2.setSelection(editText2.getText().length());
        aO();
    }

    @Override // defpackage.aug
    protected final boolean aK() {
        return true;
    }

    @Override // defpackage.aug
    public final void aL(boolean z) {
        if (z) {
            String obj = this.ad.getText().toString();
            EditTextPreference aO = aO();
            if (!aO.I(obj)) {
                return;
            }
            aO.e(obj);
        }
    }

    @Override // defpackage.aug, defpackage.ex, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            this.ae = aO().g;
        } else {
            this.ae = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // defpackage.aug, defpackage.ex, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.ae);
    }
}

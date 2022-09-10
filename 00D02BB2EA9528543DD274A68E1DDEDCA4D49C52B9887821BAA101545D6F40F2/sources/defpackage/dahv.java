package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: dahv  reason: default package */
/* loaded from: classes5.dex */
public class dahv extends ne {
    private final TextInputLayout b;

    public dahv(TextInputLayout textInputLayout) {
        this.b = textInputLayout;
    }

    @Override // defpackage.ne
    public void f(View view, pc pcVar) {
        TextView textView;
        super.f(view, pcVar);
        EditText editText = this.b.a;
        CharSequence charSequence = null;
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence b = this.b.b();
        CharSequence h = this.b.h();
        TextInputLayout textInputLayout = this.b;
        int i = textInputLayout.c;
        if (textInputLayout.b && textInputLayout.d && (textView = textInputLayout.e) != null) {
            charSequence = textView.getContentDescription();
        }
        boolean z = !TextUtils.isEmpty(text);
        boolean z2 = !TextUtils.isEmpty(b);
        boolean isEmpty = TextUtils.isEmpty(h);
        boolean z3 = (isEmpty ^ true) || !TextUtils.isEmpty(charSequence);
        String charSequence2 = z2 ? b.toString() : "";
        if (z) {
            pcVar.D(text);
        } else if (!TextUtils.isEmpty(charSequence2)) {
            pcVar.D(charSequence2);
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            if (Build.VERSION.SDK_INT >= 26) {
                pcVar.K(charSequence2);
            } else {
                if (z) {
                    String valueOf = String.valueOf(text);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(charSequence2).length());
                    sb.append(valueOf);
                    sb.append(", ");
                    sb.append(charSequence2);
                    charSequence2 = sb.toString();
                }
                pcVar.D(charSequence2);
            }
            boolean z4 = !z;
            if (Build.VERSION.SDK_INT >= 26) {
                pcVar.a.setShowingHintText(z4);
            } else {
                pcVar.P(4, z4);
            }
        }
        if (text == null || text.length() != i) {
            i = -1;
        }
        pcVar.a.setMaxTextLength(i);
        if (z3) {
            if (true == isEmpty) {
                h = charSequence;
            }
            pcVar.a.setError(h);
        }
        if (editText != null) {
            editText.setLabelFor(R.id.textinput_helper_text);
        }
    }
}

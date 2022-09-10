package defpackage;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.google.android.apps.maps.R;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: dahp  reason: default package */
/* loaded from: classes5.dex */
public final class dahp extends dahf {
    public final TextWatcher a;
    private final dahw b;
    private final dahx c;

    public dahp(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.a = new dahl(this);
        this.b = new dahm(this);
        this.c = new dahn(this);
    }

    @Override // defpackage.dahf
    public final void a() {
        this.k.setEndIconDrawable(sl.b(this.l, R.drawable.design_password_eye));
        TextInputLayout textInputLayout = this.k;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.password_toggle_content_description));
        this.k.setEndIconOnClickListener(new daho(this));
        this.k.p(this.b);
        this.k.o(this.c);
        EditText editText = this.k.a;
        if (editText != null) {
            if (editText.getInputType() != 16 && editText.getInputType() != 128 && editText.getInputType() != 144 && editText.getInputType() != 224) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean e() {
        EditText editText = this.k.a;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}

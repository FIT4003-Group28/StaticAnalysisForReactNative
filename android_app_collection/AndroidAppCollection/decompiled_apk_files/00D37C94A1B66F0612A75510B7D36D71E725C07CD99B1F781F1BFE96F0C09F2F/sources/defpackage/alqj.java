package defpackage;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: alqj  reason: default package */
/* loaded from: classes.dex */
public final class alqj extends alpy {
    public final TextWatcher a;
    private final alqp b;
    private final alqq c;

    public alqj(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
        this.a = new alqe(this);
        this.b = new alqf(this);
        this.c = new alqh(this);
    }

    public final boolean a() {
        EditText editText = this.k.a;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // defpackage.alpy
    public final void b() {
        TextInputLayout textInputLayout = this.k;
        int i = this.n;
        if (i == 0) {
            i = R.drawable.design_password_eye;
        }
        textInputLayout.o(i);
        TextInputLayout textInputLayout2 = this.k;
        textInputLayout2.n(textInputLayout2.getResources().getText(R.string.password_toggle_content_description));
        this.k.r(new alqi(this));
        this.k.e(this.b);
        this.k.f(this.c);
        EditText editText = this.k.a;
        if (editText != null) {
            if (editText.getInputType() != 16 && editText.getInputType() != 128 && editText.getInputType() != 144 && editText.getInputType() != 224) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}

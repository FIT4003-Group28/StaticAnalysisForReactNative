package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import c.e.a.c.i;
import com.google.android.material.textfield.TextInputLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h extends e {

    /* renamed from: d  reason: collision with root package name */
    private final TextWatcher f8231d;

    /* renamed from: e  reason: collision with root package name */
    private final TextInputLayout.f f8232e;

    /* renamed from: f  reason: collision with root package name */
    private final TextInputLayout.g f8233f;

    /* loaded from: classes.dex */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            h hVar = h.this;
            hVar.f8217c.setChecked(!hVar.c());
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes.dex */
    class b implements TextInputLayout.f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            h hVar = h.this;
            hVar.f8217c.setChecked(!hVar.c());
            editText.removeTextChangedListener(h.this.f8231d);
            editText.addTextChangedListener(h.this.f8231d);
        }
    }

    /* loaded from: classes.dex */
    class c implements TextInputLayout.g {
        c(h hVar) {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* loaded from: classes.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = h.this.f8215a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            editText.setTransformationMethod(h.this.c() ? null : PasswordTransformationMethod.getInstance());
            if (selectionEnd < 0) {
                return;
            }
            editText.setSelection(selectionEnd);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f8231d = new a();
        this.f8232e = new b();
        this.f8233f = new c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        EditText editText = this.f8215a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public void a() {
        this.f8215a.setEndIconDrawable(a.a.k.a.a.c(this.f8216b, c.e.a.c.e.design_password_eye));
        TextInputLayout textInputLayout = this.f8215a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(i.password_toggle_content_description));
        this.f8215a.setEndIconOnClickListener(new d());
        this.f8215a.a(this.f8232e);
        this.f8215a.a(this.f8233f);
    }
}

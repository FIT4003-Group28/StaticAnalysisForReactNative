package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kqi  reason: default package */
/* loaded from: classes3.dex */
final class kqi implements TextWatcher {
    final /* synthetic */ TextInputLayout a;
    final /* synthetic */ kqk b;

    public kqi(kqk kqkVar, TextInputLayout textInputLayout) {
        this.b = kqkVar;
        this.a = textInputLayout;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable == null ? "" : editable.toString().trim();
        if (trim.contains("<") || trim.contains(">")) {
            this.a.v(this.b.rb().getString(R.string.playlist_creation_title_invalid_characters_error));
            this.b.ap.d(false);
            return;
        }
        this.a.v(null);
        this.b.ap.d(!trim.isEmpty());
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}

package defpackage;

import android.net.Uri;
import android.text.Editable;
import android.text.TextWatcher;
/* compiled from: PG */
/* renamed from: cdxi  reason: default package */
/* loaded from: classes4.dex */
final class cdxi implements TextWatcher {
    final /* synthetic */ cdwo a;
    final /* synthetic */ Uri b;

    public cdxi(cdwo cdwoVar, Uri uri) {
        this.a = cdwoVar;
        this.b = uri;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.a(cdwq.d(this.b, editable.toString()));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}

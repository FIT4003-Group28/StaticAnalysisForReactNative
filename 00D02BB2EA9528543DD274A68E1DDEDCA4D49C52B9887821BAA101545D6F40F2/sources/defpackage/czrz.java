package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.List;
/* compiled from: PG */
/* renamed from: czrz  reason: default package */
/* loaded from: classes5.dex */
final class czrz implements TextWatcher {
    final /* synthetic */ List a;
    final /* synthetic */ int b;
    final /* synthetic */ czsc c;

    public czrz(czsc czscVar, List list, int i) {
        this.c = czscVar;
        this.a = list;
        this.b = i;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String trim = charSequence.toString().trim();
        if (!TextUtils.isEmpty(trim)) {
            this.c.a.a(new czsb(4, trim, ((dtza) this.a.get(this.b)).b));
        }
    }
}

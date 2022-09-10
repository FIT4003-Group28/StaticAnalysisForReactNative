package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.CheckBox;
/* compiled from: PG */
/* renamed from: czpq  reason: default package */
/* loaded from: classes5.dex */
final class czpq implements TextWatcher {
    final /* synthetic */ int a;
    final /* synthetic */ CheckBox b;
    final /* synthetic */ czpu c;

    public czpq(czpu czpuVar, int i, CheckBox checkBox) {
        this.c = czpuVar;
        this.a = i;
        this.b = checkBox;
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
            this.c.a[this.a] = true;
            this.b.setChecked(true);
            czpu czpuVar = this.c;
            czpuVar.b = trim;
            czpuVar.c.a(new czps(czpuVar.b, czpuVar.a));
        }
    }
}

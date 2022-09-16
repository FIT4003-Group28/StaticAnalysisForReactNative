package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: muv  reason: default package */
/* loaded from: classes3.dex */
final class muv implements TextWatcher {
    final /* synthetic */ muz a;

    public muv(muz muzVar) {
        this.a = muzVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        muz muzVar = this.a;
        String obj = editable.toString();
        muzVar.b.clear();
        if (obj.isEmpty()) {
            muzVar.b.addAll(muzVar.a);
        } else {
            Pattern compile = Pattern.compile(Pattern.quote(obj), 2);
            for (muw muwVar : muzVar.a) {
                if (compile.matcher(muwVar.a).find()) {
                    muzVar.b.add(muwVar);
                }
            }
        }
        muzVar.d.m.mr();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}

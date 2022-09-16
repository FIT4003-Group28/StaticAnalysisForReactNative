package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.apps.youtube.app.common.rendering.presenter.donationshelf.PrefixedEditText;
/* compiled from: PG */
/* renamed from: fky  reason: default package */
/* loaded from: classes3.dex */
public final class fky implements TextWatcher {
    final /* synthetic */ fkz a;

    public fky(fkz fkzVar) {
        this.a = fkzVar;
    }

    private final void a(long j) {
        nlm nlmVar = this.a.f;
        if (nlmVar != null) {
            nlr nlrVar = nlmVar.a;
            nlrVar.j = j;
            if (j <= 0) {
                nlrVar.i.setEnabled(false);
            } else {
                nlrVar.i.setEnabled(true);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        try {
            if (editable.toString().isEmpty()) {
                a(0L);
                return;
            }
            long parseLong = Long.parseLong(editable.toString()) * 1000000;
            fkz fkzVar = this.a;
            aqnb aqnbVar = fkzVar.e;
            if (parseLong >= aqnbVar.t && parseLong <= aqnbVar.u) {
                fkzVar.c.setError(null);
                a(parseLong);
                return;
            }
            PrefixedEditText prefixedEditText = fkzVar.c;
            arag aragVar = aqnbVar.v;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            prefixedEditText.setError(ajgl.b(aragVar));
            a(0L);
        } catch (NumberFormatException unused) {
            fkz fkzVar2 = this.a;
            PrefixedEditText prefixedEditText2 = fkzVar2.c;
            arag aragVar2 = fkzVar2.e.v;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            prefixedEditText2.setError(ajgl.b(aragVar2));
            a(0L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}

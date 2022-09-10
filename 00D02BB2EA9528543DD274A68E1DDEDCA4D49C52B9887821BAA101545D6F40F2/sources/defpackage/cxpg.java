package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.analytics.Stopwatch;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxpg  reason: default package */
/* loaded from: classes5.dex */
public final class cxpg implements TextWatcher {
    final /* synthetic */ cxqo a;
    final /* synthetic */ cxpn b;

    public cxpg(cxpn cxpnVar, cxqo cxqoVar) {
        this.b = cxpnVar;
        this.a = cxqoVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.b.f();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if ((i3 > i2 && (charSequence.charAt(i) == ',' || charSequence.charAt(i) == ':' || charSequence.charAt(i) == ';')) || (i3 - i2 > 1 && (cxpn.m(charSequence, ',', i, i3) || cxpn.m(charSequence, ':', i, i3) || cxpn.m(charSequence, ';', i, i3)))) {
            this.b.e.post(new cxpf(this));
        }
        if (this.b.e.hasFocus()) {
            cxpn cxpnVar = this.b;
            cxpnVar.g.d(charSequence, cxpnVar.e);
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.b.C(8);
        }
        if (this.b.t.isEmpty() && i == 0 && i2 == 0) {
            if (i3 > 0) {
                this.a.d(16, this.b.l);
            }
            i2 = 0;
        }
        if (this.b.n && i2 > i3) {
            cxqo cxqoVar = this.a;
            PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath.a(new czhc(dhjm.v));
            peopleKitVisualElementPath.c(this.b.l);
            cxqoVar.d(16, peopleKitVisualElementPath);
        }
        Stopwatch a = this.a.a("TimeToAutocompleteSelection");
        if (!a.c && charSequence.length() > 0) {
            a.b();
            a.c();
        }
        this.b.n = true;
    }
}

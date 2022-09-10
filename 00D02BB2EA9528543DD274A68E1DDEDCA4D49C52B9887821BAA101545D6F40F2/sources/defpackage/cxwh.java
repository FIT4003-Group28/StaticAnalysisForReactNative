package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
/* compiled from: PG */
/* renamed from: cxwh  reason: default package */
/* loaded from: classes5.dex */
final class cxwh implements TextWatcher {
    final /* synthetic */ cxqo a;
    final /* synthetic */ cxwi b;

    public cxwh(cxwi cxwiVar, cxqo cxqoVar) {
        this.b = cxwiVar;
        this.a = cxqoVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i == 0 && i2 == 0 && i3 > 0) {
            cxqo cxqoVar = this.a;
            PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath.a(new czhc(dhjm.b));
            peopleKitVisualElementPath.c(this.b.c);
            cxqoVar.d(16, peopleKitVisualElementPath);
        }
    }
}

package defpackage;

import android.view.View;
import android.widget.EditText;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
/* compiled from: PG */
/* renamed from: cxwg  reason: default package */
/* loaded from: classes5.dex */
final class cxwg implements View.OnFocusChangeListener {
    final /* synthetic */ EditText a;
    final /* synthetic */ cxqo b;
    final /* synthetic */ cxwi c;

    public cxwg(cxwi cxwiVar, EditText editText, cxqo cxqoVar) {
        this.c = cxwiVar;
        this.a = editText;
        this.b = cxqoVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (view != this.a || !z) {
            return;
        }
        cxqo cxqoVar = this.b;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.a(new czhc(dhjm.b));
        peopleKitVisualElementPath.c(this.c.c);
        cxqoVar.d(4, peopleKitVisualElementPath);
    }
}

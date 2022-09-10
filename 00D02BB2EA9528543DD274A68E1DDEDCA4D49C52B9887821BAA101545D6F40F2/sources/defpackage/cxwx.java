package defpackage;

import android.view.View;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
/* compiled from: PG */
/* renamed from: cxwx  reason: default package */
/* loaded from: classes5.dex */
final class cxwx implements View.OnClickListener {
    final /* synthetic */ cxxa a;
    final /* synthetic */ cxwz b;

    public cxwx(cxwz cxwzVar, cxxa cxxaVar) {
        this.b = cxwzVar;
        this.a = cxxaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cxqo cxqoVar = this.b.e.c;
        if (cxqoVar != null) {
            PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath.a(new czhc(dhjm.O));
            peopleKitVisualElementPath.c(this.b.e.d);
            cxqoVar.d(4, peopleKitVisualElementPath);
        }
        this.b.e.b(6, this.a.f());
    }
}

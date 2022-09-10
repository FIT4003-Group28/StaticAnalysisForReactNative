package defpackage;

import android.view.View;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxwa  reason: default package */
/* loaded from: classes5.dex */
public final class cxwa implements View.OnClickListener {
    final /* synthetic */ cxwe a;

    public cxwa(cxwe cxweVar) {
        this.a = cxweVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cxwd cxwdVar = this.a.l;
        if (cxwdVar != null) {
            cxwdVar.a();
        }
        cxqo cxqoVar = this.a.f;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.a(new czhc(dhjm.p));
        peopleKitVisualElementPath.c(this.a.j);
        cxqoVar.d(4, peopleKitVisualElementPath);
    }
}

package defpackage;

import android.view.View;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxte  reason: default package */
/* loaded from: classes5.dex */
public final class cxte implements View.OnClickListener {
    final /* synthetic */ cxti a;

    public cxte(cxti cxtiVar) {
        this.a = cxtiVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.j.a();
        cxqo cxqoVar = this.a.e;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.a(new czhc(dhjm.N));
        peopleKitVisualElementPath.c(this.a.g);
        cxqoVar.d(4, peopleKitVisualElementPath);
    }
}

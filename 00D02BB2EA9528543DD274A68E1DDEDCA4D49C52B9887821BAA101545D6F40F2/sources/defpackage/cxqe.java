package defpackage;

import android.view.View;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
/* compiled from: PG */
/* renamed from: cxqe  reason: default package */
/* loaded from: classes5.dex */
final class cxqe implements View.OnClickListener {
    final /* synthetic */ Channel a;
    final /* synthetic */ cxqh b;

    public cxqe(cxqh cxqhVar, Channel channel) {
        this.b = cxqhVar;
        this.a = channel;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cxqo cxqoVar = this.b.g;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.a(new czhc(dhjm.m));
        peopleKitVisualElementPath.a(new czhc(dhjm.j));
        peopleKitVisualElementPath.c(this.b.f);
        cxqoVar.d(4, peopleKitVisualElementPath);
        this.b.j.dismiss();
        this.b.h.e(this.a);
    }
}

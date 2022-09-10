package defpackage;

import android.view.View;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
/* compiled from: PG */
/* renamed from: cxqb  reason: default package */
/* loaded from: classes5.dex */
final class cxqb implements View.OnClickListener {
    final /* synthetic */ Channel a;
    final /* synthetic */ cxqh b;

    public cxqb(cxqh cxqhVar, Channel channel) {
        this.b = cxqhVar;
        this.a = channel;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cxqo cxqoVar = this.b.g;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.a(new czhc(dhjm.k));
        peopleKitVisualElementPath.a(new czhc(dhjm.j));
        peopleKitVisualElementPath.c(this.b.f);
        cxqoVar.d(4, peopleKitVisualElementPath);
        this.a.A();
        if (this.a.y()) {
            cxqh cxqhVar = this.b;
            cxqhVar.b.setText(cxrc.l(this.a, cxqhVar.c));
        } else {
            cxqh cxqhVar2 = this.b;
            cxqhVar2.b.setText(this.a.b(cxqhVar2.c));
        }
        this.b.j.dismiss();
        cxoy cxoyVar = this.b.o;
        if (cxoyVar != null) {
            cxoyVar.a.j();
        }
    }
}

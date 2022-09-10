package defpackage;

import android.view.View;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
/* compiled from: PG */
/* renamed from: cxuu  reason: default package */
/* loaded from: classes5.dex */
final class cxuu implements View.OnClickListener {
    final /* synthetic */ PeopleKitVisualElementPath a;
    final /* synthetic */ cxuz b;

    public cxuu(cxuz cxuzVar, PeopleKitVisualElementPath peopleKitVisualElementPath) {
        this.b = cxuzVar;
        this.a = peopleKitVisualElementPath;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.j.d(4, this.a);
        this.b.l.d(this.a);
    }
}

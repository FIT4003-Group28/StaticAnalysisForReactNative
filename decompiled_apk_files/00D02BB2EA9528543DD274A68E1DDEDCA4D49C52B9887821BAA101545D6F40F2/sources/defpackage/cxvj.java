package defpackage;

import android.view.View;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
/* compiled from: PG */
/* renamed from: cxvj  reason: default package */
/* loaded from: classes5.dex */
final class cxvj implements View.OnClickListener {
    final /* synthetic */ PeopleKitVisualElementPath a;
    final /* synthetic */ cxvk b;

    public cxvj(cxvk cxvkVar, PeopleKitVisualElementPath peopleKitVisualElementPath) {
        this.b = cxvkVar;
        this.a = peopleKitVisualElementPath;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.f.d(4, this.a);
        this.b.h.d(this.a);
    }
}

package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
/* compiled from: PG */
/* renamed from: cxuq  reason: default package */
/* loaded from: classes5.dex */
final class cxuq implements View.OnClickListener {
    final /* synthetic */ CoalescedChannels a;
    final /* synthetic */ cxuz b;

    public cxuq(cxuz cxuzVar, CoalescedChannels coalescedChannels) {
        this.b = cxuzVar;
        this.a = coalescedChannels;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.b(this.a);
        cxqo cxqoVar = this.b.j;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.a(new czhc(dhjm.q));
        peopleKitVisualElementPath.a(this.b.f());
        peopleKitVisualElementPath.c(this.b.m);
        cxqoVar.d(4, peopleKitVisualElementPath);
        cxuz cxuzVar = this.b;
        cxuzVar.e(cxuzVar.g.getVisibility() == 8, true);
        cxuz cxuzVar2 = this.b;
        ((InputMethodManager) cxuzVar2.a.getSystemService("input_method")).hideSoftInputFromWindow(cxuzVar2.b.getWindowToken(), 0);
    }
}

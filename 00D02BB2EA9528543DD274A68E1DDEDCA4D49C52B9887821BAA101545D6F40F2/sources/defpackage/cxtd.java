package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
/* compiled from: PG */
/* renamed from: cxtd  reason: default package */
/* loaded from: classes5.dex */
final class cxtd implements View.OnClickListener {
    final /* synthetic */ Channel a;
    final /* synthetic */ View b;
    final /* synthetic */ CoalescedChannels c;
    final /* synthetic */ cxti d;

    public cxtd(cxti cxtiVar, Channel channel, View view, CoalescedChannels coalescedChannels) {
        this.d = cxtiVar;
        this.a = channel;
        this.b = view;
        this.c = coalescedChannels;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        if (this.d.d.f(this.a)) {
            this.d.d.e(this.a);
            peopleKitVisualElementPath.a(new czhc(dhjm.K));
            cxti cxtiVar = this.d;
            cxov cxovVar = cxtiVar.h;
            if (cxovVar != null) {
                cxovVar.s(this.a.z(cxtiVar.a), true ^ this.d.d.h());
            }
            this.b.setContentDescription(null);
        } else {
            this.d.d.c(this.a, this.c);
            peopleKitVisualElementPath.a(new czhc(dhjm.Q));
            cxti cxtiVar2 = this.d;
            cxov cxovVar2 = cxtiVar2.h;
            if (cxovVar2 != null) {
                cxovVar2.r(this.a.z(cxtiVar2.a));
            }
            View view2 = this.b;
            Context context = this.d.a;
            view2.setContentDescription(context.getString(R.string.peoplekit_contact_name_and_method_selected_description, this.a.i(context), this.a.b(this.d.a)));
        }
        peopleKitVisualElementPath.c(this.d.g);
        this.d.e.d(4, peopleKitVisualElementPath);
    }
}

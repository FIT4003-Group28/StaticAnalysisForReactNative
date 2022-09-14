package defpackage;

import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
/* compiled from: PG */
/* renamed from: cxtj  reason: default package */
/* loaded from: classes5.dex */
final class cxtj implements cxso {
    final /* synthetic */ cxtp a;

    public cxtj(cxtp cxtpVar) {
        this.a = cxtpVar;
    }

    @Override // defpackage.cxso
    public final void v(Channel channel, CoalescedChannels coalescedChannels) {
        this.a.b(channel);
        cxqo cxqoVar = this.a.f;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.a(new czhc(dhjm.L));
        peopleKitVisualElementPath.c(this.a.g);
        cxqoVar.d(1, peopleKitVisualElementPath);
    }

    @Override // defpackage.cxso
    public final void w(Channel channel) {
        this.a.b(channel);
    }
}

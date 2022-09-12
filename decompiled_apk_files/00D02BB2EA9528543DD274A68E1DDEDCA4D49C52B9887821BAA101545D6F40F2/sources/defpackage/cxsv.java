package defpackage;

import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxsv  reason: default package */
/* loaded from: classes5.dex */
public final class cxsv implements cxso {
    final /* synthetic */ cxsx a;

    public cxsv(cxsx cxsxVar) {
        this.a = cxsxVar;
    }

    @Override // defpackage.cxso
    public final void v(Channel channel, CoalescedChannels coalescedChannels) {
        this.a.b(channel);
        cxqo cxqoVar = this.a.d;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.a(new czhc(dhjm.L));
        peopleKitVisualElementPath.c(this.a.e);
        cxqoVar.d(1, peopleKitVisualElementPath);
    }

    @Override // defpackage.cxso
    public final void w(Channel channel) {
        this.a.b(channel);
    }
}

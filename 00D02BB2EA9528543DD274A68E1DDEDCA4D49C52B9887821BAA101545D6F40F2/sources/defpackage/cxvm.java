package defpackage;

import android.view.inputmethod.InputMethodManager;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
/* compiled from: PG */
/* renamed from: cxvm  reason: default package */
/* loaded from: classes5.dex */
final class cxvm implements cxso {
    final /* synthetic */ cxvr a;

    public cxvm(cxvr cxvrVar) {
        this.a = cxvrVar;
    }

    @Override // defpackage.cxso
    public final void v(Channel channel, CoalescedChannels coalescedChannels) {
        this.a.a(channel);
        cxqo cxqoVar = this.a.g;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.a(new czhc(dhjm.L));
        peopleKitVisualElementPath.c(this.a.h);
        cxqoVar.d(1, peopleKitVisualElementPath);
    }

    @Override // defpackage.cxso
    public final void w(Channel channel) {
        this.a.a(channel);
        if (this.a.e.b().isEmpty()) {
            ((InputMethodManager) this.a.b.getSystemService("input_method")).hideSoftInputFromWindow(this.a.a.getWindowToken(), 0);
        }
    }
}

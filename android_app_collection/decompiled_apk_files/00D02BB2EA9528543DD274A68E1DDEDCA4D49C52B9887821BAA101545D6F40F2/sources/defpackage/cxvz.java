package defpackage;

import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxvz  reason: default package */
/* loaded from: classes5.dex */
public final class cxvz implements cxso {
    final /* synthetic */ cxwe a;

    public cxvz(cxwe cxweVar) {
        this.a = cxweVar;
    }

    @Override // defpackage.cxso
    public final void v(Channel channel, CoalescedChannels coalescedChannels) {
        this.a.e(true);
        if (this.a.e.h()) {
            this.a.c.setVisibility(0);
        }
    }

    @Override // defpackage.cxso
    public final void w(Channel channel) {
        if (this.a.d.g() == 0) {
            this.a.e(false);
            if (!this.a.e.h()) {
                return;
            }
            this.a.c.setVisibility(8);
        }
    }
}

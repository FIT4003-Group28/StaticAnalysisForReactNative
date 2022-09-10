package defpackage;

import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxts  reason: default package */
/* loaded from: classes5.dex */
public final class cxts implements cxso {
    final /* synthetic */ PeopleKitSelectionModel a;
    final /* synthetic */ cxtv b;

    public cxts(cxtv cxtvVar, PeopleKitSelectionModel peopleKitSelectionModel) {
        this.b = cxtvVar;
        this.a = peopleKitSelectionModel;
    }

    @Override // defpackage.cxso
    public final void v(Channel channel, CoalescedChannels coalescedChannels) {
        this.b.b(true);
    }

    @Override // defpackage.cxso
    public final void w(Channel channel) {
        if (this.a.h()) {
            this.b.b(false);
        }
    }
}

package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxur  reason: default package */
/* loaded from: classes5.dex */
public final class cxur implements View.OnClickListener {
    final /* synthetic */ int a;
    final /* synthetic */ Channel b;
    final /* synthetic */ CoalescedChannels c;
    final /* synthetic */ cxuz d;

    public cxur(cxuz cxuzVar, int i, Channel channel, CoalescedChannels coalescedChannels) {
        this.d = cxuzVar;
        this.a = i;
        this.b = channel;
        this.c = coalescedChannels;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cxqo cxqoVar = this.d.j;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        czhc czhcVar = new czhc(dhjm.e);
        czhcVar.a(this.a);
        peopleKitVisualElementPath.a(czhcVar);
        peopleKitVisualElementPath.a(this.d.f());
        peopleKitVisualElementPath.c(this.d.m);
        cxqoVar.d(4, peopleKitVisualElementPath);
        if (this.d.i.f(this.b)) {
            this.d.i.e(this.b);
            return;
        }
        cxuz cxuzVar = this.d;
        if (cxuzVar.i.f(cxuzVar.p)) {
            cxuz cxuzVar2 = this.d;
            cxuzVar2.i.e(cxuzVar2.p);
            cxuz cxuzVar3 = this.d;
            cxov cxovVar = cxuzVar3.n;
            if (cxovVar != null) {
                cxovVar.s(cxuzVar3.p.z(cxuzVar3.a), !this.d.i.h());
            }
        }
        this.d.i.c(this.b, this.c);
        if (!this.d.k.i() || this.b.d() != 1 || !TextUtils.isEmpty(this.b.s())) {
            cxuz cxuzVar4 = this.d;
            cxov cxovVar2 = cxuzVar4.n;
            if (cxovVar2 == null) {
                return;
            }
            cxovVar2.r(this.b.z(cxuzVar4.a));
            return;
        }
        this.d.c(this.b);
    }
}

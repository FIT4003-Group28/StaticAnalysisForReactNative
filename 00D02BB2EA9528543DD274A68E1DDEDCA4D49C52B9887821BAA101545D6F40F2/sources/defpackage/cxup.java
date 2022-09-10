package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
/* compiled from: PG */
/* renamed from: cxup  reason: default package */
/* loaded from: classes5.dex */
final class cxup implements View.OnClickListener {
    final /* synthetic */ CoalescedChannels a;
    final /* synthetic */ cxuz b;

    public cxup(cxuz cxuzVar, CoalescedChannels coalescedChannels) {
        this.b = cxuzVar;
        this.a = coalescedChannels;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cxuz cxuzVar = this.b;
        if (!cxuzVar.i.f(cxuzVar.p)) {
            cxqo cxqoVar = this.b.j;
            PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath.a(this.b.f());
            peopleKitVisualElementPath.c(this.b.m);
            cxqoVar.d(4, peopleKitVisualElementPath);
            cxuz cxuzVar2 = this.b;
            cxuzVar2.i.c(cxuzVar2.p, this.a);
            if (!this.b.k.i() || this.b.p.d() != 1 || !TextUtils.isEmpty(this.b.p.s())) {
                cxuz cxuzVar3 = this.b;
                cxov cxovVar = cxuzVar3.n;
                if (cxovVar == null) {
                    return;
                }
                cxovVar.r(cxuzVar3.p.z(cxuzVar3.a));
                return;
            }
            cxuz cxuzVar4 = this.b;
            cxuzVar4.c(cxuzVar4.p);
            return;
        }
        cxqo cxqoVar2 = this.b.j;
        PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath2.a(this.b.f());
        peopleKitVisualElementPath2.c(this.b.m);
        cxqoVar2.d(4, peopleKitVisualElementPath2);
        cxuz cxuzVar5 = this.b;
        cxuzVar5.i.e(cxuzVar5.p);
        cxuz cxuzVar6 = this.b;
        cxov cxovVar2 = cxuzVar6.n;
        if (cxovVar2 == null) {
            return;
        }
        cxovVar2.s(cxuzVar6.p.z(cxuzVar6.a), true ^ this.b.i.h());
    }
}

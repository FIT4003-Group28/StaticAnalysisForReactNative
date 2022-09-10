package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.ManualChannel;
/* compiled from: PG */
/* renamed from: cxvc  reason: default package */
/* loaded from: classes5.dex */
final class cxvc implements View.OnClickListener {
    final /* synthetic */ Channel a;
    final /* synthetic */ cxvk b;
    final /* synthetic */ cxvi c;

    public cxvc(cxvi cxviVar, Channel channel, cxvk cxvkVar) {
        this.c = cxviVar;
        this.a = channel;
        this.b = cxvkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cxpd cxpdVar;
        if (!(this.a instanceof ManualChannel) || (cxpdVar = this.c.q) == null || !cxpdVar.a.g()) {
            if (this.a.d() == 0 || (!this.c.h.n() && this.a.d() == 2)) {
                Context context = this.c.a;
                String str = null;
                if (TextUtils.isEmpty(null)) {
                    str = this.c.a.getResources().getString(true != this.c.h.n() ? R.string.peoplekit_listview_invalid_input_no_phone_number : R.string.peoplekit_invalid_input);
                }
                Toast.makeText(context, str, 0).show();
                return;
            }
            this.b.d(this.c.a.getResources().getString(R.string.peoplekit_listview_selected));
            this.c.f.d(this.a);
            this.b.c(true);
            PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
            if (this.a instanceof ManualChannel) {
                peopleKitVisualElementPath.a(new czhc(dhjm.c));
            } else {
                peopleKitVisualElementPath.a(new czhc(dhjm.f));
            }
            if (this.c.h.i()) {
                cxvi cxviVar = this.c;
                View view2 = this.b.b;
                Channel channel = this.a;
                View findViewById = view2.findViewById(R.id.peoplekit_row_progress_bar);
                cxviVar.m = true;
                view2.postDelayed(new cxve(cxviVar, findViewById), 200L);
                cxviVar.e.q(channel, new cxvg(cxviVar, view2, findViewById, channel));
            } else {
                cxvi cxviVar2 = this.c;
                cxov cxovVar = cxviVar2.i;
                if (cxovVar != null) {
                    cxovVar.r(this.a.z(cxviVar2.a));
                }
            }
            peopleKitVisualElementPath.c(this.c.j);
            this.c.g.d(4, peopleKitVisualElementPath);
            return;
        }
        cxqo cxqoVar = this.c.g;
        PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath2.a(new czhc(dhjm.c));
        peopleKitVisualElementPath2.c(this.c.j);
        cxqoVar.d(4, peopleKitVisualElementPath2);
    }
}

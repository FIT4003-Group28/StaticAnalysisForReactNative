package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.AutocompleteMatchInfo;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.ManualChannel;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cxvi  reason: default package */
/* loaded from: classes5.dex */
public final class cxvi extends abg {
    public final Context a;
    public final PeopleKitDataLayer e;
    public final PeopleKitSelectionModel f;
    public final cxqo g;
    public final PeopleKitConfig h;
    public final cxov i;
    public final PeopleKitVisualElementPath j;
    public String k;
    public String l;
    public boolean m;
    public boolean o;
    public cxpd q;
    private final int r;
    private final cxse t;
    private boolean u;
    private final boolean v;
    public boolean n = false;
    public cxsq p = cxsq.b();
    private List<Channel> s = new ArrayList();

    public cxvi(Context context, PeopleKitDataLayer peopleKitDataLayer, PeopleKitSelectionModel peopleKitSelectionModel, cxqo cxqoVar, PeopleKitConfig peopleKitConfig, cxov cxovVar, PeopleKitVisualElementPath peopleKitVisualElementPath, cxse cxseVar) {
        this.a = context;
        this.e = peopleKitDataLayer;
        this.f = peopleKitSelectionModel;
        this.g = cxqoVar;
        this.h = peopleKitConfig;
        this.i = cxovVar;
        this.j = peopleKitVisualElementPath;
        this.r = peopleKitConfig.g();
        this.t = cxseVar;
        this.u = cxseVar.e();
        this.v = ((AccessibilityManager) context.getSystemService("accessibility")).isTouchExplorationEnabled();
    }

    public final void a(List<Channel> list) {
        this.s = list;
        s();
    }

    public final void b() {
        this.u = false;
        s();
    }

    @Override // defpackage.abg
    public final int c() {
        List<Channel> list = this.s;
        if (list == null) {
            return 0;
        }
        return list.size() + (this.u ? 1 : 0);
    }

    @Override // defpackage.abg
    public final acl d(ViewGroup viewGroup, int i) {
        return new cxvh(new cxvk(this.a, viewGroup, this.g, this.t, this.j));
    }

    @Override // defpackage.abg
    public final void e(acl aclVar, int i) {
        String b;
        cxvk cxvkVar = ((cxvh) aclVar).s;
        cxsq cxsqVar = this.p;
        if (!cxvkVar.i.equals(cxsqVar)) {
            cxvkVar.i = cxsqVar;
            cxvkVar.a();
        }
        cxvkVar.c.i();
        cxvkVar.c.a.setAlpha(1.0f);
        cxvkVar.d.setText("");
        cxvkVar.e.setText("");
        cxvkVar.d("");
        cxvkVar.c(false);
        cxvkVar.b.findViewById(R.id.peoplekit_listview_flattened_row).setVisibility(0);
        cxvkVar.b.findViewById(R.id.peoplekit_listview_flattened_permissions_row).setVisibility(8);
        cxvkVar.b.findViewById(R.id.peoplekit_listview_no_contacts_row).setVisibility(8);
        cxvkVar.b.findViewById(R.id.peoplekit_listview_no_results_fullscreen).setVisibility(8);
        cxvkVar.b.getLayoutParams().height = -2;
        AutocompleteMatchInfo autocompleteMatchInfo = null;
        cxvkVar.b.setOnClickListener(null);
        if (!this.u || i != this.s.size()) {
            Channel channel = this.s.get(i);
            this.e.f(channel);
            boolean i2 = cxrc.i(channel, this.h.a(), this.h.e());
            if (channel instanceof ManualChannel) {
                cxvkVar.c.j(akm.c(this.a, R.color.quantum_googred), false);
                if (this.h.q() || !i2) {
                    if (TextUtils.isEmpty(null)) {
                        cxvkVar.b(this.a.getResources().getString(R.string.peoplekit_listview_add_recipient), channel.b(this.a), null, null);
                    } else {
                        cxvkVar.b(null, channel.b(this.a), null, null);
                    }
                } else {
                    cxvkVar.b(null, channel.b(this.a), null, null);
                }
            } else {
                if (this.o) {
                    b = cxrc.l(channel, this.a);
                } else {
                    b = channel.b(this.a);
                }
                String i3 = channel.i(this.a);
                AutocompleteMatchInfo h = channel.h();
                if (channel.r() == 1) {
                    autocompleteMatchInfo = channel.e();
                }
                cxvkVar.b(i3, b, h, autocompleteMatchInfo);
                if (this.h.r() && channel.y()) {
                    cxvkVar.c.g(this.r, this.n ? 0 : akm.c(cxvkVar.a, R.color.google_white));
                }
                cxvkVar.c.b(channel);
            }
            if (i2) {
                cxvkVar.d(this.a.getResources().getString(R.string.peoplekit_listview_self));
            }
            if (this.h.q() || !i2) {
                if (!this.f.f(channel)) {
                    cxvkVar.b.setOnClickListener(new cxvc(this, channel, cxvkVar));
                    if (!this.v) {
                        return;
                    }
                    od.c(cxvkVar.b, new cxvd(this));
                    return;
                }
                cxvkVar.d(this.a.getResources().getString(R.string.peoplekit_listview_selected));
                cxvkVar.c(true);
                cxvkVar.b.setClickable(false);
                if (!this.v) {
                    cxvkVar.b.setOnClickListener(new cxvb(this));
                    return;
                }
                od.c(cxvkVar.b, new ne());
                cxvkVar.e(this.a.getString(R.string.peoplekit_listview_already_selected));
                return;
            }
            cxvkVar.c(true);
            cxvkVar.b.setClickable(false);
            if (!this.v) {
                cxvkVar.b.setOnClickListener(new cxva(this));
                return;
            }
            od.c(cxvkVar.b, new ne());
            cxvkVar.e(this.a.getString(R.string.peoplekit_listview_no_self_select));
            return;
        }
        cxvkVar.b.findViewById(R.id.peoplekit_listview_flattened_row).setVisibility(8);
        cxvkVar.b.findViewById(R.id.peoplekit_listview_flattened_permissions_row).setVisibility(0);
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.a(new czhc(dhjm.P));
        peopleKitVisualElementPath.c(cxvkVar.g);
        cxvkVar.f.d(-1, peopleKitVisualElementPath);
        cxvkVar.b.setOnClickListener(new cxvj(cxvkVar, peopleKitVisualElementPath));
    }

    @Override // defpackage.abg
    public final long k(int i) {
        return i;
    }
}

package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cxuo  reason: default package */
/* loaded from: classes5.dex */
public final class cxuo extends abg {
    public final Context a;
    public final cxqo f;
    public final PeopleKitVisualElementPath g;
    public cxov h;
    public boolean l;
    public String m;
    private final PeopleKitDataLayer o;
    private final PeopleKitSelectionModel p;
    private final cxse q;
    private final PeopleKitConfig r;
    private final int s;
    private boolean t;
    public final List<CoalescedChannels> e = new ArrayList();
    public boolean k = false;
    public cxsq n = cxsq.b();
    public List<CoalescedChannels> i = new ArrayList();
    public List<CoalescedChannels> j = new ArrayList();

    public cxuo(Context context, PeopleKitDataLayer peopleKitDataLayer, PeopleKitSelectionModel peopleKitSelectionModel, cxse cxseVar, cxqo cxqoVar, PeopleKitConfig peopleKitConfig, PeopleKitVisualElementPath peopleKitVisualElementPath) {
        this.a = context;
        this.o = peopleKitDataLayer;
        this.p = peopleKitSelectionModel;
        this.q = cxseVar;
        this.f = cxqoVar;
        this.r = peopleKitConfig;
        this.g = peopleKitVisualElementPath;
        this.s = peopleKitConfig.g();
        this.t = cxseVar.e();
        peopleKitSelectionModel.i(new cxuj());
    }

    private final void b(cxuz cxuzVar, String str, boolean z) {
        View y = y(cxuzVar);
        y.findViewById(R.id.peoplekit_listview_main_header_wrapper).setVisibility(0);
        ((TextView) y.findViewById(R.id.peoplekit_listview_main_header)).setText(str);
        View findViewById = y.findViewById(R.id.peoplekit_listview_header_info);
        if (z) {
            findViewById.setOnClickListener(new cxul(this));
            findViewById.setVisibility(0);
            return;
        }
        findViewById.setVisibility(8);
    }

    private static final View y(cxuz cxuzVar) {
        View findViewById = cxuzVar.b.findViewById(R.id.peoplekit_listview_header);
        findViewById.setVisibility(0);
        return findViewById;
    }

    private static final void z(cxuz cxuzVar, String str) {
        TextView textView = (TextView) y(cxuzVar).findViewById(R.id.peoplekit_listview_header_letter);
        textView.setVisibility(0);
        textView.setText(str);
    }

    public final void a() {
        this.t = false;
        s();
    }

    @Override // defpackage.abg
    public final int c() {
        return this.i.size() + this.j.size() + (this.t ? 1 : 0);
    }

    @Override // defpackage.abg
    public final acl d(ViewGroup viewGroup, int i) {
        return new cxun(new cxuz(this.a, this.o, this.p, new cxuk(this), this.f, this.r, this.q, this.g));
    }

    @Override // defpackage.abg
    public final void e(acl aclVar, int i) {
        CoalescedChannels coalescedChannels;
        boolean z;
        int i2 = i;
        cxuz cxuzVar = ((cxun) aclVar).s;
        cxuzVar.b.setOnClickListener(null);
        cxuzVar.b.setClickable(false);
        View findViewById = cxuzVar.b.findViewById(R.id.peoplekit_listview_header);
        findViewById.setVisibility(8);
        findViewById.findViewById(R.id.peoplekit_listview_main_header_wrapper).setVisibility(8);
        findViewById.findViewById(R.id.peoplekit_listview_star).setVisibility(8);
        findViewById.findViewById(R.id.peoplekit_listview_header_letter).setVisibility(8);
        cxuzVar.b.findViewById(R.id.peoplekit_listview_main_row).setVisibility(0);
        cxuzVar.b.findViewById(R.id.peoplekit_listview_permissions_row).setVisibility(8);
        cxuzVar.d.setText("");
        cxuzVar.d.setTranslationY(0.0f);
        cxuzVar.d.setTypeface(Typeface.SANS_SERIF, 0);
        cxuzVar.e.setText("");
        cxuzVar.e.setAlpha(1.0f);
        cxuzVar.e.setVisibility(0);
        cxuzVar.f.setText("");
        cxuzVar.f.setVisibility(true != TextUtils.isEmpty("") ? 0 : 8);
        AppCompatImageView appCompatImageView = (AppCompatImageView) cxuzVar.b.findViewById(R.id.peoplekit_listview_chevron);
        appCompatImageView.setRotation(0.0f);
        appCompatImageView.setVisibility(8);
        Drawable b = sl.b(cxuzVar.a, 2131232266);
        ks.b(b);
        b.mutate().setTint(akm.c(cxuzVar.a, cxuzVar.s.m));
        appCompatImageView.setImageDrawable(b);
        cxuzVar.c.i();
        cxuzVar.g.removeAllViews();
        cxuzVar.g.setVisibility(8);
        cxuzVar.b.findViewById(R.id.peoplekit_listview_main_content).getLayoutParams().height = -2;
        cxuzVar.p = null;
        cxuzVar.o = null;
        cxuzVar.r = i2;
        cxuzVar.n = this.h;
        cxsq cxsqVar = this.n;
        if (!cxuzVar.s.equals(cxsqVar)) {
            cxuzVar.s = cxsqVar;
            cxuzVar.c.h(cxsqVar);
            cxuzVar.a();
        }
        if (this.l) {
            cxuzVar.q = true;
        }
        if (this.t) {
            if (i2 == 0) {
                cxuzVar.b.findViewById(R.id.peoplekit_listview_main_row).setVisibility(8);
                cxuzVar.b.findViewById(R.id.peoplekit_listview_permissions_row).setVisibility(0);
                PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
                peopleKitVisualElementPath.a(new czhc(dhjm.P));
                peopleKitVisualElementPath.c(cxuzVar.m);
                cxuzVar.j.d(-1, peopleKitVisualElementPath);
                cxuzVar.b.setOnClickListener(new cxuu(cxuzVar, peopleKitVisualElementPath));
                return;
            }
            i2--;
        }
        if (i2 < this.i.size()) {
            if (i2 == 0) {
                b(cxuzVar, this.a.getString(R.string.peoplekit_listview_suggestions), true);
                i2 = 0;
            }
            coalescedChannels = this.i.get(i2);
            z = false;
        } else {
            if (i2 - this.i.size() == 0) {
                b(cxuzVar, this.a.getString(R.string.peoplekit_listview_phone_contacts), false);
            }
            coalescedChannels = this.j.get(i2 - this.i.size());
            z = true;
        }
        Channel channel = coalescedChannels.b().get(0);
        if (this.r.r() && channel.y()) {
            cxuzVar.c.g(this.s, this.k ? 0 : akm.c(cxuzVar.a, R.color.google_white));
        }
        cxuzVar.c.c(coalescedChannels);
        if (z) {
            if (channel.p()) {
                if (i2 - this.i.size() == 0) {
                    y(cxuzVar).findViewById(R.id.peoplekit_listview_star).setVisibility(0);
                }
            } else if (i2 - this.i.size() == 0) {
                z(cxuzVar, channel.o());
            } else if (!this.j.get((i2 - this.i.size()) - 1).b().get(0).o().equals(channel.o())) {
                z(cxuzVar, channel.o());
            }
        }
        cxuzVar.o = coalescedChannels;
        cxuzVar.g.removeAllViews();
        List<Channel> b2 = coalescedChannels.b();
        cxuzVar.p = b2.get(0);
        for (Channel channel2 : b2) {
            if (cxuzVar.i.f(channel2)) {
                cxuzVar.p = channel2;
            }
        }
        if (coalescedChannels.e() == 1) {
            cxuzVar.d.setText(cxrc.h(coalescedChannels, cxuzVar.a));
            if (coalescedChannels.a() != 1 || coalescedChannels.c().isEmpty()) {
                cxuzVar.e.setText(cxuzVar.a.getString(R.string.peoplekit_group_contact_method, Integer.valueOf(coalescedChannels.a())));
            } else {
                cxuzVar.d(cxuzVar.e, coalescedChannels.c().get(0));
            }
        } else {
            cxuzVar.d.setText(cxuzVar.p.i(cxuzVar.a));
            cxuzVar.d(cxuzVar.e, cxuzVar.p);
        }
        cxuzVar.h.f(cxuzVar.p);
        cxuzVar.c.f(true != cxuzVar.i.f(cxuzVar.p) ? 1 : 2);
        View findViewById2 = cxuzVar.b.findViewById(R.id.peoplekit_listview_main_content);
        if (cxuzVar.i.f(cxuzVar.p)) {
            View view = cxuzVar.b;
            Context context = cxuzVar.a;
            view.setContentDescription(context.getString(R.string.peoplekit_contact_name_and_method_selected_description, cxuzVar.p.i(context), cxuzVar.p.b(cxuzVar.a)));
        } else {
            cxuzVar.b.setContentDescription(null);
        }
        findViewById2.setOnClickListener(new cxup(cxuzVar, coalescedChannels));
        if (coalescedChannels.a() > 1 && coalescedChannels.e() != 1) {
            View findViewById3 = cxuzVar.b.findViewById(R.id.peoplekit_listview_chevron);
            findViewById3.setVisibility(0);
            Drawable drawable = ((AppCompatImageView) findViewById3).getDrawable();
            ks.b(drawable);
            drawable.mutate().setTint(akm.c(cxuzVar.a, cxuzVar.s.m));
            ((AppCompatImageView) cxuzVar.b.findViewById(R.id.peoplekit_listview_chevron)).setImageDrawable(drawable);
            Context context2 = cxuzVar.a;
            findViewById3.setContentDescription(context2.getString(R.string.peoplekit_expand_button_content_description, cxuzVar.p.i(context2)));
            findViewById3.setOnClickListener(new cxuq(cxuzVar, coalescedChannels));
        }
        if (this.e.contains(coalescedChannels)) {
            cxuzVar.b(coalescedChannels);
            cxuzVar.e(true, false);
        }
    }
}

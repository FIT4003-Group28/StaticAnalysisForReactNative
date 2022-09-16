package defpackage;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitControllerLoggingRelativeLayout;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.analytics.Stopwatch;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cxti  reason: default package */
/* loaded from: classes5.dex */
public final class cxti implements cxri, cxso, cxsf {
    public final boolean C;
    public final Context a;
    public final PeopleKitControllerLoggingRelativeLayout b;
    public final PeopleKitDataLayer c;
    public final PeopleKitSelectionModel d;
    public final cxqo e;
    public final cxse f;
    public final PeopleKitVisualElementPath g;
    public final cxov h;
    public final PeopleKitConfig i;
    public cxth j;
    public cxsf k;
    public List<CoalescedChannels> l;
    public int p;
    public final LinearLayout q;
    public final RecyclerView r;
    public final abg<cxtg> s;
    public AnimatorSet v;
    public View w;
    public int x;
    public int y;
    public final Map<cxpr, Channel> m = new HashMap();
    public final Map<cxpr, View> n = new HashMap();
    public final Map<View, cxpr> o = new HashMap();
    public List<View> t = new ArrayList();
    public final List<View> u = new ArrayList();
    public boolean z = false;
    public boolean A = true;
    public boolean B = false;
    public cxsq D = cxsq.b();

    public cxti(Context context, PeopleKitDataLayer peopleKitDataLayer, PeopleKitSelectionModel peopleKitSelectionModel, cxqo cxqoVar, PeopleKitConfig peopleKitConfig, ViewGroup viewGroup, cxth cxthVar, cxov cxovVar, PeopleKitVisualElementPath peopleKitVisualElementPath, boolean z) {
        boolean z2 = true;
        this.a = context;
        this.c = peopleKitDataLayer;
        this.d = peopleKitSelectionModel;
        this.e = cxqoVar;
        this.i = peopleKitConfig;
        this.j = cxthVar;
        this.h = cxovVar;
        PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath2.a(new czhc(dhjm.r));
        peopleKitVisualElementPath2.c(peopleKitVisualElementPath);
        this.g = peopleKitVisualElementPath2;
        this.C = (!z || peopleKitConfig.t() != 19) ? false : z2;
        cxqoVar.d(-1, peopleKitVisualElementPath2);
        this.p = peopleKitConfig.g();
        peopleKitSelectionModel.i(this);
        cxse cxseVar = new cxse(context, this, peopleKitConfig.l(), cxqoVar);
        this.f = cxseVar;
        cxseVar.b(new cxta(this));
        PeopleKitControllerLoggingRelativeLayout peopleKitControllerLoggingRelativeLayout = (PeopleKitControllerLoggingRelativeLayout) LayoutInflater.from(context).inflate(R.layout.peoplekit_facerows_scrolling_view, viewGroup, false);
        this.b = peopleKitControllerLoggingRelativeLayout;
        peopleKitControllerLoggingRelativeLayout.setUp(cxqoVar, peopleKitVisualElementPath2);
        this.q = (LinearLayout) peopleKitControllerLoggingRelativeLayout.findViewById(R.id.peoplekit_ghost_facerows_items);
        for (int i = 0; i < 8; i++) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.peoplekit_ghost_facerows_item, (ViewGroup) this.q, false);
            if (this.C) {
                inflate.setPaddingRelative(inflate.getPaddingStart(), 0, inflate.getPaddingEnd(), 0);
            }
            this.u.add(inflate);
            this.q.addView(inflate);
        }
        RecyclerView recyclerView = (RecyclerView) this.b.findViewById(R.id.peoplekit_facerows_items);
        this.r = recyclerView;
        cxtb cxtbVar = new cxtb(this, context);
        this.s = cxtbVar;
        recyclerView.setLayoutManager(new aag(0, false));
        recyclerView.setAdapter(cxtbVar);
        l();
        this.v = cxqw.a(this.u);
        peopleKitDataLayer.c(this);
    }

    private final void l() {
        int c = akm.c(this.a, this.D.a);
        this.b.setBackgroundColor(c);
        this.s.s();
        for (View view : this.u) {
            view.setBackgroundColor(c);
        }
        View view2 = this.w;
        if (view2 != null) {
            view2.setBackgroundColor(c);
        }
        if (this.r.findViewById(R.id.peoplekit_facerows_more_button) != null) {
            m(this.r);
        }
        if (this.q.findViewById(R.id.peoplekit_facerows_more_button) != null) {
            m(this.q);
        }
    }

    private final void m(View view) {
        ((TextView) view.findViewById(R.id.peoplekit_facerows_more_text)).setTextColor(akm.c(this.a, this.D.e));
        Drawable drawable = ((AppCompatImageView) view.findViewById(R.id.peoplekit_facerows_more_button)).getDrawable();
        ks.b(drawable);
        drawable.mutate().setTint(akm.c(this.a, this.D.n));
    }

    @Override // defpackage.cxsf
    public final void a(String[] strArr) {
        cxsf cxsfVar = this.k;
        if (cxsfVar != null) {
            cxsfVar.a(strArr);
            return;
        }
        Context context = this.a;
        if (context instanceof Activity) {
            ((Activity) context).requestPermissions(strArr, 1234);
            return;
        }
        throw new IllegalStateException("PeopleKit needs an activity or a permission listener to handle permissions.");
    }

    @Override // defpackage.cxsf
    public final boolean b() {
        cxsf cxsfVar = this.k;
        if (cxsfVar != null) {
            return cxsfVar.b();
        }
        Context context = this.a;
        if (context instanceof Activity) {
            return ((Activity) context).shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS");
        }
        throw new IllegalStateException("PeopleKit needs an activity or a permission listener to handle permissions.");
    }

    public final int c() {
        List<CoalescedChannels> list = this.l;
        if (list == null) {
            return 8;
        }
        return Math.min(8, list.size());
    }

    public final void d() {
        List<CoalescedChannels> list = this.l;
        if (list != null) {
            list.clear();
        }
        Stopwatch a = this.e.a("FaceRowTopSuggestionsTime");
        a.b();
        a.c();
        this.c.k();
    }

    public final void e() {
        if (this.w == null) {
            if (this.f.e()) {
                View inflate = LayoutInflater.from(this.a).inflate(R.layout.peoplekit_facerows_show_phone_contacts_full, (ViewGroup) this.b, false);
                this.w = inflate;
                inflate.setOnClickListener(new cxtc(this));
                PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
                peopleKitVisualElementPath.a(new czhc(dhjm.P));
                peopleKitVisualElementPath.c(this.g);
                this.e.d(-1, peopleKitVisualElementPath);
            } else {
                this.w = LayoutInflater.from(this.a).inflate(R.layout.peoplekit_facerows_no_contacts, (ViewGroup) this.b, false);
                PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
                peopleKitVisualElementPath2.a(new czhc(dhjm.C));
                peopleKitVisualElementPath2.c(this.g);
                this.e.d(-1, peopleKitVisualElementPath2);
            }
            this.q.setVisibility(8);
            this.r.setVisibility(8);
            this.b.addView(this.w);
        }
    }

    public final void f(View view) {
        if (this.C) {
            view.setPaddingRelative(view.getPaddingStart(), 0, view.getPaddingEnd(), 0);
        }
        TextView textView = (TextView) view.findViewById(R.id.peoplekit_facerows_more_text);
        textView.setTextColor(akm.c(this.a, this.D.e));
        if (this.y != 0) {
            int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(this.y);
            textView.setTextSize(0, dimensionPixelSize);
            if (dimensionPixelSize > this.a.getResources().getDimensionPixelSize(R.dimen.peoplekit_facerows_item_name_size)) {
                textView.setLines(2);
            }
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.peoplekit_facerows_more_button);
        if (this.x != 0) {
            int dimensionPixelSize2 = this.a.getResources().getDimensionPixelSize(this.x);
            appCompatImageView.getLayoutParams().height = dimensionPixelSize2;
            appCompatImageView.getLayoutParams().width = dimensionPixelSize2;
        }
        Drawable drawable = appCompatImageView.getDrawable();
        ks.b(drawable);
        drawable.mutate().setTint(akm.c(this.a, this.D.n));
        view.setOnClickListener(new cxte(this));
    }

    public final void g() {
        this.f.c(this.g);
    }

    public final void h(cxsq cxsqVar) {
        if (!this.D.equals(cxsqVar)) {
            this.D = cxsqVar;
            for (cxpr cxprVar : this.o.values()) {
                cxprVar.h(cxsqVar);
            }
            l();
        }
    }

    public final void i(boolean z) {
        boolean z2 = this.z;
        this.z = z;
        if (z2 == z || this.m.isEmpty()) {
            return;
        }
        for (Map.Entry<cxpr, Channel> entry : this.m.entrySet()) {
            Channel value = entry.getValue();
            cxpr key = entry.getKey();
            if (this.i.r() && value.y()) {
                key.g(this.p, z ? 0 : akm.c(this.a, R.color.quantum_white_100));
            }
        }
    }

    public final void k(int i, int[] iArr) {
        this.f.f(i, iArr);
    }

    @Override // defpackage.cxri
    public final void s(List<CoalescedChannels> list, cxrb cxrbVar) {
        Context context = this.a;
        if (context == null) {
            return;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return;
            }
        }
        List<CoalescedChannels> list2 = this.l;
        if (list2 == null || cxrbVar.a == 0) {
            this.l = new ArrayList(list);
        } else {
            list2.addAll(list);
        }
        if (!cxrbVar.b) {
            return;
        }
        if (this.B) {
            this.l = cxrc.g(this.l);
        }
        int i = 0;
        for (CoalescedChannels coalescedChannels : this.l) {
            for (Channel channel : coalescedChannels.b()) {
                if (channel.y()) {
                    i++;
                }
            }
        }
        cxqo cxqoVar = this.e;
        eazd bZ = eaze.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eaze eazeVar = (eaze) bZ.b;
        eazeVar.b = 3;
        eazeVar.a |= 1;
        eayy bZ2 = eayz.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        eayz eayzVar = (eayz) bZ2.b;
        eayzVar.b = 2;
        int i2 = eayzVar.a | 1;
        eayzVar.a = i2;
        eayzVar.a = i2 | 2;
        eayzVar.c = i;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eaze eazeVar2 = (eaze) bZ.b;
        eayz bK = bZ2.bK();
        bK.getClass();
        eazeVar2.d = bK;
        eazeVar2.a |= 4;
        eazk bZ3 = eazl.e.bZ();
        int g = this.e.g();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        eazl eazlVar = (eazl) bZ3.b;
        int i3 = g - 1;
        if (g == 0) {
            throw null;
        }
        eazlVar.b = i3;
        eazlVar.a |= 1;
        eazl eazlVar2 = (eazl) bZ3.b;
        eazlVar2.c = 1;
        int i4 = eazlVar2.a | 2;
        eazlVar2.a = i4;
        int i5 = cxrbVar.a;
        eazlVar2.a = i4 | 4;
        eazlVar2.d = i5;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eaze eazeVar3 = (eaze) bZ.b;
        eazl bK2 = bZ3.bK();
        bK2.getClass();
        eazeVar3.c = bK2;
        eazeVar3.a |= 2;
        cxqoVar.b(bZ.bK());
        Stopwatch a = cxqn.a();
        a.c();
        this.v.cancel();
        List<CoalescedChannels> list3 = this.l;
        if (list3 == null || list3.isEmpty()) {
            e();
        } else {
            this.m.clear();
            this.n.clear();
            this.o.clear();
            this.q.setVisibility(8);
            this.r.setVisibility(0);
            this.s.s();
            RecyclerView recyclerView = this.r;
            if (recyclerView.getWindowToken() == null || recyclerView.getVisibility() == 0) {
                recyclerView.setVisibility(0);
                recyclerView.setAlpha(1.0f);
            } else {
                recyclerView.setAlpha(0.0f);
                recyclerView.setVisibility(0);
                recyclerView.animate().alpha(1.0f).setDuration(250L).setStartDelay(0L).setListener(new cxqv(recyclerView)).start();
            }
        }
        if (!this.l.isEmpty()) {
            cxqo cxqoVar2 = this.e;
            PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath.a(new czhc(dhjm.L));
            peopleKitVisualElementPath.c(this.g);
            cxqoVar2.d(-1, peopleKitVisualElementPath);
            cxqo cxqoVar3 = this.e;
            PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath2.a(new czhc(dhjm.Q));
            peopleKitVisualElementPath2.c(this.g);
            cxqoVar3.d(-1, peopleKitVisualElementPath2);
        }
        this.r.post(new cxtf(this, a, cxrbVar, i));
    }

    @Override // defpackage.cxri
    public final void t(List<Channel> list, cxrb cxrbVar) {
    }

    @Override // defpackage.cxri
    public final void u(List<CoalescedChannels> list, cxrb cxrbVar) {
    }

    @Override // defpackage.cxso
    public final void v(Channel channel, CoalescedChannels coalescedChannels) {
        for (cxpr cxprVar : this.m.keySet()) {
            if (channel.equals(this.m.get(cxprVar))) {
                cxprVar.f(2);
                Context context = this.a;
                this.n.get(cxprVar).setContentDescription(context.getString(R.string.peoplekit_contact_name_and_method_selected_description, channel.i(context), channel.b(this.a)));
            }
        }
    }

    @Override // defpackage.cxso
    public final void w(Channel channel) {
        for (cxpr cxprVar : this.m.keySet()) {
            if (channel.equals(this.m.get(cxprVar))) {
                cxprVar.f(1);
                this.n.get(cxprVar).setContentDescription(null);
            }
        }
    }
}

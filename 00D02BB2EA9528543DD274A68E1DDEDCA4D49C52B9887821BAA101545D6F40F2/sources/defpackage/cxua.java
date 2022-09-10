package defpackage;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.analytics.Stopwatch;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cxua  reason: default package */
/* loaded from: classes5.dex */
public final class cxua implements cxri, cxsf {
    public final Activity a;
    public final View b;
    public final RecyclerView c;
    public final cxuo d;
    public final cxse e;
    public final cxqo f;
    public PeopleKitVisualElementPath g;
    public List<CoalescedChannels> i;
    public cxsf j;
    public cxvx l;
    private final PeopleKitDataLayer m;
    private final PeopleKitConfig n;
    private final int o;
    private final AnimatorSet p;
    public boolean h = false;
    public cxsq k = cxsq.b();

    public cxua(Activity activity, PeopleKitDataLayer peopleKitDataLayer, PeopleKitSelectionModel peopleKitSelectionModel, cxqo cxqoVar, PeopleKitConfig peopleKitConfig, PeopleKitVisualElementPath peopleKitVisualElementPath, int i) {
        this.a = activity;
        this.m = peopleKitDataLayer;
        this.f = cxqoVar;
        this.n = peopleKitConfig;
        PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath2.a(new czhc(dhjm.d));
        peopleKitVisualElementPath2.c(peopleKitVisualElementPath);
        this.g = peopleKitVisualElementPath2;
        cxqoVar.d(-1, peopleKitVisualElementPath2);
        this.o = i;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.peoplekit_top_suggestions_container, (ViewGroup) null);
        this.b = inflate;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.peoplekit_top_suggestions_recyclerview);
        this.c = recyclerView;
        recyclerView.setLayoutManager(new aag());
        cxse cxseVar = new cxse(activity, this, peopleKitConfig.l(), cxqoVar);
        this.e = cxseVar;
        cxseVar.b(new cxtw(this));
        cxuo cxuoVar = new cxuo(activity, peopleKitDataLayer, peopleKitSelectionModel, cxseVar, cxqoVar, peopleKitConfig, this.g);
        this.d = cxuoVar;
        recyclerView.setAdapter(cxuoVar);
        d();
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.peoplekit_top_suggestions_loading);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
            arrayList.add(linearLayout.getChildAt(i2));
        }
        this.p = cxqw.a(arrayList);
        peopleKitDataLayer.c(this);
    }

    @Override // defpackage.cxsf
    public final void a(String[] strArr) {
        cxsf cxsfVar = this.j;
        if (cxsfVar != null) {
            cxsfVar.a(strArr);
        } else {
            this.a.requestPermissions(strArr, 1234);
        }
    }

    @Override // defpackage.cxsf
    public final boolean b() {
        cxsf cxsfVar = this.j;
        if (cxsfVar != null) {
            return cxsfVar.b();
        }
        return this.a.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS");
    }

    public final void c() {
        List<CoalescedChannels> list = this.i;
        if (list != null) {
            list.clear();
        }
        Stopwatch a = this.f.a("ListViewTopSuggestionsTime");
        a.b();
        a.c();
        this.m.k();
    }

    public final void d() {
        this.b.setBackgroundColor(akm.c(this.a, this.k.a));
        ((AppCompatTextView) this.b.findViewById(R.id.peoplekit_listview_main_header)).setTextColor(akm.c(this.a, this.k.e));
    }

    public final void e() {
        this.p.cancel();
        this.b.findViewById(R.id.peoplekit_top_suggestions_loading).setVisibility(8);
        this.b.findViewById(R.id.peoplekit_top_suggestions_recyclerview).setVisibility(0);
        cxvx cxvxVar = this.l;
        if (cxvxVar != null) {
            cxwe cxweVar = cxvxVar.a;
            cxweVar.m = true;
            if (!cxweVar.n) {
                return;
            }
            cxweVar.h.l(false);
            cxvxVar.a.n = false;
        }
    }

    @Override // defpackage.cxri
    public final void t(List<Channel> list, cxrb cxrbVar) {
    }

    @Override // defpackage.cxri
    public final void u(List<CoalescedChannels> list, cxrb cxrbVar) {
        Stopwatch a = cxqn.a();
        a.c();
        this.a.runOnUiThread(new cxtx(this, list, cxrbVar, a));
    }

    @Override // defpackage.cxri
    public final void s(List<CoalescedChannels> list, cxrb cxrbVar) {
        List<CoalescedChannels> list2 = this.i;
        if (list2 == null || cxrbVar.a == 0) {
            this.i = new ArrayList(list);
        } else {
            list2.addAll(list);
        }
        if (cxrbVar.b) {
            if (this.h) {
                this.i = cxrc.g(this.i);
            }
            int size = this.i.size();
            int i = this.o;
            if (size > i) {
                this.i = this.i.subList(0, i);
            }
            Stopwatch a = cxqn.a();
            a.c();
            cxuo cxuoVar = this.d;
            cxuoVar.i = this.i;
            cxuoVar.s();
            if (!cxse.a(this.a) || !this.n.l()) {
                e();
            } else {
                Stopwatch a2 = this.f.a("ListViewDeviceSuggestionsTime");
                a2.b();
                a2.c();
                this.m.m();
            }
            int i2 = 0;
            for (CoalescedChannels coalescedChannels : this.i) {
                for (Channel channel : coalescedChannels.b()) {
                    if (channel.y()) {
                        i2++;
                    }
                }
            }
            if (!this.i.isEmpty()) {
                cxqo cxqoVar = this.f;
                PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
                peopleKitVisualElementPath.a(new czhc(dhjm.L));
                peopleKitVisualElementPath.c(this.g);
                cxqoVar.d(-1, peopleKitVisualElementPath);
                cxqo cxqoVar2 = this.f;
                PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
                peopleKitVisualElementPath2.a(new czhc(dhjm.Q));
                peopleKitVisualElementPath2.c(this.g);
                cxqoVar2.d(-1, peopleKitVisualElementPath2);
            }
            cxqo cxqoVar3 = this.f;
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
            int i3 = eayzVar.a | 1;
            eayzVar.a = i3;
            eayzVar.a = i3 | 2;
            eayzVar.c = i2;
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
            int g = this.f.g();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            eazl eazlVar = (eazl) bZ3.b;
            int i4 = g - 1;
            if (g == 0) {
                throw null;
            }
            eazlVar.b = i4;
            eazlVar.a |= 1;
            eazl eazlVar2 = (eazl) bZ3.b;
            eazlVar2.c = 1;
            eazlVar2.a |= 2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eaze eazeVar3 = (eaze) bZ.b;
            eazl bK2 = bZ3.bK();
            bK2.getClass();
            eazeVar3.c = bK2;
            eazeVar3.a |= 2;
            cxqoVar3.b(bZ.bK());
            this.c.post(new cxty(this, a, cxrbVar));
        }
    }
}

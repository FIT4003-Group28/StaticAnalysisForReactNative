package defpackage;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;
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
/* renamed from: cxui  reason: default package */
/* loaded from: classes5.dex */
public final class cxui implements cxri {
    public final Activity a;
    public final RecyclerView b;
    public final cxvi c;
    public final cxse d;
    public final PeopleKitDataLayer e;
    public final cxqo f;
    public final PeopleKitConfig g;
    public final cxov h;
    public final List<Channel> i = new ArrayList();
    public EditText j;
    public String k;
    private final PeopleKitSelectionModel l;
    private final PeopleKitVisualElementPath m;
    private Channel n;

    public cxui(Activity activity, PeopleKitDataLayer peopleKitDataLayer, PeopleKitSelectionModel peopleKitSelectionModel, cxqo cxqoVar, PeopleKitConfig peopleKitConfig, cxov cxovVar, PeopleKitVisualElementPath peopleKitVisualElementPath, cxse cxseVar) {
        this.a = activity;
        this.e = peopleKitDataLayer;
        this.f = cxqoVar;
        this.d = cxseVar;
        this.l = peopleKitSelectionModel;
        this.g = peopleKitConfig;
        this.h = cxovVar;
        PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath2.a(new czhc(dhjm.g));
        peopleKitVisualElementPath2.c(peopleKitVisualElementPath);
        this.m = peopleKitVisualElementPath2;
        cxqoVar.d(-1, peopleKitVisualElementPath2);
        RecyclerView recyclerView = new RecyclerView(activity);
        this.b = recyclerView;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutParams(new abt(-1, -1));
        recyclerView.setLayoutManager(new aag());
        cxvi cxviVar = new cxvi(activity, peopleKitDataLayer, peopleKitSelectionModel, cxqoVar, peopleKitConfig, cxovVar, peopleKitVisualElementPath2, cxseVar);
        this.c = cxviVar;
        recyclerView.setAdapter(cxviVar);
        od.c(recyclerView, new cxub(this));
        recyclerView.setLayoutManager(new cxuc(activity));
        cxseVar.b(new cxud(this, peopleKitDataLayer, cxseVar));
        peopleKitSelectionModel.i(new cxue(this));
        peopleKitDataLayer.c(this);
    }

    private final String e() {
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        if (this.g.n()) {
            return this.a.getString(R.string.peoplekit_invalid_input);
        }
        return this.a.getString(R.string.peoplekit_listview_invalid_input_no_phone_number);
    }

    public final void a() {
        if (!this.g.p() && this.i.isEmpty()) {
            Toast.makeText(this.a, e(), 0).show();
        }
        if (this.g.q() || !cxrc.i(this.n, this.g.a(), this.g.e())) {
            if (!b() || (this.n.d() != 0 && (this.g.n() || this.n.d() != 2))) {
                if (this.i.isEmpty()) {
                    return;
                }
                Channel channel = this.i.get(0);
                if (this.l.f(channel)) {
                    Activity activity = this.a;
                    Toast.makeText(activity, activity.getResources().getString(R.string.peoplekit_listview_already_selected), 0).show();
                    return;
                }
                c(channel);
                return;
            }
            Toast.makeText(this.a, e(), 0).show();
            return;
        }
        Activity activity2 = this.a;
        Toast.makeText(activity2, activity2.getString(R.string.peoplekit_listview_no_self_select), 0).show();
    }

    public final boolean b() {
        return this.g.p() && this.i.size() == 1;
    }

    public final void c(Channel channel) {
        this.l.d(channel);
        if (this.g.i()) {
            this.e.q(channel, new cxug(this, channel));
        } else {
            cxov cxovVar = this.h;
            if (cxovVar != null) {
                cxovVar.r(channel.z(this.a));
            }
        }
        cxqo cxqoVar = this.f;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.a(new czhc(dhjm.w));
        peopleKitVisualElementPath.c(this.m);
        cxqoVar.d(4, peopleKitVisualElementPath);
    }

    public final void d(CharSequence charSequence, EditText editText) {
        this.i.clear();
        if (TextUtils.isEmpty(charSequence)) {
            this.c.a(null);
            return;
        }
        Stopwatch a = this.f.a("ACQueryToRender");
        a.b();
        a.c();
        this.n = this.e.o(charSequence.toString(), this.a);
        if (this.g.p()) {
            this.i.add(this.n);
        }
        this.j = editText;
        this.e.l(charSequence.toString());
    }

    @Override // defpackage.cxri
    public final void s(List<CoalescedChannels> list, cxrb cxrbVar) {
    }

    @Override // defpackage.cxri
    public final void t(List<Channel> list, cxrb cxrbVar) {
        List<Channel> list2;
        if (!this.i.isEmpty() && this.g.p() && dcft.s(this.i) == this.n) {
            this.i.remove(list2.size() - 1);
        }
        this.i.addAll(list);
        if (this.g.p()) {
            boolean z = true;
            for (Channel channel : this.i) {
                if (this.n != null && (cxqz.c(channel.c(), this.n.c()) || cxqz.b(channel.c(), this.n.c(), this.a))) {
                    z = false;
                }
            }
            if (z) {
                this.i.add(this.n);
            }
        }
        EditText editText = this.j;
        if (editText == null || TextUtils.isEmpty(editText.getText())) {
            return;
        }
        this.c.a(this.i);
        cxqo cxqoVar = this.f;
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
        int i = eayzVar.a | 1;
        eayzVar.a = i;
        int i2 = cxrbVar.c;
        eayzVar.a = i | 2;
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
        int i3 = g - 1;
        if (g != 0) {
            eazlVar.b = i3;
            eazlVar.a = 1 | eazlVar.a;
            eazl eazlVar2 = (eazl) bZ3.b;
            eazlVar2.c = 2;
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
            this.b.post(new cxuh(this, a, cxrbVar));
            return;
        }
        throw null;
    }

    @Override // defpackage.cxri
    public final void u(List<CoalescedChannels> list, cxrb cxrbVar) {
    }
}

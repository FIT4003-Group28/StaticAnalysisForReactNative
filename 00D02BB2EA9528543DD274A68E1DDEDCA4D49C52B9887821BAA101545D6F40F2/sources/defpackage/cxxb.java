package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.analytics.Stopwatch;
/* compiled from: PG */
/* renamed from: cxxb  reason: default package */
/* loaded from: classes5.dex */
public final class cxxb {
    public final Context a;
    public final View b;
    public final cxqo c;
    final PeopleKitVisualElementPath d;
    public cxwu e;
    public final RecyclerView f;
    public abg<cxxa> g;
    public cxsq h = cxsq.b();
    public final bwdn i;

    public cxxb(Context context, cxwu cxwuVar, cxqo cxqoVar, PeopleKitVisualElementPath peopleKitVisualElementPath, bwdn bwdnVar) {
        this.a = context;
        this.e = cxwuVar;
        this.c = cxqoVar;
        PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath2.a(new czhc(dhjm.R));
        peopleKitVisualElementPath2.c(peopleKitVisualElementPath);
        this.d = peopleKitVisualElementPath2;
        cxqoVar.d(-1, peopleKitVisualElementPath2);
        this.i = bwdnVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.peoplekit_third_party_apps_tray, (ViewGroup) null);
        this.b = inflate;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.peoplekit_third_party_scroll_view);
        this.f = recyclerView;
        recyclerView.setLayoutManager(new aag(0, false));
        a();
    }

    public final void a() {
        this.f.setBackgroundResource(this.h.a);
        abg<cxxa> abgVar = this.g;
        if (abgVar != null) {
            abgVar.s();
        }
    }

    public final void b(int i, int i2) {
        if (this.c != null) {
            czhc czhcVar = new czhc(dhjm.S);
            czhcVar.a(i2);
            cxqo cxqoVar = this.c;
            PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath.a(czhcVar);
            peopleKitVisualElementPath.c(this.d);
            cxqoVar.d(4, peopleKitVisualElementPath);
            Stopwatch a = this.c.a("TimeToSend");
            if (!a.c) {
                return;
            }
            a.d();
            cxqo cxqoVar2 = this.c;
            eazd bZ = eaze.g.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eaze eazeVar = (eaze) bZ.b;
            eazeVar.b = 4;
            eazeVar.a |= 1;
            eazh bZ2 = eazi.e.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            eazi eaziVar = (eazi) bZ2.b;
            eaziVar.b = 13;
            eaziVar.a |= 1;
            long a2 = a.a();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            eazi eaziVar2 = (eazi) bZ2.b;
            eaziVar2.a |= 2;
            eaziVar2.c = a2;
            int i3 = this.c.i();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            eazi eaziVar3 = (eazi) bZ2.b;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            eaziVar3.d = i4;
            eaziVar3.a |= 4;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eaze eazeVar2 = (eaze) bZ.b;
            eazi bK = bZ2.bK();
            bK.getClass();
            eazeVar2.e = bK;
            eazeVar2.a |= 8;
            eazk bZ3 = eazl.e.bZ();
            int g = this.c.g();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            eazl eazlVar = (eazl) bZ3.b;
            int i5 = g - 1;
            if (g == 0) {
                throw null;
            }
            eazlVar.b = i5;
            int i6 = eazlVar.a | 1;
            eazlVar.a = i6;
            eazlVar.c = i - 1;
            eazlVar.a = i6 | 2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eaze eazeVar3 = (eaze) bZ.b;
            eazl bK2 = bZ3.bK();
            bK2.getClass();
            eazeVar3.c = bK2;
            eazeVar3.a |= 2;
            cxqoVar2.b(bZ.bK());
        }
    }
}

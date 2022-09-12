package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: uhr  reason: default package */
/* loaded from: classes7.dex */
public class uhr implements uhc, fzh {
    public final uhp a;
    public final uhx b;
    public final ArrayList<uhw> c;
    private final Activity d;
    private final cpv e;
    private final ufc f;
    private boolean g;
    private boolean h;

    public uhr(Activity activity, cpv cpvVar, final uhx uhxVar, ufc ufcVar, uhp uhpVar, dcdc<amvh> dcdcVar, ufb ufbVar) {
        this.d = activity;
        this.a = uhpVar;
        this.e = cpvVar;
        this.g = ufbVar.b();
        this.h = ufbVar.d();
        this.b = uhxVar;
        this.f = ufcVar;
        final ArrayList<uhw> arrayList = new ArrayList<>(dcdcVar.size());
        l(dcdcVar, new uhq(arrayList, uhxVar) { // from class: uho
            private final ArrayList a;
            private final uhx b;

            {
                this.a = arrayList;
                this.b = uhxVar;
            }

            @Override // defpackage.uhq
            public final void a(amvh amvhVar, int i, int i2, boolean z, boolean z2) {
                this.a.add(i, this.b.a(uhv.f(z, z2, amvhVar, i, i2)));
            }
        });
        this.c = arrayList;
    }

    private static void l(dcdc<amvh> dcdcVar, uhq uhqVar) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (i4 < dcdcVar.size()) {
            amvh amvhVar = dcdcVar.get(i4);
            int i5 = i4 - i3;
            boolean z = true;
            boolean z2 = i4 == dcdcVar.size() + (-1);
            if (i4 != 0) {
                z = false;
            }
            if (amvhVar.y || (amvhVar.a() && !z2)) {
                i = i3 + 1;
                i2 = -1;
            } else {
                i = i3;
                i2 = i5;
            }
            uhqVar.a(amvhVar, i4, i2, z, z2);
            i4++;
            i3 = i;
        }
    }

    @Override // defpackage.uhc
    public dcdc<cqix<?>> a() {
        return dcdc.q(dcft.o(this.c, uhk.a));
    }

    @Override // defpackage.fzh
    public void b(int i) {
        if (i < 0 || i >= this.c.size()) {
            return;
        }
        int i2 = 0;
        while (i2 < this.c.size()) {
            this.c.get(i2).t(i == i2, true, false, false);
            i2++;
        }
        cqkx.p(this);
    }

    @Override // defpackage.fzh
    public boolean c(int i, int i2) {
        if (i < 0 || i2 < 0 || i >= this.c.size() || i2 >= this.c.size()) {
            return false;
        }
        this.c.add(i2, this.c.remove(i));
        this.g = false;
        cqkx.p(this);
        return true;
    }

    @Override // defpackage.fzh
    public void d(View view, int i, int i2, @dzsi cjqm cjqmVar) {
        String string;
        if (i >= 0 && i2 >= 0 && i != i2) {
            if (i > i2) {
                string = this.d.getString(R.string.ACCESSIBILITY_WAYPOINT_MOVED_BEFORE, new Object[]{this.c.get(i).c(), this.c.get(i2).c()});
            } else {
                string = this.d.getString(R.string.ACCESSIBILITY_WAYPOINT_MOVED_AFTER, new Object[]{this.c.get(i).c(), this.c.get(i2).c()});
            }
            this.e.f(view, string);
            this.f.h(i, i2);
        }
        ArrayList<uhw> arrayList = this.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            uhw uhwVar = arrayList.get(i3);
            uhwVar.t(uhwVar.m().booleanValue(), false, false, false);
        }
        cqkx.p(this);
    }

    @Override // defpackage.uhc
    public Boolean e() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.uhc
    public Boolean f() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.uhc
    public View.OnClickListener g() {
        return new View.OnClickListener(this) { // from class: uhl
            private final uhr a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((ueg) this.a.a).i();
            }
        };
    }

    @Override // defpackage.uhc
    public View.OnClickListener h() {
        return new View.OnClickListener(this) { // from class: uhm
            private final uhr a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ueg uegVar = (ueg) this.a.a;
                if (uegVar.e.m().booleanValue()) {
                    uegVar.e.n();
                    uegVar.i();
                }
            }
        };
    }

    @Override // defpackage.uhc
    public fzh i() {
        return this;
    }

    public void j(ufb ufbVar) {
        for (int i = 0; i < this.c.size(); i++) {
            uhw uhwVar = this.c.get(i);
            dcdc<Integer> a = ufbVar.a();
            Integer valueOf = Integer.valueOf(i);
            uhwVar.t(a.contains(valueOf), false, ufbVar.d(), ufbVar.e().a() && ufbVar.a().contains(valueOf));
        }
        this.h = ufbVar.d();
        this.g = ufbVar.b();
        cqkx.p(this);
    }

    public void k(dcdc<amvh> dcdcVar) {
        l(dcdcVar, new uhq(this) { // from class: uhn
            private final uhr a;

            {
                this.a = this;
            }

            @Override // defpackage.uhq
            public final void a(amvh amvhVar, int i, int i2, boolean z, boolean z2) {
                uhr uhrVar = this.a;
                if (i < uhrVar.c.size()) {
                    uhrVar.c.get(i).u(uhv.f(z, z2, amvhVar, i, i2));
                } else {
                    uhrVar.c.add(i, uhrVar.b.a(uhv.f(z, z2, amvhVar, i, i2)));
                }
            }
        });
        if (this.c.size() > dcdcVar.size()) {
            for (int size = dcdcVar.size(); size < this.c.size(); size++) {
                this.c.remove(size);
            }
        }
        cqkx.p(this);
    }
}

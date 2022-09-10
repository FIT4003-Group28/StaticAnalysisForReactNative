package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.Iterator;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: bozj  reason: default package */
/* loaded from: classes3.dex */
public class bozj implements bpwh {
    public final boyt a;
    public final bpwg b;
    public final boyc c;
    public final boyb d;
    public final bpwf e;
    public final boyw f;
    public final bpag g;
    public boolean h = false;
    public int i = 1;
    private final dbsg<cfll> j;
    private final bozp k;
    private final bpwd l;
    private final Resources m;
    @dzsi
    private bozo n;
    private final bpvf o;

    public bozj(bpwg bpwgVar, boyt boytVar, cqhn cqhnVar, dbsg<cfll> dbsgVar, bozp bozpVar, boyc boycVar, boyb boybVar, Resources resources, bpwf bpwfVar, bpwd bpwdVar, boyw boywVar, bpag bpagVar, bpvf bpvfVar) {
        this.b = bpwgVar;
        this.a = boytVar;
        this.k = bozpVar;
        this.c = boycVar;
        this.d = boybVar;
        this.m = resources;
        this.e = bpwfVar;
        this.j = dbsgVar;
        this.l = bpwdVar;
        this.f = boywVar;
        this.g = bpagVar;
        this.o = bpvfVar;
    }

    private final void o() {
        CharSequence b;
        if (this.h) {
            bpuh bpuhVar = bpuh.UNKNOWN_MODE;
            int ordinal = this.a.g.ordinal();
            boolean z = true;
            if (ordinal == 1) {
                b = this.e.b();
            } else if (ordinal == 2) {
                igq l = this.l.l();
                if (l != null) {
                    b = l.b();
                }
                b = "";
            } else if (ordinal != 3) {
                if (ordinal == 4) {
                    bozo bozoVar = this.n;
                    dbsk.s(bozoVar);
                    b = bozoVar.b();
                }
                b = "";
            } else {
                b = this.e.c();
            }
            Iterator<View> it = cqkx.n(this).iterator();
            if (it.hasNext()) {
                View next = it.next();
                dbsk.s(b);
                od.au().d(next, b);
                ny nyVar = od.b;
                WeakHashMap<View, Boolean> weakHashMap = nyVar.a;
                if (next.getVisibility() != 0) {
                    z = false;
                }
                weakHashMap.put(next, Boolean.valueOf(z));
                next.addOnAttachStateChangeListener(nyVar);
                if (next.isAttachedToWindow()) {
                    nyVar.a(next);
                }
            }
        }
        cqkx.p(this);
    }

    private final void p(@dzsi bpuh bpuhVar) {
        bpag bpagVar = this.g;
        bpagVar.g.add(new bozi(this, bpuhVar));
        bpag bpagVar2 = this.g;
        int i = bpagVar2.h;
        if (i == 0) {
            throw null;
        }
        if (i != 1) {
            bvoo.h("startSelection when already active", new Object[0]);
            bpagVar2.b();
        }
        bpagVar2.a();
    }

    @Override // defpackage.bpwh
    public void a() {
        bpuh bpuhVar = bpuh.UNKNOWN_MODE;
        int ordinal = this.a.g.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            this.h = true;
            o();
            this.f.a();
        } else if (ordinal == 3) {
            p(bpuh.CAROUSEL);
        } else if (ordinal == 4) {
            p(bpuh.ROUTE_SELECTION);
        } else {
            this.h = true;
            o();
        }
    }

    @Override // defpackage.bpwh
    public void b() {
        this.f.b();
        this.g.b();
        this.c.a();
    }

    @Override // defpackage.bpwh
    @dzsi
    public bpwf c() {
        if (!this.h || !this.a.g.equals(bpuh.INITIAL)) {
            return null;
        }
        return this.e;
    }

    @Override // defpackage.bpwh
    @dzsi
    public bpwd d() {
        if (!this.h || !this.a.g.equals(bpuh.CAROUSEL)) {
            return null;
        }
        return this.l;
    }

    @Override // defpackage.bpwh
    @dzsi
    public bpwf e() {
        if (!this.h || !this.a.g.equals(bpuh.EXTENT_PICKING)) {
            return null;
        }
        return this.e;
    }

    @Override // defpackage.bpwh
    @dzsi
    public bpwi f() {
        if (!this.h || !this.a.g.equals(bpuh.ROUTE_SELECTION)) {
            return null;
        }
        return this.n;
    }

    @Override // defpackage.bpwh
    public boolean g() {
        bpuh bpuhVar = bpuh.UNKNOWN_MODE;
        int ordinal = this.a.g.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            this.f.b();
            boys boysVar = ((boyn) this.b).a;
            if (boysVar.aD) {
                boysVar.Nw(bpue.m);
                gfq.m(boysVar);
            }
            return true;
        } else if (ordinal == 3) {
            this.g.b();
            this.a.d();
            this.f.a();
            h(bpuh.CAROUSEL);
            return true;
        } else if (ordinal != 4) {
            return false;
        } else {
            bozo bozoVar = this.n;
            dbsk.s(bozoVar);
            bozoVar.a();
            this.a.h = 0L;
            p(bpuh.CAROUSEL);
            return true;
        }
    }

    @Override // defpackage.bpwh
    public void h(bpuh bpuhVar) {
        this.a.g = bpuhVar;
        o();
    }

    @Override // defpackage.bpwh
    public boolean i() {
        bpuh bpuhVar = bpuh.UNKNOWN_MODE;
        int ordinal = this.a.g.ordinal();
        if (ordinal == 1) {
            h(bpuh.CAROUSEL);
            return true;
        } else if (ordinal == 2) {
            this.f.b();
            if (this.j.a()) {
                int i = this.g.h;
                if (i == 0) {
                    throw null;
                }
                if (i == 1) {
                    p(null);
                    return true;
                }
            }
            this.b.a();
            return true;
        } else if (ordinal == 3) {
            this.g.b();
            this.b.a();
            return true;
        } else if (ordinal != 4) {
            return false;
        } else {
            bozo bozoVar = this.n;
            dbsk.s(bozoVar);
            bozoVar.a();
            this.b.a();
            return true;
        }
    }

    @Override // defpackage.bpwh
    public void j() {
        if (this.a.g.equals(bpuh.EXTENT_PICKING)) {
            this.g.b();
            dcep<Long> dcepVar = this.a.e;
            if (dcepVar.size() > 1) {
                n();
                h(bpuh.ROUTE_SELECTION);
            } else if (dcepVar.size() != 1) {
            } else {
                this.a.h = ((Long) dcft.c(dcepVar)).longValue();
                this.b.a();
            }
        }
    }

    @Override // defpackage.bpwh
    public View.OnLayoutChangeListener k() {
        return new View.OnLayoutChangeListener(this) { // from class: bozf
            private final bozj a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                bozj bozjVar = this.a;
                int i9 = bozjVar.i;
                if (i9 != 0) {
                    if (i9 == 1) {
                        return;
                    }
                    bpag bpagVar = bozjVar.g;
                    boolean z = i9 == 3;
                    bozs bozsVar = bpagVar.b;
                    akqr a = akqs.a();
                    bpag.c(a, bpagVar.c);
                    bpag.c(a, bpagVar.f);
                    bpag.c(a, bpagVar.e);
                    bozsVar.i(a.b(), z);
                    bozjVar.i = 1;
                    return;
                }
                throw null;
            }
        };
    }

    @Override // defpackage.bpwh
    public Boolean l() {
        boolean z = true;
        if (!this.a.g.equals(bpuh.INITIAL) && !this.a.g.equals(bpuh.CAROUSEL)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bpwh
    @dzsi
    public CharSequence m() {
        if (this.a.g.equals(bpuh.INITIAL) || this.a.g.equals(bpuh.CAROUSEL)) {
            return this.m.getString(R.string.EXTENT_PICKER_CAROUSEL_MAP_ACCESSIBILITY_TEXT);
        }
        return null;
    }

    public final void n() {
        bozp bozpVar = this.k;
        bozg bozgVar = new bozg(this);
        bpvf bpvfVar = this.o;
        cflq e = this.j.b().e();
        boyt boytVar = this.a;
        bozp.a(bozpVar.a.a(), 1);
        bozs a = bozpVar.b.a();
        bozp.a(a, 2);
        Resources a2 = bozpVar.c.a();
        bozp.a(a2, 3);
        bozp.a(bozgVar, 4);
        bozp.a(bpvfVar, 5);
        bozp.a(e, 6);
        bozp.a(boytVar, 7);
        bozo bozoVar = new bozo(a, a2, bozgVar, bpvfVar, e, boytVar);
        this.n = bozoVar;
        dbsk.s(bozoVar);
        if (bozoVar.e >= 0) {
            bozoVar.g(false);
        }
    }
}

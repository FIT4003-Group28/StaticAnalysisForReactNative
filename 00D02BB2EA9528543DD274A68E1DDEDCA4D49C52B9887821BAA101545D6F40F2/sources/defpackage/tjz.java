package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: tjz  reason: default package */
/* loaded from: classes7.dex */
public class tjz implements tji {
    public final gga a;
    public final isd b;
    public final tjy c;
    public boolean d;
    public final dcdc<jho> e;
    @dzsi
    public transient isc f;
    private final tkd g;
    private boolean h;
    private dcdc<tjh> i;
    private tjh j;

    public tjz(gga ggaVar, isd isdVar, tgg tggVar, tkd tkdVar, tjy tjyVar, dcdc<amvh> dcdcVar, boolean z) {
        this.a = ggaVar;
        this.b = isdVar;
        this.c = tjyVar;
        this.d = z;
        this.h = n(dcdcVar);
        this.e = l(tggVar, dcdcVar, tjyVar);
        this.g = tkdVar;
        this.i = m(tkdVar, tjyVar, dcdcVar);
        this.j = tkdVar.b(dcdcVar.get(0), dcdcVar.subList(1, dcdcVar.size()), new Runnable() { // from class: tjj
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    private final dcdc<tjh> k() {
        return c().booleanValue() ? this.i : dcdc.f(this.j);
    }

    private static dcdc<jho> l(final tgg tggVar, dcdc<amvh> dcdcVar, final tjy tjyVar) {
        dccx F = dcdc.F();
        int o = o(dcdcVar);
        int i = o == 2 ? R.string.ADD_DESTINATION_MENU_ITEM : R.string.EDIT_DESTINATIONS_MENU_ITEM;
        ddho ddhoVar = o == 2 ? dtxn.cm : dtxn.cq;
        jhm b = jhm.b(i);
        b.f = cjtd.a(ddhoVar);
        b.d(new View.OnClickListener(tjyVar) { // from class: tjm
            private final tjy a;

            {
                this.a = tjyVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.q();
            }
        });
        F.g(b.c());
        jhm b2 = jhm.b(ssv.MANUAL_REFRESH_ACTION_TEXT);
        b2.f = cjtd.a(dtxn.cP);
        b2.d(new View.OnClickListener(tggVar) { // from class: tju
            private final tgg a;

            {
                this.a = tggVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a();
            }
        });
        F.g(b2.c());
        return F.f();
    }

    private static dcdc<tjh> m(tkd tkdVar, final tjy tjyVar, final dcdc<amvh> dcdcVar) {
        dccx F = dcdc.F();
        final boolean z = dcdcVar.size() >= 3;
        F.g(tkdVar.a(true, false, 0, dbsg.i(dcdcVar.get(0)), dcdc.e(), new Runnable(z, tjyVar) { // from class: tjv
            private final boolean a;
            private final tjy b;

            {
                this.a = z;
                this.b = tjyVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z2 = this.a;
                tjy tjyVar2 = this.b;
                if (z2) {
                    tjyVar2.q();
                } else {
                    tjyVar2.n(0);
                }
            }
        }));
        if (dcdcVar.size() > 3) {
            dbpy<Object> dbpyVar = dbpy.a;
            dcdc<amvh> subList = dcdcVar.subList(1, dcdcVar.size() - 1);
            tjyVar.getClass();
            F.g(tkdVar.a(false, false, 1, dbpyVar, subList, new Runnable(tjyVar) { // from class: tjw
                private final tjy a;

                {
                    this.a = tjyVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.q();
                }
            }));
        } else if (dcdcVar.size() == 3) {
            dbsg<amvh> i = dbsg.i(dcdcVar.get(1));
            dcdc<amvh> e = dcdc.e();
            tjyVar.getClass();
            F.g(tkdVar.a(false, false, 1, i, e, new Runnable(tjyVar) { // from class: tjk
                private final tjy a;

                {
                    this.a = tjyVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.q();
                }
            }));
        }
        F.g(tkdVar.a(false, true, dcdcVar.size() - 1, dbsg.i((amvh) dcft.s(dcdcVar)), dcdc.e(), new Runnable(z, tjyVar, dcdcVar) { // from class: tjl
            private final boolean a;
            private final tjy b;
            private final dcdc c;

            {
                this.a = z;
                this.b = tjyVar;
                this.c = dcdcVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z2 = this.a;
                tjy tjyVar2 = this.b;
                dcdc dcdcVar2 = this.c;
                if (z2) {
                    tjyVar2.q();
                } else {
                    tjyVar2.n(dcdcVar2.size() - 1);
                }
            }
        }));
        return F.f();
    }

    private static boolean n(dcdc<amvh> dcdcVar) {
        return dcdcVar.size() >= 2 && o(dcdcVar) >= 2;
    }

    private static int o(dcdc<amvh> dcdcVar) {
        return dcdc.q(dcft.i(dcdcVar, tjn.a)).size();
    }

    @Override // defpackage.tji
    public dcdc<cqix<?>> a() {
        return dcdc.q(dcft.o(k(), tjo.a));
    }

    @Override // defpackage.tji
    public View.OnClickListener b() {
        return new View.OnClickListener(this) { // from class: tjp
            private final tjz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.s();
            }
        };
    }

    @Override // defpackage.tji
    public Boolean c() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.tji
    public View.OnClickListener d() {
        return new View.OnClickListener(this) { // from class: tjq
            private final tjz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tjz tjzVar = this.a;
                if (tjzVar.d) {
                    return;
                }
                tjzVar.d = true;
                tjzVar.c.o(true);
                cqkx.p(tjzVar);
            }
        };
    }

    @Override // defpackage.tji
    public Boolean e() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.tji
    public View.OnClickListener f() {
        return new View.OnClickListener(this) { // from class: tjr
            private final tjz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tjz tjzVar = this.a;
                isc iscVar = tjzVar.f;
                if (iscVar != null) {
                    iscVar.dismiss();
                }
                tjzVar.f = tjzVar.b.a(view);
                tjzVar.f.a(tjzVar.e);
                tjzVar.f.setOnDismissListener(new tjx(tjzVar));
                tjzVar.f.show();
            }
        };
    }

    @Override // defpackage.tji
    public Boolean g() {
        return Boolean.valueOf(k().size() <= 2);
    }

    @Override // defpackage.tji
    public View.OnClickListener h() {
        return new View.OnClickListener(this) { // from class: tjs
            private final tjz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.c.p();
            }
        };
    }

    public void i(boolean z) {
        if (this.d != z) {
            this.d = z;
            cqkx.p(this);
        }
    }

    public void j(dcdc<amvh> dcdcVar) {
        this.h = n(dcdcVar);
        this.j = this.g.b(dcdcVar.get(0), dcdcVar.subList(1, dcdcVar.size()), new Runnable() { // from class: tjt
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        this.i = m(this.g, this.c, dcdcVar);
        cqkx.p(this);
    }
}

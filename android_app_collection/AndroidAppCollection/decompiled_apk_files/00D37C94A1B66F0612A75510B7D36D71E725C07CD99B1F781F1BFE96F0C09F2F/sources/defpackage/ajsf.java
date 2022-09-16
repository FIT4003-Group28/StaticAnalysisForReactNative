package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: ajsf  reason: default package */
/* loaded from: classes.dex */
public final class ajsf extends xo implements ajrw, ajql {
    public final HashSet d;
    public aadd e;
    public ajqm f;
    private final ajsa g;
    private final ajqc h;
    private final ViewGroup.LayoutParams i;

    public ajsf(hdc hdcVar, hda hdaVar, azqb azqbVar, hkl hklVar) {
        this(hdcVar);
        ajsm ajsmVar = new ajsm();
        ajsmVar.add(new hbl());
        ajrj ajrjVar = new ajrj();
        ajrjVar.m(ajsmVar);
        ajrjVar.m(hdaVar);
        auuw auuwVar = hklVar.a.a().z;
        if ((auuwVar == null ? auuw.a : auuwVar).x) {
            ajrjVar.m((ajqm) azqbVar.get());
        }
        h(ajrjVar);
    }

    @Override // defpackage.xo
    public final int b() {
        return this.f.a();
    }

    @Override // defpackage.xo
    public final int c(int i) {
        int c = this.g.c(getItem(i));
        if (c != -1) {
            return c;
        }
        return -1;
    }

    @Override // defpackage.ymy
    public final void d(int i, int i2) {
        m(i, i2);
    }

    @Override // defpackage.ymy
    public final void e(int i, int i2) {
        for (int i3 = 0; i3 <= 0; i3++) {
            om(i + i3, i2 + i3);
        }
    }

    @Override // defpackage.ajrw
    public final void g(ajrv ajrvVar) {
        this.d.add(ajrvVar);
    }

    @Override // defpackage.ajrw
    public final Object getItem(int i) {
        return this.f.c(i);
    }

    @Override // defpackage.ajrw
    public final void h(ajqm ajqmVar) {
        ajqm ajqmVar2 = this.f;
        if (ajqmVar == ajqmVar2) {
            return;
        }
        ajqmVar.getClass();
        ajqmVar2.pl(this);
        this.f = ajqmVar;
        ajqmVar.lT(this);
        mr();
    }

    @Override // defpackage.ajrw
    public final void i(ajrv ajrvVar) {
        this.d.remove(ajrvVar);
    }

    @Override // defpackage.xo
    public final long mp(int i) {
        return this.f.b(i);
    }

    @Override // defpackage.ajql
    public final void pi() {
        mr();
    }

    @Override // defpackage.ymy
    public final void pj(int i, int i2) {
        oo(i, i2);
    }

    @Override // defpackage.ymy
    public final void pk(int i, int i2) {
        l(i, i2);
    }

    @Override // defpackage.ajrw
    public final void rZ(ajrt ajrtVar) {
        this.h.b(ajrtVar);
    }

    @Override // defpackage.xo
    /* renamed from: w */
    public final ajrz f(ViewGroup viewGroup, int i) {
        ajru e;
        if (i == -1) {
            e = new ajqs(viewGroup.getContext());
        } else {
            e = this.g.e(i, viewGroup);
        }
        View a = e.a();
        akel.n(a, e, i);
        if (a.getLayoutParams() == null) {
            a.setLayoutParams(new ViewGroup.LayoutParams(this.i));
        }
        return new ajrz(e);
    }

    @Override // defpackage.xo
    /* renamed from: x */
    public final void o(ajrz ajrzVar, int i) {
        ajru ajruVar = ajrzVar.t;
        View a = ajruVar.a();
        ajrs f = a != null ? akel.f(a) : null;
        if (f == null) {
            f = new ajrs();
            akel.l(a, f);
        }
        f.h();
        f.f("position", Integer.valueOf(i));
        this.h.a(f, this.f, i);
        this.f.mH(f, i);
        Object item = getItem(i);
        if (ajruVar instanceof ajsl) {
            ajsl ajslVar = (ajsl) ajruVar;
            ajslVar.w = this.e;
            ajslVar.oK(f, item);
        } else {
            ajruVar.oK(f, item);
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((ajrv) it.next()).m(ajruVar, item);
        }
    }

    @Override // defpackage.xo
    /* renamed from: y */
    public final void p(ajrz ajrzVar) {
        akel.j(ajrzVar.a, this.g);
    }

    @Deprecated
    public ajsf(ajsa ajsaVar) {
        this(ajsaVar, new ViewGroup.LayoutParams(-1, -2));
    }

    private ajsf(ajsa ajsaVar, ViewGroup.LayoutParams layoutParams) {
        ajsaVar.getClass();
        this.g = ajsaVar;
        this.i = new ViewGroup.LayoutParams(layoutParams);
        this.h = new ajqc();
        this.f = ajqr.a;
        this.d = new HashSet();
    }

    public ajsf(ajsk ajskVar, ajsa ajsaVar) {
        this(ajsaVar);
        g(new ajse(ajskVar));
    }

    public ajsf(ajsk ajskVar, ajsa ajsaVar, ViewGroup.LayoutParams layoutParams) {
        this(ajsaVar, layoutParams);
        g(new ajse(ajskVar, 2));
    }
}

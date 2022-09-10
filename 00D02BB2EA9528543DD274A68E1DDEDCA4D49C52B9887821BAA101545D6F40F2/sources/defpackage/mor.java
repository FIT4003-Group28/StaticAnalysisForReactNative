package defpackage;

import com.google.android.apps.maps.R;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: mor  reason: default package */
/* loaded from: classes7.dex */
public class mor implements btph {
    public final iuv a = nql.a();
    public final qbo b;
    public final lzf c;
    public final ksr d;
    public final nce e;
    public final lze f;
    public final ksu g;
    public final mog h;
    public final cqtd i;
    public final int j;
    @dzsi
    public final Runnable k;
    public final boolean l;
    public final dcdc<ldm> m;
    public final mir n;
    public final kdk o;
    public final lzc p;
    public boolean q;
    public moo r;
    public int s;

    public mor(qbo qboVar, lzf lzfVar, ksr ksrVar, dcdc<ldm> dcdcVar, lzc lzcVar, nce nceVar, lze lzeVar, ksu ksuVar, mog mogVar, kdk kdkVar, boolean z, cqtd cqtdVar, int i, @dzsi Runnable runnable, boolean z2, mir mirVar) {
        dbsk.s(qboVar);
        this.b = qboVar;
        dbsk.s(lzfVar);
        this.c = lzfVar;
        dbsk.s(ksrVar);
        this.d = ksrVar;
        dbsk.s(lzcVar);
        this.p = lzcVar;
        dbsk.s(nceVar);
        this.e = nceVar;
        dbsk.s(lzeVar);
        this.f = lzeVar;
        dbsk.s(ksuVar);
        this.g = ksuVar;
        dbsk.s(mogVar);
        this.h = mogVar;
        this.o = kdkVar;
        this.q = z;
        this.i = cqtdVar;
        this.j = i;
        this.k = runnable;
        this.l = z2;
        this.m = dcdcVar;
        dbsk.l(!dcdcVar.isEmpty());
        this.n = mirVar;
        if (dcdcVar.get(0).u() == 2) {
            if (!z2 || !o()) {
                kdk kdkVar2 = kdk.NOTHING;
                int ordinal = kdkVar.ordinal();
                if (ordinal == 1) {
                    t(new moi(this));
                    return;
                } else if (ordinal == 2) {
                    dbsk.l(true);
                    if (dcdcVar.get(0).t()) {
                        t(new moj(this));
                        return;
                    } else {
                        t(new moi(this));
                        return;
                    }
                } else {
                    t(new moj(this));
                    return;
                }
            }
            t(new mom(this));
            return;
        }
        kdk kdkVar3 = kdk.NOTHING;
        int ordinal2 = kdkVar.ordinal();
        if (ordinal2 == 1) {
            t(new moq(this));
        } else if (ordinal2 == 2) {
            dbsk.l(true);
            t(new moq(this));
        } else {
            t(new moh(this));
        }
    }

    private final void t(moo mooVar) {
        if (this.r != mooVar) {
            this.r = mooVar;
            mooVar.h();
        }
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    public final boolean a() {
        return this.r.j();
    }

    @dzsi
    public final cqtd b() {
        return this.r.a();
    }

    public final int d() {
        return this.r.i();
    }

    public final int e() {
        return this.r.b();
    }

    public final knz f() {
        return this.r.o();
    }

    public final CharSequence g() {
        return this.r.m();
    }

    public final boolean h() {
        return this.r.n();
    }

    public final iuv i() {
        return this.r.p();
    }

    public final CharSequence j() {
        return this.r.q();
    }

    public final boolean k() {
        return this.r.k();
    }

    public final void l() {
        this.m.get(0).u();
        this.n.a();
        kdk kdkVar = kdk.NOTHING;
        int u = this.m.get(0).u() - 1;
        if (u == 1) {
            t(this.r.f());
        } else if (u == 2) {
            t(this.r.u(true));
        } else if (u != 3) {
            throw new IllegalStateException("Cannot call onDirectionsFetched while directions pending.");
        } else {
            t(this.r.u(false));
        }
    }

    public final void m() {
        t(this.r.g());
    }

    public final void n() {
        t(this.r.l());
    }

    public final boolean o() {
        return this.k != null && !this.m.isEmpty() && this.m.get(0).s();
    }

    public final int p() {
        return this.d.g() ? R.string.CAR_WAITING_FOR_LOCATION : R.string.CAR_LOADING_ROUTE;
    }

    public final ddho q() {
        return this.d.g() ? dtxm.df : dtxm.cZ;
    }

    public final void r() {
        int i;
        int i2 = this.s;
        if (i2 == 0 || !mol.a(i2)) {
            i = this.d.g() ? 201 : 202;
        } else {
            i = 203;
        }
        this.s = i;
    }

    public final int s() {
        int i;
        int i2 = this.s;
        if (i2 != 0) {
            if (i2 == 401) {
                i = com.google.android.filament.R.styleable.AppCompatTheme_textAppearanceListItem;
            } else if (mol.a(i2)) {
                i = 102;
            }
            this.s = i;
            return this.s;
        }
        this.s = com.google.android.filament.R.styleable.AppCompatTheme_switchStyle;
        return this.s;
    }
}

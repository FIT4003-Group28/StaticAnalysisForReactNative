package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: klk  reason: default package */
/* loaded from: classes7.dex */
public class klk implements klc {
    private final klj a;
    private final Context b;
    @dzsi
    private final ddho c;
    @dzsi
    private final ddho d;
    private klb e;
    @dzsi
    private CharSequence f;
    private boolean g;

    public klk(Context context, klj kljVar, khx khxVar) {
        ddho ddhoVar;
        ddho ddhoVar2;
        this.a = kljVar;
        this.b = context;
        int ordinal = khxVar.ordinal();
        if (ordinal == 0) {
            ddhoVar = dtxm.M;
        } else if (ordinal == 1) {
            ddhoVar = dtxm.al;
        } else if (ordinal == 2) {
            ddhoVar = dtxm.ad;
        } else if (ordinal == 3) {
            ddhoVar = dtxm.U;
        } else if (ordinal == 4) {
            ddhoVar = dtxm.w;
        } else if (ordinal != 5) {
            String valueOf = String.valueOf(khxVar.name());
            throw new IllegalStateException(valueOf.length() != 0 ? "Unexpected personal category type: ".concat(valueOf) : new String("Unexpected personal category type: "));
        } else {
            ddhoVar = dtxm.E;
        }
        this.c = ddhoVar;
        int ordinal2 = khxVar.ordinal();
        if (ordinal2 == 0) {
            ddhoVar2 = dtxm.K;
        } else if (ordinal2 == 1) {
            ddhoVar2 = dtxm.aj;
        } else if (ordinal2 == 2) {
            ddhoVar2 = dtxm.ab;
        } else if (ordinal2 == 3) {
            ddhoVar2 = dtxm.S;
        } else if (ordinal2 == 4) {
            ddhoVar2 = dtxm.u;
        } else if (ordinal2 != 5) {
            String valueOf2 = String.valueOf(khxVar.name());
            throw new IllegalStateException(valueOf2.length() != 0 ? "Unexpected personal category type: ".concat(valueOf2) : new String("Unexpected personal category type: "));
        } else {
            ddhoVar2 = dtxm.C;
        }
        this.d = ddhoVar2;
        this.e = klb.LOADING_SPINNER;
    }

    @Override // defpackage.klc
    public CharSequence a() {
        return this.b.getString(R.string.CAR_ALPHA_JUMP_TITLE);
    }

    @Override // defpackage.klc
    public cjtd b() {
        ddho ddhoVar = this.d;
        if (ddhoVar == null) {
            return cjtd.b;
        }
        return cjtd.a(ddhoVar);
    }

    @Override // defpackage.klc
    public cjtd c() {
        ddho ddhoVar = this.c;
        if (ddhoVar == null) {
            return cjtd.b;
        }
        return cjtd.a(ddhoVar);
    }

    @Override // defpackage.klc
    public cqkl d() {
        ((khq) this.a).a.h.b();
        return cqkl.a;
    }

    @Override // defpackage.klc
    public cqkl e() {
        klj kljVar = this.a;
        dccx F = dcdc.F();
        khq khqVar = (khq) kljVar;
        dcdc<klg> dcdcVar = khqVar.a.l;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            klg klgVar = dcdcVar.get(i);
            if (klgVar.j()) {
                F.g(klgVar);
            }
        }
        khqVar.a.b.a();
        kht khtVar = khqVar.a;
        nop nopVar = khtVar.g;
        kdi kdiVar = khtVar.f;
        dcdc f = F.f();
        dbrn dbrnVar = kho.a;
        final kht khtVar2 = khqVar.a;
        jwh jwhVar = new jwh(khtVar2) { // from class: khp
            private final kht a;

            {
                this.a = khtVar2;
            }

            @Override // defpackage.jwh
            public final void a(int i2, dcdc dcdcVar2) {
                kht khtVar3 = this.a;
                if (khtVar3.o && !khtVar3.n) {
                    khtVar3.n = true;
                    khtVar3.p -= 3;
                }
                khtVar3.l = dcdcVar2;
                if (dcdcVar2.isEmpty()) {
                    khtVar3.e.m(khtVar3.a.getString(R.string.CAR_NO_PLACES_FOUND));
                    return;
                }
                khtVar3.p(i2);
                khtVar3.e.l();
            }
        };
        jyi h = jyj.h();
        jyk jykVar = (jyk) h;
        jykVar.e = dtxm.t;
        jykVar.d = dtxm.s;
        nopVar.k(kdiVar.k(f, dbrnVar, jwhVar, h.a()));
        khqVar.a.b.b();
        return cqkl.a;
    }

    @Override // defpackage.klc
    public cqkl f() {
        ((khq) this.a).a.c.o();
        return cqkl.a;
    }

    @Override // defpackage.klc
    public Boolean g() {
        boolean z = false;
        if (this.e == klb.LIST && !bvox.b(this.b)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.klc
    public Boolean h() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.klc
    @dzsi
    public CharSequence i() {
        return this.f;
    }

    @Override // defpackage.klc
    public Boolean j(klb klbVar) {
        return Boolean.valueOf(this.e == klbVar);
    }

    public void k(boolean z) {
        if (this.g != z) {
            this.g = z;
            cqkx.p(this);
        }
    }

    public void l() {
        this.e = klb.LIST;
        this.f = null;
        cqkx.p(this);
    }

    public void m(CharSequence charSequence) {
        this.f = charSequence;
        this.e = klb.MESSAGE;
        cqkx.p(this);
    }
}

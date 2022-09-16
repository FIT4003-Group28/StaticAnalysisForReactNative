package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: kln  reason: default package */
/* loaded from: classes7.dex */
public class kln implements klf {
    public final klm a;
    private final Context b;
    private final btvo c;
    private final Runnable d;
    private final boolean e;
    private final boolean f;
    private khw g;
    private kld h = kld.LOADING_SPINNER;
    private boolean i;
    private boolean j;
    @dzsi
    private CharSequence k;

    public kln(Context context, btvo btvoVar, klm klmVar, Runnable runnable, Runnable runnable2, Runnable runnable3, boolean z, boolean z2, akfa akfaVar, khw khwVar) {
        this.b = context;
        this.c = btvoVar;
        this.a = klmVar;
        this.d = runnable;
        this.f = z;
        this.g = khwVar;
        this.e = btlu.n(akfaVar.j());
    }

    public void A() {
        this.h = kld.LIST;
        this.k = null;
        cqkx.p(this);
    }

    public void B(CharSequence charSequence) {
        this.k = charSequence;
        this.h = kld.MESSAGE;
        cqkx.p(this);
    }

    @Override // defpackage.klf
    public cqkl a(khw khwVar) {
        khw khwVar2 = this.g;
        this.g = khwVar;
        klm klmVar = this.a;
        if (khwVar == khwVar2) {
            kgs kgsVar = (kgs) klmVar;
            cov covVar = kgsVar.a.n;
            covVar.b.g = true;
            covVar.a(0);
            View f = kgsVar.a.n.f();
            if (kgsVar.a.j.h() && f != null) {
                nol.b(f);
            }
        } else {
            ((kgs) klmVar).a.m();
        }
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.klf
    public Boolean b(khw khwVar) {
        return Boolean.valueOf(this.g.equals(khwVar));
    }

    @Override // defpackage.klf
    public CharSequence c(khw khwVar) {
        khw khwVar2 = khw.RECENT;
        int ordinal = khwVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return this.b.getString(R.string.DESTINATION_CATEGORY_NEARBY);
            }
            if (ordinal == 2) {
                return this.b.getString(R.string.DESTINATION_CATEGORY_PERSONAL);
            }
            String valueOf = String.valueOf(khwVar.name());
            throw new IllegalStateException(valueOf.length() != 0 ? "Unexpected DestinationsTab: ".concat(valueOf) : new String("Unexpected DestinationsTab: "));
        }
        return this.b.getString(R.string.DESTINATION_CATEGORY_RECENT);
    }

    @Override // defpackage.klf
    @dzsi
    public Integer d() {
        return null;
    }

    @Override // defpackage.klf
    @dzsi
    public cqtd e() {
        khw khwVar = khw.RECENT;
        int ordinal = this.g.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                return iva.e(iup.e(R.raw.car_only_destination_input_personal_sign_in_promo), iup.e(R.raw.car_only_destination_input_personal_sign_in_promo_night));
            }
            return null;
        }
        return nqu.at();
    }

    @Override // defpackage.klf
    @dzsi
    public Integer f() {
        khw khwVar = khw.RECENT;
        this.g.ordinal();
        return null;
    }

    @Override // defpackage.klf
    @dzsi
    public Integer g() {
        khw khwVar = khw.RECENT;
        this.g.ordinal();
        return null;
    }

    @Override // defpackage.klf
    @dzsi
    public Integer h() {
        return null;
    }

    @Override // defpackage.klf
    public Boolean i() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.klf
    public View.OnFocusChangeListener j(final kle kleVar) {
        return new View.OnFocusChangeListener(this, kleVar) { // from class: kll
            private final kln a;
            private final kle b;

            {
                this.a = this;
                this.b = kleVar;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                kln klnVar = this.a;
                kle kleVar2 = this.b;
                if (z) {
                    ((kgs) klnVar.a).a.s = kleVar2;
                }
            }
        };
    }

    @Override // defpackage.klf
    public cqkl k() {
        ((kgs) this.a).a.e.b();
        return cqkl.a;
    }

    @Override // defpackage.klf
    public cqkl l() {
        if (this.i) {
            if (this.c.getCarParameters().f) {
                this.a.a();
            }
        } else {
            ((kgs) this.a).a.k.run();
        }
        return cqkl.a;
    }

    @Override // defpackage.klf
    public cjtd m() {
        cjta b = cjtd.b();
        b.d = this.i ? dtxm.aA : dtxm.az;
        return b.a();
    }

    @Override // defpackage.klf
    public cqkl n() {
        this.a.a();
        return cqkl.a;
    }

    @Override // defpackage.klf
    public cqkl o() {
        this.d.run();
        return cqkl.a;
    }

    @Override // defpackage.klf
    public Boolean p() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.klf
    public Boolean q() {
        return false;
    }

    @Override // defpackage.klf
    public Boolean r() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.klf
    public Boolean s() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.klf
    @dzsi
    public CharSequence t() {
        return this.k;
    }

    @Override // defpackage.klf
    public Boolean u(kld kldVar) {
        return Boolean.valueOf(this.h == kldVar);
    }

    @Override // defpackage.klf
    @dzsi
    public cjtd v() {
        khw khwVar = khw.RECENT;
        int ordinal = this.g.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                return cjtd.a(dtxm.aa);
            }
            return null;
        }
        return cjtd.a(dtxm.at);
    }

    public khw w() {
        return this.g;
    }

    public void x(boolean z) {
        if (this.i != z) {
            this.i = z;
            cqkx.p(this);
        }
    }

    public void y(boolean z) {
        if (this.j != z) {
            this.j = z;
            cqkx.p(this);
        }
    }

    public void z() {
        this.h = kld.LOADING_SPINNER;
        this.k = null;
        cqkx.p(this);
    }
}

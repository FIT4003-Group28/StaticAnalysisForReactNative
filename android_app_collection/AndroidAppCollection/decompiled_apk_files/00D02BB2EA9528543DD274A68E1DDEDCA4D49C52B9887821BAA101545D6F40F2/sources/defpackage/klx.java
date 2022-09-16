package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: klx  reason: default package */
/* loaded from: classes7.dex */
public class klx implements klh {
    public final klw a;
    private final khx b;
    private final CharSequence c;
    private final cqtd d;
    @dzsi
    private final cqtd e;
    private final ddho f;
    private final CharSequence g;

    public klx(Context context, khx khxVar, klw klwVar, CharSequence charSequence, CharSequence charSequence2) {
        cqtd V;
        cqtd U;
        ddho ddhoVar;
        if (khxVar == khx.CUSTOM_PLACES) {
            this.c = "";
        } else {
            int ordinal = khxVar.ordinal();
            this.c = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "" : context.getString(R.string.DESTINATION_CATEGORY_CONTACTS) : context.getString(R.string.PERSONAL_CATEGORY_LABELED) : context.getString(R.string.PERSONAL_CATEGORY_STARRED) : context.getString(R.string.PERSONAL_CATEGORY_WANT_TO_GO) : context.getString(R.string.PERSONAL_CATEGORY_FAVORITES);
        }
        int ordinal2 = khxVar.ordinal();
        if (ordinal2 == 0) {
            V = nqu.V();
        } else if (ordinal2 == 1) {
            V = nqu.ab();
        } else if (ordinal2 == 2) {
            V = nqu.aa();
        } else if (ordinal2 == 3) {
            V = nqu.X();
        } else if (ordinal2 == 4) {
            V = nqu.aC(R.raw.car_only_ic_contact_place_circle_48dp, nql.n, nqo.x, nqo.y);
        } else if (ordinal2 != 5) {
            String valueOf = String.valueOf(khxVar.name());
            throw new IllegalStateException(valueOf.length() != 0 ? "Unexpected personal category type: ".concat(valueOf) : new String("Unexpected personal category type: "));
        } else {
            V = nqu.ad();
        }
        this.d = V;
        int ordinal3 = khxVar.ordinal();
        if (ordinal3 == 0) {
            U = nqu.U();
        } else if (ordinal3 == 1) {
            U = nqu.ac();
        } else if (ordinal3 == 2) {
            U = nqu.Z();
        } else if (ordinal3 == 3) {
            U = nqu.W();
        } else if (ordinal3 == 4) {
            U = null;
        } else if (ordinal3 != 5) {
            String valueOf2 = String.valueOf(khxVar.name());
            throw new IllegalStateException(valueOf2.length() != 0 ? "Unexpected personal category type: ".concat(valueOf2) : new String("Unexpected personal category type: "));
        } else {
            U = nqu.ae();
        }
        this.e = U;
        int ordinal4 = khxVar.ordinal();
        if (ordinal4 == 0) {
            ddhoVar = dtxm.N;
        } else if (ordinal4 == 1) {
            ddhoVar = dtxm.am;
        } else if (ordinal4 == 2) {
            ddhoVar = dtxm.ae;
        } else if (ordinal4 == 3) {
            ddhoVar = dtxm.V;
        } else if (ordinal4 == 4) {
            ddhoVar = dtxm.x;
        } else if (ordinal4 != 5) {
            String valueOf3 = String.valueOf(khxVar.name());
            throw new IllegalStateException(valueOf3.length() != 0 ? "Unexpected personal category type: ".concat(valueOf3) : new String("Unexpected personal category type: "));
        } else {
            ddhoVar = dtxm.F;
        }
        this.f = ddhoVar;
        this.b = khxVar;
        this.a = klwVar;
        this.g = "";
    }

    @Override // defpackage.klh
    public cqtd a() {
        return this.d;
    }

    @Override // defpackage.klh
    @dzsi
    public cqtd b() {
        return this.e;
    }

    @Override // defpackage.klh
    public CharSequence c() {
        return this.c;
    }

    @Override // defpackage.klh
    public cqkl d() {
        klw klwVar = this.a;
        khx khxVar = this.b;
        this.c.toString();
        String charSequence = this.g.toString();
        kgw kgwVar = ((kgq) klwVar).a;
        kgwVar.c.k(kgwVar.f.y(khxVar, charSequence));
        return cqkl.a;
    }

    @Override // defpackage.klh
    public View.OnFocusChangeListener e() {
        return new View.OnFocusChangeListener(this) { // from class: klv
            private final klx a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                klx klxVar = this.a;
                if (z) {
                    ((kgq) klxVar.a).a.s = kle.LIST;
                }
            }
        };
    }

    @Override // defpackage.klh
    public cjtd f() {
        return cjtd.a(this.f);
    }
}

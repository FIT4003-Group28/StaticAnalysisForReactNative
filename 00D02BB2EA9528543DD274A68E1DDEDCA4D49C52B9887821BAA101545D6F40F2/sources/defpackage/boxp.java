package defpackage;

import android.content.res.Resources;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: boxp  reason: default package */
/* loaded from: classes3.dex */
public class boxp implements bpvl {
    public final bpbc a;
    @dzsi
    public final bpbd b;
    private final bowu c;
    private final boolean d;
    private final cqqw e;
    private final bnjv f;
    private final Resources g;
    private dcdc<jba> h = dcdc.e();
    private boolean i = false;
    private boolean j = false;

    public boxp(bowu bowuVar, boolean z, cqqw cqqwVar, bpbc bpbcVar, bpbd bpbdVar, bnjv bnjvVar, Resources resources) {
        this.c = bowuVar;
        this.d = z;
        this.e = cqqwVar;
        this.a = bpbcVar;
        this.b = bpbdVar;
        this.f = bnjvVar;
        this.g = resources;
    }

    @Override // defpackage.iqf
    public Boolean a() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.iqf
    public Boolean b() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.iqf
    public List<jba> c() {
        return this.h;
    }

    @Override // defpackage.iqf
    public cqqw d() {
        return this.e;
    }

    @Override // defpackage.iqf
    public void e() {
    }

    @Override // defpackage.iqf
    public String f() {
        return "";
    }

    @Override // defpackage.iqf
    public cjtd g() {
        return cjtd.a(dtya.bV);
    }

    @Override // defpackage.iqf
    public View.OnAttachStateChangeListener h() {
        return null;
    }

    public void i(List<ilo> list) {
        dccx F = dcdc.F();
        for (final ilo iloVar : list) {
            bnjs a = this.f.a(iloVar);
            a.a = new bnjt(this, iloVar) { // from class: boxn
                private final boxp a;
                private final ilo b;

                {
                    this.a = this;
                    this.b = iloVar;
                }

                @Override // defpackage.bnjt
                public final void a(cjqm cjqmVar) {
                    boxp boxpVar = this.a;
                    boxpVar.a.a.bF(this.b);
                }
            };
            a.n = cjtd.a(dtya.bW);
            F.g(a.a());
        }
        dcdc<jba> f = F.f();
        this.h = f;
        boolean z = true;
        if (f.isEmpty() && !k().booleanValue()) {
            z = false;
        }
        this.j = z;
        cqkx.p(this);
    }

    public void j(Boolean bool) {
        this.i = bool.booleanValue();
        this.j = true;
        cqkx.p(this);
    }

    @Override // defpackage.bpvl
    public Boolean k() {
        boolean z = false;
        if (this.c.f && !this.d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bpvl
    public Runnable l() {
        return new Runnable(this) { // from class: boxo
            private final boxp a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bpbl bpblVar = this.a.b.a;
                if (!bpblVar.aD) {
                    return;
                }
                bpblVar.bE();
            }
        };
    }

    @Override // defpackage.bpvl
    public Spanned m() {
        bowu bowuVar = this.c;
        return Html.fromHtml(this.g.getString(bowuVar.e ? bowuVar.f ? R.string.CAROUSEL_FEATURE_SELECTION_HINT_PLACE_OR_ROAD : R.string.CAROUSEL_FEATURE_SELECTION_HINT_ROAD_ONLY_V2 : R.string.CAROUSEL_FEATURE_SELECTION_HINT_PLACE_ONLY_V2));
    }
}

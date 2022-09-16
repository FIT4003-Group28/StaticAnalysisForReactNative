package defpackage;

import android.text.TextUtils;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: azsc  reason: default package */
/* loaded from: classes3.dex */
public class azsc extends anct {
    public axwt g;
    final /* synthetic */ azsd h;
    private final bzgf i;
    private final bzgj j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azsc(azsd azsdVar, anee aneeVar) {
        super(azsdVar, aneeVar);
        this.h = azsdVar;
        bzgf bzgfVar = new bzgf(this) { // from class: azsb
            private final azsc a;

            {
                this.a = this;
            }

            @Override // defpackage.bzgf
            public final void a() {
                azsc azscVar = this.a;
                azscVar.g = azscVar.h.aP.a().b();
                cqkx.p(azscVar);
            }
        };
        this.i = bzgfVar;
        bzgj bzgjVar = new bzgj();
        this.j = bzgjVar;
        this.g = axwt.a;
        if (azsdVar.ay) {
            bzgg.b(bzgfVar, azsdVar.aP.a(), bzgjVar, azsdVar.aS);
            this.g = azsdVar.aP.a().b();
        }
    }

    private final String G() {
        azsd azsdVar = this.h;
        andd anddVar = azsdVar.aT;
        if (anddVar == null) {
            return "";
        }
        anby anbyVar = (anby) anddVar.d;
        return H(anbyVar.b != 3 ? azsdVar.aB : anbyVar.a);
    }

    private static final String H(@dzsi String str) {
        return str != null ? str : "";
    }

    @Override // defpackage.anct, defpackage.jap
    @dzsi
    public String D() {
        if (this.h.ah.c()) {
            return super.D();
        }
        return this.g.a();
    }

    @Override // defpackage.anct
    public String a() {
        String a = super.a();
        axwt axwtVar = this.g;
        if (axwtVar == null || TextUtils.isEmpty(axwtVar.a())) {
            return a;
        }
        if (TextUtils.isEmpty(a)) {
            return this.g.a();
        }
        String a2 = this.g.a();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 1 + String.valueOf(a2).length());
        sb.append(a);
        sb.append("\n");
        sb.append(a2);
        return sb.toString();
    }

    @Override // defpackage.anct, defpackage.jap
    public cqkl g(cjqm cjqmVar) {
        azsd azsdVar = this.h;
        axuc axucVar = azsdVar.ax;
        if (axucVar != null) {
            axucVar.a(azsdVar.J()).b();
            return cqkl.a;
        }
        return super.g(cjqmVar);
    }

    @Override // defpackage.anct, defpackage.jap
    public cqkl j(cjqm cjqmVar) {
        andb andbVar;
        akqq d = d();
        azsd azsdVar = this.h;
        andd anddVar = azsdVar.aT;
        String str = null;
        if (anddVar != null && (andbVar = anddVar.d) != null) {
            str = ((anby) andbVar).a;
        }
        if (d != null) {
            if (!azsdVar.af) {
                azsdVar.q(d, cjqmVar, str);
            } else if (azsdVar.ag) {
                azsdVar.bs();
                this.h.q(d, cjqmVar, str);
            } else {
                azsdVar.br();
            }
        }
        if (!this.h.av.equals(dndr.NICKNAME)) {
            bxlz.b(this.h);
        }
        return cqkl.a;
    }

    @Override // defpackage.anct, defpackage.jap
    public cqkl k() {
        azrs g = azrs.g(this.h);
        if (g != null) {
            String G = G();
            bxmb bxmbVar = g.b;
            bxmbVar.a(bxmbVar.c.b(G));
            g.c(3);
            return cqkl.a;
        }
        gga ggaVar = this.h.aE;
        dbsk.s(ggaVar);
        bwqv a = this.h.aC.a();
        dndr dndrVar = this.h.av;
        String G2 = G();
        ddho b = this.h.a.b();
        azsd azsdVar = this.h;
        String str = azsdVar.aw;
        axuc axucVar = azsdVar.ax;
        azru q = azrv.q();
        q.c(dndrVar);
        q.f(G2);
        q.g(false);
        q.d(false);
        azro azroVar = (azro) q;
        azroVar.a = b;
        azroVar.b = str;
        q.i(false);
        q.j(true);
        q.e(true);
        q.k(false);
        azroVar.c = null;
        q.n(axucVar, a);
        azroVar.d = null;
        q.l(false);
        this.h.aZ(azsu.aR(q.a(), ggaVar, a));
        this.h.az = null;
        return cqkl.a;
    }

    @Override // defpackage.anct, defpackage.jap
    public jib q() {
        jhz e = jib.g(this.h.J(), o()).e();
        e.x = false;
        e.n = o();
        e.F = 1;
        return e.b();
    }

    @Override // defpackage.anct, defpackage.jap
    public Boolean u() {
        return true;
    }

    @Override // defpackage.anct, defpackage.jap
    public String v() {
        String str;
        azsd azsdVar = this.h;
        andd anddVar = azsdVar.aT;
        if (anddVar == null) {
            return azsdVar.Rp(R.string.ENTER_AN_ADDRESS_LINK_LABEL);
        }
        anby anbyVar = (anby) anddVar.d;
        int i = anbyVar.b - 1;
        if (i == 0) {
            return (!azsdVar.aA || (str = azsdVar.aB) == null) ? azsdVar.Rp(R.string.ENTER_AN_ADDRESS_LINK_LABEL) : str;
        } else if (i == 2) {
            azsdVar.aB = anbyVar.a;
            azsdVar.aA = false;
            return this.h.aB;
        } else if (i == 3) {
            azsdVar.aA = false;
            return this.h.Rp(R.string.LOADING_REVERSE_GEOCODED_ADDRESS_TEXT);
        } else {
            return azsdVar.Rp(R.string.ENTER_AN_ADDRESS_LINK_LABEL);
        }
    }
}

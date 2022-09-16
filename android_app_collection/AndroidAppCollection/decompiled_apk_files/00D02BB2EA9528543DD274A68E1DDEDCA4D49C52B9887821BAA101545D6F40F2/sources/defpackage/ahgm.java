package defpackage;

import com.google.android.apps.maps.R;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: ahgm  reason: default package */
/* loaded from: classes2.dex */
public class ahgm extends agxc implements agzx, agbm {
    private final btvo a;
    private final gga b;
    private final dzsj<bbdv> c;
    private final agbp d;
    private final agwu e;
    private final dqbi f;
    private final List<bblx> g;
    private final cjta h;

    public ahgm(btvo btvoVar, cqhn cqhnVar, final gga ggaVar, dxio<ania> dxioVar, afzs afzsVar, akfa akfaVar, dzsj<bbdv> dzsjVar, agag agagVar, agbq agbqVar, agxf agxfVar, agwu agwuVar, dlcv dlcvVar, dqbi dqbiVar, cjta cjtaVar, boolean z) {
        this.a = btvoVar;
        this.b = ggaVar;
        this.c = dzsjVar;
        this.e = agwuVar;
        this.f = dqbiVar;
        this.g = dcbg.b(dqbiVar.c).s(new dbrn(ggaVar) { // from class: ahgk
            private final gga a;

            {
                this.a = ggaVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return new ahgl(this.a, (dqbq) obj);
            }
        }).z();
        this.h = cjtaVar;
        agbp a = agbqVar.a(agxfVar, dlcvVar);
        this.d = a;
        deha.q(a.c.a().C(agwuVar.b()), new agbl(this), a.b);
    }

    @Override // defpackage.agbm
    public void a() {
        cqkx.p(this);
    }

    @Override // defpackage.agbm
    public void b(boolean z) {
    }

    @Override // defpackage.agbm
    public void c(boolean z) {
    }

    @Override // defpackage.agzx
    @dzsi
    public CharSequence h() {
        if ((this.f.a & 1) == 0 || this.a.getLocalStreamParameters().n()) {
            return null;
        }
        return String.format(Locale.getDefault(), "%.0f", Float.valueOf(n().floatValue() * 100.0f));
    }

    @Override // defpackage.agzx
    public CharSequence i() {
        return String.format(Locale.getDefault(), "%s%% %s", h(), this.b.getString(R.string.LOCALSTREAM_PERSONAL_SCORE_MATCH));
    }

    @Override // defpackage.agzx
    public cqkl j() {
        bwrs<ilo> a = bwrs.a(this.e.b());
        this.c.a().J(a);
        this.c.a().e(a);
        return cqkl.a;
    }

    @Override // defpackage.agzx
    public cjtd k() {
        return this.h.b(dtxu.ch);
    }

    @Override // defpackage.agzx
    public cjtd l() {
        cjta b = cjtd.b();
        b.d = dtxu.cf;
        b.g(this.f.f);
        return b.a();
    }

    public agwu m() {
        return this.e;
    }

    public Float n() {
        return Float.valueOf(akn.a(this.f.b, 0.0f, 1.0f));
    }

    @Override // defpackage.bbly
    public List<bblx> o() {
        return this.g;
    }
}

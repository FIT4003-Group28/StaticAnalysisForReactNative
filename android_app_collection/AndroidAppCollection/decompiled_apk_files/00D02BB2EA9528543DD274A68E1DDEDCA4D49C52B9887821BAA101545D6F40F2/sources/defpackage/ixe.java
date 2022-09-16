package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.text.NumberFormat;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ixe  reason: default package */
/* loaded from: classes6.dex */
public class ixe implements izm {
    private final cdjk a;
    private final boolean b;
    private final boolean c;
    private final iyi d;
    private final jbj e;
    private final jbe f;
    @dzsi
    private final jbd g;
    private final int h;
    private final Activity i;
    private final btvo j;

    public ixe(bwrs<ilo> bwrsVar, cdjd cdjdVar, cdjk cdjkVar, boolean z, boolean z2, iyj iyjVar, ixv ixvVar, ixb ixbVar, bhja bhjaVar, Activity activity, btvo btvoVar, bhhf bhhfVar) {
        ilo c = bwrsVar.c();
        dbsk.s(c);
        this.a = cdjkVar;
        this.b = cdja.PUBLISHED.equals(cdjdVar.a().c());
        this.c = !((Boolean) cdjdVar.c().b().h(ixc.a).h(ixd.a).c(true)).booleanValue();
        iyi b = iyjVar.b(bwrsVar, cdjdVar, null);
        this.d = b;
        this.e = b;
        this.f = ixvVar.a(cdjdVar, c.n(), z2);
        if (bhhfVar.f(bwrsVar)) {
            this.g = ixbVar.a(bwrsVar, cdjdVar);
        } else {
            this.g = null;
        }
        this.h = 0;
        this.i = activity;
        this.j = btvoVar;
    }

    @Override // defpackage.izm
    public jbj a() {
        return this.d;
    }

    @Override // defpackage.izm
    public jbj b() {
        return this.e;
    }

    @Override // defpackage.izm
    public jbe c() {
        return this.f;
    }

    @Override // defpackage.izm
    public Boolean d() {
        jbd jbdVar = this.g;
        boolean z = false;
        if (jbdVar != null && jbdVar.c().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.izm
    @dzsi
    public jbd e() {
        return this.g;
    }

    public boolean equals(@dzsi Object obj) {
        if (!(obj instanceof ixe)) {
            return false;
        }
        ixe ixeVar = (ixe) obj;
        return dbsd.a(Boolean.valueOf(this.b), Boolean.valueOf(ixeVar.b)) && dbsd.a(Boolean.valueOf(this.c), Boolean.valueOf(ixeVar.c)) && dbsd.a(this.d, ixeVar.d) && dbsd.a(this.f, ixeVar.f) && dbsd.a(this.g, ixeVar.g);
    }

    @Override // defpackage.izm
    public Boolean f() {
        return false;
    }

    @Override // defpackage.izm
    @dzsi
    public bhir g() {
        return null;
    }

    @Override // defpackage.izm
    public Boolean h() {
        jbd jbdVar;
        boolean z = true;
        if (!this.b || !this.c || (!a().k().booleanValue() && !this.f.a().booleanValue() && ((jbdVar = this.g) == null || !jbdVar.c().booleanValue()))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), Boolean.valueOf(this.c), this.d, this.f, this.g});
    }

    @Override // defpackage.izm
    public dkyd i() {
        dkyd aP = this.j.getUgcParameters().aP();
        if (this.g != null || !this.a.l) {
            return dkyd.UNKNOWN_REVIEW_VOTE_MODE;
        }
        return (aP.equals(dkyd.THUMBS_UP_HELPFUL_COUNT_INSIDE_BUTTON) || aP.equals(dkyd.YES_OR_NO_COUNT_INSIDE_BUTTON) || aP.equals(dkyd.YES_OR_NO_PROMPT_ONE_LINE)) ? dkyd.UNKNOWN_REVIEW_VOTE_MODE : aP;
    }

    @Override // defpackage.izm
    public CharSequence j() {
        if (k().booleanValue()) {
            return this.i.getResources().getQuantityString(R.plurals.REVIEW_CARD_VIEWS_COUNT, this.h, NumberFormat.getInstance(this.i.getResources().getConfiguration().locale).format(this.h));
        }
        return "";
    }

    @Override // defpackage.izm
    public Boolean k() {
        return Boolean.valueOf(this.h > 0);
    }

    public dqjc l() {
        return this.d.a();
    }

    @Override // defpackage.izm
    public void m(int i) {
        this.d.v(i);
        this.e.v(i);
        jbd jbdVar = this.g;
        if (jbdVar != null) {
            jbdVar.f(i);
        }
    }

    public ixe(dtol dtolVar, iyj iyjVar, ixv ixvVar, ixb ixbVar, Activity activity, btvo btvoVar) {
        this.a = cdjk.PROFILE;
        this.b = true;
        this.c = true;
        this.d = iyjVar.a(dtolVar, true);
        this.e = iyjVar.a(dtolVar, false);
        ixv.b(dtolVar, 1);
        ff ffVar = (ff) ((dxjd) ixvVar.a).a;
        ixv.b(ffVar, 2);
        bwft a = ixvVar.b.a();
        ixv.b(a, 3);
        ckcw a2 = ixvVar.c.a();
        ixv.b(a2, 4);
        this.f = new ixu(dtolVar, ffVar, a, a2);
        this.g = null;
        this.h = (int) dtolVar.k;
        this.i = activity;
        this.j = btvoVar;
    }
}

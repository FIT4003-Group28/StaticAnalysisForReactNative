package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bfda  reason: default package */
/* loaded from: classes3.dex */
public class bfda extends bfde implements bzml {
    static final eaow a = eaow.a(60);
    private final Activity g;
    private final cqat h;
    private final bfaq i;
    private final bfdf j;
    private final bfbb k;
    private final gga l;
    private final dxio<bzmm> m;
    private final cjtd n;
    @dzsi
    private bexz o;
    @dzsi
    private bwrs<ilo> p;
    @dzsi
    private bfbj q;

    public bfda(Activity activity, cqat cqatVar, cqhn cqhnVar, cqhu cqhuVar, bfaq bfaqVar, gga ggaVar, bvrb bvrbVar, dxio<bzmm> dxioVar, dxio<cjqq> dxioVar2, bfdf bfdfVar, bfbb bfbbVar) {
        super(activity, cqhnVar, cqhuVar, dxioVar2);
        this.g = activity;
        this.h = cqatVar;
        this.i = bfaqVar;
        this.l = ggaVar;
        this.m = dxioVar;
        this.j = bfdfVar;
        this.k = bfbbVar;
        this.n = cjtd.a(dtxu.aa);
    }

    @Override // defpackage.bzml
    public dqkc a() {
        return dqkc.LOCAL_FOLLOW_PRIVACY_REMINDER_TOAST;
    }

    @Override // defpackage.bzml
    public bzmj b() {
        return bzmj.CRITICAL;
    }

    @Override // defpackage.bzml
    public boolean c() {
        return false;
    }

    @Override // defpackage.bzml
    public boolean d() {
        bexz bexzVar = this.o;
        return bexzVar != null && bexzVar.a() && !this.e;
    }

    @Override // defpackage.bzml
    public bzmk e() {
        bexz bexzVar = this.o;
        if (bexzVar == null || !bexzVar.b() || this.e) {
            return bzmk.NONE;
        }
        bzmm a2 = this.m.a();
        long c = a2.c(a());
        if (c == -1) {
            c = a2.c(dqkc.LOCAL_FOLLOW_PERSONALIZED_OFFERS_DIALOG);
        }
        if (new eapd(c).e(a).x(new eapd(this.h.b()))) {
            return bzmk.VISIBLE;
        }
        return bzmk.NONE;
    }

    @Override // defpackage.bzml
    public boolean f(bzmk bzmkVar) {
        bzmk bzmkVar2 = bzmk.UNKNOWN_VISIBILITY;
        if (bzmkVar.ordinal() != 3) {
            return false;
        }
        String valueOf = String.valueOf(k());
        String valueOf2 = String.valueOf(l());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(" ");
        sb.append(valueOf2);
        this.d = sb.toString();
        super.z(this.n);
        return true;
    }

    @Override // defpackage.bfch
    public void h(jjn jjnVar) {
        bwrs<ilo> bwrsVar;
        bfbj bfbjVar;
        if (jjnVar == jjn.FULLY_EXPANDED) {
            if (this.e && (bwrsVar = this.p) != null && this.i.b(bwrsVar) && (bfbjVar = this.q) != null) {
                bfbjVar.m(true);
                this.q.n();
            }
            super.A();
            this.m.a().f(a());
        }
    }

    @Override // defpackage.bfch
    @dzsi
    public cqtd j() {
        return null;
    }

    @Override // defpackage.bfch
    public CharSequence k() {
        return this.g.getString(R.string.LOCAL_FOLLOW_REMINDER_TOAST_HEADLINE);
    }

    @Override // defpackage.bfch
    public CharSequence l() {
        return this.g.getString(R.string.LOCAL_FOLLOW_REMINDER_TOAST_BODY);
    }

    @Override // defpackage.bfch
    public CharSequence n() {
        return this.g.getString(R.string.LOCAL_FOLLOW_REMINDER_TOAST_ACCEPT_BUTTON);
    }

    @Override // defpackage.bfch
    public CharSequence o() {
        return this.g.getString(R.string.LOCAL_FOLLOW_REMINDER_TOAST_SETTINGS_BUTTON);
    }

    @Override // defpackage.bfch
    public cqkl p() {
        super.A();
        bwrs<ilo> bwrsVar = this.p;
        if (bwrsVar == null || !this.i.b(bwrsVar)) {
            this.m.a().a(this.j);
        } else {
            this.k.y(true);
            bfbj bfbjVar = this.q;
            if (bfbjVar != null) {
                bfbjVar.m(true);
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.bfch
    public cqkl q() {
        bszv.ba(this.l, btki.aU(3));
        return cqkl.a;
    }

    @Override // defpackage.bfch
    public cjtd r() {
        return this.n;
    }

    @Override // defpackage.bfch
    public cjtd s() {
        return cjtd.a(dtxu.ab);
    }

    @Override // defpackage.bfch
    public cjtd t() {
        return cjtd.a(dtxu.ac);
    }

    public void w(bwrs<ilo> bwrsVar, bexz bexzVar) {
        this.p = bwrsVar;
        this.o = bexzVar;
    }

    public void x(bfbj bfbjVar) {
        this.q = bfbjVar;
    }

    public void y() {
        this.p = null;
        this.o = null;
        this.q = null;
    }
}

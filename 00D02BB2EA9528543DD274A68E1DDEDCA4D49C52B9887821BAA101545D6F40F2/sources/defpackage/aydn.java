package defpackage;

import android.app.Activity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aydn  reason: default package */
/* loaded from: classes3.dex */
public class aydn implements ayde {
    private final Activity a;
    private final dxio<aaap> b;
    private final aaws c;
    private final dqhy d;
    private final boolean e;
    private final ddho f;
    private final baal g;
    private final boolean h;
    private final String i;
    private final dpuk j;
    private String k;
    private CharSequence l;
    @dzsi
    private final jic m;
    @dzsi
    private akky n;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public aydn(baal baalVar, baai baaiVar, String str, dqhy dqhyVar, boolean z, boolean z2, ddho ddhoVar, Activity activity, aklj akljVar, aaxo aaxoVar, bvsx bvsxVar, dxio<aaap> dxioVar) {
        String str2 = "";
        this.k = str2;
        this.l = str2;
        this.g = baalVar;
        this.a = activity;
        this.b = dxioVar;
        this.i = baaiVar.a();
        this.j = baaiVar.b();
        this.k = str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Spannable spannable = str2;
        if (dqhyVar != dqhy.OK) {
            bvsv a = bvsxVar.a(activity.getString(R.string.EXPERIENCE_LIST_ITEM_EXPIRED));
            a.n();
            a.m(R.color.qu_vanilla_red_500);
            spannable = a.c();
        }
        dcdc z3 = dcbg.b(dcdc.h(spannable, baaiVar.c(), baaiVar.d())).o(aydm.a).z();
        int size = z3.size();
        for (int i = 0; i < size; i++) {
            CharSequence charSequence = (CharSequence) z3.get(i);
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) " · ");
            }
            spannableStringBuilder.append(charSequence);
        }
        this.l = new SpannableString(spannableStringBuilder);
        this.d = dqhyVar;
        this.e = z;
        this.h = z2;
        this.f = ddhoVar;
        this.c = aaxoVar;
        String e = baaiVar.e();
        if (!cqjv.v(e).booleanValue()) {
            ckql ckqlVar = new ckql();
            ckqlVar.e = false;
            this.m = new jic(e, ckqc.FULLY_QUALIFIED, iup.e(R.raw.experiences_backdrop_illustration), 0, null, ckqlVar);
        } else {
            this.m = null;
        }
        if (baaiVar.f() != null) {
            dhti f = baaiVar.f();
            dbsk.s(f);
            this.n = akljVar.a(f, baaiVar.h());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static baai Qz(diwb diwbVar) {
        String str = diwbVar.c;
        dpuk b = dpuk.b(diwbVar.d);
        if (b == null) {
            b = dpuk.UNKNOWN_KNOWLEDGE_ENTITY;
        }
        baah i = baai.i(str, b);
        i.c(diwbVar.l);
        i.e(aahv.a(diwbVar));
        dive diveVar = diwbVar.v;
        if (diveVar == null) {
            diveVar = dive.d;
        }
        dsrj<dwfl> dsrjVar = diveVar.a;
        if (!dsrjVar.isEmpty()) {
            i.d(dsrjVar.get(0).h);
        }
        if ((diwbVar.a & 2097152) != 0) {
            dhti dhtiVar = diwbVar.s;
            if (dhtiVar == null) {
                dhtiVar = dhti.f;
            }
            ((azzy) i).c = dhtiVar;
        }
        ditt dittVar = diwbVar.e;
        if (dittVar == null) {
            dittVar = ditt.n;
        }
        i.b(dittVar.b);
        return i.a();
    }

    private final boolean l() {
        if (this.g.b() != null) {
            baad b = this.g.b();
            dbsk.s(b);
            return b.W();
        }
        return false;
    }

    @Override // defpackage.ayde
    public String a() {
        return l() ? this.a.getString(R.string.NUMBERED_PLACE_TITLE, new Object[]{Integer.valueOf(this.g.o() + 1), alp.a().b(this.k)}) : this.k;
    }

    @Override // defpackage.ayde
    public Boolean b() {
        boolean z = false;
        if (this.h && l()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ayde
    public Boolean c() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.ayde
    public CharSequence d() {
        return this.l;
    }

    @Override // defpackage.ayde
    @dzsi
    public jic e() {
        return this.m;
    }

    @Override // defpackage.ayde
    @dzsi
    public akky f() {
        return this.n;
    }

    @Override // defpackage.ayde
    public aaws g() {
        return this.c;
    }

    @Override // defpackage.ayde
    public cjtd h() {
        return cjtd.a(this.f);
    }

    @Override // defpackage.ayde
    public Boolean i() {
        boolean z = false;
        if (this.e && this.d == dqhy.OK) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ayde
    public cqkl j() {
        aaan g = aaao.g();
        aaaj aaajVar = (aaaj) g;
        aaajVar.a = this.i;
        aaajVar.b = this.j;
        g.c(true);
        this.b.a().i(g.a());
        return cqkl.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aydn(defpackage.baal r15, defpackage.diwb r16, boolean r17, boolean r18, defpackage.ddho r19, defpackage.gga r20, defpackage.aklj r21, defpackage.aaxo r22, defpackage.bvsx r23, defpackage.dxio<defpackage.aaap> r24) {
        /*
            r14 = this;
            r0 = r16
            baai r3 = Qz(r16)
            ditt r1 = r0.e
            if (r1 != 0) goto Lc
            ditt r1 = defpackage.ditt.n
        Lc:
            java.lang.String r4 = r1.f
            dqhy r5 = defpackage.dqhy.OK
            r1 = r14
            r2 = r15
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = r22
            r1.j(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aydn.<init>(baal, diwb, boolean, boolean, ddho, gga, aklj, aaxo, bvsx, dxio):void");
    }
}

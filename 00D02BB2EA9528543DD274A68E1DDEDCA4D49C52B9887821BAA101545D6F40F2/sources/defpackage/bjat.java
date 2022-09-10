package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bjat  reason: default package */
/* loaded from: classes3.dex */
public class bjat implements bjap {
    public final bjbu a;
    public final bwrs<ilo> b;
    public final djao c;
    private final bjhc d;
    private final bjwo e;
    private final cjtd f;
    private final String g;
    private final String h;
    private final cjtd i;
    @dzsi
    private final bjwo j;
    @dzsi
    private final String k;
    private final jbj l;
    private final cjtd m;

    public bjat(gga ggaVar, bjhc bjhcVar, bjzo bjzoVar, bjxm bjxmVar, bjxq bjxqVar, final bjbu bjbuVar, final bwrs<ilo> bwrsVar, final djao djaoVar, int i, int i2) {
        this.d = bjhcVar;
        this.a = bjbuVar;
        this.b = bwrsVar;
        this.c = djaoVar;
        bjzn a = bjzoVar.a(bwrsVar, djaoVar);
        this.e = a;
        djam djamVar = djaoVar.b;
        djamVar = djamVar == null ? djam.m : djamVar;
        djam c = bjgr.c(djaoVar);
        String string = ggaVar.getString(R.string.PLACE_QA_ACCESSIBILITY_ITEM_IN_LIST_DESCRIPTION, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        ilo c2 = bwrsVar.c();
        dbsk.s(c2);
        Object[] objArr = new Object[1];
        djag djagVar = djamVar.c;
        objArr[0] = bjgr.a(ggaVar, c2, djagVar == null ? djag.d : djagVar);
        this.g = m(ggaVar, ggaVar.getString(R.string.PLACE_QA_ACCESSIBILITY_ANSWER_BUTTON_DESCRIPTION, objArr), string);
        String str = null;
        this.j = c != null ? bjxmVar.a(new bjxk(bjbuVar, bwrsVar, djaoVar) { // from class: bjaq
            private final bjbu a;
            private final bwrs b;
            private final djao c;

            {
                this.a = bjbuVar;
                this.b = bwrsVar;
                this.c = djaoVar;
            }

            @Override // defpackage.bjxk
            public final void a(String str2) {
                bjbu bjbuVar2 = this.a;
                bwrs<ilo> bwrsVar2 = this.b;
                djao djaoVar2 = this.c;
                bjbs h = bjbv.h();
                h.c(true);
                h.a = str2;
                bjbuVar2.d(bwrsVar2, djaoVar2, h.a());
            }
        }, bwrsVar, c, djamVar.b, bjxqVar.a(bwrsVar, djaoVar, false).c(bwrsVar, c)) : null;
        int i3 = djaoVar.d;
        this.k = i3 > 1 ? ggaVar.getString(R.string.PLACE_QA_SEE_ALL_ANSWERS, new Object[]{Integer.valueOf(i3)}) : str;
        jbj s = a.s();
        this.l = s instanceof bkaj ? new bjas((bkaj) s, ggaVar, string) : s;
        bjwl t = a.t();
        this.h = t != null ? m(ggaVar, t.b(), string) : "";
        cjta d = bjgr.d(c2);
        d.d = dtxy.fM;
        this.f = d.a();
        cjta d2 = bjgr.d(c2);
        d2.d = dtxy.fI;
        this.i = d2.a();
        cjta d3 = bjgr.d(c2);
        d3.d = dtxy.fK;
        d3.a();
        this.m = cjtd.b;
    }

    public static String m(gga ggaVar, CharSequence charSequence, String str) {
        return String.format(ggaVar.getResources().getConfiguration().locale, "%s %s", charSequence, str);
    }

    @Override // defpackage.bjgv
    public void QW() {
        this.e.QW();
        bjwo bjwoVar = this.j;
        if (bjwoVar != null) {
            bjwoVar.QW();
        }
    }

    @Override // defpackage.bjap
    public bjwo a() {
        return this.e;
    }

    @Override // defpackage.bjap
    public cjtd b() {
        return this.m;
    }

    @Override // defpackage.bjap
    public cjtd c() {
        return this.f;
    }

    @Override // defpackage.bjap
    public jbj d() {
        return this.l;
    }

    @Override // defpackage.bjap
    public String e() {
        return this.h;
    }

    @Override // defpackage.bjap
    @dzsi
    public bjwo f() {
        return this.j;
    }

    @Override // defpackage.bjap
    @dzsi
    public String h() {
        return this.k;
    }

    @Override // defpackage.bjap
    public cqkl i() {
        this.a.c(this.b, this.c);
        return cqkl.a;
    }

    @Override // defpackage.bjap
    public cqkl j() {
        this.d.c(new Runnable(this) { // from class: bjar
            private final bjat a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bjat bjatVar = this.a;
                bjbu bjbuVar = bjatVar.a;
                bwrs<ilo> bwrsVar = bjatVar.b;
                djao djaoVar = bjatVar.c;
                bjbs h = bjbv.h();
                h.c(true);
                bjbuVar.d(bwrsVar, djaoVar, h.a());
            }
        });
        return cqkl.a;
    }

    @Override // defpackage.bjap
    public String k() {
        return this.g;
    }

    @Override // defpackage.bjap
    public cjtd l() {
        return this.i;
    }
}

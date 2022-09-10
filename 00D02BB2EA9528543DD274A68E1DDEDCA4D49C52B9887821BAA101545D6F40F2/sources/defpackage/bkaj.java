package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bkaj  reason: default package */
/* loaded from: classes3.dex */
public class bkaj implements jbj, bjgv {
    private final cqhn a;
    private final gga b;
    public final bvfc c;
    public final djcg d;
    public final btzi<djcg, djci> e = new bkai(this);
    public boolean f;
    private final dxio<akfa> g;
    private final bjgz h;
    private final bjhc i;
    private final String j;
    private final String k;
    private final String l;
    private final int m;
    private final cjtd n;
    private int o;

    public bkaj(bkaj bkajVar) {
        this.b = bkajVar.b;
        this.a = bkajVar.a;
        this.g = bkajVar.g;
        this.c = bkajVar.c;
        this.h = bkajVar.h;
        this.d = bkajVar.d;
        this.l = bkajVar.l;
        this.m = bkajVar.m;
        this.k = bkajVar.k;
        this.n = bkajVar.n;
        this.j = bkajVar.j;
        this.i = bkajVar.i;
        this.o = bkajVar.o;
        this.f = bkajVar.f;
    }

    private final void n() {
        dbsk.s(this.j);
        dbsk.s(this.h);
        btlu j = this.g.a().j();
        dqjh dqjhVar = this.f ? dqjh.THUMBS_UP : dqjh.THUMBS_VOTE_NONE;
        if (btlu.i(j).equals(btlt.GOOGLE)) {
            bjgz bjgzVar = this.h;
            dbsk.s(j);
            if (!bjgzVar.b(j, this.j, dqjhVar)) {
                boolean z = this.f;
                this.f = !z;
                this.o += true != z ? 1 : -1;
            }
        }
        if (this.o != 0 || !this.f) {
            return;
        }
        this.o = 1;
    }

    @Override // defpackage.bjgv
    public void QW() {
        n();
    }

    public final void a(boolean z) {
        bjgz bjgzVar = this.h;
        btlu j = this.g.a().j();
        dbsk.s(j);
        bjgzVar.a(j, this.j, z ? dqjh.THUMBS_UP : dqjh.THUMBS_VOTE_NONE);
        if (this.f != z) {
            this.f = z;
            int i = this.o;
            int i2 = 1;
            if (true != z) {
                i2 = -1;
            }
            this.o = i + i2;
            cqkx.p(this);
        }
    }

    @Override // defpackage.jbj
    public String b() {
        int i = this.o;
        return i > 0 ? String.valueOf(i) : this.b.getString(R.string.REVIEW_CARD_LIKE);
    }

    @Override // defpackage.jbj
    public Boolean c() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.jbj
    public Boolean d() {
        return false;
    }

    @Override // defpackage.jbj
    public CharSequence e() {
        if (this.f) {
            return this.l;
        }
        gga ggaVar = this.b;
        int i = this.m;
        Object[] objArr = new Object[2];
        objArr[0] = this.k;
        int i2 = this.o;
        objArr[1] = i2 == 0 ? "" : ggaVar.getString(R.string.REVIEW_THUMBS_UP_DESCRIPTION, new Object[]{ggaVar.getResources().getQuantityString(R.plurals.REVIEW_THUMBS_UP_PEOPLE_COUNT, i2, Integer.valueOf(i2))});
        return ggaVar.getString(i, objArr);
    }

    @Override // defpackage.jbj
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.jbj
    public CharSequence g() {
        return "";
    }

    @Override // defpackage.jbj
    public CharSequence h() {
        return "";
    }

    @Override // defpackage.jbj
    public CharSequence i() {
        return "";
    }

    @Override // defpackage.jbj
    public CharSequence j() {
        return "";
    }

    @Override // defpackage.jbj
    public Boolean k() {
        return true;
    }

    @Override // defpackage.jbj
    public cqkl l() {
        this.i.c(new Runnable(this) { // from class: bkah
            private final bkaj a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bkaj bkajVar = this.a;
                bkajVar.a(!bkajVar.f);
                bvfc bvfcVar = bkajVar.c;
                djcg djcgVar = bkajVar.d;
                dsqp dsqpVar = (dsqp) djcgVar.cu(5);
                dsqpVar.bC(djcgVar);
                djcf djcfVar = (djcf) dsqpVar;
                dqjh dqjhVar = bkajVar.f ? dqjh.THUMBS_UP : dqjh.THUMBS_VOTE_NONE;
                if (djcfVar.c) {
                    djcfVar.bF();
                    djcfVar.c = false;
                }
                djcg djcgVar2 = (djcg) djcfVar.b;
                djcg djcgVar3 = djcg.f;
                djcgVar2.c = dqjhVar.e;
                djcgVar2.a |= 2;
                bvfcVar.a(djcfVar.bK(), bkajVar.e, bvrj.UI_THREAD);
            }
        });
        return cqkl.a;
    }

    @Override // defpackage.jbj
    public cqkl m() {
        return cqkl.a;
    }

    @Override // defpackage.jbj
    @dzsi
    public cqtd q() {
        return null;
    }

    @Override // defpackage.jbj
    @dzsi
    public cqtd r() {
        return null;
    }

    @Override // defpackage.jbj
    public cjtd s() {
        return this.n;
    }

    @Override // defpackage.jbj
    @dzsi
    public cjtd t() {
        return null;
    }

    @Override // defpackage.jbj
    public CharSequence u() {
        return "";
    }

    @Override // defpackage.jbj
    public void v(int i) {
    }

    public bkaj(cqhn cqhnVar, gga ggaVar, dxio<akfa> dxioVar, bjhc bjhcVar, bvfc bvfcVar, bjgz bjgzVar, bwrs<ilo> bwrsVar, djam djamVar, boolean z) {
        this.a = cqhnVar;
        this.b = ggaVar;
        this.g = dxioVar;
        this.i = bjhcVar;
        this.c = bvfcVar;
        this.h = bjgzVar;
        ilo c = bwrsVar.c();
        dbsk.s(c);
        djcf bZ = djcg.f.bZ();
        String str = djamVar.b;
        boolean z2 = false;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djcg djcgVar = (djcg) bZ.b;
        str.getClass();
        djcgVar.a |= 1;
        djcgVar.b = str;
        String o = c.ai().o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djcg djcgVar2 = (djcg) bZ.b;
        o.getClass();
        djcgVar2.a |= 4;
        djcgVar2.d = o;
        String cG = c.cG();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djcg djcgVar3 = (djcg) bZ.b;
        cG.getClass();
        djcgVar3.a |= 8;
        djcgVar3.e = cG;
        this.d = bZ.bK();
        this.j = djamVar.b;
        djag djagVar = djamVar.c;
        String a = bjgr.a(ggaVar, c, djagVar == null ? djag.d : djagVar);
        this.k = a;
        this.l = ggaVar.getString(z ? R.string.PLACE_QA_ACCESSIBILITY_QUESTION_THUMBS_UP_CHECKED_DESCRIPTION : R.string.PLACE_QA_ACCESSIBILITY_ANSWER_THUMBS_UP_CHECKED_DESCRIPTION, new Object[]{a});
        this.m = true != z ? R.string.PLACE_QA_ACCESSIBILITY_ANSWER_THUMBS_UP_UNCHECKED_DESCRIPTION : R.string.PLACE_QA_ACCESSIBILITY_QUESTION_THUMBS_UP_UNCHECKED_DESCRIPTION;
        cjta c2 = cjtd.c(c.bZ());
        c2.d = dtxy.gi;
        this.n = c2.a();
        this.o = djamVar.e;
        dqjh b = dqjh.b(djamVar.f);
        this.f = (b == null ? dqjh.UNKNOWN_VOTE_TYPE : b) == dqjh.THUMBS_UP ? true : z2;
        n();
    }
}

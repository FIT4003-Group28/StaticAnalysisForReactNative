package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: iyi  reason: default package */
/* loaded from: classes7.dex */
public class iyi implements jbj {
    public final ff a;
    public final Executor b;
    private final btrm c;
    private final buyl d;
    private final bvas e;
    private final akfa f;
    private final String g;
    private final String h;
    private final String i;
    private final boolean j;
    private final cebr k;
    private final String l;
    @dzsi
    private final bwrs<ilo> m;
    private final akfc n;
    private final boolean o;
    private final int p;
    private final dkyd q;
    @dzsi
    private final ddho r;
    @dzsi
    private final ddho s;
    private dqjh t;
    private int u;
    @dzsi
    private cdjd v;

    public iyi(bwrs<ilo> bwrsVar, cdjd cdjdVar, boolean z, @dzsi ddho ddhoVar, @dzsi ddho ddhoVar2, ff ffVar, buyl buylVar, bvas bvasVar, akfa akfaVar, akfc akfcVar, Executor executor, btvo btvoVar, cebr cebrVar, btrm btrmVar) {
        this.u = -1;
        this.m = bwrsVar;
        this.v = cdjdVar;
        this.j = false;
        this.r = ddhoVar;
        this.s = null;
        this.a = ffVar;
        this.d = buylVar;
        this.e = bvasVar;
        this.f = akfaVar;
        this.n = akfcVar;
        this.b = executor;
        this.k = cebrVar;
        this.c = btrmVar;
        this.l = cdjdVar.a().h().c("");
        this.o = true;
        this.t = cdjdVar.b().b();
        this.p = cdjdVar.b().a() - (this.t.equals(dqjh.THUMBS_UP) ? 1 : 0);
        this.g = cdjdVar.a().g();
        this.h = (String) cdjdVar.a().b().h(iyc.a).c("");
        ilo c = bwrsVar.c();
        dbsk.s(c);
        this.i = c.n();
        this.q = btvoVar.getUgcParameters().aP();
    }

    private final int A() {
        return this.p + (c().booleanValue() ? 1 : 0);
    }

    private final <I, O> btzi<I, O> B(dqjh dqjhVar) {
        return new iyh(this, dqjhVar);
    }

    private final String w() {
        return NumberFormat.getInstance(this.a.getResources().getConfiguration().locale).format(A());
    }

    private final CharSequence x(String str) {
        Resources resources = this.a.getResources();
        String y = y();
        Integer valueOf = Integer.valueOf(A());
        if (valueOf.intValue() == 0 || !dkyd.UNKNOWN_REVIEW_VOTE_MODE.equals(this.q)) {
            return TextUtils.concat(y, " ", str);
        }
        return TextUtils.concat(y, " ", resources.getString(R.string.REVIEW_THUMBS_UP_DESCRIPTION, resources.getQuantityString(R.plurals.REVIEW_THUMBS_UP_PEOPLE_COUNT, valueOf.intValue(), valueOf)), " ", str);
    }

    private final String y() {
        Resources resources = this.a.getResources();
        if (dbsj.d(this.i)) {
            return resources.getString(R.string.REVIEW_THUMBS_UP_ACCESSIBILITY_REVIEW_AUTHOR, this.h);
        }
        if (dbsj.d(this.h)) {
            return resources.getString(R.string.REVIEW_THUMBS_UP_ACCESSIBILITY_REVIEW_PLACE, this.i);
        }
        int i = this.u;
        if (i <= 0) {
            return resources.getString(R.string.REVIEW_THUMBS_UP_ACCESSIBILITY_REVIEW_PLACE_AND_AUTHOR, this.i, this.h);
        }
        return resources.getString(R.string.REVIEW_THUMBS_UP_ACCESSIBILITY_REVIEW_PLACE_AUTHOR_AND_ORDINAL, Integer.valueOf(i), this.i, this.h);
    }

    private final cqkl z(Runnable runnable) {
        if (this.f.c()) {
            runnable.run();
            return cqkl.a;
        }
        this.n.k(new iyg(runnable), null);
        return cqkl.a;
    }

    public dqjc a() {
        dqjb bZ = dqjc.d.bZ();
        int A = A();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqjc dqjcVar = (dqjc) bZ.b;
        int i = dqjcVar.a | 1;
        dqjcVar.a = i;
        dqjcVar.b = A;
        dqjcVar.c = this.t.e;
        dqjcVar.a = i | 8;
        return bZ.bK();
    }

    @Override // defpackage.jbj
    public String b() {
        if (!this.o || A() <= 0) {
            return this.j ? this.a.getString(R.string.REVIEW_CARD_LIKE) : "";
        }
        return w();
    }

    @Override // defpackage.jbj
    public Boolean c() {
        return Boolean.valueOf(this.t.equals(dqjh.THUMBS_UP));
    }

    @Override // defpackage.jbj
    public Boolean d() {
        return Boolean.valueOf(this.t.equals(dqjh.THUMBS_DOWN));
    }

    @Override // defpackage.jbj
    public CharSequence e() {
        String string;
        Resources resources = this.a.getResources();
        if (c().booleanValue()) {
            string = resources.getString(R.string.REVIEW_THUMBS_UP_ACCESSIBILITY_CHECKED);
        } else {
            string = resources.getString(R.string.REVIEW_THUMBS_UP_ACCESSIBILITY_UNCHECKED);
        }
        return x(string);
    }

    public boolean equals(@dzsi Object obj) {
        if (!(obj instanceof iyi)) {
            return false;
        }
        iyi iyiVar = (iyi) obj;
        return this.g.equals(iyiVar.g) && this.j == iyiVar.j;
    }

    @Override // defpackage.jbj
    public CharSequence f() {
        String string;
        Resources resources = this.a.getResources();
        if (d().booleanValue()) {
            string = resources.getString(R.string.REVIEW_THUMBS_DOWN_ACCESSIBILITY_CHECKED);
        } else {
            string = resources.getString(R.string.REVIEW_THUMBS_DOWN_ACCESSIBILITY_UNCHECKED);
        }
        return x(string);
    }

    @Override // defpackage.jbj
    public CharSequence g() {
        return TextUtils.concat(y(), " ", h());
    }

    @Override // defpackage.jbj
    public CharSequence h() {
        int A = A();
        return A == 0 ? "" : this.a.getResources().getQuantityString(R.plurals.REVIEW_HELPFUL_COUNT, A, Integer.valueOf(A));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.g, Boolean.valueOf(this.j)});
    }

    @Override // defpackage.jbj
    public CharSequence i() {
        Resources resources = this.a.getResources();
        int A = A();
        if (A == 0) {
            return resources.getString(R.string.REVIEW_HELPFUL_PROMPT);
        }
        return resources.getString(R.string.REVIEW_HELPFUL_PROMPT_COUNT, Integer.valueOf(A));
    }

    @Override // defpackage.jbj
    public CharSequence j() {
        Resources resources = this.a.getResources();
        int A = A();
        if (A == 0) {
            return resources.getString(R.string.REVIEW_HELPFUL_FEEDBACK);
        }
        return resources.getString(R.string.REVIEW_HELPFUL_FEEDBACK_COUNT, Integer.valueOf(A));
    }

    @Override // defpackage.jbj
    public Boolean k() {
        return Boolean.valueOf(!this.g.isEmpty());
    }

    @Override // defpackage.jbj
    public cqkl l() {
        final dqjh dqjhVar = c().booleanValue() ? dqjh.THUMBS_VOTE_NONE : dqjh.THUMBS_UP;
        return z(new Runnable(this, dqjhVar) { // from class: iyd
            private final iyi a;
            private final dqjh b;

            {
                this.a = this;
                this.b = dqjhVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.n(this.b);
            }
        });
    }

    @Override // defpackage.jbj
    public cqkl m() {
        final dqjh dqjhVar = d().booleanValue() ? dqjh.THUMBS_VOTE_NONE : dqjh.THUMBS_DOWN;
        return z(new Runnable(this, dqjhVar) { // from class: iye
            private final iyi a;
            private final dqjh b;

            {
                this.a = this;
                this.b = dqjhVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.n(this.b);
            }
        });
    }

    public final void n(dqjh dqjhVar) {
        dqjh dqjhVar2 = this.t;
        o(dqjhVar);
        if (this.k.a()) {
            bvas bvasVar = this.e;
            dkep bZ = dkeq.e.bZ();
            String str = this.g;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dkeq dkeqVar = (dkeq) bZ.b;
            str.getClass();
            int i = 1 | dkeqVar.a;
            dkeqVar.a = i;
            dkeqVar.b = str;
            dkeqVar.c = this.t.e;
            dkeqVar.a = i | 2;
            dnqg bZ2 = dnqh.p.bZ();
            dnmu dnmuVar = dnmu.PROPERTY_GMM;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ2.b;
            dnqhVar.l = dnmuVar.ap;
            int i2 = dnqhVar.a | ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            dnqhVar.a = i2;
            String str2 = this.l;
            str2.getClass();
            int i3 = i2 | 8;
            dnqhVar.a = i3;
            dnqhVar.e = str2;
            dnqhVar.a = i3 | 64;
            dnqhVar.g = 26810;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dkeq dkeqVar2 = (dkeq) bZ.b;
            dnqh bK = bZ2.bK();
            bK.getClass();
            dkeqVar2.d = bK;
            dkeqVar2.a |= 8;
            bvasVar.b(bZ.bK(), B(dqjhVar2), this.b);
            return;
        }
        buyl buylVar = this.d;
        djve bZ3 = djvf.d.bZ();
        dqjd bZ4 = dqjf.d.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dqjf dqjfVar = (dqjf) bZ4.b;
        dqjfVar.b = 1;
        int i4 = dqjfVar.a | 1;
        dqjfVar.a = i4;
        String str3 = this.g;
        str3.getClass();
        dqjfVar.a = i4 | 2;
        dqjfVar.c = str3;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        djvf djvfVar = (djvf) bZ3.b;
        dqjf bK2 = bZ4.bK();
        bK2.getClass();
        djvfVar.b = bK2;
        djvfVar.a = 1 | djvfVar.a;
        dqjh dqjhVar3 = this.t;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        djvf djvfVar2 = (djvf) bZ3.b;
        djvfVar2.c = dqjhVar3.e;
        djvfVar2.a |= 2;
        buylVar.b(bZ3.bK(), B(dqjhVar2), this.b);
    }

    public final void o(dqjh dqjhVar) {
        ilo c;
        this.t = dqjhVar;
        bwrs<ilo> bwrsVar = this.m;
        if (bwrsVar != null && (c = bwrsVar.c()) != null && c.bo() != null) {
            ily g = c.g();
            doco bo = c.bo();
            dbsk.s(bo);
            if ((bo.a & 1) != 0) {
                String str = this.g;
                docg docgVar = bo.c;
                if (docgVar == null) {
                    docgVar = docg.M;
                }
                if (str.equals(docgVar.i)) {
                    docg docgVar2 = bo.c;
                    if (docgVar2 == null) {
                        docgVar2 = docg.M;
                    }
                    g.v(p(docgVar2));
                }
            }
            g.J(this.g, new dbrn(this) { // from class: iyf
                private final iyi a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    return this.a.p((docg) obj);
                }
            });
            this.m.d(g.d());
        }
        cqkx.p(this);
        cdjd cdjdVar = this.v;
        if (cdjdVar != null) {
            cdjd g2 = cdjdVar.g(A(), this.t);
            this.v = g2;
            this.c.b(new bkoz(g2, false));
            return;
        }
        btrm btrmVar = this.c;
        docc bZ = docg.M.bZ();
        String str2 = this.g;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        docg docgVar3 = (docg) bZ.b;
        str2.getClass();
        docgVar3.a |= 1;
        docgVar3.i = str2;
        int A = A();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        docg docgVar4 = (docg) bZ.b;
        int i = docgVar4.a | 4194304;
        docgVar4.a = i;
        docgVar4.D = A;
        docgVar4.C = this.t.e;
        docgVar4.a = 2097152 | i;
        btrmVar.b(new bkoz(cdrr.q(bZ.bK(), dqgr.PUBLISHED), true));
    }

    @Deprecated
    public final docg p(docg docgVar) {
        docc ca = docg.M.ca(docgVar);
        int A = A();
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        docg docgVar2 = (docg) ca.b;
        int i = docgVar2.a | 4194304;
        docgVar2.a = i;
        docgVar2.D = A;
        docgVar2.C = this.t.e;
        docgVar2.a = 2097152 | i;
        return ca.bK();
    }

    @Override // defpackage.jbj
    @dzsi
    public cqtd q() {
        return iup.c(R.raw.ic_mod_thumb_up, c().booleanValue() ? ibm.y() : ibm.p());
    }

    @Override // defpackage.jbj
    @dzsi
    public cqtd r() {
        return iup.c(R.raw.ic_mod_thumb_down, d().booleanValue() ? ibm.y() : ibm.p());
    }

    @Override // defpackage.jbj
    public cjtd s() {
        deaa deaaVar;
        cjta b = cjtd.b();
        ddho ddhoVar = this.r;
        if (ddhoVar == null) {
            ddhoVar = dtya.dZ;
        }
        b.d = ddhoVar;
        ddzy bZ = deab.c.bZ();
        if (c().booleanValue()) {
            deaaVar = deaa.TOGGLE_ON;
        } else {
            deaaVar = deaa.TOGGLE_OFF;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        b.g(this.l);
        return b.a();
    }

    @Override // defpackage.jbj
    @dzsi
    public cjtd t() {
        deaa deaaVar;
        cjta b = cjtd.b();
        b.d = dtya.dY;
        ddzy bZ = deab.c.bZ();
        if (d().booleanValue()) {
            deaaVar = deaa.TOGGLE_ON;
        } else {
            deaaVar = deaa.TOGGLE_OFF;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        b.g(this.l);
        return b.a();
    }

    @Override // defpackage.jbj
    public CharSequence u() {
        return A() > 0 ? this.a.getResources().getQuantityString(R.plurals.REVIEW_CARD_LIKES_COUNT, A(), w()) : "";
    }

    @Override // defpackage.jbj
    public void v(int i) {
        this.u = i;
    }

    public iyi(dtol dtolVar, boolean z, ff ffVar, buyl buylVar, bvas bvasVar, akfa akfaVar, akfc akfcVar, Executor executor, btvo btvoVar, cebr cebrVar, btrm btrmVar) {
        this.u = -1;
        this.n = akfcVar;
        dtok dtokVar = dtolVar.l;
        dtokVar = dtokVar == null ? dtok.d : dtokVar;
        this.m = null;
        this.v = null;
        this.i = dtolVar.i;
        this.h = "";
        this.j = true;
        this.r = null;
        this.s = null;
        this.a = ffVar;
        this.d = buylVar;
        this.e = bvasVar;
        this.f = akfaVar;
        this.b = executor;
        this.k = cebrVar;
        this.c = btrmVar;
        this.l = dtolVar.n;
        this.o = z;
        dqjh b = dqjh.b(dtokVar.b);
        this.t = b == null ? dqjh.UNKNOWN_VOTE_TYPE : b;
        this.p = dtokVar.c - (this.t.equals(dqjh.THUMBS_UP) ? 1 : 0);
        dqjf dqjfVar = dtokVar.a;
        this.g = (dqjfVar == null ? dqjf.d : dqjfVar).c;
        this.q = btvoVar.getUgcParameters().aP();
    }
}

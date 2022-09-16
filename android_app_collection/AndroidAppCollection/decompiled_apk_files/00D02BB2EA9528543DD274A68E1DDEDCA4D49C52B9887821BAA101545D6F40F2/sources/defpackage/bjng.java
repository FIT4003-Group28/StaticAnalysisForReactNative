package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bjng  reason: default package */
/* loaded from: classes3.dex */
public class bjng implements bjne {
    private final jht a;
    private final bjfo b;
    private final bjln c;
    private final Resources d;
    private final ilo e;

    public bjng(final bjfo bjfoVar, ilo iloVar, final bjln bjlnVar, Resources resources) {
        this.b = bjfoVar;
        this.c = bjlnVar;
        this.d = resources;
        this.e = iloVar;
        cjta c = cjtd.c(iloVar.bZ());
        jhu h = jhv.h();
        h.c(c.b(dtxy.gw));
        Object[] objArr = new Object[1];
        bjfq bjfqVar = bjfoVar.c;
        objArr[0] = (bjfqVar == null ? bjfq.g : bjfqVar).b;
        ((jhi) h).e = resources.getString(R.string.PLACE_QA_ACCESSIBILITY_ANSWER_OVERFLOW_MENU_DESCRIPTION, objArr);
        jhm b = jhm.b(R.string.PLACE_QA_REPORT_ANSWER);
        b.d(new View.OnClickListener(bjlnVar, bjfoVar) { // from class: bjnf
            private final bjln a;
            private final bjfo b;

            {
                this.a = bjlnVar;
                this.b = bjfoVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bjln bjlnVar2 = this.a;
                bjfo bjfoVar2 = this.b;
                if (!bjfoVar2.g.isEmpty()) {
                    bjgy a = ((bjmi) bjlnVar2).k.a();
                    bjfm bjfmVar = bjfoVar2.b;
                    if (bjfmVar == null) {
                        bjfmVar = bjfm.c;
                    }
                    a.a(2, bjfmVar.b, bjfoVar2.g);
                } else if (bjfoVar2.h.isEmpty()) {
                } else {
                    bjmi bjmiVar = (bjmi) bjlnVar2;
                    Context H = bjmiVar.g.H();
                    ahr ahrVar = new ahr();
                    ahrVar.d();
                    bjmiVar.j.a().q(H, ahrVar, bjfoVar2.h, 4);
                }
            }
        });
        b.f = c.b(dtxy.gr);
        h.d(b.c());
        this.a = h.b();
    }

    @Override // defpackage.bjne
    public jic a() {
        bjfq bjfqVar = this.b.c;
        if (bjfqVar == null) {
            bjfqVar = bjfq.g;
        }
        return new jic(bjfqVar.e, ckqc.FIFE_MERGE, 2131232998);
    }

    @Override // defpackage.bjne
    public String b() {
        bjfq bjfqVar = this.b.c;
        if (bjfqVar == null) {
            bjfqVar = bjfq.g;
        }
        return bjfqVar.b;
    }

    @Override // defpackage.bjne
    public cqkl c() {
        bjln bjlnVar = this.c;
        bjfq bjfqVar = this.b.c;
        if (bjfqVar == null) {
            bjfqVar = bjfq.g;
        }
        bjlnVar.e(bjfqVar);
        return cqkl.a;
    }

    @Override // defpackage.bjne
    public boolean d() {
        bjfq bjfqVar = this.b.c;
        if (bjfqVar == null) {
            bjfqVar = bjfq.g;
        }
        return !bjfqVar.d;
    }

    @Override // defpackage.bjne
    public String e() {
        return this.b.i;
    }

    public boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjng)) {
            return false;
        }
        bjng bjngVar = (bjng) obj;
        return this.b.equals(bjngVar.b) && this.e.equals(bjngVar.e);
    }

    @Override // defpackage.bjne
    public String f() {
        return this.b.d;
    }

    @Override // defpackage.bjne
    public jht g() {
        return this.a;
    }

    @Override // defpackage.bjne
    public String h() {
        int i = this.b.e;
        return i > 0 ? String.valueOf(i) : this.d.getString(R.string.REVIEW_CARD_LIKE);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{bjng.class, this.b, this.e});
    }

    @Override // defpackage.bjne
    public String i() {
        dqjh dqjhVar = dqjh.UNKNOWN_VOTE_TYPE;
        dqjh b = dqjh.b(this.b.f);
        if (b == null) {
            b = dqjh.UNKNOWN_VOTE_TYPE;
        }
        if (b.ordinal() != 1) {
            Resources resources = this.d;
            Object[] objArr = new Object[2];
            bjfq bjfqVar = this.b.c;
            if (bjfqVar == null) {
                bjfqVar = bjfq.g;
            }
            objArr[0] = bjfqVar.b;
            Resources resources2 = this.d;
            int i = this.b.e;
            objArr[1] = i == 0 ? "" : resources2.getString(R.string.REVIEW_THUMBS_UP_DESCRIPTION, resources2.getQuantityString(R.plurals.REVIEW_THUMBS_UP_PEOPLE_COUNT, i, Integer.valueOf(i)));
            return resources.getString(R.string.PLACE_QA_ACCESSIBILITY_ANSWER_THUMBS_UP_UNCHECKED_DESCRIPTION, objArr);
        }
        Resources resources3 = this.d;
        Object[] objArr2 = new Object[1];
        bjfq bjfqVar2 = this.b.c;
        if (bjfqVar2 == null) {
            bjfqVar2 = bjfq.g;
        }
        objArr2[0] = bjfqVar2.b;
        return resources3.getString(R.string.PLACE_QA_ACCESSIBILITY_ANSWER_THUMBS_UP_CHECKED_DESCRIPTION, objArr2);
    }

    @Override // defpackage.bjne
    public boolean j() {
        dqjh b = dqjh.b(this.b.f);
        if (b == null) {
            b = dqjh.UNKNOWN_VOTE_TYPE;
        }
        return b == dqjh.THUMBS_UP;
    }

    @Override // defpackage.bjne
    public cqkl k() {
        dqjh dqjhVar = dqjh.UNKNOWN_VOTE_TYPE;
        dqjh b = dqjh.b(this.b.f);
        if (b == null) {
            b = dqjh.UNKNOWN_VOTE_TYPE;
        }
        if (b.ordinal() == 1) {
            this.c.b(this.b, dqjh.THUMBS_VOTE_NONE);
        } else {
            this.c.b(this.b, dqjh.THUMBS_UP);
        }
        return cqkl.a;
    }

    @Override // defpackage.bjne
    public cjtd l() {
        return cjtd.c(this.e.bZ()).b(dtxy.gs);
    }

    @Override // defpackage.bjne
    public boolean m() {
        bjfq bjfqVar = this.b.c;
        if (bjfqVar == null) {
            bjfqVar = bjfq.g;
        }
        return bjfqVar.d;
    }

    @Override // defpackage.bjne
    public boolean n() {
        bjfq bjfqVar = this.b.c;
        if (bjfqVar == null) {
            bjfqVar = bjfq.g;
        }
        return bjfqVar.c;
    }

    @Override // defpackage.bjne
    public cqkl o() {
        bjmi bjmiVar = (bjmi) this.c;
        bjmiVar.i(this.b, true);
        bjmiVar.n();
        return cqkl.a;
    }

    @Override // defpackage.bjne
    public cqkl p() {
        this.c.d(this.b);
        return cqkl.a;
    }
}

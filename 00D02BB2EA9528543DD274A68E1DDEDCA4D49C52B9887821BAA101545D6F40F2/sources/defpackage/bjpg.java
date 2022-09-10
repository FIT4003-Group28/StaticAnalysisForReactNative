package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bjpg  reason: default package */
/* loaded from: classes3.dex */
public class bjpg implements bjpf {
    private final ilo a;
    private final bjln b;
    private final Resources c;
    private final bjfw d;

    public bjpg(bjfw bjfwVar, ilo iloVar, bjln bjlnVar, Resources resources) {
        this.d = bjfwVar;
        this.a = iloVar;
        this.b = bjlnVar;
        this.c = resources;
    }

    @Override // defpackage.bjpf
    public String a() {
        return this.d.d;
    }

    @Override // defpackage.bjpf
    public String b() {
        bjfq bjfqVar = this.d.c;
        if (bjfqVar == null) {
            bjfqVar = bjfq.g;
        }
        return bjfqVar.b;
    }

    @Override // defpackage.bjpf
    public cqkl c() {
        bjln bjlnVar = this.b;
        bjfq bjfqVar = this.d.c;
        if (bjfqVar == null) {
            bjfqVar = bjfq.g;
        }
        bjlnVar.e(bjfqVar);
        return cqkl.a;
    }

    @Override // defpackage.bjpf
    public boolean d() {
        bjfq bjfqVar = this.d.c;
        if (bjfqVar == null) {
            bjfqVar = bjfq.g;
        }
        return !bjfqVar.d;
    }

    @Override // defpackage.bjpf
    public boolean e() {
        return !this.d.k;
    }

    public boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjpg)) {
            return false;
        }
        bjpg bjpgVar = (bjpg) obj;
        return this.a.equals(bjpgVar.a) && this.d.equals(bjpgVar.d);
    }

    @Override // defpackage.bjpf
    public String f() {
        return this.d.j;
    }

    @Override // defpackage.bjpf
    public jic g() {
        bjfq bjfqVar = this.d.c;
        if (bjfqVar == null) {
            bjfqVar = bjfq.g;
        }
        return new jic(bjfqVar.e, ckqc.FIFE_MERGE, 2131232998);
    }

    @Override // defpackage.bjpf
    public String h() {
        int i = this.d.e;
        return i > 0 ? String.valueOf(i) : this.c.getString(R.string.REVIEW_CARD_LIKE);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{bjpg.class, this.a, this.d});
    }

    @Override // defpackage.bjpf
    public String i() {
        dqjh dqjhVar = dqjh.UNKNOWN_VOTE_TYPE;
        dqjh b = dqjh.b(this.d.f);
        if (b == null) {
            b = dqjh.UNKNOWN_VOTE_TYPE;
        }
        if (b.ordinal() != 1) {
            Resources resources = this.c;
            Object[] objArr = new Object[2];
            bjfq bjfqVar = this.d.c;
            if (bjfqVar == null) {
                bjfqVar = bjfq.g;
            }
            objArr[0] = bjfqVar.b;
            Resources resources2 = this.c;
            int i = this.d.e;
            objArr[1] = i == 0 ? "" : resources2.getString(R.string.REVIEW_THUMBS_UP_DESCRIPTION, resources2.getQuantityString(R.plurals.REVIEW_THUMBS_UP_PEOPLE_COUNT, i, Integer.valueOf(i)));
            return resources.getString(R.string.PLACE_QA_ACCESSIBILITY_QUESTION_THUMBS_UP_UNCHECKED_DESCRIPTION, objArr);
        }
        Resources resources3 = this.c;
        Object[] objArr2 = new Object[1];
        bjfq bjfqVar2 = this.d.c;
        if (bjfqVar2 == null) {
            bjfqVar2 = bjfq.g;
        }
        objArr2[0] = bjfqVar2.b;
        return resources3.getString(R.string.PLACE_QA_ACCESSIBILITY_QUESTION_THUMBS_UP_CHECKED_DESCRIPTION, objArr2);
    }

    @Override // defpackage.bjpf
    public boolean j() {
        dqjh b = dqjh.b(this.d.f);
        if (b == null) {
            b = dqjh.UNKNOWN_VOTE_TYPE;
        }
        return b == dqjh.THUMBS_UP;
    }

    @Override // defpackage.bjpf
    public cqkl k() {
        dqjh dqjhVar = dqjh.UNKNOWN_VOTE_TYPE;
        dqjh b = dqjh.b(this.d.f);
        if (b == null) {
            b = dqjh.UNKNOWN_VOTE_TYPE;
        }
        if (b.ordinal() == 1) {
            this.b.a(this.d, dqjh.THUMBS_VOTE_NONE);
        } else {
            this.b.a(this.d, dqjh.THUMBS_UP);
        }
        return cqkl.a;
    }

    @Override // defpackage.bjpf
    public boolean l() {
        bjfq bjfqVar = this.d.c;
        if (bjfqVar == null) {
            bjfqVar = bjfq.g;
        }
        return bjfqVar.d;
    }

    @Override // defpackage.bjpf
    public cjtd m() {
        return bjgr.d(this.a).b(dtxy.gA);
    }
}

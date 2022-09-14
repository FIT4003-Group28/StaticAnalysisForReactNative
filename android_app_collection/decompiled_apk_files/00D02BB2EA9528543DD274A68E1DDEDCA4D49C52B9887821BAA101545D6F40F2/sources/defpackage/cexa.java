package defpackage;

import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cexa  reason: default package */
/* loaded from: classes4.dex */
public class cexa implements cesx {
    static final cqtd a = cqrt.h(2131231716, cqrt.c(R.color.qu_blue_grey_400));
    public final gga b;
    public final eeu c;
    public final anhk d;
    public final bjbu e;
    public final djcb f;
    public final djbr g;
    public final cewt h;
    public final btzi<djaa, djae> i = new cewp(this);
    public final btzi<djar, djav> j = new cewq(this);
    public final btzi<dkez, dkfb> k = new cewr(this);
    private final begg l;
    private final jax m;
    private final jic n;
    private final boolean o;

    public cexa(gga ggaVar, eeu eeuVar, Executor executor, anhk anhkVar, bvff bvffVar, bvfk bvfkVar, bvfn bvfnVar, begg beggVar, bjbu bjbuVar, btvo btvoVar, jic jicVar, djcb djcbVar, boolean z, cewt cewtVar) {
        djby djbyVar;
        djbv djbvVar;
        djca djcaVar;
        this.b = ggaVar;
        this.c = eeuVar;
        this.d = anhkVar;
        this.l = beggVar;
        this.e = bjbuVar;
        this.n = jicVar;
        this.f = djcbVar;
        this.h = cewtVar;
        dkig dkigVar = btvoVar.getCreatorProfileParameters().g;
        this.o = (dkigVar == null ? dkig.b : dkigVar).a;
        int a2 = djbw.a(djcbVar.a);
        int i = a2 - 1;
        if (a2 == 0) {
            throw null;
        }
        if (i == 0) {
            if (djcbVar.a == 2) {
                djbyVar = (djby) djcbVar.b;
            } else {
                djbyVar = djby.c;
            }
            djbr djbrVar = djbyVar.a;
            this.g = djbrVar == null ? djbr.d : djbrVar;
        } else if (i == 1) {
            if (djcbVar.a == 3) {
                djbvVar = (djbv) djcbVar.b;
            } else {
                djbvVar = djbv.c;
            }
            djbr djbrVar2 = djbvVar.b;
            this.g = djbrVar2 == null ? djbr.d : djbrVar2;
        } else if (i == 2) {
            if (djcbVar.a == 5) {
                djcaVar = (djca) djcbVar.b;
            } else {
                djcaVar = djca.d;
            }
            djbr djbrVar3 = djcaVar.c;
            this.g = djbrVar3 == null ? djbr.d : djbrVar3;
        } else {
            this.g = djbr.d;
        }
        dvyw dvywVar = djcbVar.c;
        this.m = new cewz(this, bvfkVar, bvffVar, bvfnVar, executor, dvywVar == null ? dvyw.bv : dvywVar, z);
    }

    @Override // defpackage.cesx
    public jax a() {
        return this.m;
    }

    @Override // defpackage.cesx
    public jic b() {
        return this.n;
    }

    @Override // defpackage.cesx
    public Boolean c() {
        return Boolean.valueOf(this.f.a == 2);
    }

    @Override // defpackage.cesx
    public Boolean d() {
        return Boolean.valueOf(this.f.a == 3);
    }

    @Override // defpackage.cesx
    public Boolean e() {
        return Boolean.valueOf(this.f.a == 5);
    }

    @Override // defpackage.cesx
    public String f() {
        return this.f.d;
    }

    @Override // defpackage.cesx
    public String g() {
        String str;
        djca djcaVar;
        if (e().booleanValue()) {
            djcb djcbVar = this.f;
            if (djcbVar.a == 5) {
                djcaVar = (djca) djcbVar.b;
            } else {
                djcaVar = djca.d;
            }
            djbo djboVar = djcaVar.b;
            if (djboVar == null) {
                djboVar = djbo.c;
            }
            if (djboVar.b.isEmpty()) {
                return "";
            }
        }
        String valueOf = String.valueOf(this.b.getString(R.string.PLACE_QA_QUESTION_LABEL));
        if (this.g.a.isEmpty()) {
            str = this.b.getString(R.string.PLACE_QA_DELETED_QUESTION_PLACE_HOLDER_TEXT);
        } else {
            str = this.g.a;
        }
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    @Override // defpackage.cesx
    public String h() {
        djbv djbvVar;
        djbo djboVar;
        djby djbyVar;
        djca djcaVar;
        if (e().booleanValue()) {
            djcb djcbVar = this.f;
            if (djcbVar.a == 5) {
                djcaVar = (djca) djcbVar.b;
            } else {
                djcaVar = djca.d;
            }
            djbo djboVar2 = djcaVar.b;
            if (djboVar2 == null) {
                djboVar2 = djbo.c;
            }
            String valueOf = String.valueOf(this.b.getString(R.string.PLACE_QA_ANSWER_LABEL));
            String valueOf2 = String.valueOf((djboVar2.a & 1) != 0 ? djboVar2.b : this.b.getString(R.string.PLACE_QA_DELETED_ANSWER_PLACE_HOLDER_TEXT));
            return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        if (c().booleanValue()) {
            djcb djcbVar2 = this.f;
            if (djcbVar2.a == 2) {
                djbyVar = (djby) djcbVar2.b;
            } else {
                djbyVar = djby.c;
            }
            djboVar = djbyVar.b;
            if (djboVar == null) {
                djboVar = djbo.c;
            }
        } else {
            djcb djcbVar3 = this.f;
            if (djcbVar3.a == 3) {
                djbvVar = (djbv) djcbVar3.b;
            } else {
                djbvVar = djbv.c;
            }
            djboVar = djbvVar.a;
            if (djboVar == null) {
                djboVar = djbo.c;
            }
        }
        if ((djboVar.a & 1) == 0) {
            return "";
        }
        String valueOf3 = String.valueOf(this.b.getString(R.string.PLACE_QA_ANSWER_LABEL));
        String valueOf4 = String.valueOf(djboVar.b);
        return valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
    }

    @Override // defpackage.cesx
    public String i() {
        djca djcaVar;
        if (e().booleanValue()) {
            String valueOf = String.valueOf(this.b.getString(bdys.PLACE_QA_REPLY_LABEL));
            djcb djcbVar = this.f;
            if (djcbVar.a == 5) {
                djcaVar = (djca) djcbVar.b;
            } else {
                djcaVar = djca.d;
            }
            djbt djbtVar = djcaVar.a;
            if (djbtVar == null) {
                djbtVar = djbt.c;
            }
            String valueOf2 = String.valueOf(djbtVar.a);
            return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        return "";
    }

    @Override // defpackage.cesx
    public String j() {
        int i = this.g.c;
        if (i > 0) {
            return this.b.getString(R.string.PLACE_QA_SEE_ALL_ANSWERS, new Object[]{Integer.valueOf(i)});
        }
        return this.b.getString(R.string.PLACE_QA_SEE_THE_QUESTION);
    }

    @Override // defpackage.cesx
    public Boolean k() {
        boolean z = false;
        if (this.o) {
            dvyw dvywVar = this.f.c;
            if (dvywVar == null) {
                dvywVar = dvyw.bv;
            }
            if (!dvywVar.i.isEmpty() && !this.g.a.isEmpty()) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cesx
    public cqkl l() {
        if (!k().booleanValue()) {
            return cqkl.a;
        }
        ily ilyVar = new ily();
        dvyw dvywVar = this.f.c;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        ilyVar.k(dvywVar.g);
        this.l.p(ilyVar.d(), null, new cews(this));
        return cqkl.a;
    }

    public djcb m() {
        return this.f;
    }
}

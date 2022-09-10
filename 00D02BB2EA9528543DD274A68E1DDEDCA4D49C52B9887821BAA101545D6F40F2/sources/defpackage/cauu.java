package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cauu  reason: default package */
/* loaded from: classes4.dex */
public class cauu implements cafq {
    public final eeu a;
    public final bjbu b;
    public final anhk c;
    public final gga d;
    private final Resources e;
    private final begg f;
    private final djcb g;
    private final jic h;
    private final jax i;
    private boolean j;
    private final btzi<djaa, djae> k;
    private final btzi<djar, djav> l;
    private final btzi<dkez, dkfb> m;

    public cauu(gga ggaVar, Resources resources, begg beggVar, Executor executor, anhk anhkVar, bvff bvffVar, bvfk bvfkVar, bvfn bvfnVar, eeu eeuVar, bjbu bjbuVar, caux cauxVar, djcb djcbVar, jic jicVar, boolean z) {
        cauo cauoVar = new cauo(this);
        this.k = cauoVar;
        caup caupVar = new caup(this);
        this.l = caupVar;
        cauq cauqVar = new cauq(this);
        this.m = cauqVar;
        this.d = ggaVar;
        this.e = resources;
        this.f = beggVar;
        this.c = anhkVar;
        this.a = eeuVar;
        this.b = bjbuVar;
        this.g = djcbVar;
        this.h = jicVar;
        jay p = z ? p(ggaVar, bvfkVar, bvffVar, bvfnVar, caupVar, cauoVar, cauqVar, anhkVar, executor, djcbVar) : null;
        String q = z ? q(ggaVar, djcbVar) : "";
        dvyw dvywVar = djcbVar.c;
        dvywVar = dvywVar == null ? dvyw.bv : dvywVar;
        Resources a = cauxVar.a.a();
        caux.a(a, 1);
        caux.a(q, 3);
        caux.a(dvywVar, 4);
        this.i = new cauw(a, p, q, dvywVar);
    }

    @Override // defpackage.cafq
    public jax a() {
        return this.i;
    }

    @Override // defpackage.cafq
    public CharSequence b() {
        return n().c > 0 ? this.e.getString(R.string.PLACE_QA_SEE_ALL_ANSWERS, Integer.valueOf(n().c)) : this.e.getString(R.string.PLACE_QA_SEE_THE_QUESTION);
    }

    @Override // defpackage.cafq
    public cqkl c() {
        if (!j().booleanValue()) {
            return cqkl.a;
        }
        ily ilyVar = new ily();
        dvyw dvywVar = this.g.c;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        ilyVar.k(dvywVar.g);
        this.f.p(ilyVar.d(), null, new caur(this));
        return cqkl.a;
    }

    @Override // defpackage.cafq
    public String d() {
        djca djcaVar;
        if (i().booleanValue()) {
            djcb djcbVar = this.g;
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
        String str = n().a;
        String valueOf = String.valueOf(this.e.getString(R.string.PLACE_QA_QUESTION_LABEL));
        if (str.isEmpty()) {
            str = this.e.getString(R.string.PLACE_QA_DELETED_QUESTION_PLACE_HOLDER_TEXT);
        }
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    @Override // defpackage.cafq
    public String e() {
        djbv djbvVar;
        djbo djboVar;
        djby djbyVar;
        djca djcaVar;
        if (i().booleanValue()) {
            djcb djcbVar = this.g;
            if (djcbVar.a == 5) {
                djcaVar = (djca) djcbVar.b;
            } else {
                djcaVar = djca.d;
            }
            djbo djboVar2 = djcaVar.b;
            if (djboVar2 == null) {
                djboVar2 = djbo.c;
            }
            String valueOf = String.valueOf(this.d.getString(R.string.PLACE_QA_ANSWER_LABEL));
            String valueOf2 = String.valueOf((djboVar2.a & 1) != 0 ? djboVar2.b : this.d.getString(R.string.PLACE_QA_DELETED_ANSWER_PLACE_HOLDER_TEXT));
            return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        if (g().booleanValue()) {
            djcb djcbVar2 = this.g;
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
            djcb djcbVar3 = this.g;
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
        String valueOf3 = String.valueOf(this.d.getString(R.string.PLACE_QA_ANSWER_LABEL));
        String valueOf4 = String.valueOf(djboVar.b);
        return valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
    }

    @Override // defpackage.cafq
    public String f() {
        djca djcaVar;
        if (i().booleanValue()) {
            String valueOf = String.valueOf(this.e.getString(bdys.PLACE_QA_REPLY_LABEL));
            djcb djcbVar = this.g;
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

    @Override // defpackage.cafq
    public Boolean g() {
        return Boolean.valueOf(this.g.a == 2);
    }

    @Override // defpackage.cafq
    public Boolean h() {
        return Boolean.valueOf(this.g.a == 3);
    }

    @Override // defpackage.cafq
    public Boolean i() {
        return Boolean.valueOf(this.g.a == 5);
    }

    @Override // defpackage.cafq
    public Boolean j() {
        dvyw dvywVar = this.g.c;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        boolean z = true;
        if (dvywVar.i.isEmpty() || (!g().booleanValue() && n().a.isEmpty())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cafq
    public jic k() {
        return this.h;
    }

    @Override // defpackage.cafq
    public CharSequence l() {
        return this.g.d;
    }

    @Override // defpackage.cafq
    public Boolean m() {
        return Boolean.valueOf(this.j);
    }

    private static String q(gga ggaVar, djcb djcbVar) {
        djby djbyVar;
        djbv djbvVar;
        djca djcaVar;
        int a = djbw.a(djcbVar.a);
        int i = a - 1;
        if (a != 0) {
            if (i == 0) {
                Object[] objArr = new Object[1];
                if (djcbVar.a == 2) {
                    djbyVar = (djby) djcbVar.b;
                } else {
                    djbyVar = djby.c;
                }
                djbr djbrVar = djbyVar.a;
                if (djbrVar == null) {
                    djbrVar = djbr.d;
                }
                objArr[0] = djbrVar.a;
                return ggaVar.getString(R.string.PLACE_QA_ACCESSIBILITY_YOUR_QUESTION_OVERFLOW_MENU_DESCRIPTION, objArr);
            } else if (i == 1) {
                Object[] objArr2 = new Object[1];
                if (djcbVar.a == 3) {
                    djbvVar = (djbv) djcbVar.b;
                } else {
                    djbvVar = djbv.c;
                }
                djbo djboVar = djbvVar.a;
                if (djboVar == null) {
                    djboVar = djbo.c;
                }
                objArr2[0] = djboVar.b;
                return ggaVar.getString(R.string.PLACE_QA_ACCESSIBILITY_YOUR_ANSWER_OVERFLOW_MENU_DESCRIPTION, objArr2);
            } else if (i != 2) {
                return "";
            } else {
                int i2 = bdys.PLACE_QA_ACCESSIBILITY_YOUR_REPLY_OVERFLOW_MENU_DESCRIPTION;
                Object[] objArr3 = new Object[1];
                if (djcbVar.a == 5) {
                    djcaVar = (djca) djcbVar.b;
                } else {
                    djcaVar = djca.d;
                }
                djbt djbtVar = djcaVar.a;
                if (djbtVar == null) {
                    djbtVar = djbt.c;
                }
                objArr3[0] = djbtVar.a;
                return ggaVar.getString(i2, objArr3);
            }
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064 A[RETURN] */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.jay p(defpackage.gga r8, final defpackage.bvfk r9, final defpackage.bvff r10, final defpackage.bvfn r11, final defpackage.btzi<defpackage.djar, defpackage.djav> r12, final defpackage.btzi<defpackage.djaa, defpackage.djae> r13, final defpackage.btzi<defpackage.dkez, defpackage.dkfb> r14, final defpackage.anhk r15, final java.util.concurrent.Executor r16, final defpackage.djcb r17) {
        /*
            r3 = r17
            int r0 = r3.a
            int r0 = defpackage.djbw.a(r0)
            int r1 = r0 + (-1)
            r6 = 0
            if (r0 == 0) goto L65
            if (r1 == 0) goto L44
            r0 = 1
            if (r1 == r0) goto L2d
            r0 = 2
            if (r1 == r0) goto L1b
            java.lang.Runnable r0 = defpackage.caun.a
            cjtd r1 = defpackage.cjtd.b
            r2 = 0
            goto L5b
        L1b:
            caum r0 = new caum
            r1 = r11
            r2 = r14
            r5 = r16
            r0.<init>(r11, r3, r14, r5)
            int r2 = defpackage.bdys.PLACE_QA_DELETE_REPLY
            ddho r1 = defpackage.dtyd.cf
            cjtd r1 = defpackage.cjtd.a(r1)
            goto L5b
        L2d:
            r5 = r16
            caul r7 = new caul
            r0 = r7
            r1 = r10
            r2 = r15
            r3 = r17
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            ddho r0 = defpackage.dtyd.cd
            cjtd r1 = defpackage.cjtd.a(r0)
            r2 = 2131956460(0x7f1312ec, float:1.9549476E38)
            goto L5a
        L44:
            r5 = r16
            cauk r7 = new cauk
            r0 = r7
            r1 = r9
            r2 = r15
            r3 = r17
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            ddho r0 = defpackage.dtyd.ce
            cjtd r1 = defpackage.cjtd.a(r0)
            r2 = 2131956461(0x7f1312ed, float:1.9549478E38)
        L5a:
            r0 = r7
        L5b:
            if (r2 == 0) goto L64
            caut r3 = new caut
            r4 = r8
            r3.<init>(r8, r2, r0, r1)
            return r3
        L64:
            return r6
        L65:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cauu.p(gga, bvfk, bvff, bvfn, btzi, btzi, btzi, anhk, java.util.concurrent.Executor, djcb):jay");
    }

    public final djbr n() {
        djby djbyVar;
        djbv djbvVar;
        djca djcaVar;
        int a = djbw.a(this.g.a);
        int i = a - 1;
        if (a != 0) {
            if (i == 0) {
                djcb djcbVar = this.g;
                if (djcbVar.a == 2) {
                    djbyVar = (djby) djcbVar.b;
                } else {
                    djbyVar = djby.c;
                }
                djbr djbrVar = djbyVar.a;
                return djbrVar == null ? djbr.d : djbrVar;
            } else if (i == 1) {
                djcb djcbVar2 = this.g;
                if (djcbVar2.a == 3) {
                    djbvVar = (djbv) djcbVar2.b;
                } else {
                    djbvVar = djbv.c;
                }
                djbr djbrVar2 = djbvVar.b;
                return djbrVar2 == null ? djbr.d : djbrVar2;
            } else if (i == 2) {
                djcb djcbVar3 = this.g;
                if (djcbVar3.a == 5) {
                    djcaVar = (djca) djcbVar3.b;
                } else {
                    djcaVar = djca.d;
                }
                djbr djbrVar3 = djcaVar.c;
                return djbrVar3 == null ? djbr.d : djbrVar3;
            } else {
                return djbr.d;
            }
        }
        throw null;
    }
}

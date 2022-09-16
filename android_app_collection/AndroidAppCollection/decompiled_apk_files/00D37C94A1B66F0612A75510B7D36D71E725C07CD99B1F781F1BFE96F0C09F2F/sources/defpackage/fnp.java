package defpackage;

import java.security.InvalidParameterException;
/* compiled from: PG */
/* renamed from: fnp  reason: default package */
/* loaded from: classes3.dex */
public final class fnp {
    public final akqq a;
    public final afvn b;
    public final abcu c;
    public final acgf d;

    public fnp(akqq akqqVar, afvn afvnVar, abcu abcuVar, acgf acgfVar, byte[] bArr) {
        this.a = akqqVar;
        this.b = afvnVar;
        this.c = abcuVar;
        this.d = acgfVar;
    }

    public static final aurq c(abcn abcnVar) {
        aurh aurhVar;
        if (abcnVar != null) {
            for (Object obj : abcnVar.a()) {
                if (obj instanceof aurh) {
                    aurhVar = (aurh) obj;
                    int bh = awwc.bh(aurhVar.e);
                    if (bh != 0 && bh == 10050) {
                        break;
                    }
                }
            }
        }
        aurhVar = null;
        if (aurhVar == null) {
            return null;
        }
        for (auri auriVar : aurhVar.d) {
            aurq aurqVar = auriVar.i;
            if (aurqVar == null) {
                aurqVar = aurq.a;
            }
            int bf = awwc.bf(aurqVar.c);
            if (bf != 0 && bf == 344) {
                return aurqVar;
            }
        }
        return null;
    }

    public final ankt a(abcn abcnVar) {
        akqe b;
        aurq c = c(abcnVar);
        if (c != null) {
            if (this.b.t()) {
                b = akqe.a(this.b.c().d(), "search_namespace", "voice_language");
            } else {
                b = akqe.b("search_namespace", "voice_language");
            }
            return this.a.b(b, c, aeqk.b);
        }
        return anlz.p(new InvalidParameterException());
    }

    public final void b() {
        anii.i(anii.h(this.d.a.a(), fcq.p, anjk.a), new fno(this), anjk.a).qY(bhj.a, anjk.a);
    }
}

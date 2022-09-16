package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: meq  reason: default package */
/* loaded from: classes3.dex */
public final class meq {
    public final aoqu a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final boolean f;
    public final Optional g;
    public final Optional h;
    public final mep i;

    private meq(aoqu aoquVar, Optional optional, Optional optional2, Optional optional3, Optional optional4, boolean z, Optional optional5, mep mepVar, Optional optional6) {
        this.a = aoquVar;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
        this.e = optional4;
        this.f = z;
        this.g = optional5;
        mepVar.getClass();
        this.i = mepVar;
        this.h = optional6;
    }

    public static Optional a(atxn atxnVar) {
        atxnVar.getClass();
        int i = atxnVar.b;
        if (i != 117501096) {
            if (i == 318370163) {
                atxh atxhVar = (atxh) atxnVar.c;
                atxhVar.getClass();
                return Optional.of(new meq(atxhVar, Optional.empty(), b(atxhVar, jny.s, lhh.t), b(atxhVar, mem.b, meo.a), Optional.empty(), false, b(atxhVar, jny.t, meo.b), men.b, b(atxhVar, mem.a, meo.c)));
            }
            return Optional.empty();
        }
        atxk atxkVar = (atxk) atxnVar.c;
        atxkVar.getClass();
        Optional b = b(atxkVar, mem.h, lhh.s);
        Optional b2 = b(atxkVar, mem.c, meo.d);
        Optional b3 = b(atxkVar, mem.e, meo.f);
        Optional b4 = b(atxkVar, mem.g, lhh.r);
        atxj atxjVar = atxkVar.h;
        if (atxjVar == null) {
            atxjVar = atxj.a;
        }
        int ck = awwc.ck(atxjVar.b);
        boolean z = true;
        if (ck == 0 || ck != 2) {
            atxi atxiVar = atxkVar.i;
            if (atxiVar == null) {
                atxiVar = atxi.a;
            }
            if (atxiVar.b != 140810778) {
                atxi atxiVar2 = atxkVar.i;
                if (atxiVar2 == null) {
                    atxiVar2 = atxi.a;
                }
                if (atxiVar2.b != 318370164) {
                    z = false;
                }
            }
        }
        return Optional.of(new meq(atxkVar, b, b2, b3, b4, z, b(atxkVar, mem.d, meo.e), men.a, b(atxkVar, mem.f, meo.g)));
    }

    private static Optional b(Object obj, ampt amptVar, ampg ampgVar) {
        amptVar.getClass();
        ampgVar.getClass();
        return amptVar.a(obj) ? Optional.of(ampgVar.apply(obj)) : Optional.empty();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof meq) && this.a.equals(((meq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder("meq".length() + 2 + String.valueOf(valueOf).length());
        sb.append("meq");
        sb.append("{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

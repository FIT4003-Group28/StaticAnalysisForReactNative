package defpackage;
/* compiled from: PG */
/* renamed from: pfm  reason: default package */
/* loaded from: classes7.dex */
public final class pfm<V> {
    public final dfoc a;
    public final String b;
    public final dfoo c;
    public final ddyb d;
    public final V e;

    public pfm(dfoc dfocVar, String str, dfoo dfooVar, ddyb ddybVar, V v) {
        dzvx.c(dfocVar, "corpus");
        dzvx.c(str, "key");
        this.a = dfocVar;
        this.b = str;
        this.c = dfooVar;
        this.d = ddybVar;
        this.e = v;
    }

    public final dfok a(dspy<dfok, V> dspyVar) {
        dfoj dfojVar = (dfoj) dfok.f.bZ();
        dzvx.b(dfojVar, "signalBuilder");
        dfoc dfocVar = this.a;
        if (dfojVar.c) {
            dfojVar.bF();
            dfojVar.c = false;
        }
        dfok dfokVar = (dfok) dfojVar.b;
        dfocVar.getClass();
        dfokVar.b = dfocVar;
        int i = dfokVar.a | 1;
        dfokVar.a = i;
        String str = this.b;
        str.getClass();
        int i2 = i | 2;
        dfokVar.a = i2;
        dfokVar.c = str;
        dfoo dfooVar = this.c;
        if (dfooVar != null) {
            dfooVar.getClass();
            dfokVar.e = dfooVar;
            i2 |= 16;
            dfokVar.a = i2;
        }
        ddyb ddybVar = this.d;
        if (ddybVar != null) {
            ddybVar.getClass();
            dfokVar.d = ddybVar;
            dfokVar.a = i2 | 4;
        }
        V v = this.e;
        if (v != null) {
            dfojVar.k(dspyVar, v);
        }
        MessageType bK = dfojVar.bK();
        dzvx.b(bK, "signalBuilder.build()");
        return (dfok) bK;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof pfm)) {
                return false;
            }
            pfm pfmVar = (pfm) obj;
            return dzvx.d(this.a, pfmVar.a) && dzvx.d(this.b, pfmVar.b) && dzvx.d(this.c, pfmVar.c) && dzvx.d(this.d, pfmVar.d) && dzvx.d(this.e, pfmVar.e);
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        dfoc dfocVar = this.a;
        int i4 = 0;
        if (dfocVar != null) {
            i = dfocVar.bC;
            if (i == 0) {
                i = dsst.a.b(dfocVar).c(dfocVar);
                dfocVar.bC = i;
            }
        } else {
            i = 0;
        }
        int i5 = i * 31;
        String str = this.b;
        int hashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        dfoo dfooVar = this.c;
        if (dfooVar != null) {
            i2 = dfooVar.bC;
            if (i2 == 0) {
                i2 = dsst.a.b(dfooVar).c(dfooVar);
                dfooVar.bC = i2;
            }
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 31;
        ddyb ddybVar = this.d;
        if (ddybVar != null) {
            i3 = ddybVar.bC;
            if (i3 == 0) {
                i3 = dsst.a.b(ddybVar).c(ddybVar);
                ddybVar.bC = i3;
            }
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        V v = this.e;
        if (v != null) {
            i4 = v.hashCode();
        }
        return i7 + i4;
    }

    public final String toString() {
        return "SignalData(corpus=" + this.a + ", key=" + this.b + ", time=" + this.c + ", eventId=" + this.d + ", data=" + this.e + ")";
    }
}

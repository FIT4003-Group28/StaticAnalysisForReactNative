package defpackage;
/* compiled from: PG */
/* renamed from: axjk  reason: default package */
/* loaded from: classes3.dex */
public final class axjk {
    public final String a;
    public final dimq b;

    public axjk(String str, dimq dimqVar) {
        dzvx.c(str, "obfuscatedGaiaId");
        dzvx.c(dimqVar, "responseProto");
        this.a = str;
        this.b = dimqVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof axjk)) {
                return false;
            }
            axjk axjkVar = (axjk) obj;
            return dzvx.d(this.a, axjkVar.a) && dzvx.d(this.b, axjkVar.b);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        dimq dimqVar = this.b;
        if (dimqVar != null && (i = dimqVar.bC) == 0) {
            i = dsst.a.b(dimqVar).c(dimqVar);
            dimqVar.bC = i;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Response(obfuscatedGaiaId=" + this.a + ", responseProto=" + this.b + ")";
    }
}

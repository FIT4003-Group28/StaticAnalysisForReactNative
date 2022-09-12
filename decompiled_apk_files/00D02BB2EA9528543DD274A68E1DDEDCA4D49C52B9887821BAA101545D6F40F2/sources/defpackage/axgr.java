package defpackage;
/* compiled from: PG */
/* renamed from: axgr  reason: default package */
/* loaded from: classes3.dex */
public final class axgr {
    public final String a;
    public final ckij b;

    public axgr(String str, ckij ckijVar) {
        dzvx.c(str, "obfuscatedGaiaId");
        dzvx.c(ckijVar, "fetchReason");
        this.a = str;
        this.b = ckijVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof axgr)) {
                return false;
            }
            axgr axgrVar = (axgr) obj;
            return dzvx.d(this.a, axgrVar.a) && dzvx.d(this.b, axgrVar.b);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ckij ckijVar = this.b;
        if (ckijVar != null) {
            i = ckijVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "EntryToFetch(obfuscatedGaiaId=" + this.a + ", fetchReason=" + this.b + ")";
    }
}

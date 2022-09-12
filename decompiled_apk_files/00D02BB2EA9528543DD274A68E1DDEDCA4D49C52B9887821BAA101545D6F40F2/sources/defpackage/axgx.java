package defpackage;
/* compiled from: PG */
/* renamed from: axgx  reason: default package */
/* loaded from: classes3.dex */
public final class axgx extends axhd {
    public final String a;
    public final dqaw b;

    public axgx(String str, dqaw dqawVar) {
        dzvx.c(str, "targetUserObfuscatedGaiaId");
        dzvx.c(dqawVar, "followeeInfo");
        this.a = str;
        this.b = dqawVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof axgx)) {
                return false;
            }
            axgx axgxVar = (axgx) obj;
            return dzvx.d(this.a, axgxVar.a) && dzvx.d(this.b, axgxVar.b);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        dqaw dqawVar = this.b;
        if (dqawVar != null && (i = dqawVar.bC) == 0) {
            i = dsst.a.b(dqawVar).c(dqawVar);
            dqawVar.bC = i;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "UpdateFolloweeInfoEvent(targetUserObfuscatedGaiaId=" + this.a + ", followeeInfo=" + this.b + ")";
    }
}

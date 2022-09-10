package defpackage;
/* compiled from: PG */
/* renamed from: axha  reason: default package */
/* loaded from: classes3.dex */
public final class axha extends axhd {
    public final dqas a;

    public axha(dqas dqasVar) {
        dzvx.c(dqasVar, "selfContext");
        this.a = dqasVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof axha) && dzvx.d(this.a, ((axha) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        dqas dqasVar = this.a;
        if (dqasVar != null) {
            int i = dqasVar.bC;
            if (i != 0) {
                return i;
            }
            int c = dsst.a.b(dqasVar).c(dqasVar);
            dqasVar.bC = c;
            return c;
        }
        return 0;
    }

    public final String toString() {
        return "UpdateSelfContextEvent(selfContext=" + this.a + ")";
    }
}

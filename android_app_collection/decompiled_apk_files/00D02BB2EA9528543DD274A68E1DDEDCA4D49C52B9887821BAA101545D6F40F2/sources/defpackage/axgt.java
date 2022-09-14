package defpackage;
/* compiled from: PG */
/* renamed from: axgt  reason: default package */
/* loaded from: classes3.dex */
public final class axgt extends axgu {
    public final dida a;

    public axgt(dida didaVar) {
        dzvx.c(didaVar, "response");
        this.a = didaVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof axgt) && dzvx.d(this.a, ((axgt) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        dida didaVar = this.a;
        if (didaVar != null) {
            int i = didaVar.bC;
            if (i != 0) {
                return i;
            }
            int c = dsst.a.b(didaVar).c(didaVar);
            didaVar.bC = c;
            return c;
        }
        return 0;
    }

    public final String toString() {
        return "Success(response=" + this.a + ")";
    }
}

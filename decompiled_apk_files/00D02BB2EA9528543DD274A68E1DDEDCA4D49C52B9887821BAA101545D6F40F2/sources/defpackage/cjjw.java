package defpackage;
/* compiled from: PG */
/* renamed from: cjjw  reason: default package */
/* loaded from: classes4.dex */
public final class cjjw {
    public final cjjr a;
    public final dzvk<cjjr, cjiz, Integer, Integer, Integer> b;

    /* JADX WARN: Multi-variable type inference failed */
    public cjjw(cjjr cjjrVar, dzvk<? super cjjr, ? super cjiz, ? super Integer, ? super Integer, Integer> dzvkVar) {
        dzvx.c(cjjrVar, "themeValues");
        dzvx.c(dzvkVar, "desiredHPositioner");
        this.a = cjjrVar;
        this.b = dzvkVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof cjjw)) {
                return false;
            }
            cjjw cjjwVar = (cjjw) obj;
            return dzvx.d(this.a, cjjwVar.a) && dzvx.d(this.b, cjjwVar.b);
        }
        return true;
    }

    public final int hashCode() {
        cjjr cjjrVar = this.a;
        int i = 0;
        int hashCode = (cjjrVar != null ? cjjrVar.hashCode() : 0) * 31;
        dzvk<cjjr, cjiz, Integer, Integer, Integer> dzvkVar = this.b;
        if (dzvkVar != null) {
            i = dzvkVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Positioner(themeValues=" + this.a + ", desiredHPositioner=" + this.b + ")";
    }
}

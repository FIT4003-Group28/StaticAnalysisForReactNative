package defpackage;
/* compiled from: PG */
/* renamed from: pfo  reason: default package */
/* loaded from: classes7.dex */
public final class pfo<V> {
    public final pfm<V> a;
    public final pfn b;

    public pfo(pfm<V> pfmVar, pfn pfnVar) {
        dzvx.c(pfnVar, "type");
        this.a = pfmVar;
        this.b = pfnVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof pfo)) {
                return false;
            }
            pfo pfoVar = (pfo) obj;
            return dzvx.d(this.a, pfoVar.a) && dzvx.d(this.b, pfoVar.b);
        }
        return true;
    }

    public final int hashCode() {
        pfm<V> pfmVar = this.a;
        int i = 0;
        int hashCode = (pfmVar != null ? pfmVar.hashCode() : 0) * 31;
        pfn pfnVar = this.b;
        if (pfnVar != null) {
            i = pfnVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SignalEvent(signal=" + this.a + ", type=" + this.b + ")";
    }
}

package defpackage;

import defpackage.dssj;
/* compiled from: PG */
/* renamed from: csqb  reason: default package */
/* loaded from: classes5.dex */
public final class csqb<T extends dssj> extends csqc<T> {
    private final dtrw a;
    private final dspy<dtrw, T> b;

    public csqb(dtrw dtrwVar, dspy<dtrw, T> dspyVar) {
        if (dtrwVar != null) {
            this.a = dtrwVar;
            this.b = dspyVar;
            return;
        }
        throw new NullPointerException("Null moonLanderData");
    }

    @Override // defpackage.csqc
    public final dtrw b() {
        return this.a;
    }

    @Override // defpackage.csqc
    public final dspy<dtrw, T> c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof csqc) {
            csqc csqcVar = (csqc) obj;
            if (this.a.equals(csqcVar.b()) && this.b.equals(csqcVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        dtrw dtrwVar = this.a;
        int i = dtrwVar.bC;
        if (i == 0) {
            i = dsst.a.b(dtrwVar).c(dtrwVar);
            dtrwVar.bC = i;
        }
        return this.b.hashCode() ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55 + String.valueOf(valueOf2).length());
        sb.append("ProtoMoonLanderDataWrapper{moonLanderData=");
        sb.append(valueOf);
        sb.append(", extension=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

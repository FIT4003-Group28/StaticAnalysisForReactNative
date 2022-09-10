package defpackage;
/* compiled from: PG */
/* renamed from: aksv  reason: default package */
/* loaded from: classes.dex */
public final class aksv extends akvw {
    private final dmpn a;
    private final akqn b;

    public aksv(dmpn dmpnVar, akqn akqnVar) {
        if (dmpnVar != null) {
            this.a = dmpnVar;
            this.b = akqnVar;
            return;
        }
        throw new NullPointerException("Null renderOp");
    }

    @Override // defpackage.akvw
    public final dmpn a() {
        return this.a;
    }

    @Override // defpackage.akvw
    public final akqn b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akvw) {
            akvw akvwVar = (akvw) obj;
            if (this.a.equals(akvwVar.a()) && this.b.equals(akvwVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        dmpn dmpnVar = this.a;
        int i = dmpnVar.bC;
        if (i == 0) {
            i = dsst.a.b(dmpnVar).c(dmpnVar);
            dmpnVar.bC = i;
        }
        return this.b.hashCode() ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40 + String.valueOf(valueOf2).length());
        sb.append("LabelOpAndUnpacker{renderOp=");
        sb.append(valueOf);
        sb.append(", unpacker=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: bzcu  reason: default package */
/* loaded from: classes4.dex */
public final class bzcu extends bzdl {
    private final bzdg b;
    private final String c;
    private final eaow d;

    public bzcu(bzdg bzdgVar, String str, eaow eaowVar) {
        if (bzdgVar != null) {
            this.b = bzdgVar;
            if (str != null) {
                this.c = str;
                this.d = eaowVar;
                return;
            }
            throw new NullPointerException("Null destinationText");
        }
        throw new NullPointerException("Null stage");
    }

    @Override // defpackage.bzdh
    public final bzdg b() {
        return this.b;
    }

    @Override // defpackage.bzdh
    public final String d() {
        return this.c;
    }

    @Override // defpackage.bzdh
    public final eaow e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzdl) {
            bzdl bzdlVar = (bzdl) obj;
            if (this.b.equals(bzdlVar.b()) && this.c.equals(bzdlVar.d()) && this.d.equals(bzdlVar.e()) && !bzdlVar.o()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237;
    }

    @Override // defpackage.bzdh
    public final boolean o() {
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String str = this.c;
        String valueOf2 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 91 + str.length() + String.valueOf(valueOf2).length());
        sb.append("WaitingToBoardState{stage=");
        sb.append(valueOf);
        sb.append(", destinationText=");
        sb.append(str);
        sb.append(", remainingDuration=");
        sb.append(valueOf2);
        sb.append(", toFinalDestination=");
        sb.append(false);
        sb.append("}");
        return sb.toString();
    }
}

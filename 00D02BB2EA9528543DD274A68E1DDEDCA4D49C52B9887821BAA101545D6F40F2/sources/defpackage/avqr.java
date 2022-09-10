package defpackage;
/* compiled from: PG */
/* renamed from: avqr  reason: default package */
/* loaded from: classes3.dex */
public final class avqr extends avrb {
    public final avkh a;
    public final dlsw b;
    public final int c;
    public final int d;

    public avqr(avkh avkhVar, dlsw dlswVar, int i, int i2) {
        if (avkhVar != null) {
            this.a = avkhVar;
            if (dlswVar != null) {
                this.b = dlswVar;
                this.d = i;
                this.c = i2;
                return;
            }
            throw new NullPointerException("Null owner");
        }
        throw new NullPointerException("Null updateOptions");
    }

    @Override // defpackage.avrb
    public final avkh a() {
        return this.a;
    }

    @Override // defpackage.avrb
    public final dlsw b() {
        return this.b;
    }

    @Override // defpackage.avrb
    public final int c() {
        return this.c;
    }

    @Override // defpackage.avrb
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof avrb) {
            avrb avrbVar = (avrb) obj;
            if (this.a.equals(avrbVar.a()) && this.b.equals(avrbVar.b()) && this.d == avrbVar.d() && this.c == avrbVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        dlsw dlswVar = this.b;
        int i = dlswVar.bC;
        if (i == 0) {
            i = dsst.a.b(dlswVar).c(dlswVar);
            dlswVar.bC = i;
        }
        return ((((hashCode ^ i) * 1000003) ^ this.d) * 1000003) ^ this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(Integer.toString(this.d - 1));
        int i = this.c;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 95 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("FetchParams{updateOptions=");
        sb.append(valueOf);
        sb.append(", owner=");
        sb.append(valueOf2);
        sb.append(", downloadConnectivityRequirement=");
        sb.append(valueOf3);
        sb.append(", retryAttempt=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}

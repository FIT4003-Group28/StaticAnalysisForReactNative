package defpackage;
/* compiled from: PG */
/* renamed from: vwp  reason: default package */
/* loaded from: classes7.dex */
public final class vwp extends vwt {
    private final dgaw a;
    private final dgaw b;
    private final dpbw c;

    public vwp(@dzsi dgaw dgawVar, @dzsi dgaw dgawVar2, dpbw dpbwVar) {
        this.a = dgawVar;
        this.b = dgawVar2;
        if (dpbwVar != null) {
            this.c = dpbwVar;
            return;
        }
        throw new NullPointerException("Null realtimeStatus");
    }

    @Override // defpackage.vwt
    @dzsi
    public final dgaw a() {
        return this.a;
    }

    @Override // defpackage.vwt
    @dzsi
    public final dgaw b() {
        return this.b;
    }

    @Override // defpackage.vwt
    public final dpbw c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vwt) {
            vwt vwtVar = (vwt) obj;
            dgaw dgawVar = this.a;
            if (dgawVar != null ? dgawVar.equals(vwtVar.a()) : vwtVar.a() == null) {
                dgaw dgawVar2 = this.b;
                if (dgawVar2 != null ? dgawVar2.equals(vwtVar.b()) : vwtVar.b() == null) {
                    if (this.c.equals(vwtVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("DepartureData{time=");
        sb.append(valueOf);
        sb.append(", scheduledTime=");
        sb.append(valueOf2);
        sb.append(", realtimeStatus=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i;
        dgaw dgawVar = this.a;
        int i2 = 0;
        if (dgawVar == null) {
            i = 0;
        } else {
            i = dgawVar.bC;
            if (i == 0) {
                i = dsst.a.b(dgawVar).c(dgawVar);
                dgawVar.bC = i;
            }
        }
        int i3 = (i ^ 1000003) * 1000003;
        dgaw dgawVar2 = this.b;
        if (dgawVar2 != null && (i2 = dgawVar2.bC) == 0) {
            i2 = dsst.a.b(dgawVar2).c(dgawVar2);
            dgawVar2.bC = i2;
        }
        return this.c.hashCode() ^ ((i2 ^ i3) * 1000003);
    }
}

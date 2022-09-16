package defpackage;
/* compiled from: PG */
/* renamed from: amsn  reason: default package */
/* loaded from: classes2.dex */
public final class amsn extends amuh {
    public final int a;
    private final dcdc<amub> c;
    private final dqvj d;

    public amsn(dcdc<amub> dcdcVar, int i, @dzsi dqvj dqvjVar) {
        if (dcdcVar != null) {
            this.c = dcdcVar;
            this.a = i;
            this.d = dqvjVar;
            return;
        }
        throw new NullPointerException("Null routes");
    }

    @Override // defpackage.amuh
    public final dcdc<amub> a() {
        return this.c;
    }

    @Override // defpackage.amuh
    public final int b() {
        return this.a;
    }

    @Override // defpackage.amuh
    @dzsi
    public final dqvj c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        dqvj dqvjVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof amuh) {
            amuh amuhVar = (amuh) obj;
            if (dchl.m(this.c, amuhVar.a()) && this.a == amuhVar.b() && ((dqvjVar = this.d) != null ? dqvjVar.equals(amuhVar.c()) : amuhVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.c.hashCode() ^ 1000003) * 1000003) ^ this.a) * 1000003;
        dqvj dqvjVar = this.d;
        return hashCode ^ (dqvjVar == null ? 0 : dqvjVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        int i = this.a;
        String valueOf2 = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71 + String.valueOf(valueOf2).length());
        sb.append("RouteList{routes=");
        sb.append(valueOf);
        sb.append(", getSelectedIndex=");
        sb.append(i);
        sb.append(", getDisplayTravelMode=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

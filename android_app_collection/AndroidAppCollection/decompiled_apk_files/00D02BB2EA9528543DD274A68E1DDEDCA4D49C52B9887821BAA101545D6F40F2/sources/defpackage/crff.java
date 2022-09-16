package defpackage;
/* compiled from: PG */
/* renamed from: crff  reason: default package */
/* loaded from: classes5.dex */
public final class crff extends crfk {
    public final String a;
    public final dspd b;

    public crff(String str, @dzsi dspd dspdVar) {
        if (str != null) {
            this.a = str;
            this.b = dspdVar;
            return;
        }
        throw new NullPointerException("Null text");
    }

    @Override // defpackage.crfk
    public final String a() {
        return this.a;
    }

    @Override // defpackage.crfk
    @dzsi
    public final dspd b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        dspd dspdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof crfk) {
            crfk crfkVar = (crfk) obj;
            if (this.a.equals(crfkVar.a()) && ((dspdVar = this.b) != null ? dspdVar.equals(crfkVar.b()) : crfkVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        dspd dspdVar = this.b;
        return hashCode ^ (dspdVar == null ? 0 : dspdVar.hashCode());
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: dcsl  reason: default package */
/* loaded from: classes.dex */
public final class dcsl {
    public final dcuf a;
    public final String b;

    public dcsl(dcuf dcufVar, String str) {
        dcuj.a(dcufVar, "parser");
        this.a = dcufVar;
        dcuj.a(str, "message");
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dcsl) {
            dcsl dcslVar = (dcsl) obj;
            if (this.a.equals(dcslVar.a) && this.b.equals(dcslVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}

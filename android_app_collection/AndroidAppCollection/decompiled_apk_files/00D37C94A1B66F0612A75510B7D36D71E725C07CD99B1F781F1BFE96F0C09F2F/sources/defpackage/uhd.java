package defpackage;
/* compiled from: PG */
/* renamed from: uhd  reason: default package */
/* loaded from: classes4.dex */
public final class uhd {
    public final String a;
    public final boolean b;

    public uhd() {
    }

    public uhd(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final aois a() {
        aopa createBuilder = aois.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        aois aoisVar = (aois) createBuilder.instance;
        str.getClass();
        aoisVar.b |= 1;
        aoisVar.c = str;
        int i = true != this.b ? 2 : 3;
        createBuilder.copyOnWrite();
        aois aoisVar2 = (aois) createBuilder.instance;
        aoisVar2.d = i - 1;
        aoisVar2.b |= 2;
        return (aois) createBuilder.mo39build();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uhd) {
            uhd uhdVar = (uhd) obj;
            if (this.a.equals(uhdVar.a) && this.b == uhdVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 49);
        sb.append("ChimeNotificationChannelGroup{id=");
        sb.append(str);
        sb.append(", blocked=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

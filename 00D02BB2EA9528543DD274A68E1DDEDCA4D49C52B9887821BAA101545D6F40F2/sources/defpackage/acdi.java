package defpackage;
/* compiled from: PG */
/* renamed from: acdi  reason: default package */
/* loaded from: classes2.dex */
final class acdi extends acdk {
    public final aktd a;
    private final dcdc<akuh> b;
    private final int c;

    public acdi(dcdc<akuh> dcdcVar, aktd aktdVar, int i) {
        if (dcdcVar != null) {
            this.b = dcdcVar;
            if (aktdVar != null) {
                this.a = aktdVar;
                this.c = i;
                return;
            }
            throw new NullPointerException("Null clientLabel");
        }
        throw new NullPointerException("Null mapStyles");
    }

    @Override // defpackage.acdk
    public final dcdc<akuh> a() {
        return this.b;
    }

    @Override // defpackage.acdk
    public final aktd b() {
        return this.a;
    }

    @Override // defpackage.acdk
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acdk) {
            acdk acdkVar = (acdk) obj;
            if (dchl.m(this.b, acdkVar.a()) && this.a.equals(acdkVar.b()) && this.c == acdkVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        int i = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 66 + String.valueOf(valueOf2).length());
        sb.append("ClientClusterLabel{mapStyles=");
        sb.append(valueOf);
        sb.append(", clientLabel=");
        sb.append(valueOf2);
        sb.append(", priority=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}

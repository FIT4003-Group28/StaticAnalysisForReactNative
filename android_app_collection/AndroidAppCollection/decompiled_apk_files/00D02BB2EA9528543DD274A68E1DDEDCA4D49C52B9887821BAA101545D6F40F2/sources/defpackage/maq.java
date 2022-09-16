package defpackage;
/* compiled from: PG */
/* renamed from: maq  reason: default package */
/* loaded from: classes7.dex */
final class maq extends mby {
    private final aktc a;
    private final atzd b;
    private final int c;

    public maq(aktc aktcVar, atzd atzdVar, int i) {
        if (aktcVar != null) {
            this.a = aktcVar;
            this.b = atzdVar;
            this.c = i;
            return;
        }
        throw new NullPointerException("Null callout");
    }

    @Override // defpackage.mby
    public final aktc a() {
        return this.a;
    }

    @Override // defpackage.mby
    public final atzd b() {
        return this.b;
    }

    @Override // defpackage.mby
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mby) {
            mby mbyVar = (mby) obj;
            if (this.a.equals(mbyVar.a()) && this.b.equals(mbyVar.b()) && this.c == mbyVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 60 + String.valueOf(valueOf2).length());
        sb.append("CalloutAndInfo{callout=");
        sb.append(valueOf);
        sb.append(", calloutInfo=");
        sb.append(valueOf2);
        sb.append(", priority=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}

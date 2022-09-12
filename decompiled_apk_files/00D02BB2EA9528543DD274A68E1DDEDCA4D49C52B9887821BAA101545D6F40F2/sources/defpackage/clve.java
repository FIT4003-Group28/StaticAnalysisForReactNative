package defpackage;
/* compiled from: PG */
/* renamed from: clve  reason: default package */
/* loaded from: classes5.dex */
public final class clve {
    public final clvh a;
    public final clvh b;

    public clve(clvh clvhVar, clvh clvhVar2) {
        this.a = clvhVar;
        this.b = clvhVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            clve clveVar = (clve) obj;
            if (this.a.equals(clveVar.a) && this.b.equals(clveVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        String sb;
        String valueOf = String.valueOf(this.a);
        if (this.a.equals(this.b)) {
            sb = "";
        } else {
            String valueOf2 = String.valueOf(this.b);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 2);
            sb2.append(", ");
            sb2.append(valueOf2);
            sb = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(sb).length());
        sb3.append("[");
        sb3.append(valueOf);
        sb3.append(sb);
        sb3.append("]");
        return sb3.toString();
    }
}

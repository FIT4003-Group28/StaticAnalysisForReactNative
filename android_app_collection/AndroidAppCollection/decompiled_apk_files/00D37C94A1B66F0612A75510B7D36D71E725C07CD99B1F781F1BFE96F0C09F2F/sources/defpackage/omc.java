package defpackage;
/* compiled from: PG */
/* renamed from: omc  reason: default package */
/* loaded from: classes3.dex */
public final class omc {
    public final boolean a;

    public omc() {
    }

    public omc(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof omc) && this.a == ((omc) obj).a;
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(33);
        sb.append("ActivityArguments{forcedOn=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

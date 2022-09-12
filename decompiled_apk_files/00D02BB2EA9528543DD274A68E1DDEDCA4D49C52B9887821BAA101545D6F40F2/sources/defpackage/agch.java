package defpackage;
/* compiled from: PG */
/* renamed from: agch  reason: default package */
/* loaded from: classes2.dex */
public final class agch extends agmk {
    private final boolean a;

    public agch(boolean z) {
        this.a = z;
    }

    @Override // defpackage.agmk
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof agmk) && this.a == ((agmk) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Options{useFixedLayoutHeight=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

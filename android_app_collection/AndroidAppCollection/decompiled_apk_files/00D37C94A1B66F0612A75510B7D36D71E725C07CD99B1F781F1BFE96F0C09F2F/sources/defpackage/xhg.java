package defpackage;
/* compiled from: PG */
/* renamed from: xhg  reason: default package */
/* loaded from: classes4.dex */
public final class xhg {
    public final boolean a;

    public xhg() {
    }

    public xhg(boolean z) {
        this.a = z;
    }

    public static xhf a() {
        xhf xhfVar = new xhf();
        xhfVar.b(false);
        return xhfVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof xhg) && this.a == ((xhg) obj).a;
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(39);
        sb.append("MdxAdOverlayState{remotePlayback=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

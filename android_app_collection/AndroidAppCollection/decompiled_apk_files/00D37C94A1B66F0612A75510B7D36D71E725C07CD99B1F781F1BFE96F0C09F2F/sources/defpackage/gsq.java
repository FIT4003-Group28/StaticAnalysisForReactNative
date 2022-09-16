package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: gsq  reason: default package */
/* loaded from: classes3.dex */
public final class gsq {
    static final gsq a = new gsq(false, 0, null);
    static final gsq b = a(2, "Action not supported");
    static final gsq c = a(4, "Required premium account to perform action in background");
    public final boolean d;
    public final int e;
    public final String f;

    private gsq(boolean z, int i, String str) {
        this.d = z;
        this.e = i;
        this.f = str;
    }

    public static gsq a(int i, String str) {
        return new gsq(true, i, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            gsq gsqVar = (gsq) obj;
            if (this.d == gsqVar.d && this.e == gsqVar.e && akzj.f(this.f, gsqVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.d), Integer.valueOf(this.e), this.f});
    }

    public final String toString() {
        if (!this.d) {
            return "MediaSessionResult Successful";
        }
        int i = this.e;
        String str = this.f;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
        sb.append("MediaSessionResult Error: ");
        sb.append(i);
        sb.append(" : ");
        sb.append(str);
        return sb.toString();
    }
}

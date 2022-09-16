package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: azoo  reason: default package */
/* loaded from: classes2.dex */
public final class azoo implements Serializable {
    private static final long serialVersionUID = -8759979445933046293L;
    public final Throwable a;

    public azoo(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof azoo) {
            return ayrd.a(this.a, ((azoo) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("NotificationLite.Error[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}

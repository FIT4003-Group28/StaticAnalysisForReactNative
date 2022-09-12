package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dzfq  reason: default package */
/* loaded from: classes6.dex */
public final class dzfq implements Serializable {
    private static final long serialVersionUID = -8759979445933046293L;
    public final Throwable a;

    public dzfq(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzfq) {
            Throwable th = this.a;
            Throwable th2 = ((dzfq) obj).a;
            return th == th2 || (th != null && th.equals(th2));
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

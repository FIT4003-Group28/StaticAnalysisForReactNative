package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dzfp  reason: default package */
/* loaded from: classes6.dex */
final class dzfp implements Serializable {
    private static final long serialVersionUID = -7482590109178395495L;
    final dzak a;

    public dzfp(dzak dzakVar) {
        this.a = dzakVar;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("NotificationLite.Disposable[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}

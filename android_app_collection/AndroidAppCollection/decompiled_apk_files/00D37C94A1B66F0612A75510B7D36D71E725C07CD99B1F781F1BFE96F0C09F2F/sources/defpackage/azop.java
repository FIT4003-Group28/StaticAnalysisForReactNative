package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: azop  reason: default package */
/* loaded from: classes2.dex */
final class azop implements Serializable {
    private static final long serialVersionUID = -1322257508628817540L;
    final bamf a;

    public azop(bamf bamfVar) {
        this.a = bamfVar;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("NotificationLite.Subscription[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}

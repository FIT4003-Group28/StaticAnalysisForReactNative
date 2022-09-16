package defpackage;

import android.widget.RemoteViews;
/* compiled from: PG */
/* renamed from: cgso  reason: default package */
/* loaded from: classes4.dex */
final class cgso extends cgtd {
    private final RemoteViews a;
    private final RemoteViews b;

    public cgso(RemoteViews remoteViews, RemoteViews remoteViews2) {
        this.a = remoteViews;
        if (remoteViews2 != null) {
            this.b = remoteViews2;
            return;
        }
        throw new NullPointerException("Null expanded");
    }

    @Override // defpackage.cgtd
    public final RemoteViews a() {
        return this.a;
    }

    @Override // defpackage.cgtd
    public final RemoteViews b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgtd) {
            cgtd cgtdVar = (cgtd) obj;
            if (this.a.equals(cgtdVar.a()) && this.b.equals(cgtdVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39 + String.valueOf(valueOf2).length());
        sb.append("NotificationData{collapsed=");
        sb.append(valueOf);
        sb.append(", expanded=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

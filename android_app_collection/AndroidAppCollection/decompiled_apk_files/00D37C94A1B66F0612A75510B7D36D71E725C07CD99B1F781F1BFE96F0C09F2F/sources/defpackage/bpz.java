package defpackage;

import android.app.Notification;
/* compiled from: PG */
/* renamed from: bpz  reason: default package */
/* loaded from: classes2.dex */
public final class bpz {
    public final int a;
    public final int b;
    public final Notification c;

    public bpz(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bpz bpzVar = (bpz) obj;
        if (this.a != bpzVar.a || this.b != bpzVar.b) {
            return false;
        }
        return this.c.equals(bpzVar.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}

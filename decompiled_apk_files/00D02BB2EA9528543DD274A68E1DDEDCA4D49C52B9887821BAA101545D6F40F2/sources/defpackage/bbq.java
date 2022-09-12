package defpackage;

import android.app.Notification;
/* compiled from: PG */
/* renamed from: bbq  reason: default package */
/* loaded from: classes3.dex */
public final class bbq {
    public final int a;
    public final int b;
    public final Notification c;

    public bbq(int i, Notification notification, int i2) {
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
        bbq bbqVar = (bbq) obj;
        if (this.a != bbqVar.a || this.b != bbqVar.b) {
            return false;
        }
        return this.c.equals(bbqVar.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}

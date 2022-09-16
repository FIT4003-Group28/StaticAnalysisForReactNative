package defpackage;

import android.app.Notification;
/* compiled from: PG */
/* renamed from: fh  reason: default package */
/* loaded from: classes3.dex */
public final class fh extends fk {
    private CharSequence a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fk
    public final String a() {
        return "android.support.v4.app.NotificationCompat$BigTextStyle";
    }

    @Override // defpackage.fk
    public final void b(fd fdVar) {
        Notification.BigTextStyle bigText = new Notification.BigTextStyle(((fl) fdVar).b).setBigContentTitle(this.c).bigText(this.a);
        if (this.e) {
            bigText.setSummaryText(this.d);
        }
    }

    public final void c(CharSequence charSequence) {
        this.a = fi.d(charSequence);
    }

    public final void d(CharSequence charSequence) {
        this.c = fi.d(charSequence);
    }
}

package defpackage;

import android.app.Notification;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: fj  reason: default package */
/* loaded from: classes3.dex */
public final class fj extends fk {
    private final ArrayList a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fk
    public final String a() {
        return "android.support.v4.app.NotificationCompat$InboxStyle";
    }

    @Override // defpackage.fk
    public final void b(fd fdVar) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(((fl) fdVar).b).setBigContentTitle(this.c);
        if (this.e) {
            bigContentTitle.setSummaryText(this.d);
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bigContentTitle.addLine((CharSequence) arrayList.get(i));
        }
    }

    public final void c(CharSequence charSequence) {
        if (charSequence != null) {
            this.a.add(fi.d(charSequence));
        }
    }
}

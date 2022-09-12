package defpackage;

import android.app.Application;
import android.app.NotificationManager;
/* compiled from: PG */
/* renamed from: aukh  reason: default package */
/* loaded from: classes.dex */
final class aukh implements dbty<NotificationManager> {
    final /* synthetic */ Application a;

    public aukh(Application application) {
        this.a = application;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ NotificationManager a() {
        return (NotificationManager) this.a.getSystemService("notification");
    }
}

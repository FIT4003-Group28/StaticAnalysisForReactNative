package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: bzcf  reason: default package */
/* loaded from: classes4.dex */
public final class bzcf implements bzch {
    private static final String b = String.valueOf(bzcf.class.getCanonicalName()).concat(".ACTION");
    protected final Service a;
    private final auhi c;

    public bzcf(Service service, auhi auhiVar) {
        this.a = service;
        this.c = auhiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Service service) {
        ((AlarmManager) service.getSystemService("alarm")).cancel(d(service));
        service.stopSelf();
    }

    public static PendingIntent d(Service service) {
        return PendingIntent.getService(service, 0, new Intent(b, Uri.EMPTY, service, service.getClass()), 134217728);
    }

    @Override // defpackage.bzch
    public final void a(Intent intent) {
        this.c.m(dpyv.TRANSIT_GUIDANCE.dm);
        this.a.stopSelf();
    }

    @Override // defpackage.bzch
    public final boolean b(Intent intent) {
        return b.equals(intent.getAction());
    }
}

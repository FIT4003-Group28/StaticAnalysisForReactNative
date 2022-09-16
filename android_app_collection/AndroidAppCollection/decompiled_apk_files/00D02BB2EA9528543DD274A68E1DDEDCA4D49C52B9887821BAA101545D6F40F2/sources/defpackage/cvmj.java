package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cvmj  reason: default package */
/* loaded from: classes5.dex */
public final class cvmj implements cvle {
    public final cvki a;
    public final cvnp b;
    private final cvkf c;
    private final cvmg d;
    private final cqat e;

    public cvmj(cvki cvkiVar, cvkf cvkfVar, cvmg cvmgVar, cvnp cvnpVar, cqat cqatVar) {
        this.a = cvkiVar;
        this.c = cvkfVar;
        this.d = cvmgVar;
        this.b = cvnpVar;
        this.e = cqatVar;
    }

    @Override // defpackage.cvle
    public final String c() {
        return "ON_NOTIFICATION_RECEIVED";
    }

    @Override // defpackage.cvle
    public final cviw d(Bundle bundle) {
        cvkc b;
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        long j = bundle.getLong("com.google.android.libraries.notifications.DELIVERED_TIMESTAMP");
        if (!TextUtils.isEmpty(string)) {
            try {
                b = this.c.b(string);
            } catch (cvke e) {
                return cviw.c(e);
            }
        } else {
            b = null;
        }
        List<cvkh> b2 = this.a.b(string, 5);
        ArrayList arrayList = new ArrayList();
        for (cvkh cvkhVar : b2) {
            try {
                arrayList.add((dscr) dsqw.cq(dscr.o, cvkhVar.c()));
            } catch (dsrm unused) {
                cvlw.e("OnNotificationReceivedHandler", "Unable to parse FrontendNotificationThread message", new Object[0]);
            }
        }
        this.a.c(string, b2);
        cvlq cvlqVar = new cvlq(Long.valueOf(j), drvb.SCHEDULED_RECEIVER);
        cvlqVar.h = Long.valueOf(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
        this.d.a(b, arrayList, cvix.d(), cvlqVar);
        return cviw.a;
    }
}

package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ufi  reason: default package */
/* loaded from: classes4.dex */
public final class ufi implements ujj {
    public final ucv a;
    public final ujk b;
    private final ucs c;
    private final uff d;
    private final snc e;

    public ufi(ucv ucvVar, ucs ucsVar, uff uffVar, ujk ujkVar, snc sncVar) {
        this.a = ucvVar;
        this.c = ucsVar;
        this.d = uffVar;
        this.b = ujkVar;
        this.e = sncVar;
    }

    @Override // defpackage.ujj
    public final /* synthetic */ long d() {
        return 0L;
    }

    @Override // defpackage.ujj
    public final uby e(Bundle bundle) {
        ucp b;
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        long j = bundle.getLong("com.google.android.libraries.notifications.DELIVERED_TIMESTAMP");
        boolean z = bundle.getInt("com.google.android.libraries.notifications.MUTE_NOTIFICATION") == 1;
        if (!TextUtils.isEmpty(string)) {
            try {
                b = this.c.b(string);
            } catch (ucr e) {
                return uby.a(e);
            }
        } else {
            b = null;
        }
        ucp ucpVar = b;
        List<ucu> b2 = this.a.b(string, 5);
        ArrayList arrayList = new ArrayList();
        for (ucu ucuVar : b2) {
            try {
                arrayList.add((aomd) aopi.parseFrom(aomd.a, ucuVar.b));
            } catch (aopx e2) {
                uev.c("OnNotificationReceivedHandler", e2, "Unable to parse FrontendNotificationThread message", new Object[0]);
            }
        }
        this.a.d(string, b2);
        this.d.a(ucpVar, arrayList, ubz.b(), new uer(Long.valueOf(j), Long.valueOf(this.e.d()), aojh.SCHEDULED_RECEIVER), z);
        return uby.a;
    }

    @Override // defpackage.ujj
    public final String f() {
        return "ON_NOTIFICATION_RECEIVED";
    }

    @Override // defpackage.ujj
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // defpackage.ujj
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.ujj
    public final /* synthetic */ void i() {
    }
}

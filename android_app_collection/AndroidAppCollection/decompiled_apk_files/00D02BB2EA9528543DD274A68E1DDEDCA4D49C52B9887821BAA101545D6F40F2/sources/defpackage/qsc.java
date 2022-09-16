package defpackage;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
/* compiled from: PG */
/* renamed from: qsc  reason: default package */
/* loaded from: classes7.dex */
public class qsc {
    public static final eaow a = eaow.c(10);
    public final AlarmManager b;
    private final Application c;
    private final cqat d;

    public qsc(Application application, cqat cqatVar) {
        this.c = application;
        this.d = cqatVar;
        this.b = (AlarmManager) application.getSystemService("alarm");
    }

    public final boolean a(int i, eapd eapdVar, eaow eaowVar, @dzsi qco qcoVar) {
        eapd f = eapdVar.f(eaowVar);
        if (f.J(this.d.b())) {
            return false;
        }
        PendingIntent b = b(i, eapdVar, qcoVar);
        if (Build.VERSION.SDK_INT >= 23) {
            this.b.setExactAndAllowWhileIdle(0, f.a, b);
            return true;
        }
        this.b.setExact(0, f.a, b);
        return true;
    }

    public final PendingIntent b(int i, @dzsi eapd eapdVar, @dzsi qco qcoVar) {
        Intent action = new Intent(this.c, qrz.class).setAction(qsb.a);
        String valueOf = String.valueOf(Integer.valueOf(i));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("departurealarm://");
        sb.append(valueOf);
        Intent data = action.setData(Uri.parse(sb.toString()));
        if (eapdVar != null) {
            data.putExtra(qsb.b, eapdVar.a);
        }
        if (qcoVar != null) {
            data.putExtras(qcoVar.j());
        }
        return PendingIntent.getBroadcast(this.c, 0, data, 134217728);
    }
}

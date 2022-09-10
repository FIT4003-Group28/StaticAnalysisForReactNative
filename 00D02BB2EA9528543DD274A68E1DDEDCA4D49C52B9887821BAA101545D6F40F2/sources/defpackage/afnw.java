package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: afnw  reason: default package */
/* loaded from: classes2.dex */
public final class afnw implements afks {
    private final afme a;

    public afnw(afme afmeVar) {
        dbsk.s(afmeVar);
        this.a = afmeVar;
    }

    @Override // defpackage.afks
    public final durz b() {
        return durz.EIT_REPORT_A_PROBLEM;
    }

    @Override // defpackage.afks
    public final Runnable a(@dzsi Intent intent, duqp duqpVar) {
        int intExtra;
        if ((duqpVar.a & 8) == 0) {
            throw new afkt("No place details request present.");
        }
        afme afmeVar = this.a;
        dvzj dvzjVar = duqpVar.e;
        if (dvzjVar == null) {
            dvzjVar = dvzj.y;
        }
        dvzj dvzjVar2 = dvzjVar;
        durp durpVar = duqpVar.u;
        if (durpVar == null) {
            durpVar = durp.b;
        }
        durp durpVar2 = durpVar;
        if (intent == null) {
            intExtra = dpyv.UNKNOWN_NOTIFICATION_ID.dm;
        } else {
            intExtra = intent.getIntExtra("notification_id", dpyv.UNKNOWN_NOTIFICATION_ID.dm);
        }
        return new afmc(afmeVar, dvzjVar2, durpVar2, intExtra, intent == null ? false : intent.getBooleanExtra("verify_hours", false));
    }
}

package defpackage;

import android.content.Intent;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: byxp  reason: default package */
/* loaded from: classes4.dex */
public final class byxp implements byxw {
    private final byyg a;
    private final btvo b;
    private final bysv c;
    private final cqat d;

    public byxp(byyg byygVar, btvo btvoVar, bysv bysvVar, cqat cqatVar) {
        this.a = byygVar;
        this.b = btvoVar;
        this.c = bysvVar;
        this.d = cqatVar;
    }

    @Override // defpackage.byxw
    public final void a(Intent intent) {
        ckha ckhaVar;
        dbsk.a(b(intent));
        String action = intent.getAction();
        if (byxy.f.equals(action)) {
            this.c.c(cken.RECEIVED_INTENT_REFRESH);
        } else if (!byxy.g.equals(action)) {
            String valueOf = String.valueOf(action);
            throw new RuntimeException(valueOf.length() != 0 ? "Unknown action: ".concat(valueOf) : new String("Unknown action: "));
        } else {
            this.c.c(cken.RECEIVED_INTENT_REFRESH_ONCE);
        }
        if (byxy.g.equals(intent.getAction())) {
            long longExtra = intent.getLongExtra(byxy.h, 0L);
            if (longExtra == 0) {
                this.c.c(cken.WARNING_REFRESH_ONCE_TIMESTAMP_IS_MISSING);
            } else {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(this.d.b()) - longExtra;
                ckcw ckcwVar = this.c.a;
                if (seconds >= 0) {
                    ckhaVar = ckeo.L;
                } else {
                    ckhaVar = ckeo.K;
                }
                ((ckcp) ckcwVar.a(ckhaVar)).a(Math.abs(seconds));
            }
        }
        String stringExtra = intent.getStringExtra(byxy.d);
        if (stringExtra != null) {
            dkqr dkqrVar = this.b.getNotificationsParameters().o;
            if (dkqrVar == null) {
                dkqrVar = dkqr.d;
            }
            dkhd dkhdVar = dkqrVar.a;
            if (dkhdVar == null) {
                dkhdVar = dkhd.h;
            }
            if (dkhdVar.b) {
                this.a.b(stringExtra);
            }
        } else {
            this.c.c(cken.WARNING_REFRESH_SESSION_ID_IS_MISSING);
        }
        String action2 = intent.getAction();
        if (byxy.f.equals(action2)) {
            this.c.c(cken.SUCCESSFULLY_PROCESSED_INTENT_REFRESH);
        } else if (!byxy.g.equals(action2)) {
            String valueOf2 = String.valueOf(action2);
            throw new RuntimeException(valueOf2.length() != 0 ? "Unknown action: ".concat(valueOf2) : new String("Unknown action: "));
        } else {
            this.c.c(cken.SUCCESSFULLY_PROCESSED_INTENT_REFRESH_ONCE);
        }
    }

    @Override // defpackage.byxw
    public final boolean b(Intent intent) {
        return byxy.f.equals(intent.getAction()) || byxy.g.equals(intent.getAction());
    }
}

package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: byxt  reason: default package */
/* loaded from: classes4.dex */
public final class byxt implements byxw {
    private static final dcep<String> a = dcep.B(byxy.c);
    private final bysv b;
    @dzsi
    private final qjl c;
    private final byyg d;

    public byxt(bysv bysvVar, @dzsi qjl qjlVar, byyg byygVar) {
        this.b = bysvVar;
        this.c = qjlVar;
        this.d = byygVar;
    }

    @Override // defpackage.byxw
    public final void a(Intent intent) {
        dbsk.a(b(intent));
        String stringExtra = intent.getStringExtra(byxy.d);
        int intExtra = intent.getIntExtra(byxy.e, -1);
        if (stringExtra == null) {
            this.b.c(cken.ERROR_ACTION_ADVANCE_TO_STAGE_SESSION_ID_IS_NULL);
        } else if (intExtra < 0) {
            this.b.c(cken.ERROR_ACTION_ADVANCE_TO_STAGE_STAGE_IS_INVALID);
        } else {
            this.b.c(cken.RECEIVED_INTENT_ADVANCE_TO_STAGE);
            if (this.c != null) {
                qjj qjjVar = qjj.TRANSIT_TO_PLACE;
                qjl qjlVar = this.c;
                dbsk.s(qjlVar);
                qjlVar.a(qjjVar, stringExtra, intExtra);
                this.d.b(stringExtra);
            }
            this.b.c(cken.SUCCESSFULLY_PROCESSED_INTENT_ADVANCE_TO_STAGE);
        }
    }

    @Override // defpackage.byxw
    public final boolean b(Intent intent) {
        return a.contains(intent.getAction());
    }
}

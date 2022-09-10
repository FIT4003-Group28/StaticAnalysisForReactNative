package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: afnt  reason: default package */
/* loaded from: classes2.dex */
public final class afnt implements afks {
    private final aflw a;

    public afnt(aflw aflwVar) {
        dbsk.s(aflwVar);
        this.a = aflwVar;
    }

    @Override // defpackage.afks
    public final durz b() {
        return durz.EIT_PLACE_LIST_SHARED_URL;
    }

    @Override // defpackage.afks
    public final Runnable a(@dzsi Intent intent, duqp duqpVar) {
        if ((duqpVar.a & 67108864) == 0) {
            throw new afkt("no entity list.");
        }
        final aflw aflwVar = this.a;
        final dibq dibqVar = duqpVar.r;
        if (dibqVar == null) {
            dibqVar = dibq.f;
        }
        return new Runnable(aflwVar, dibqVar) { // from class: aflv
            private final aflw a;
            private final dibq b;

            {
                this.a = aflwVar;
                this.b = dibqVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aflw aflwVar2 = this.a;
                aflwVar2.a.a().j(this.b);
            }
        };
    }
}

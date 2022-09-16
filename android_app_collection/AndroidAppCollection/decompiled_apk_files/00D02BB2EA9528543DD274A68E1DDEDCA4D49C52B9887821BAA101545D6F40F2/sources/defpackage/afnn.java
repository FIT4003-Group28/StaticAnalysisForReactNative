package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: afnn  reason: default package */
/* loaded from: classes2.dex */
public final class afnn implements afks {
    private final aflk a;

    public afnn(aflk aflkVar) {
        dbsk.s(aflkVar);
        this.a = aflkVar;
    }

    @Override // defpackage.afks
    public final durz b() {
        return durz.EIT_HOME_SCREEN;
    }

    @Override // defpackage.afks
    public final Runnable a(@dzsi Intent intent, duqp duqpVar) {
        if ((duqpVar.a & Integer.MIN_VALUE) == 0) {
            throw new afkt("No HomeScreenDetails in response.");
        }
        final aflk aflkVar = this.a;
        final duqt duqtVar = duqpVar.v;
        if (duqtVar == null) {
            duqtVar = duqt.b;
        }
        return new Runnable(aflkVar, duqtVar) { // from class: aflj
            private final aflk a;
            private final duqt b;

            {
                this.a = aflkVar;
                this.b = duqtVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aflk aflkVar2 = this.a;
                drrb b = drrb.b(this.b.a);
                if (b == null) {
                    b = drrb.UNKNOWN_CONTENT;
                }
                if (!b.equals(drrb.COMMUTE) || !aflkVar2.c.d()) {
                    dktk dktkVar = aflkVar2.a.a().get(b);
                    if (dktkVar == null) {
                        return;
                    }
                    aflkVar2.b.a().g(dktkVar);
                    return;
                }
                aflkVar2.d.a().J(-1);
            }
        };
    }
}

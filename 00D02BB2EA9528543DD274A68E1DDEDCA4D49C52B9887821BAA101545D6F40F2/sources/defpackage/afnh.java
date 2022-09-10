package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: afnh  reason: default package */
/* loaded from: classes2.dex */
public final class afnh implements afks {
    private final afla a;

    public afnh(afla aflaVar) {
        dbsk.s(aflaVar);
        this.a = aflaVar;
    }

    @Override // defpackage.afks
    public final Runnable a(@dzsi Intent intent, duqp duqpVar) {
        Runnable runnable;
        final afla aflaVar = this.a;
        if (aflaVar.b.a().j().m()) {
            return deic.a;
        }
        if (aflaVar.d.a().d()) {
            runnable = new Runnable(aflaVar) { // from class: afky
                private final afla a;

                {
                    this.a = aflaVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c.a().N();
                }
            };
        } else {
            runnable = new Runnable(aflaVar) { // from class: afkz
                private final afla a;

                {
                    this.a = aflaVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.a().f();
                }
            };
        }
        return runnable;
    }

    @Override // defpackage.afks
    public final durz b() {
        return durz.EIT_COMMUTE_SETTINGS;
    }
}

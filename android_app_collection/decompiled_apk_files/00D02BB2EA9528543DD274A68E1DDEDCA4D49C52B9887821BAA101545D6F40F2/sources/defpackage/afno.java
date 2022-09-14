package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: afno  reason: default package */
/* loaded from: classes2.dex */
public final class afno implements afks {
    private final aflm a;

    public afno(aflm aflmVar) {
        dbsk.s(aflmVar);
        this.a = aflmVar;
    }

    @Override // defpackage.afks
    public final Runnable a(@dzsi Intent intent, duqp duqpVar) {
        final aflm aflmVar = this.a;
        return new Runnable(aflmVar) { // from class: afll
            private final aflm a;

            {
                this.a = aflmVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.a().o();
            }
        };
    }

    @Override // defpackage.afks
    public final durz b() {
        return durz.EIT_LABELED_PLACES;
    }
}

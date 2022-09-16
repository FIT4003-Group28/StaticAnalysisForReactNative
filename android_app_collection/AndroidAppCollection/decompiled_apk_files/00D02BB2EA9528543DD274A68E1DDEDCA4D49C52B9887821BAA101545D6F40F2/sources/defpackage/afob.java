package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: afob  reason: default package */
/* loaded from: classes2.dex */
public final class afob implements afks {
    private final afmn a;

    public afob(afmn afmnVar) {
        dbsk.s(afmnVar);
        this.a = afmnVar;
    }

    @Override // defpackage.afks
    public final Runnable a(@dzsi Intent intent, duqp duqpVar) {
        final afmn afmnVar = this.a;
        final durt durtVar = duqpVar.q;
        if (durtVar == null) {
            durtVar = durt.b;
        }
        return new Runnable(afmnVar, durtVar) { // from class: afmm
            private final afmn a;
            private final durt b;

            {
                this.a = afmnVar;
                this.b = durtVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                afmn afmnVar2 = this.a;
                durt durtVar2 = this.b;
                axwo a = afmnVar2.a.a();
                dibq dibqVar = durtVar2.a;
                if (dibqVar == null) {
                    dibqVar = dibq.f;
                }
                a.j(dibqVar);
            }
        };
    }

    @Override // defpackage.afks
    public final durz b() {
        return durz.EIT_SOCIAL_PLANNING;
    }
}

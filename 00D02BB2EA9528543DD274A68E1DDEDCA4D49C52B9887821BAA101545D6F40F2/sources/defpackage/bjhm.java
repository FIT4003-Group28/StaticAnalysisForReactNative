package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: bjhm  reason: default package */
/* loaded from: classes3.dex */
final class bjhm implements cqrh {
    final /* synthetic */ bjhr a;

    public bjhm(bjhr bjhrVar) {
        this.a = bjhrVar;
    }

    @Override // defpackage.cqrh
    public final void Rz(cqiw<?> cqiwVar, cqkp cqkpVar) {
        bjhr bjhrVar = this.a;
        if (bjhrVar.e || cqkpVar != bjhrVar.d) {
            return;
        }
        new Handler().post(new Runnable(this) { // from class: bjhl
            private final bjhm a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bjhr bjhrVar2 = this.a.a;
                bjhrVar2.e = true;
                bjhrVar2.a.a(bjhrVar2.c, bjhrVar2, bvrj.UI_THREAD);
            }
        });
    }
}

package defpackage;

import android.app.Activity;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: ajrc  reason: default package */
/* loaded from: classes2.dex */
public final class ajrc implements awnl {
    public static final dcqe a = dcqe.c("ajrc");
    public final String b;
    @dzsi
    public transient akfa c;
    @dzsi
    public transient bvrb d;
    @dzsi
    public transient ajsa e;

    public ajrc(btlu btluVar) {
        this.b = btluVar.d;
    }

    @Override // defpackage.awnl
    public final awnn a() {
        return awnn.LOCATION_HISTORY_DIALOG;
    }

    @Override // defpackage.awnl
    public final void b(Activity activity, int i, Intent intent) {
        ((ajrd) btsq.c(ajrd.class, activity)).wK(this);
        final akfa akfaVar = this.c;
        dbsk.s(akfaVar);
        final bvrb bvrbVar = this.d;
        dbsk.s(bvrbVar);
        final ajsa ajsaVar = this.e;
        dbsk.s(ajsaVar);
        bvrbVar.b(new Runnable(this, akfaVar, bvrbVar, ajsaVar) { // from class: ajra
            private final ajrc a;
            private final akfa b;
            private final bvrb c;
            private final ajsa d;

            {
                this.a = this;
                this.b = akfaVar;
                this.c = bvrbVar;
                this.d = ajsaVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ajrc ajrcVar = this.a;
                akfa akfaVar2 = this.b;
                bvrb bvrbVar2 = this.c;
                final ajsa ajsaVar2 = this.d;
                final btlu n = akfaVar2.n(ajrcVar.b);
                if (n == null) {
                    bvoo.h("Gmm account was lost after fixing location history.", new Object[0]);
                } else {
                    bvrbVar2.b(new Runnable(ajsaVar2, n) { // from class: ajrb
                        private final ajsa a;
                        private final btlu b;

                        {
                            this.a = ajsaVar2;
                            this.b = n;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.a(this.b);
                        }
                    }, bvrj.UI_THREAD);
                }
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }
}

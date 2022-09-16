package defpackage;

import com.google.android.apps.gmm.car.api.GmmCarProjectionStateEvent;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: arzn  reason: default package */
/* loaded from: classes2.dex */
public final class arzn implements crgx, arzt, btph {
    public final btrm a;
    public final arzs b;
    public final arzg c;
    public final Executor d;
    public final btwd e;
    public boolean f;
    public final arzl g = new arzl(this);
    public final arzm h = new arzm(this);
    private final Executor i;

    public arzn(btrm btrmVar, Executor executor, Executor executor2, arzg arzgVar, arzs arzsVar, btwd btwdVar) {
        this.a = btrmVar;
        this.i = executor;
        this.b = arzsVar;
        this.c = arzgVar;
        this.d = executor2;
        this.e = btwdVar;
    }

    @Override // defpackage.crgx, defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        printWriter.println("".concat("NotificationController:"));
        arzg arzgVar = this.c;
        String concat = "".concat("  ");
        printWriter.println(String.valueOf(concat).concat("NavigationStatusNotificationContent:"));
        String concat2 = String.valueOf(concat).concat("  ");
        boolean z = arzgVar.i;
        StringBuilder sb = new StringBuilder(String.valueOf(concat2).length() + 40);
        sb.append(concat2);
        sb.append("areHeadsUpNotificationsSuppressed: ");
        sb.append(z);
        printWriter.println(sb.toString());
    }

    @Override // defpackage.crgx
    public final void a() {
        this.i.execute(new Runnable(this) { // from class: arzi
            private final arzn a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                arzn arznVar = this.a;
                btrm btrmVar = arznVar.a;
                arzl arzlVar = arznVar.g;
                dceq a = dcet.a();
                a.b(crhp.class, new arzo(0, crhp.class, arzlVar, bvrj.UI_THREAD));
                a.b(cqzy.class, new arzo(1, cqzy.class, arzlVar, bvrj.UI_THREAD));
                a.b(ascc.class, new arzo(2, ascc.class, arzlVar, bvrj.UI_THREAD));
                a.b(GmmCarProjectionStateEvent.class, new arzo(3, GmmCarProjectionStateEvent.class, arzlVar, bvrj.UI_THREAD));
                btrmVar.g(arzlVar, a.a());
                btrm btrmVar2 = arznVar.a;
                arzm arzmVar = arznVar.h;
                dceq a2 = dcet.a();
                a2.b(cria.class, new arzp(cria.class, arzmVar, bvrj.UI_THREAD));
                btrmVar2.g(arzmVar, a2.a());
            }
        });
    }

    @Override // defpackage.crgx
    public final void b() {
        this.i.execute(new Runnable(this) { // from class: arzj
            private final arzn a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                arzn arznVar = this.a;
                arznVar.a.a(arznVar.g);
                arznVar.a.a(arznVar.h);
                arznVar.b.a();
                arzg arzgVar = arznVar.c;
                arzgVar.e.removeCallbacks(arzgVar.m);
                arzgVar.e.removeCallbacks(arzgVar.l);
                arzgVar.b.a();
                arzd arzdVar = arzgVar.b;
                if (!bvrj.UI_THREAD.b()) {
                    arzdVar.n.execute(new Runnable(arzdVar) { // from class: aryx
                        private final arzd a;

                        {
                            this.a = arzdVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.c();
                        }
                    });
                } else {
                    arzdVar.c();
                }
                arzgVar.j = 0L;
                arzgVar.f = null;
                arzgVar.g = null;
            }
        });
    }
}

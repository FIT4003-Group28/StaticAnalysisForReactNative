package defpackage;

import android.app.Activity;
import android.view.View;
/* compiled from: PG */
/* renamed from: wsg  reason: default package */
/* loaded from: classes7.dex */
public class wsg implements cqkn<wpv> {
    private final qsc a;
    private final cztz b;
    private final wqe c;

    public wsg(qsc qscVar, wqe wqeVar, cztz cztzVar) {
        this.a = qscVar;
        this.c = wqeVar;
        this.b = cztzVar;
    }

    @Override // defpackage.cqkn
    public final /* bridge */ /* synthetic */ void a(wpv wpvVar, View view) {
        b(wpvVar);
    }

    public final void b(wpv wpvVar) {
        eapr y;
        if (wpvVar.T() != null) {
            return;
        }
        qco qcoVar = null;
        if (wpvVar.ab() != null) {
            y = wpvVar.ab();
        } else {
            y = wpvVar.y() != null ? wpvVar.y() : null;
        }
        if (y == null) {
            return;
        }
        qsc qscVar = this.a;
        int A = wpvVar.A();
        eapd Ti = y.Ti();
        boolean z = wpvVar instanceof wsl;
        if (z) {
            qcoVar = ((wsl) wpvVar).as();
        }
        if (!qscVar.a(A, Ti, qsc.a, qcoVar)) {
            cztq a = cztt.a(this.b);
            a.d(cztr.SHORT);
            a.e(pxo.TRANSIT_COMMUTE_BOARD_DEPARTURE_ALARM_SCHEDULING_FAILED, new Object[0]);
            a.c();
        } else if (!z) {
        } else {
            final wsl wslVar = (wsl) wpvVar;
            wqe wqeVar = this.c;
            Integer valueOf = Integer.valueOf(wpvVar.A());
            eapd Ti2 = y.Ti();
            Runnable runnable = new Runnable(wslVar) { // from class: wsf
                private final wsl a;

                {
                    this.a = wslVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.ar(null);
                }
            };
            qco as = wslVar.as();
            Activity activity = (Activity) ((dxjd) wqeVar.a).a;
            wqe.a(activity, 1);
            cqkj a2 = wqeVar.b.a();
            wqe.a(a2, 2);
            qsc a3 = wqeVar.c.a();
            wqe.a(a3, 3);
            cqhn a4 = wqeVar.d.a();
            wqe.a(a4, 4);
            wqe.a(valueOf, 5);
            wqe.a(Ti2, 6);
            wqe.a(runnable, 7);
            wqe.a(wslVar, 8);
            wslVar.ar(new wqd(activity, a2, a3, a4, valueOf, Ti2, runnable, wslVar, as));
            cqkx.p(wpvVar);
        }
    }
}

package defpackage;

import android.app.AlarmManager;
import android.app.Application;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: byyg  reason: default package */
/* loaded from: classes4.dex */
public final class byyg {
    public final byuf a;
    private final Application b;
    private final bywx c;
    private final AlarmManager d;
    private final bysv e;
    private final btvo f;
    private final cqat g;

    public byyg(Application application, byuf byufVar, bywx bywxVar, bysv bysvVar, btvo btvoVar, cqat cqatVar) {
        this.b = application;
        this.a = byufVar;
        this.c = bywxVar;
        this.d = (AlarmManager) application.getSystemService("alarm");
        this.e = bysvVar;
        this.f = btvoVar;
        this.g = cqatVar;
    }

    public final void a() {
        bvrj.UI_THREAD.d();
        this.c.c();
        d();
        e();
        byuf byufVar = this.a;
        try {
            bvrj.UI_THREAD.d();
            deha.s(byufVar.a.i(bwrj.TRANSIT_NOTIFICATION_DATA, "commute_data"));
        } catch (RuntimeException e) {
            byufVar.b.c(cken.ERROR_IN_DATA_STORAGE_REMOVE_COMMUTE_NOTIFICATION);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:128:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0a05  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0a20  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r38) {
        /*
            Method dump skipped, instructions count: 2667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byyg.b(java.lang.String):void");
    }

    public final void c(String str) {
        dkqr dkqrVar = this.f.getNotificationsParameters().o;
        if (dkqrVar == null) {
            dkqrVar = dkqr.d;
        }
        eaow d = eaow.d(dkqrVar.b);
        this.d.setInexactRepeating(1, TimeUnit.MINUTES.toMillis(TimeUnit.MILLISECONDS.toMinutes(this.g.b() + d.b)), d.b, byxy.b(this.b, str));
    }

    public final void d() {
        this.d.cancel(byxy.b(this.b, null));
    }

    public final void e() {
        this.d.cancel(byxy.c(this.b, null, 0L));
    }

    public final boolean f() {
        return this.f.getTransitAssistanceNotificationsParameters().a;
    }
}

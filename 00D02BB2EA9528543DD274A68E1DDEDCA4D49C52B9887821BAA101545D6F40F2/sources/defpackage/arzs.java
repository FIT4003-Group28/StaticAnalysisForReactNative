package defpackage;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
/* compiled from: PG */
/* renamed from: arzs  reason: default package */
/* loaded from: classes2.dex */
public final class arzs {
    public static final dcqe a = dcqe.c("arzs");
    static final long[] b = {0};
    public final Service c;
    public final arzw d;
    public final in e;
    public final atom f;
    public final jzv g;
    public final PendingIntent h;
    public final PendingIntent i;
    public final aukk k;
    public final ausy l;
    @dzsi
    public Intent m;
    @dzsi
    public PendingIntent n;
    public int o;
    @dzsi
    public atxz p;
    private final cjqy r;
    public final Runnable q = new arzr(this);
    public final Handler j = new Handler();

    public arzs(arzw arzwVar, atom atomVar, jzv jzvVar, Service service, cjqy cjqyVar, aukk aukkVar, ausy ausyVar) {
        dbsk.s(arzwVar);
        this.d = arzwVar;
        dbsk.s(atomVar);
        this.f = atomVar;
        dbsk.s(jzvVar);
        this.g = jzvVar;
        dbsk.s(service);
        this.c = service;
        dbsk.s(cjqyVar);
        this.r = cjqyVar;
        dbsk.s(aukkVar);
        this.k = aukkVar;
        dbsk.s(ausyVar);
        this.l = ausyVar;
        this.e = in.a(service);
        this.h = PendingIntent.getService(service, 1, new Intent(service.getApplicationContext(), service.getClass()).putExtra("acceptsuggestion", true), 134217728);
        this.i = PendingIntent.getService(service, 2, new Intent(service.getApplicationContext(), service.getClass()).putExtra("declinesuggestion", true), 134217728);
    }

    public final void a() {
        this.e.b(dpyv.NAVIGATION_PROMPTS.dm);
        this.p = null;
    }

    public final void b(@dzsi atxw atxwVar, boolean z) {
        Intent intent;
        if (atxwVar == null) {
            return;
        }
        atxwVar.c();
        cjtd m = atxwVar.m();
        if (m != null) {
            this.r.i(m);
        }
        a();
        if (!z || (intent = this.m) == null) {
            return;
        }
        this.c.startActivity(intent);
    }
}

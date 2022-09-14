package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: nml  reason: default package */
/* loaded from: classes7.dex */
public final class nml {
    public final bttf a;
    public final Context b;
    public final cjqy c;
    public final cjqq d;
    public final ktq e;
    public final kts f;
    public final jzp g;
    public final cqkj h;
    public final Executor i;
    public final crzm<Boolean> j;
    public final cqhn k;
    public final ViewGroup m;
    public cqkf<nmz> n;
    public nnb o;
    public final kcx q;
    private final NotificationManager r;
    private final dxio<aukk> s;
    private final kcv t;
    public final cjsz l = new cjsz(dtxm.ex);
    public final nss p = new nmd();

    public nml(bttf bttfVar, Context context, Executor executor, crzm crzmVar, NotificationManager notificationManager, cjqy cjqyVar, cjqq cjqqVar, kcv kcvVar, kcx kcxVar, ktq ktqVar, kts ktsVar, jzp jzpVar, cqkj cqkjVar, ViewGroup viewGroup, dxio dxioVar, cqhn cqhnVar) {
        dbsk.s(bttfVar);
        this.a = bttfVar;
        dbsk.s(context);
        this.b = context;
        dbsk.s(notificationManager);
        this.r = notificationManager;
        dbsk.s(cjqyVar);
        this.c = cjqyVar;
        dbsk.s(cjqqVar);
        this.d = cjqqVar;
        dbsk.s(kcvVar);
        this.t = kcvVar;
        dbsk.s(kcxVar);
        this.q = kcxVar;
        this.e = ktqVar;
        this.f = ktsVar;
        dbsk.s(jzpVar);
        this.g = jzpVar;
        dbsk.s(cqkjVar);
        this.h = cqkjVar;
        this.m = viewGroup;
        dbsk.s(executor);
        this.i = executor;
        dbsk.s(crzmVar);
        this.j = crzmVar;
        this.s = dxioVar;
        dbsk.s(cqhnVar);
        this.k = cqhnVar;
    }

    public final void a(nmj nmjVar) {
        Notification.Builder contentIntent = new Notification.Builder(this.b).setContentTitle(this.b.getResources().getString(R.string.CAR_PHONE_TERMS_NOTIFICATION_TITLE, this.b.getResources().getString(nmjVar.f))).setContentText(this.b.getResources().getString(R.string.CAR_PHONE_TERMS_NOTIFICATION_CONTENTS)).setSmallIcon(2131232603).setContentIntent(PendingIntent.getActivity(this.b, 0, new Intent("android.intent.action.VIEW").setData(Uri.parse(nmjVar.a())), 0));
        if (ako.a()) {
            this.s.a().a(false);
            contentIntent.setChannelId("OtherChannel");
        }
        this.r.notify(nmjVar.g, contentIntent.build());
    }

    public final void b() {
        this.t.k(this.b.getResources().getString(R.string.CAR_READ_TERMS_ON_PHONE_TOAST), 1);
    }
}

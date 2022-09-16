package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
/* loaded from: classes.dex */
public class a implements s {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6714a;

    /* renamed from: b  reason: collision with root package name */
    private final c.e.a.a.i.w.j.c f6715b;

    /* renamed from: c  reason: collision with root package name */
    private AlarmManager f6716c;

    /* renamed from: d  reason: collision with root package name */
    private final g f6717d;

    /* renamed from: e  reason: collision with root package name */
    private final c.e.a.a.i.y.a f6718e;

    a(Context context, c.e.a.a.i.w.j.c cVar, AlarmManager alarmManager, c.e.a.a.i.y.a aVar, g gVar) {
        this.f6714a = context;
        this.f6715b = cVar;
        this.f6716c = alarmManager;
        this.f6718e = aVar;
        this.f6717d = gVar;
    }

    public a(Context context, c.e.a.a.i.w.j.c cVar, c.e.a.a.i.y.a aVar, g gVar) {
        this(context, cVar, (AlarmManager) context.getSystemService("alarm"), aVar, gVar);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.s
    public void a(c.e.a.a.i.m mVar, int i) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", mVar.a());
        builder.appendQueryParameter("priority", String.valueOf(c.e.a.a.i.z.a.a(mVar.c())));
        if (mVar.b() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(mVar.b(), 0));
        }
        Intent intent = new Intent(this.f6714a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (a(intent)) {
            c.e.a.a.i.u.a.a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", mVar);
            return;
        }
        long b2 = this.f6715b.b(mVar);
        long a2 = this.f6717d.a(mVar.c(), b2, i);
        c.e.a.a.i.u.a.a("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", mVar, Long.valueOf(a2), Long.valueOf(b2), Integer.valueOf(i));
        this.f6716c.set(3, this.f6718e.a() + a2, PendingIntent.getBroadcast(this.f6714a, 0, intent, 0));
    }

    boolean a(Intent intent) {
        return PendingIntent.getBroadcast(this.f6714a, 0, intent, 536870912) != null;
    }
}

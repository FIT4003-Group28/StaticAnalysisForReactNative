package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
/* compiled from: PG */
/* renamed from: btxg  reason: default package */
/* loaded from: classes.dex */
final class btxg implements btxj {
    final /* synthetic */ btxk a;
    private final Context b;
    @dzsi
    private BroadcastReceiver c = null;

    public btxg(btxk btxkVar, Context context) {
        this.a = btxkVar;
        this.b = context;
    }

    @Override // defpackage.btxj
    public final synchronized void b() {
        btxf btxfVar = new btxf(this);
        this.c = btxfVar;
        this.b.registerReceiver(btxfVar, new IntentFilter("android.intent.action.LOCALE_CHANGED"));
    }

    @Override // defpackage.btxj
    public final synchronized void c() {
        BroadcastReceiver broadcastReceiver = this.c;
        if (broadcastReceiver != null) {
            this.b.unregisterReceiver(broadcastReceiver);
            this.c = null;
        }
    }
}

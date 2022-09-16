package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Map;
/* compiled from: PG */
/* renamed from: yvz  reason: default package */
/* loaded from: classes4.dex */
public final class yvz extends BroadcastReceiver {
    private final Context a;
    private final ywa b;
    private final yni c;
    private Map d;

    public yvz(Context context, ywa ywaVar, yni yniVar) {
        context.getClass();
        this.a = context;
        ywaVar.getClass();
        this.b = ywaVar;
        yniVar.getClass();
        this.c = yniVar;
    }

    public final void a() {
        this.d = this.b.h();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme("file");
        this.a.registerReceiver(this, intentFilter);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Map map = this.d;
        Map h = this.b.h();
        this.d = h;
        if (!h.equals(map)) {
            this.b.i();
            this.c.d(new yvy(this.d));
        }
    }
}

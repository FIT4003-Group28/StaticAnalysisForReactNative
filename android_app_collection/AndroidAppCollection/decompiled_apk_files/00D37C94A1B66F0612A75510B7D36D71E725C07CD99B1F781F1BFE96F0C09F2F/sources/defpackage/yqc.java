package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* compiled from: PG */
/* renamed from: yqc  reason: default package */
/* loaded from: classes4.dex */
public final class yqc extends BroadcastReceiver implements ypz {
    public final Application a;
    public final zdj b;
    public final yok c;
    public final yoj d;
    private final azqb e;

    public yqc(Context context, final azqb azqbVar, zdj zdjVar) {
        context.getClass();
        Application application = (Application) context.getApplicationContext();
        this.a = application;
        this.e = azqbVar;
        yok yokVar = new yok() { // from class: yqb
            @Override // defpackage.yok
            public final void a() {
                ((ypx) azqb.this.get()).a.c(true);
            }
        };
        this.c = yokVar;
        yoj yojVar = new yoj() { // from class: yqa
            @Override // defpackage.yoj
            public final void g() {
                ((ypx) azqb.this.get()).a.c(false);
            }
        };
        this.d = yojVar;
        zdjVar.getClass();
        this.b = zdjVar;
        zdjVar.a(yokVar);
        zdjVar.a(yojVar);
        application.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            ((ypx) this.e.get()).a.c(true);
            return;
        }
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
        sb.append("Unexpected intent. Received action does not match CONNECTIVITY_ACTION: ");
        sb.append(valueOf);
        zep.l(sb.toString());
    }
}

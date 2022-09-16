package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rkz  reason: default package */
/* loaded from: classes4.dex */
public final class rkz extends BroadcastReceiver {
    public final rpn a;
    public boolean b;
    public boolean c;

    public rkz(rpn rpnVar) {
        this.a = rpnVar;
    }

    public final Context a() {
        return this.a.b();
    }

    public final rks b() {
        return this.a.aG();
    }

    public final void c() {
        this.a.x();
        this.a.v();
        this.a.v();
        if (!this.b) {
            return;
        }
        b().k.a("Unregistering connectivity change receiver");
        this.b = false;
        this.c = false;
        try {
            a().unregisterReceiver(this);
        } catch (IllegalArgumentException e) {
            b().c.b("Failed to unregister the network broadcast receiver", e);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.x();
        String action = intent.getAction();
        b().k.b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean a = this.a.m().a();
            if (this.c == a) {
                return;
            }
            this.c = a;
            this.a.aH().g(new rky(this));
            return;
        }
        b().f.b("NetworkBroadcastReceiver received unknown action", action);
    }
}

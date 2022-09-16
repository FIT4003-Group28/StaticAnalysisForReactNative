package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* compiled from: PG */
/* renamed from: btc  reason: default package */
/* loaded from: classes2.dex */
public abstract class btc extends bte {
    private final BroadcastReceiver f;

    static {
        bqf.b("BrdcstRcvrCnstrntTrckr");
    }

    public btc(Context context, bwn bwnVar) {
        super(context, bwnVar);
        this.f = new btb(this);
    }

    public abstract IntentFilter a();

    public abstract void c(Intent intent);

    @Override // defpackage.bte
    public final void d() {
        bqf a = bqf.a();
        String.format("%s: registering receiver", getClass().getSimpleName());
        a.d(new Throwable[0]);
        this.a.registerReceiver(this.f, a());
    }

    @Override // defpackage.bte
    public final void e() {
        bqf a = bqf.a();
        String.format("%s: unregistering receiver", getClass().getSimpleName());
        a.d(new Throwable[0]);
        this.a.unregisterReceiver(this.f);
    }
}

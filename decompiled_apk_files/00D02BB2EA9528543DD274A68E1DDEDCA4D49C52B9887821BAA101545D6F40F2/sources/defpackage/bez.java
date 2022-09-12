package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* compiled from: PG */
/* renamed from: bez  reason: default package */
/* loaded from: classes3.dex */
public abstract class bez<T> extends bfb<T> {
    private final BroadcastReceiver f;

    static {
        bbz.f("BrdcstRcvrCnstrntTrckr");
    }

    public bez(Context context, bif bifVar) {
        super(context, bifVar);
        this.f = new bey(this);
    }

    public abstract IntentFilter a();

    public abstract void c(Intent intent);

    @Override // defpackage.bfb
    public final void d() {
        bbz.e().a(new Throwable[0]);
        this.a.registerReceiver(this.f, a());
    }

    @Override // defpackage.bfb
    public final void e() {
        bbz.e().a(new Throwable[0]);
        this.a.unregisterReceiver(this.f);
    }
}

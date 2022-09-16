package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* compiled from: PG */
/* renamed from: albs  reason: default package */
/* loaded from: classes.dex */
public final class albs extends albi {
    protected static final albv b = albv.a(1);
    private final BroadcastReceiver c;
    private final Context d;
    private final ConnectivityManager e;

    public albs(Context context) {
        super(1);
        this.c = new albr(this);
        this.d = context;
        this.e = (ConnectivityManager) context.getSystemService("connectivity");
    }

    @Override // defpackage.albi
    protected final void e() {
        this.d.registerReceiver(this.c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // defpackage.albi
    protected final void f() {
        this.d.unregisterReceiver(this.c);
    }

    @Override // defpackage.albu
    public final albv g() {
        NetworkInfo activeNetworkInfo = this.e.getActiveNetworkInfo();
        return (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) ? b : albv.a;
    }
}

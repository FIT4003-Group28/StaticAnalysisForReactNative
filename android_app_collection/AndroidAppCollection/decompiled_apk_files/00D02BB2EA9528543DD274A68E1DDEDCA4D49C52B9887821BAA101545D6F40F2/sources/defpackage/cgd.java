package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* compiled from: PG */
/* renamed from: cgd  reason: default package */
/* loaded from: classes.dex */
public final class cgd implements cgb {
    boolean a;
    final brz b;
    private final Context c;
    private boolean d;
    private final BroadcastReceiver e = new cgc(this);

    public cgd(Context context, brz brzVar) {
        this.c = context.getApplicationContext();
        this.b = brzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        cjn.b(connectivityManager);
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException unused) {
            return true;
        }
    }

    @Override // defpackage.cgp
    public final void d() {
        if (this.d) {
            return;
        }
        this.a = a(this.c);
        try {
            this.c.registerReceiver(this.e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.d = true;
        } catch (SecurityException unused) {
        }
    }

    @Override // defpackage.cgp
    public final void e() {
        if (!this.d) {
            return;
        }
        this.c.unregisterReceiver(this.e);
        this.d = false;
    }

    @Override // defpackage.cgp
    public final void f() {
    }
}

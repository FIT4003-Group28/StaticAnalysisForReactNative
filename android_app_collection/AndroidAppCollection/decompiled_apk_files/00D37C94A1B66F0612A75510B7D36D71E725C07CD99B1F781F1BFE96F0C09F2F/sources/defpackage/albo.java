package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* compiled from: PG */
/* renamed from: albo  reason: default package */
/* loaded from: classes.dex */
public final class albo extends albi {
    private static final albv b = albv.a(1);
    private static final albv c = albv.a(3);
    private final BroadcastReceiver d;
    private final SharedPreferences.OnSharedPreferenceChangeListener e;
    private final Context f;
    private final ConnectivityManager g;
    private final SharedPreferences h;
    private final zer i;

    public albo(Context context, SharedPreferences sharedPreferences) {
        super(3);
        this.d = new albm(this);
        this.e = new albn(this);
        this.f = context;
        this.g = (ConnectivityManager) context.getSystemService("connectivity");
        this.h = sharedPreferences;
        this.i = new albl(context);
    }

    @Override // defpackage.albi
    protected final void e() {
        this.f.registerReceiver(this.d, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.h.registerOnSharedPreferenceChangeListener(this.e);
    }

    @Override // defpackage.albi
    protected final void f() {
        this.f.unregisterReceiver(this.d);
        this.h.unregisterOnSharedPreferenceChangeListener(this.e);
    }

    @Override // defpackage.albu
    public final albv g() {
        NetworkInfo activeNetworkInfo = this.g.getActiveNetworkInfo();
        boolean equals = ((String) this.i.get()).equals(this.h.getString(ymf.UPLOAD_NETWORK_POLICY, null));
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return equals ? c : b;
        }
        if (activeNetworkInfo.getType() != 1 && equals) {
            return c;
        }
        return albv.a;
    }

    public final boolean h() {
        NetworkInfo activeNetworkInfo = this.g.getActiveNetworkInfo();
        return activeNetworkInfo == null || !activeNetworkInfo.isAvailable() || !activeNetworkInfo.isConnected();
    }

    public final boolean i() {
        if (((String) this.i.get()).equals(this.h.getString(ymf.UPLOAD_NETWORK_POLICY, null))) {
            NetworkInfo activeNetworkInfo = this.g.getActiveNetworkInfo();
            return activeNetworkInfo == null || !activeNetworkInfo.isAvailable() || !activeNetworkInfo.isConnected() || activeNetworkInfo.getType() != 1;
        }
        return false;
    }
}

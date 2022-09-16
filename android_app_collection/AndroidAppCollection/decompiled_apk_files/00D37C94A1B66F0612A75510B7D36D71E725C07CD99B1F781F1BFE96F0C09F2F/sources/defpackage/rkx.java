package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* compiled from: PG */
/* renamed from: rkx  reason: default package */
/* loaded from: classes4.dex */
public final class rkx extends rpf {
    public rkx(rpn rpnVar) {
        super(rpnVar);
    }

    public final boolean a() {
        V();
        ConnectivityManager connectivityManager = (ConnectivityManager) I().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    @Override // defpackage.rpf
    protected final void b() {
    }
}

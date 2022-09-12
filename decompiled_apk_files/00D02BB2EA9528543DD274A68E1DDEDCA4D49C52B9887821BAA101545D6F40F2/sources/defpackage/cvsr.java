package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
/* compiled from: PG */
/* renamed from: cvsr  reason: default package */
/* loaded from: classes5.dex */
public final class cvsr implements cvsd {
    public final Context a;
    private final dbty<dbsg<cvse>> b = cvsl.b(new dbty(this) { // from class: cvso
        private final cvsr a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            Object i;
            cvsr cvsrVar = this.a;
            if (!dxxh.a.a().h()) {
                cvlw.a("NetworkStateImpl", "Transport unknown (Phenotype disabled).", new Object[0]);
                return dbpy.a;
            } else if (akm.d(cvsrVar.a, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                cvlw.a("NetworkStateImpl", "Transport unknown (no permission).", new Object[0]);
                return dbpy.a;
            } else {
                ConnectivityManager connectivityManager = (ConnectivityManager) cvsrVar.a.getSystemService("connectivity");
                if (connectivityManager == null) {
                    cvlw.a("NetworkStateImpl", "Transport unknown (ConnectivityManager missing).", new Object[0]);
                    return dbpy.a;
                } else if (Build.VERSION.SDK_INT >= 23) {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (activeNetwork == null) {
                        cvlw.a("NetworkStateImpl", "Transport unknown (SDK >= M, active network missing).", new Object[0]);
                        return dbpy.a;
                    }
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                    if (networkCapabilities == null) {
                        cvlw.a("NetworkStateImpl", "Transport unknown (SDK >= M, network capabilities missing).", new Object[0]);
                        return dbpy.a;
                    } else if (networkCapabilities.hasTransport(0)) {
                        cvlw.a("NetworkStateImpl", "Transport is CELLULAR (SDK >= M).", new Object[0]);
                        return dbsg.i(cvse.CELLULAR);
                    } else if (networkCapabilities.hasTransport(1)) {
                        cvlw.a("NetworkStateImpl", "Transport is WIFI (SDK >= M).", new Object[0]);
                        return dbsg.i(cvse.WIFI);
                    } else {
                        cvlw.a("NetworkStateImpl", "Transport unknown (SDK >= M, not CELLULAR/WIFI).", new Object[0]);
                        return dbpy.a;
                    }
                } else {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null) {
                        cvlw.a("NetworkStateImpl", "Transport unknown (SDK < M, active network missing info missing).", new Object[0]);
                        return dbpy.a;
                    }
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        i = type != 1 ? dbpy.a : dbsg.i(cvse.WIFI);
                    } else {
                        i = dbsg.i(cvse.CELLULAR);
                    }
                    cvlw.a("NetworkStateImpl", "Transport is %s (SDK < M, network info type == %s).", i, Integer.valueOf(activeNetworkInfo.getType()));
                    return i;
                }
            }
        }
    });
    private final dbty<dbsg<Boolean>> c = cvsl.b(new dbty(this) { // from class: cvsp
        private final cvsr a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            cvsr cvsrVar = this.a;
            if (!dxxh.a.a().f()) {
                cvlw.a("NetworkStateImpl", "Metered unknown (Phenotype disabled).", new Object[0]);
                return dbpy.a;
            } else if (akm.d(cvsrVar.a, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                cvlw.a("NetworkStateImpl", "Metered unknown (no permission).", new Object[0]);
                return dbpy.a;
            } else {
                ConnectivityManager connectivityManager = (ConnectivityManager) cvsrVar.a.getSystemService("connectivity");
                if (connectivityManager == null) {
                    cvlw.a("NetworkStateImpl", "Metered unknown (ConnectivityManager missing).", new Object[0]);
                    return dbpy.a;
                }
                Boolean valueOf = Boolean.valueOf(connectivityManager.isActiveNetworkMetered());
                cvlw.a("NetworkStateImpl", "Metered is %s.", valueOf);
                return dbsg.i(valueOf);
            }
        }
    });
    private final dbty<dbsg<Boolean>> d = cvsl.b(new dbty(this) { // from class: cvsq
        private final cvsr a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            cvsr cvsrVar = this.a;
            if (!dxxh.a.a().g()) {
                cvlw.a("NetworkStateImpl", "Roaming unknown (Phenotype disabled).", new Object[0]);
                return dbpy.a;
            } else if (akm.d(cvsrVar.a, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                cvlw.a("NetworkStateImpl", "Roaming unknown (no permission).", new Object[0]);
                return dbpy.a;
            } else {
                ConnectivityManager connectivityManager = (ConnectivityManager) cvsrVar.a.getSystemService("connectivity");
                if (connectivityManager == null) {
                    cvlw.a("NetworkStateImpl", "Roaming unknown (ConnectivityManager missing).", new Object[0]);
                    return dbpy.a;
                } else if (Build.VERSION.SDK_INT >= 28) {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (activeNetwork == null) {
                        cvlw.a("NetworkStateImpl", "Roaming unknown (SDK >= P, active network missing).", new Object[0]);
                        return dbpy.a;
                    }
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                    if (networkCapabilities == null) {
                        cvlw.a("NetworkStateImpl", "Roaming unknown (SDK >= P, network capabilities missing).", new Object[0]);
                        return dbpy.a;
                    }
                    Boolean valueOf = Boolean.valueOf(!networkCapabilities.hasCapability(18));
                    cvlw.a("NetworkStateImpl", "Roaming is %s (SDK >= P).", valueOf);
                    return dbsg.i(valueOf);
                } else {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null) {
                        cvlw.a("NetworkStateImpl", "Roaming unknown (SDK < P, active network info missing).", new Object[0]);
                        return dbpy.a;
                    }
                    cvlw.a("NetworkStateImpl", "Roaming is %s (SDK < P).", Boolean.valueOf(activeNetworkInfo.isRoaming()));
                    return dbsg.i(Boolean.valueOf(activeNetworkInfo.isRoaming()));
                }
            }
        }
    });

    public cvsr(Context context) {
        this.a = context;
    }

    @Override // defpackage.cvsd
    public final dbsg<cvse> a() {
        return this.b.a();
    }

    @Override // defpackage.cvsd
    public final dbsg<Boolean> b() {
        return this.c.a();
    }

    @Override // defpackage.cvsd
    public final dbsg<Boolean> c() {
        return this.d.a();
    }
}

package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: desh  reason: default package */
/* loaded from: classes6.dex */
public final class desh implements Runnable {
    public final FirebaseInstanceId a;
    final ExecutorService b = dero.a();
    private final long c;
    private final PowerManager.WakeLock d;

    public desh(FirebaseInstanceId firebaseInstanceId, long j) {
        this.a = firebaseInstanceId;
        this.c = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.d = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context a() {
        return this.a.d.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0187 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.desh.run():void");
    }
}
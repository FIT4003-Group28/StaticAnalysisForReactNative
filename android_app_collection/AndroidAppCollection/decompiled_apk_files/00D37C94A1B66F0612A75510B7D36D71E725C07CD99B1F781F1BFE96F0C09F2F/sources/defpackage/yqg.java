package defpackage;

import android.net.NetworkInfo;
import java.net.InetAddress;
import java.net.UnknownHostException;
/* compiled from: PG */
/* renamed from: yqg  reason: default package */
/* loaded from: classes4.dex */
public final class yqg {
    private final azqb a;

    public yqg(azqb azqbVar) {
        this.a = azqbVar;
    }

    public final void a(String str) {
        ylr.b();
        NetworkInfo a = ((yug) this.a.get()).a();
        if (a == null || !a.isConnected()) {
            return;
        }
        try {
            InetAddress.getByName(str);
        } catch (UnknownHostException unused) {
            String.valueOf(str).length();
        }
    }
}

package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: byvw  reason: default package */
/* loaded from: classes4.dex */
public final class byvw {
    public static void a(btsm btsmVar, dxio<akfa> dxioVar, btvo btvoVar, bytc bytcVar) {
        String t = dxioVar.a().j().t();
        if (t == null) {
            try {
                dehn<Void> l = dxioVar.a().l();
                dkqz dkqzVar = btvoVar.getNotificationsParameters().m;
                if (dkqzVar == null) {
                    dkqzVar = dkqz.ap;
                }
                dkqw dkqwVar = dkqzVar.an;
                if (dkqwVar == null) {
                    dkqwVar = dkqw.c;
                }
                l.get(dkqwVar.a, TimeUnit.SECONDS);
                t = dxioVar.a().j().t();
            } catch (InterruptedException unused) {
                bytcVar.a(259);
            } catch (ExecutionException unused2) {
                bytcVar.a(258);
            } catch (TimeoutException unused3) {
                bytcVar.a(260);
            }
        }
        if (t != null) {
            btsmVar.j(t);
            bytcVar.a(261);
            return;
        }
        bytcVar.a(262);
    }
}

package defpackage;

import android.util.Log;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: vio  reason: default package */
/* loaded from: classes4.dex */
public final class vio implements vip {
    private static final String a = vip.class.getSimpleName();

    @Override // defpackage.vip
    public final void a(vin vinVar) {
        try {
            rtt.a(vinVar.b);
        } catch (qsc e) {
            Log.e(a, "Attempted to use SSL unpatched. Google Play Services unavailable.", e);
            qrq.a.d(vinVar.b, e.a);
            int i = vinVar.c;
            throw new IOException("Blocked unpatched use of SSL stack.", e);
        } catch (qsd e2) {
            qrq.a.d(vinVar.b, e2.a);
            int i2 = vinVar.c;
            throw new IOException("Attempted to use SSL unpatched. Google Play Services needs update.", e2);
        }
    }
}

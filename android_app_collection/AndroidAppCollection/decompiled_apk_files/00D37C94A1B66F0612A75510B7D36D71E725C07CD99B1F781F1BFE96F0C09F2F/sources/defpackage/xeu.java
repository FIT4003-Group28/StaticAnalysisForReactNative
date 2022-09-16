package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: xeu  reason: default package */
/* loaded from: classes4.dex */
public final class xeu {
    public static amuk a(List list) {
        if (list == null || list.isEmpty()) {
            return amuk.q();
        }
        amuf amufVar = new amuf();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            apae apaeVar = (apae) it.next();
            if (apaeVar != null && (apaeVar.b & 1) != 0) {
                try {
                    Uri i = zgt.i(apaeVar.c);
                    if (i != null && !Uri.EMPTY.equals(i)) {
                        amufVar.h(i);
                    }
                } catch (MalformedURLException unused) {
                }
            }
        }
        return amufVar.g();
    }

    public static amuk b(PlayerAd playerAd, tla tlaVar) {
        tla tlaVar2 = tla.START;
        switch (tlaVar.ordinal()) {
            case 0:
                return a(playerAd.X());
            case 1:
                return a(playerAd.O());
            case 2:
                return a(playerAd.S());
            case 3:
                return a(playerAd.Y());
            case 4:
                return a(playerAd.L());
            case 5:
                return a(playerAd.V());
            case 6:
                return a(playerAd.T());
            case 7:
            case 10:
            case 11:
                return amuk.q();
            case 8:
                return a(playerAd.F());
            case 9:
                return a(playerAd.W());
            case 12:
                return a(playerAd.I());
            case 13:
                return a(playerAd.H());
            case 14:
                return a(playerAd.G());
            case 15:
                return a(playerAd.P());
            case 16:
                return a(playerAd.M());
            default:
                String valueOf = String.valueOf(tlaVar.name());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Unrecognized video event: ".concat(valueOf) : new String("Unrecognized video event: "));
        }
    }
}

package defpackage;

import android.net.wifi.ScanResult;
import java.util.Locale;
/* renamed from: dmko  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class dmko implements dbsl {
    static final dbsl a = new dmko();

    private dmko() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        ScanResult scanResult = (ScanResult) obj;
        if (scanResult != null && scanResult.level < 0 && cxna.a(scanResult.BSSID)) {
            String str = scanResult.BSSID;
            String str2 = scanResult.SSID;
            if (str != null && !cxna.a(str)) {
                throw new IllegalArgumentException(str.length() != 0 ? "Invalid MAC Address: ".concat(str) : new String("Invalid MAC Address: "));
            } else if (str2 != null) {
                if (str == null || !"2367abefABEF".contains(str.substring(1, 2))) {
                    if (str2.indexOf(95) < 0) {
                        return true;
                    }
                    String lowerCase = str2.toLowerCase(Locale.ENGLISH);
                    return !lowerCase.contains("_nomap") && !lowerCase.contains("_optout");
                }
            } else {
                throw new IllegalArgumentException("Null SSID.");
            }
        }
        return false;
    }
}

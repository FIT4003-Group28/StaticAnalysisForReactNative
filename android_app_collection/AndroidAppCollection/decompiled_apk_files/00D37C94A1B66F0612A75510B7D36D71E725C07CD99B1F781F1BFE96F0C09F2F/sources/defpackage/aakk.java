package defpackage;

import java.util.Map;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: aakk  reason: default package */
/* loaded from: classes.dex */
public final class aakk {
    public final Map a;
    public final amup b;

    public aakk(Map map) {
        this.a = map;
        amum amumVar = new amum();
        for (Map.Entry entry : map.entrySet()) {
            amumVar.f(((aajr) entry.getValue()).e(), (Long) entry.getKey());
        }
        this.b = amumVar.b();
    }

    public static int a(String str) {
        try {
            return aakj.a(str);
        } catch (IllegalArgumentException unused) {
            return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        }
    }

    public final abga b(String str, byte[] bArr) {
        long a = a(str);
        if (a == -2147483648L) {
            return aajv.b(str, bArr);
        }
        aajr aajrVar = (aajr) this.a.get(Long.valueOf(a));
        if (aajrVar == null) {
            return aajv.b(str, bArr);
        }
        return aajrVar.a(bArr);
    }
}

package defpackage;

import java.math.BigDecimal;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dcus  reason: default package */
/* loaded from: classes5.dex */
public final class dcus {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static BigDecimal a(double d) {
        return new BigDecimal(d);
    }

    public static double b(double d) {
        return Math.IEEEremainder(d, 6.283185307179586d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Class<?> cls) {
        Logger.getLogger(cls.getCanonicalName());
    }
}

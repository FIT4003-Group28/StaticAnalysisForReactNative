package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: dbsj  reason: default package */
/* loaded from: classes.dex */
public final class dbsj {
    public static final /* synthetic */ int a = 0;

    static {
        Logger.getLogger(dbsj.class.getName());
    }

    private dbsj() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a() {
        return System.nanoTime();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dbrb b(dbrb dbrbVar) {
        BitSet bitSet = new BitSet();
        dbrbVar.l(bitSet);
        int cardinality = bitSet.cardinality();
        if (cardinality + cardinality <= 65536) {
            return dbrb.q(cardinality, bitSet, dbrbVar.toString());
        }
        bitSet.flip(0, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
        int i = ImageMetadata.CONTROL_AE_ANTIBANDING_MODE - cardinality;
        String dbrbVar2 = dbrbVar.toString();
        return new dbqh(dbrb.q(i, bitSet, dbrbVar2.endsWith(".negate()") ? dbrbVar2.substring(0, dbrbVar2.length() - 9) : String.valueOf(dbrbVar2).concat(".negate()")), dbrbVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(double d) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d));
    }

    public static boolean d(String str) {
        return str == null || str.isEmpty();
    }

    public static String e(String str) {
        return str == null ? "" : str;
    }

    public static String f(String str) {
        if (d(str)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dbre g(String str) {
        return new dbru(Pattern.compile(str));
    }
}

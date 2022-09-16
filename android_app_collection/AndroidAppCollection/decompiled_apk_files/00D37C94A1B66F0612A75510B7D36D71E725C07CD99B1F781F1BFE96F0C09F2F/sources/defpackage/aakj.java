package defpackage;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: aakj  reason: default package */
/* loaded from: classes.dex */
public final class aakj {
    static {
        amvn.s("/device/orientation", "/app/mdx");
    }

    public static int a(String str) {
        try {
            aqvz c = c(str);
            if ((c.b & 1) != 0) {
                long j = c.c;
                if (j > 0) {
                    return (int) j;
                }
            }
        } catch (Exception unused) {
        }
        return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    }

    public static aoob b(String str) {
        try {
            return c(str).e;
        } catch (Exception unused) {
            return aoob.b;
        }
    }

    public static aqvz c(String str) {
        return (aqvz) aopi.parseFrom(aqvz.a, Base64.decode(URLDecoder.decode(str, "UTF-8"), 8));
    }

    public static String d(int i, String str) {
        str.getClass();
        aoob z = aoob.z(str);
        aqxo.y(i > 0);
        aopa createBuilder = aqvz.a.createBuilder();
        createBuilder.copyOnWrite();
        aqvz aqvzVar = (aqvz) createBuilder.instance;
        aqvzVar.d = 2;
        aqvzVar.b = 2 | aqvzVar.b;
        createBuilder.copyOnWrite();
        aqvz aqvzVar2 = (aqvz) createBuilder.instance;
        aqvzVar2.b = 1 | aqvzVar2.b;
        aqvzVar2.c = i;
        createBuilder.copyOnWrite();
        aqvz aqvzVar3 = (aqvz) createBuilder.instance;
        aqvzVar3.b |= 4;
        aqvzVar3.e = z;
        return h(createBuilder.mo39build());
    }

    public static String e(int i, aoob aoobVar) {
        aoobVar.getClass();
        aopa createBuilder = aqvz.a.createBuilder();
        createBuilder.copyOnWrite();
        aqvz aqvzVar = (aqvz) createBuilder.instance;
        aqvzVar.d = 1;
        aqvzVar.b |= 2;
        createBuilder.copyOnWrite();
        aqvz aqvzVar2 = (aqvz) createBuilder.instance;
        aqvzVar2.b = 1 | aqvzVar2.b;
        aqvzVar2.c = i;
        createBuilder.copyOnWrite();
        aqvz aqvzVar3 = (aqvz) createBuilder.instance;
        aqvzVar3.b |= 4;
        aqvzVar3.e = aoobVar;
        return h(createBuilder.mo39build());
    }

    public static String f(int i, String str) {
        str.getClass();
        return e(i, aoob.z(str));
    }

    public static String g(String str) {
        return b(str).E();
    }

    public static String h(aoqu aoquVar) {
        try {
            return URLEncoder.encode(Base64.encodeToString(aoquVar.toByteArray(), 10), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean i(String str) {
        try {
            aqvz c = c(str);
            if (c != null && (c.b & 1) != 0) {
                int v = amnt.v(c.d);
                if (v != 0 && v == 3) {
                    return true;
                }
            }
        } catch (aopx | UnsupportedEncodingException | IllegalArgumentException unused) {
        }
        return false;
    }

    public static boolean j(String str) {
        try {
            aqvz c = c(str);
            if (c != null && (c.b & 1) != 0) {
                int v = amnt.v(c.d);
                if (v != 0 && v == 2) {
                    return true;
                }
            }
        } catch (aopx | UnsupportedEncodingException | IllegalArgumentException unused) {
        }
        return false;
    }
}

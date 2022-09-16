package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aafx  reason: default package */
/* loaded from: classes.dex */
public final class aafx {
    public static aoob a(apzg apzgVar) {
        return (apzgVar == null || (apzgVar.b & 1) == 0) ? aoob.b : apzgVar.c;
    }

    public static apzg b(byte[] bArr) {
        if (bArr != null) {
            try {
                return (apzg) aopi.parseFrom(apzg.a, bArr, aoos.b());
            } catch (aopx unused) {
            }
        }
        return apzg.a;
    }

    public static void c(aafo aafoVar, List list, Object obj) {
        d(aafoVar, list, obj != null ? amup.k("com.google.android.libraries.youtube.innertube.endpoint.tag", obj) : null);
    }

    public static void d(aafo aafoVar, List list, Map map) {
        if (aafoVar == null || list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            apzg apzgVar = (apzg) it.next();
            if (apzgVar != null) {
                aafoVar.c(apzgVar, map);
            }
        }
    }

    public static final boolean e(double d, double d2, double d3, double d4) {
        return (d == 0.0d && d2 == 0.0d && d3 == 0.0d && d4 == 0.0d) ? false : true;
    }
}

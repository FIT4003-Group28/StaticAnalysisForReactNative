package defpackage;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
/* compiled from: PG */
/* renamed from: abgb  reason: default package */
/* loaded from: classes.dex */
public final class abgb {
    public abgb() {
    }

    public abgb(byte[] bArr) {
    }

    public static CharSequence a(asov asovVar) {
        aspb b = aspb.b(asovVar.d);
        if (b == null) {
            b = aspb.LIKE;
        }
        arag aragVar = null;
        if (b != aspb.DISLIKE) {
            if ((asovVar.b & 256) != 0 && (aragVar = asovVar.j) == null) {
                aragVar = arag.a;
            }
            return ajgl.b(aragVar);
        }
        if ((asovVar.b & 1024) != 0 && (aragVar = asovVar.m) == null) {
            aragVar = arag.a;
        }
        return ajgl.b(aragVar);
    }

    public static CharSequence b(asov asovVar) {
        aspb b = aspb.b(asovVar.d);
        if (b == null) {
            b = aspb.LIKE;
        }
        arag aragVar = null;
        if (b != aspb.LIKE) {
            if ((asovVar.b & 8) != 0 && (aragVar = asovVar.f) == null) {
                aragVar = arag.a;
            }
            return ajgl.b(aragVar);
        }
        if ((asovVar.b & 32) != 0 && (aragVar = asovVar.h) == null) {
            aragVar = arag.a;
        }
        return ajgl.b(aragVar);
    }

    public static aspb c(aopc aopcVar) {
        if (!aopcVar.qn(asou.b) || !((Boolean) aopcVar.qm(asou.b)).booleanValue()) {
            aopg aopgVar = asou.c;
            aspb b = aspb.b(((asov) aopcVar.instance).d);
            if (b == null) {
                b = aspb.LIKE;
            }
            aopcVar.e(aopgVar, b);
            aopcVar.e(asou.b, true);
        }
        return (aspb) aopcVar.qm(asou.c);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, aoqu] */
    public static aoqu d(String str, aorb aorbVar) {
        try {
            return aorbVar.n(Base64.decode(str, 8), aoos.b());
        } catch (aopx unused) {
            return null;
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18);
            sb.append("Unable to decode ");
            sb.append(str);
            sb.append(".");
            afus.c(2, 5, sb.toString(), e);
            return null;
        }
    }

    public static aoqu e(String str, aorb aorbVar) {
        aorbVar.getClass();
        if (str == null) {
            return null;
        }
        return d(f(str), aorbVar);
    }

    public static String f(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            afus.c(2, 5, "Apparently UTF-8 is no longer a supported encoding", e);
            return str;
        }
    }

    public static boolean g(afvm afvmVar, afvm afvmVar2) {
        return afvmVar2.b().equals(afvmVar.b()) && afvmVar2.d().equals(afvmVar.d());
    }
}

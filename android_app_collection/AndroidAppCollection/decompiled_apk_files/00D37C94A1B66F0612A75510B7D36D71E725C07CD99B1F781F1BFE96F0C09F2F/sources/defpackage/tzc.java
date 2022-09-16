package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: tzc  reason: default package */
/* loaded from: classes4.dex */
public class tzc {
    public static long c(tqm tqmVar) {
        if (tqmVar.k == 0) {
            return Long.MAX_VALUE;
        }
        return TimeUnit.SECONDS.toMillis(tqmVar.k);
    }

    public static Uri d(Context context, ampq ampqVar, tqk tqkVar, tqm tqmVar) {
        String[] split;
        Uri.Builder buildUpon = e(context, ampqVar, tqmVar).buildUpon();
        if (!tqkVar.p.isEmpty()) {
            for (String str : tqkVar.p.split("/", -1)) {
                if (!str.isEmpty()) {
                    buildUpon.appendPath(str);
                }
            }
        } else {
            String str2 = tqkVar.d;
            buildUpon.appendPath(str2.substring(str2.lastIndexOf("/") + 1));
        }
        return buildUpon.build();
    }

    public static Uri e(Context context, ampq ampqVar, tqm tqmVar) {
        int b = tqn.b(tqmVar.i);
        if (b == 0) {
            b = 1;
        }
        return n(context, ampqVar).buildUpon().appendPath(r(b)).build().buildUpon().appendPath(tqmVar.d).build();
    }

    public static tqm f(tqm tqmVar, long j) {
        tql tqlVar = tqmVar.c;
        if (tqlVar == null) {
            tqlVar = tql.a;
        }
        aopa mo52toBuilder = tqlVar.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        tql tqlVar2 = (tql) mo52toBuilder.instance;
        tqlVar2.b |= 1;
        tqlVar2.c = j;
        tql tqlVar3 = (tql) mo52toBuilder.mo39build();
        aopa mo52toBuilder2 = tqmVar.mo52toBuilder();
        mo52toBuilder2.copyOnWrite();
        tqm tqmVar2 = (tqm) mo52toBuilder2.instance;
        tqlVar3.getClass();
        tqmVar2.c = tqlVar3;
        tqmVar2.b |= 1;
        return (tqm) mo52toBuilder2.mo39build();
    }

    public static String g(tqk tqkVar) {
        return i(tqkVar) ? tqkVar.i : tqkVar.g;
    }

    public static void h(Context context, ampq ampqVar, tqm tqmVar, vjb vjbVar) {
        Uri e = e(context, ampqVar, tqmVar);
        if (vjbVar.h(e)) {
            Void r0 = (Void) vjbVar.c(e, new vkg(4));
        }
    }

    public static boolean i(tqk tqkVar) {
        if ((tqkVar.b & 32) != 0) {
            awxs awxsVar = tqkVar.h;
            if (awxsVar == null) {
                awxsVar = awxs.a;
            }
            for (awxr awxrVar : awxsVar.b) {
                if (awxrVar.b == 4) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean j(long j, snc sncVar) {
        return j <= sncVar.c();
    }

    public static boolean k(tqm tqmVar) {
        if (tqmVar.m) {
            for (tqk tqkVar : tqmVar.n) {
                int d = tqn.d(tqkVar.m);
                if (d != 0 && d == 2) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean l(tqk tqkVar) {
        return tqkVar.d.startsWith("file");
    }

    public static Uri m(Context context, ampq ampqVar) {
        vjf a = vjg.a(context);
        a.e((ampqVar == null || !ampqVar.h()) ? "datadownload" : (String) ampqVar.c());
        if (ampqVar != null && ampqVar.h()) {
            a.f("datadownload");
        }
        return a.a();
    }

    public static Uri n(Context context, ampq ampqVar) {
        return m(context, ampqVar).buildUpon().appendPath("links").build();
    }

    public static Uri o(Context context, String str) {
        vjh a = vji.a(context);
        a.a = str;
        return a.a();
    }

    public static String p(String str, ampq ampqVar) {
        if (ampqVar != null && ampqVar.h()) {
            String str2 = (String) ampqVar.c();
            str = str2.length() != 0 ? str.concat(str2) : new String(str);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3);
        sb.append(str);
        sb.append(".pb");
        return sb.toString();
    }

    public static String r(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? "public_3p" : "private" : "public";
    }

    public static void s(Context context, String str, Uri uri, tqm tqmVar, tqk tqkVar, vjb vjbVar, boolean z) {
        String str2 = "";
        int i = 0;
        try {
            Uri o = o(context, str);
            InputStream inputStream = (InputStream) vjbVar.c(uri, vkk.b());
            try {
                OutputStream outputStream = (OutputStream) vjbVar.c(o, vkl.b());
                anek.g(inputStream, outputStream);
                if (outputStream != null) {
                    outputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (vjo unused2) {
            typ.e("%s: Failed to share after download for file %s, file group %s due to LimitExceededException", "AndroidSharingUtil", tqkVar.c, tqmVar.d);
            str2 = String.format("System limit exceeded for file %s, group %s", tqkVar.c, tqmVar.d);
            i = 25;
        } catch (vjt unused3) {
            typ.e("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", tqkVar.c, tqmVar.d);
            str2 = String.format("Malformed blob Uri for file %s, group %s", tqkVar.c, tqmVar.d);
            i = 17;
        } catch (vjw e) {
            if (!TextUtils.isEmpty(e.getMessage())) {
                str2 = e.getMessage();
            }
            String str3 = tqkVar.c;
            String str4 = tqmVar.d;
            int i2 = typ.a;
            String valueOf = String.valueOf(str2);
            str2 = valueOf.length() != 0 ? "UnsupportedFileStorageOperation was thrown: ".concat(valueOf) : new String("UnsupportedFileStorageOperation was thrown: ");
            i = 24;
        } catch (IOException unused4) {
            typ.e("%s: Failed to copy to the blobstore after download for file %s, file group %s", "AndroidSharingUtil", tqkVar.c, tqmVar.d);
            int i3 = true != z ? 21 : 22;
            str2 = String.format("Error while copying file %s, group %s, to the shared blob storage", tqkVar.c, tqmVar.d);
            i = i3;
        }
        if (i == 0) {
            return;
        }
        throw new tza(i, str2);
    }

    public static boolean t(Context context, String str, tqm tqmVar, tqk tqkVar, vjb vjbVar) {
        boolean z;
        String str2 = "";
        int i = 0;
        try {
            z = vjbVar.h(o(context, str));
        } catch (vjt unused) {
            typ.e("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", tqkVar.c, tqmVar.d);
            str2 = String.format("Malformed blob Uri for file %s, group %s", tqkVar.c, tqmVar.d);
            z = false;
            i = 17;
        } catch (vjw e) {
            if (!TextUtils.isEmpty(e.getMessage())) {
                str2 = e.getMessage();
            }
            String str3 = tqkVar.c;
            String str4 = tqmVar.d;
            int i2 = typ.a;
            String valueOf = String.valueOf(str2);
            str2 = valueOf.length() != 0 ? "UnsupportedFileStorageOperation was thrown: ".concat(valueOf) : new String("UnsupportedFileStorageOperation was thrown: ");
            z = false;
            i = 24;
        } catch (IOException unused2) {
            typ.e("%s: Failed to check existence in the shared storage for file %s, file group %s", "AndroidSharingUtil", tqkVar.c, tqmVar.d);
            str2 = String.format("Error while checking if file %s, group %s, exists in the shared blob storage.", tqkVar.c, tqmVar.d);
            z = false;
            i = 19;
        }
        if (i == 0) {
            return z;
        }
        throw new tza(i, str2);
    }

    public static Uri u(Uri uri) {
        String uri2 = uri.toString();
        return Uri.parse(uri2.substring(0, uri2.lastIndexOf("_")));
    }

    public static String v(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        return sb.toString();
    }

    public static boolean w(Context context, int i, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) qyr.b(context).a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean x() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public qsn a(Context context, Looper looper, qwu qwuVar, Object obj, qub qubVar, qvh qvhVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    @Deprecated
    public qsn b(Context context, Looper looper, qwu qwuVar, Object obj, qsv qsvVar, qsw qswVar) {
        return a(context, looper, qwuVar, obj, qsvVar, qswVar);
    }

    public static Uri q(Context context, int i, String str, String str2, trv trvVar, ampq ampqVar, boolean z) {
        try {
            if (!z) {
                return m(context, ampqVar).buildUpon().appendPath(r(i)).build().buildUpon().appendPath(str).build();
            }
            return o(context, str2);
        } catch (Exception e) {
            typ.f(e, "%s: Unable to create mobstore uri for file %s.", "DirectoryUtil", str);
            trvVar.a(e, "Unable to create mobstore uri for file", new Object[0]);
            return null;
        }
    }
}

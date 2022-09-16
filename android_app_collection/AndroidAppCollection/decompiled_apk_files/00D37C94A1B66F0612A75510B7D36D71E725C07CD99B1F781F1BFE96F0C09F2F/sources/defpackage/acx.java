package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.util.Log;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: PG */
/* renamed from: acx  reason: default package */
/* loaded from: classes.dex */
public class acx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static BiometricPrompt.AuthenticationCallback c(acz aczVar) {
        return new acw(aczVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BiometricPrompt.CryptoObject d(BiometricPrompt.AuthenticationResult authenticationResult) {
        return authenticationResult.getCryptoObject();
    }

    public static /* synthetic */ String e(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "MEMORY_CACHE" : "RESOURCE_DISK_CACHE" : "DATA_DISK_CACHE" : "REMOTE" : "LOCAL";
    }

    public static long f(String str) {
        String str2;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                String str3 = cfg.a;
                return 0L;
            }
            Object[] objArr = {str};
            String str4 = cfg.a;
            String format = String.format(Locale.US, "Unable to parse dateStr: %s, falling back to 0", objArr);
            StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
            int i = 2;
            while (true) {
                if (i >= stackTrace.length) {
                    str2 = "<unknown>";
                    break;
                } else if (!stackTrace[i].getClassName().equals(cfg.b)) {
                    String className = stackTrace[i].getClassName();
                    String substring = className.substring(className.lastIndexOf(46) + 1);
                    String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                    String methodName = stackTrace[i].getMethodName();
                    StringBuilder sb = new StringBuilder(String.valueOf(substring2).length() + 1 + String.valueOf(methodName).length());
                    sb.append(substring2);
                    sb.append(".");
                    sb.append(methodName);
                    str2 = sb.toString();
                    break;
                } else {
                    i++;
                }
            }
            Log.e(str4, String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, format), e);
            return 0L;
        }
    }

    public static cer g(cew cewVar) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = cewVar.c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long f = str != null ? f(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i2 = 0;
            j = 0;
            j2 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j = 0;
            j2 = 0;
        }
        String str3 = (String) map.get("Expires");
        long f2 = str3 != null ? f(str3) : 0L;
        String str4 = (String) map.get("Last-Modified");
        long f3 = str4 != null ? f(str4) : 0L;
        String str5 = (String) map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j * 1000);
            if (i != 0) {
                j5 = j4;
            } else {
                Long.signum(j2);
                j5 = (j2 * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (f <= 0 || f2 < f) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (f2 - f);
                j3 = j4;
            }
        }
        cer cerVar = new cer();
        cerVar.a = cewVar.b;
        cerVar.b = str5;
        cerVar.f = j4;
        cerVar.e = j3;
        cerVar.c = f;
        cerVar.d = f3;
        cerVar.g = map;
        List list = cewVar.d;
        return cerVar;
    }

    public static String h(Map map) {
        return i(map, "ISO-8859-1");
    }

    public static String i(Map map, String str) {
        String str2;
        if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
            String[] split = str2.split(";", 0);
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return str;
    }
}

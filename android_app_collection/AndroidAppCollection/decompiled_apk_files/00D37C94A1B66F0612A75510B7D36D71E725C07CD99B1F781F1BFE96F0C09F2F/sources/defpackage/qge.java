package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
/* compiled from: PG */
/* renamed from: qge  reason: default package */
/* loaded from: classes4.dex */
public class qge {
    public static Object b(Context context, String str, qgc qgcVar) {
        try {
            try {
                return qgcVar.a(ras.e(context, ras.a, "com.google.android.gms.ads.dynamite").d(str));
            } catch (Exception e) {
                throw new qgd(e);
            }
        } catch (Exception e2) {
            throw new qgd(e2);
        }
    }

    public static boolean c(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == null && bundle2 == null;
        } else if (bundle.size() != bundle2.size()) {
            return false;
        } else {
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                } else if (obj instanceof Bundle) {
                    if (!(obj2 instanceof Bundle) || !c((Bundle) obj, (Bundle) obj2)) {
                        return false;
                    }
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                        return false;
                    }
                    for (int i = 0; i < length; i++) {
                        if (!tnk.j(Array.get(obj, i), Array.get(obj2, i))) {
                            return false;
                        }
                    }
                    continue;
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void d(String str) {
        try {
            try {
                rpy rpyVar = rfk.a;
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
                        sb.append("Received non-success response code ");
                        sb.append(responseCode);
                        sb.append(" from pinging URL: ");
                        sb.append(str);
                        Log.w("HttpUrlPinger", sb.toString());
                    }
                    rpy rpyVar2 = rfk.a;
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e) {
                e = e;
                String message = e.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
                sb2.append("Error while pinging URL: ");
                sb2.append(str);
                sb2.append(". ");
                sb2.append(message);
                Log.w("HttpUrlPinger", sb2.toString(), e);
                rpy rpyVar3 = rfk.a;
            } catch (IndexOutOfBoundsException e2) {
                String message2 = e2.getMessage();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
                sb3.append("Error while parsing ping URL: ");
                sb3.append(str);
                sb3.append(". ");
                sb3.append(message2);
                Log.w("HttpUrlPinger", sb3.toString(), e2);
                rpy rpyVar4 = rfk.a;
            } catch (RuntimeException e3) {
                e = e3;
                String message3 = e.getMessage();
                StringBuilder sb22 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length());
                sb22.append("Error while pinging URL: ");
                sb22.append(str);
                sb22.append(". ");
                sb22.append(message3);
                Log.w("HttpUrlPinger", sb22.toString(), e);
                rpy rpyVar32 = rfk.a;
            }
        } catch (Throwable th) {
            rpy rpyVar5 = rfk.a;
            throw th;
        }
    }

    public void a(pzg pzgVar) {
        throw null;
    }
}

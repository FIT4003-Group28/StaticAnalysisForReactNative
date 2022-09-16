package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: aodm  reason: default package */
/* loaded from: classes.dex */
public final class aodm {
    public static aodm a;

    public static anxn a(String str, String str2) {
        aodl aodlVar = new aodl(str, str2);
        anxm a2 = anxn.a(aodl.class);
        a2.a = 1;
        a2.c(new anxl(aodlVar, 1));
        return a2.a();
    }

    public static String b(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    public static String c(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    public static String d(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    public static void e(String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = new Bundle();
        String string = bundle.getString("google.c.a.c_id");
        if (string != null) {
            bundle2.putString("_nmid", string);
        }
        String b = b(bundle);
        if (b != null) {
            bundle2.putString("_nmn", b);
        }
        String c = c(bundle);
        if (!TextUtils.isEmpty(c)) {
            bundle2.putString("label", c);
        }
        String string2 = bundle.getString("google.c.a.m_c");
        if (!TextUtils.isEmpty(string2)) {
            bundle2.putString("message_channel", string2);
        }
        String d = d(bundle);
        if (d != null) {
            bundle2.putString("_nt", d);
        }
        String string3 = bundle.getString("google.c.a.ts");
        if (string3 != null) {
            try {
                bundle2.putInt("_nmt", Integer.parseInt(string3));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
            }
        }
        String string4 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
        if (string4 != null) {
            try {
                bundle2.putInt("_ndt", Integer.parseInt(string4));
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
            }
        }
        String str2 = true != aoce.i(bundle) ? "data" : "display";
        if ("_nr".equals(str) || "_nf".equals(str)) {
            bundle2.putString("_nmc", str2);
        }
        anwm anwmVar = (anwm) anwg.b().f(anwm.class);
        if (anwmVar != null) {
            anwmVar.a(str, bundle2);
        } else {
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        }
    }

    public static boolean f(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    public static boolean g(Intent intent) {
        if (intent == null || f(intent)) {
            return false;
        }
        return h(intent.getExtras());
    }

    public static boolean h(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    public static final void i(fi fiVar, aocb aocbVar) {
        if (aocbVar != null) {
            try {
                rve rveVar = aocbVar.b;
                qnm.b(rveVar);
                Bitmap bitmap = (Bitmap) rwd.e(rveVar, 5L, TimeUnit.SECONDS);
                fiVar.n(bitmap);
                fg fgVar = new fg();
                fgVar.a = bitmap;
                fgVar.c(null);
                fiVar.s(fgVar);
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                aocbVar.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                String valueOf = String.valueOf(e.getCause());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                sb.append("Failed to download image: ");
                sb.append(valueOf);
                Log.w("FirebaseMessaging", sb.toString());
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                aocbVar.close();
            }
        }
    }
}

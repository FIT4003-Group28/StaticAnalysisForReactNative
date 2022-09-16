package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: qzv  reason: default package */
/* loaded from: classes4.dex */
public final class qzv {
    private static Context a;
    private static Boolean b;

    public static File a(Context context) {
        return context.getDir("dg_cache", 0);
    }

    public static void b(File file, File file2) {
        if (file.renameTo(file2)) {
            return;
        }
        String valueOf = String.valueOf(file);
        String valueOf2 = String.valueOf(file2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22 + String.valueOf(valueOf2).length());
        sb.append("Failed to rename ");
        sb.append(valueOf);
        sb.append(" -> ");
        sb.append(valueOf2);
        sb.append(".");
        throw new qzp(sb.toString());
    }

    public static final void c(qzx qzxVar) {
        File file = qzxVar.b;
        try {
            if (!file.exists() && !file.createNewFile()) {
                String valueOf = String.valueOf(qzxVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Failed to touch last-used file for ");
                sb.append(valueOf);
                sb.append(".");
                throw new qzp(sb.toString());
            }
            if (file.setLastModified(System.currentTimeMillis())) {
                return;
            }
            String valueOf2 = String.valueOf(qzxVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 42);
            sb2.append("Failed to update last-used timestamp for ");
            sb2.append(valueOf2);
            sb2.append(".");
            throw new qzp(sb2.toString());
        } catch (IOException e) {
            String valueOf3 = String.valueOf(qzxVar);
            String valueOf4 = String.valueOf(e);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 37 + String.valueOf(valueOf4).length());
            sb3.append("Failed to touch last-used file for ");
            sb3.append(valueOf3);
            sb3.append(": ");
            sb3.append(valueOf4);
            throw new qzp(sb3.toString());
        }
    }

    public static final qzx d(Context context, List list) {
        String valueOf = String.valueOf(UUID.randomUUID().toString());
        return g(valueOf.length() != 0 ? "tmp_".concat(valueOf) : new String("tmp_"), context);
    }

    public static final qzx e(qzy qzyVar, Context context, List list) {
        qzx g = g(qzyVar.a, context);
        if (!g.c()) {
            return null;
        }
        c(g);
        return g;
    }

    public static final void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (!i(file)) {
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb.append("Failed to clean up temporary file ");
                sb.append(valueOf);
                sb.append(".");
                Log.e("DG", sb.toString());
            }
        }
        list.clear();
    }

    public static final qzx g(String str, Context context) {
        File file = new File(a(context), str);
        return new qzx(new qzt(file, "the.apk"), new File(file, "opt"), new File(file, "t"));
    }

    public static byte[] h(String str) {
        String valueOf = String.valueOf(str);
        return (valueOf.length() != 0 ? "ERROR : ".concat(valueOf) : new String("ERROR : ")).getBytes();
    }

    public static boolean i(File file) {
        File[] listFiles;
        if (!file.exists()) {
            return true;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                i(file2);
            }
        }
        return file.delete();
    }

    public static synchronized boolean j(Context context) {
        Boolean bool;
        synchronized (qzv.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = a;
            if (context2 != null && (bool = b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            b = null;
            if (twx.g()) {
                b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    b = true;
                } catch (ClassNotFoundException unused) {
                    b = false;
                }
            }
            a = applicationContext;
            return b.booleanValue();
        }
    }

    public static int k(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            if (i == 4) {
                return 5;
            }
            return i != 5 ? 0 : 6;
        }
        return 1;
    }

    public static int l(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static final void m(String str) {
        try {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Pinging URL: ".concat(valueOf);
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                qar.c();
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setReadTimeout(60000);
                httpURLConnection.setUseCaches(false);
                int i = qgb.a;
                qgb.a();
                new ArrayList();
                qgb.a();
                int responseCode = httpURLConnection.getResponseCode();
                qgb.a();
                if (responseCode < 200 || responseCode >= 300) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
                    sb.append("Received non-success response code ");
                    sb.append(responseCode);
                    sb.append(" from pinging URL: ");
                    sb.append(str);
                    qfl.e(sb.toString());
                }
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
            qfl.e(sb2.toString());
        } catch (IndexOutOfBoundsException e2) {
            String message2 = e2.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
            sb3.append("Error while parsing ping URL: ");
            sb3.append(str);
            sb3.append(". ");
            sb3.append(message2);
            qfl.e(sb3.toString());
        } catch (RuntimeException e3) {
            e = e3;
            String message3 = e.getMessage();
            StringBuilder sb22 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length());
            sb22.append("Error while pinging URL: ");
            sb22.append(str);
            sb22.append(". ");
            sb22.append(message3);
            qfl.e(sb22.toString());
        }
    }
}

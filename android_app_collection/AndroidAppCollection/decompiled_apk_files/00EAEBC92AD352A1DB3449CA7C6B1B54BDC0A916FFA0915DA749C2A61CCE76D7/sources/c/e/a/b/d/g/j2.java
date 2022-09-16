package c.e.a.b.d.g;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class j2 {
    private static g2 a(File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            HashMap hashMap = new HashMap();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    String valueOf = String.valueOf(file);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
                    sb.append("Parsed ");
                    sb.append(valueOf);
                    Log.i("HermeticFileOverrides", sb.toString());
                    g2 g2Var = new g2(hashMap);
                    bufferedReader.close();
                    return g2Var;
                }
                String[] split = readLine.split(" ", 3);
                if (split.length != 3) {
                    String valueOf2 = String.valueOf(readLine);
                    Log.e("HermeticFileOverrides", valueOf2.length() != 0 ? "Invalid: ".concat(valueOf2) : new String("Invalid: "));
                } else {
                    String str = split[0];
                    String decode = Uri.decode(split[1]);
                    String decode2 = Uri.decode(split[2]);
                    if (!hashMap.containsKey(str)) {
                        hashMap.put(str, new HashMap());
                    }
                    ((Map) hashMap.get(str)).put(decode, decode2);
                }
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static y2<g2> a(Context context) {
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        boolean z = false;
        if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
            z = true;
        }
        if (!z) {
            return y2.c();
        }
        if (x1.a() && !context.isDeviceProtectedStorage()) {
            context = context.createDeviceProtectedStorageContext();
        }
        y2<File> b2 = b(context);
        return b2.a() ? y2.a(a(b2.b())) : y2.c();
    }

    private static y2<File> b(Context context) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? y2.a(file) : y2.c();
        } catch (RuntimeException e2) {
            Log.e("HermeticFileOverrides", "no data dir", e2);
            return y2.c();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}

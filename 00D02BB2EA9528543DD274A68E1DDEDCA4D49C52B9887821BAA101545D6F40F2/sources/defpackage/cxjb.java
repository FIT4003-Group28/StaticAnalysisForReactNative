package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cxjb  reason: default package */
/* loaded from: classes.dex */
public final class cxjb {
    public static final dbsg<cxja> a(Context context) {
        dbsg dbsgVar;
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
            if (cqvm.a() && !context.isDeviceProtectedStorage()) {
                context = context.createDeviceProtectedStorageContext();
            }
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                StrictMode.allowThreadDiskWrites();
                try {
                    File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                    dbsgVar = file.exists() ? dbsg.i(file) : dbpy.a;
                } catch (RuntimeException unused) {
                    dbsgVar = dbpy.a;
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                if (!dbsgVar.a()) {
                    return dbpy.a;
                }
                File file2 = (File) dbsgVar.b();
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            String valueOf = String.valueOf(file2);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
                            sb.append("Parsed ");
                            sb.append(valueOf);
                            sb.toString();
                            cxja cxjaVar = new cxja(hashMap);
                            bufferedReader.close();
                            return dbsg.i(cxjaVar);
                        }
                        String[] split = readLine.split(" ", 3);
                        if (split.length == 3) {
                            String str3 = split[0];
                            String decode = Uri.decode(split[1]);
                            String decode2 = Uri.decode(split[2]);
                            if (!hashMap.containsKey(str3)) {
                                hashMap.put(str3, new HashMap());
                            }
                            ((Map) hashMap.get(str3)).put(decode, decode2);
                        } else if (readLine.length() == 0) {
                            new String("Invalid: ");
                        }
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th;
            }
        } else {
            return dbpy.a;
        }
    }
}

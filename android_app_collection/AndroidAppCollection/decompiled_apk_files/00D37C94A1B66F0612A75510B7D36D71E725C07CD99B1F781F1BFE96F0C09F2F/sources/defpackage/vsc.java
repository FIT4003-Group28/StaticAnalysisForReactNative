package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: vsc  reason: default package */
/* loaded from: classes4.dex */
public class vsc {
    private static String a(String str) {
        return new String(str);
    }

    public static axjh b(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            axjh axjhVar = (axjh) it.next();
            if (Objects.equals(axjhVar.k(), str)) {
                return axjhVar;
            }
        }
        throw new vsb(str.length() != 0 ? "Could not find track of handler type ".concat(str) : new String("Could not find track of handler type "));
    }

    public static axjh c(List list) {
        return b(list, "vide");
    }

    public static int e(int i) {
        if (i != 1) {
            if (i == 2) {
                return 2;
            }
            StringBuilder sb = new StringBuilder(34);
            sb.append("Invalid channel count: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return 1;
    }

    public static boolean f(int i) {
        return i == 2;
    }

    public static ampq g(Context context) {
        ampq ampqVar;
        ampq ampqVar2;
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
            Context a = sre.a(context);
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                StrictMode.allowThreadDiskWrites();
                try {
                    File file = new File(a.getDir("phenotype_hermetic", 0), "overrides.txt");
                    ampqVar = file.exists() ? ampq.j(file) : amon.a;
                } catch (RuntimeException e) {
                    Log.e("HermeticFileOverrides", "no data dir", e);
                    ampqVar = amon.a;
                }
                if (ampqVar.h()) {
                    File file2 = (File) ampqVar.c();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                        try {
                            HashMap hashMap = new HashMap();
                            HashMap hashMap2 = new HashMap();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                String[] split = readLine.split(" ", 3);
                                if (split.length != 3) {
                                    Log.e("HermeticFileOverrides", readLine.length() != 0 ? "Invalid: ".concat(readLine) : new String("Invalid: "));
                                } else {
                                    String a2 = a(split[0]);
                                    String decode = Uri.decode(a(split[1]));
                                    String str3 = (String) hashMap2.get(split[2]);
                                    if (str3 == null) {
                                        String a3 = a(split[2]);
                                        str3 = Uri.decode(a3);
                                        if (str3.length() < 1024 || str3 == a3) {
                                            hashMap2.put(a3, str3);
                                        }
                                    }
                                    if (!hashMap.containsKey(a2)) {
                                        hashMap.put(a2, new HashMap());
                                    }
                                    ((Map) hashMap.get(a2)).put(decode, str3);
                                }
                            }
                            String.valueOf(String.valueOf(file2)).length();
                            vbg vbgVar = new vbg(hashMap);
                            bufferedReader.close();
                            ampqVar2 = ampq.j(vbgVar);
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable unused) {
                            }
                            throw th;
                        }
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    }
                } else {
                    ampqVar2 = amon.a;
                }
                return ampqVar2;
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
        return amon.a;
    }
}

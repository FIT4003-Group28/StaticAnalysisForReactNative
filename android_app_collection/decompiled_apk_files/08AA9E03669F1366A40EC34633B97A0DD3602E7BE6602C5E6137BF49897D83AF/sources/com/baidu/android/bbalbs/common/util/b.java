package com.baidu.android.bbalbs.common.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.baidu.android.bbalbs.common.a.d;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import javax.crypto.Cipher;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    private static C0036b f1471d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f1472a;

    /* renamed from: b  reason: collision with root package name */
    private int f1473b = 0;

    /* renamed from: c  reason: collision with root package name */
    private PublicKey f1474c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public ApplicationInfo f1475a;

        /* renamed from: b  reason: collision with root package name */
        public int f1476b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1477c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1478d;

        private a() {
            this.f1476b = 0;
            this.f1477c = false;
            this.f1478d = false;
        }

        /* synthetic */ a(c cVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.baidu.android.bbalbs.common.util.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0036b {

        /* renamed from: a  reason: collision with root package name */
        public String f1479a;

        /* renamed from: b  reason: collision with root package name */
        public String f1480b;

        /* renamed from: c  reason: collision with root package name */
        public int f1481c;

        private C0036b() {
            this.f1481c = 2;
        }

        /* synthetic */ C0036b(c cVar) {
            this();
        }

        public static C0036b a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("deviceid");
                String string2 = jSONObject.getString("imei");
                int i = jSONObject.getInt("ver");
                if (!TextUtils.isEmpty(string) && string2 != null) {
                    C0036b c0036b = new C0036b();
                    c0036b.f1479a = string;
                    c0036b.f1480b = string2;
                    c0036b.f1481c = i;
                    return c0036b;
                }
            } catch (JSONException e) {
                b.b(e);
            }
            return null;
        }

        public String a() {
            try {
                return new JSONObject().put("deviceid", this.f1479a).put("imei", this.f1480b).put("ver", this.f1481c).toString();
            } catch (JSONException e) {
                b.b(e);
                return null;
            }
        }

        public String b() {
            String str = this.f1480b;
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            String stringBuffer = new StringBuffer(str).reverse().toString();
            return this.f1479a + "|" + stringBuffer;
        }
    }

    private b(Context context) {
        this.f1472a = context.getApplicationContext();
        a();
    }

    public static String a(Context context) {
        return c(context).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(java.io.File r5) {
        /*
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            r5 = 8192(0x2000, float:1.14794E-41)
            char[] r5 = new char[r5]     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L3e
            java.io.CharArrayWriter r2 = new java.io.CharArrayWriter     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L3e
            r2.<init>()     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L3e
        Lf:
            int r3 = r1.read(r5)     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L3e
            if (r3 <= 0) goto L1a
            r4 = 0
            r2.write(r5, r4, r3)     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L3e
            goto Lf
        L1a:
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L3e
            if (r1 == 0) goto L28
            r1.close()     // Catch: java.lang.Exception -> L24
            return r5
        L24:
            r0 = move-exception
            b(r0)
        L28:
            return r5
        L29:
            r5 = move-exception
            goto L30
        L2b:
            r5 = move-exception
            r1 = r0
            goto L3f
        L2e:
            r5 = move-exception
            r1 = r0
        L30:
            b(r5)     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L3d
            r1.close()     // Catch: java.lang.Exception -> L39
            return r0
        L39:
            r5 = move-exception
            b(r5)
        L3d:
            return r0
        L3e:
            r5 = move-exception
        L3f:
            if (r1 == 0) goto L49
            r1.close()     // Catch: java.lang.Exception -> L45
            goto L49
        L45:
            r0 = move-exception
            b(r0)
        L49:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.android.bbalbs.common.util.b.a(java.io.File):java.lang.String");
    }

    private static String a(byte[] bArr) {
        StringBuilder sb;
        if (bArr == null) {
            throw new IllegalArgumentException("Argument b ( byte array ) is null! ");
        }
        String str = "";
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                sb = new StringBuilder();
                sb.append(str);
                str = "0";
            } else {
                sb = new StringBuilder();
            }
            sb.append(str);
            sb.append(hexString);
            str = sb.toString();
        }
        return str.toLowerCase();
    }

    private List<a> a(Intent intent, boolean z) {
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = this.f1472a.getPackageManager();
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers != null) {
            for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                if (resolveInfo.activityInfo != null && resolveInfo.activityInfo.applicationInfo != null) {
                    try {
                        Bundle bundle = packageManager.getReceiverInfo(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name), 128).metaData;
                        if (bundle != null) {
                            String string = bundle.getString("galaxy_data");
                            if (!TextUtils.isEmpty(string)) {
                                byte[] a2 = com.baidu.android.bbalbs.common.a.b.a(string.getBytes("utf-8"));
                                JSONObject jSONObject = new JSONObject(new String(a2));
                                a aVar = new a(null);
                                aVar.f1476b = jSONObject.getInt("priority");
                                aVar.f1475a = resolveInfo.activityInfo.applicationInfo;
                                if (this.f1472a.getPackageName().equals(resolveInfo.activityInfo.applicationInfo.packageName)) {
                                    aVar.f1478d = true;
                                }
                                if (z) {
                                    String string2 = bundle.getString("galaxy_sf");
                                    if (!TextUtils.isEmpty(string2)) {
                                        PackageInfo packageInfo = packageManager.getPackageInfo(resolveInfo.activityInfo.applicationInfo.packageName, 64);
                                        JSONArray jSONArray = jSONObject.getJSONArray("sigs");
                                        String[] strArr = new String[jSONArray.length()];
                                        for (int i = 0; i < strArr.length; i++) {
                                            strArr[i] = jSONArray.getString(i);
                                        }
                                        if (a(strArr, a(packageInfo.signatures))) {
                                            byte[] a3 = a(com.baidu.android.bbalbs.common.a.b.a(string2.getBytes()), this.f1474c);
                                            if (a3 != null && Arrays.equals(a3, d.a(a2))) {
                                                aVar.f1477c = true;
                                            }
                                        }
                                    }
                                }
                                arrayList.add(aVar);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        Collections.sort(arrayList, new c(this));
        return arrayList;
    }

    private void a() {
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        try {
            try {
                byteArrayInputStream = new ByteArrayInputStream(com.baidu.android.bbalbs.common.util.a.a());
                try {
                    this.f1474c = CertificateFactory.getInstance("X.509").generateCertificate(byteArrayInputStream).getPublicKey();
                    if (byteArrayInputStream == null) {
                        return;
                    }
                    byteArrayInputStream.close();
                } catch (Exception unused) {
                    if (byteArrayInputStream == null) {
                        return;
                    }
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th = th2;
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Exception e) {
                            b(e);
                        }
                    }
                    throw th;
                }
            } catch (Exception e2) {
                b(e2);
            }
        } catch (Exception unused2) {
            byteArrayInputStream = null;
        } catch (Throwable th3) {
            byteArrayInputStream = null;
            th = th3;
        }
    }

    private boolean a(String str) {
        FileOutputStream openFileOutput;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                openFileOutput = this.f1472a.openFileOutput("libcuid.so", 1);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            openFileOutput.write(str.getBytes());
            openFileOutput.flush();
            if (openFileOutput != null) {
                try {
                    openFileOutput.close();
                    return true;
                } catch (Exception e2) {
                    b(e2);
                }
            }
            return true;
        } catch (Exception e3) {
            e = e3;
            fileOutputStream = openFileOutput;
            b(e);
            if (fileOutputStream == null) {
                return false;
            }
            try {
                fileOutputStream.close();
                return false;
            } catch (Exception e4) {
                b(e4);
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = openFileOutput;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception e5) {
                    b(e5);
                }
            }
            throw th;
        }
    }

    private boolean a(String str, String str2) {
        try {
            return Settings.System.putString(this.f1472a.getContentResolver(), str, str2);
        } catch (Exception e) {
            b(e);
            return false;
        }
    }

    private boolean a(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null || strArr.length != strArr2.length) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            hashSet.add(str);
        }
        HashSet hashSet2 = new HashSet();
        for (String str2 : strArr2) {
            hashSet2.add(str2);
        }
        return hashSet.equals(hashSet2);
    }

    private static byte[] a(byte[] bArr, PublicKey publicKey) {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, publicKey);
        return cipher.doFinal(bArr);
    }

    private String[] a(Signature[] signatureArr) {
        String[] strArr = new String[signatureArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = a(d.a(signatureArr[i].toByteArray()));
        }
        return strArr;
    }

    private C0036b b() {
        boolean z;
        String str;
        List<a> a2 = a(new Intent("com.baidu.intent.action.GALAXY").setPackage(this.f1472a.getPackageName()), true);
        boolean z2 = false;
        if (a2 == null || a2.size() == 0) {
            for (int i = 0; i < 3; i++) {
                Log.w("DeviceId", "galaxy lib host missing meta-data,make sure you know the right way to integrate galaxy");
            }
            z = false;
        } else {
            a aVar = a2.get(0);
            z = aVar.f1477c;
            if (!aVar.f1477c) {
                for (int i2 = 0; i2 < 3; i2++) {
                    Log.w("DeviceId", "galaxy config err, In the release version of the signature should be matched");
                }
            }
        }
        File file = new File(this.f1472a.getFilesDir(), "libcuid.so");
        String str2 = null;
        C0036b a3 = file.exists() ? C0036b.a(f(a(file))) : null;
        if (a3 == null) {
            this.f1473b |= 16;
            List<a> a4 = a(new Intent("com.baidu.intent.action.GALAXY"), z);
            if (a4 != null) {
                String str3 = "files";
                File filesDir = this.f1472a.getFilesDir();
                if (!str3.equals(filesDir.getName())) {
                    Log.e("DeviceId", "fetal error:: app files dir name is unexpectedly :: " + filesDir.getAbsolutePath());
                    str3 = filesDir.getName();
                }
                for (a aVar2 : a4) {
                    if (!aVar2.f1478d) {
                        File file2 = new File(new File(aVar2.f1475a.dataDir, str3), "libcuid.so");
                        if (file2.exists() && (a3 = C0036b.a(f(a(file2)))) != null) {
                            break;
                        }
                    }
                }
            }
        }
        if (a3 == null) {
            a3 = C0036b.a(f(b("com.baidu.deviceid.v2")));
        }
        boolean c2 = c("android.permission.READ_EXTERNAL_STORAGE");
        if (a3 == null && c2) {
            this.f1473b |= 2;
            a3 = e();
        }
        if (a3 == null) {
            this.f1473b |= 8;
            a3 = d();
        }
        if (a3 != null || !c2) {
            str = null;
        } else {
            this.f1473b |= 1;
            String h = h("");
            z2 = true;
            str = h;
            a3 = d(h);
        }
        if (a3 == null) {
            this.f1473b |= 4;
            if (!z2) {
                str = h("");
            }
            a3 = new C0036b(null);
            String b2 = b(this.f1472a);
            a3.f1479a = com.baidu.android.bbalbs.common.a.c.a((Build.VERSION.SDK_INT < 23 ? str + b2 + UUID.randomUUID().toString() : "com.baidu" + b2).getBytes(), true);
            a3.f1480b = str;
        }
        File file3 = new File(this.f1472a.getFilesDir(), "libcuid.so");
        if ((this.f1473b & 16) != 0 || !file3.exists()) {
            if (TextUtils.isEmpty(null)) {
                str2 = e(a3.a());
            }
            a(str2);
        }
        boolean c3 = c();
        if (c3 && ((this.f1473b & 2) != 0 || TextUtils.isEmpty(b("com.baidu.deviceid.v2")))) {
            if (TextUtils.isEmpty(str2)) {
                str2 = e(a3.a());
            }
            a("com.baidu.deviceid.v2", str2);
        }
        if (c("android.permission.WRITE_EXTERNAL_STORAGE")) {
            File file4 = new File(Environment.getExternalStorageDirectory(), "backups/.SystemConfig/.cuid2");
            if ((this.f1473b & 8) != 0 || !file4.exists()) {
                if (TextUtils.isEmpty(str2)) {
                    str2 = e(a3.a());
                }
                g(str2);
            }
        }
        if (c3 && ((1 & this.f1473b) != 0 || TextUtils.isEmpty(b("com.baidu.deviceid")))) {
            a("com.baidu.deviceid", a3.f1479a);
            a("bd_setting_i", a3.f1480b);
        }
        if (c3 && !TextUtils.isEmpty(a3.f1480b)) {
            File file5 = new File(Environment.getExternalStorageDirectory(), "backups/.SystemConfig/.cuid");
            if ((this.f1473b & 2) != 0 || !file5.exists()) {
                b(a3.f1480b, a3.f1479a);
            }
        }
        return a3;
    }

    public static String b(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        return TextUtils.isEmpty(string) ? "" : string;
    }

    private String b(String str) {
        try {
            return Settings.System.getString(this.f1472a.getContentResolver(), str);
        } catch (Exception e) {
            b(e);
            return null;
        }
    }

    private static void b(String str, String str2) {
        File file;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file2 = new File(Environment.getExternalStorageDirectory(), "backups/.SystemConfig");
        File file3 = new File(file2, ".cuid");
        try {
            if (file2.exists() && !file2.isDirectory()) {
                Random random = new Random();
                File parentFile = file2.getParentFile();
                String name = file2.getName();
                do {
                    file = new File(parentFile, name + random.nextInt() + ".tmp");
                } while (file.exists());
                file2.renameTo(file);
                file.delete();
            }
            file2.mkdirs();
            FileWriter fileWriter = new FileWriter(file3, false);
            fileWriter.write(com.baidu.android.bbalbs.common.a.b.a(com.baidu.android.bbalbs.common.a.a.a("30212102dicudiab", "30212102dicudiab", (str + "=" + str2).getBytes()), "utf-8"));
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException | Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Throwable th) {
    }

    private static C0036b c(Context context) {
        if (f1471d == null) {
            synchronized (C0036b.class) {
                if (f1471d == null) {
                    SystemClock.uptimeMillis();
                    f1471d = new b(context).b();
                    SystemClock.uptimeMillis();
                }
            }
        }
        return f1471d;
    }

    private boolean c() {
        return c("android.permission.WRITE_SETTINGS");
    }

    private boolean c(String str) {
        return this.f1472a.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    private C0036b d() {
        String b2 = b("com.baidu.deviceid");
        String b3 = b("bd_setting_i");
        if (TextUtils.isEmpty(b3)) {
            b3 = h("");
            if (!TextUtils.isEmpty(b3)) {
                a("bd_setting_i", b3);
            }
        }
        if (TextUtils.isEmpty(b2)) {
            String b4 = b(this.f1472a);
            b2 = b(com.baidu.android.bbalbs.common.a.c.a(("com.baidu" + b3 + b4).getBytes(), true));
        }
        if (!TextUtils.isEmpty(b2)) {
            C0036b c0036b = new C0036b(null);
            c0036b.f1479a = b2;
            c0036b.f1480b = b3;
            return c0036b;
        }
        return null;
    }

    private C0036b d(String str) {
        boolean z;
        String str2;
        boolean z2 = Build.VERSION.SDK_INT < 23;
        if (!z2 || !TextUtils.isEmpty(str)) {
            String str3 = "";
            File file = new File(Environment.getExternalStorageDirectory(), "baidu/.cuid");
            if (file.exists()) {
                z = false;
            } else {
                file = new File(Environment.getExternalStorageDirectory(), "backups/.SystemConfig/.cuid");
                z = true;
            }
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append("\r\n");
                }
                bufferedReader.close();
                String[] split = new String(com.baidu.android.bbalbs.common.a.a.b("30212102dicudiab", "30212102dicudiab", com.baidu.android.bbalbs.common.a.b.a(sb.toString().getBytes()))).split("=");
                if (split != null && split.length == 2) {
                    if (z2 && str.equals(split[0])) {
                        str2 = split[1];
                    } else if (!z2) {
                        if (TextUtils.isEmpty(str)) {
                            str = split[1];
                        }
                        str2 = split[1];
                    }
                    str3 = str2;
                }
                if (!z) {
                    b(str, str3);
                }
            } catch (FileNotFoundException | IOException | Exception unused) {
            }
            if (TextUtils.isEmpty(str3)) {
                return null;
            }
            C0036b c0036b = new C0036b(null);
            c0036b.f1479a = str3;
            c0036b.f1480b = str;
            return c0036b;
        }
        return null;
    }

    private C0036b e() {
        File file = new File(Environment.getExternalStorageDirectory(), "backups/.SystemConfig/.cuid2");
        if (file.exists()) {
            String a2 = a(file);
            if (TextUtils.isEmpty(a2)) {
                return null;
            }
            try {
                return C0036b.a(new String(com.baidu.android.bbalbs.common.a.a.b("30212102dicudiab", "30212102dicudiab", com.baidu.android.bbalbs.common.a.b.a(a2.getBytes()))));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    private static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return com.baidu.android.bbalbs.common.a.b.a(com.baidu.android.bbalbs.common.a.a.a("30212102dicudiab", "30212102dicudiab", str.getBytes()), "utf-8");
        } catch (UnsupportedEncodingException | Exception e) {
            b(e);
            return "";
        }
    }

    private static String f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new String(com.baidu.android.bbalbs.common.a.a.b("30212102dicudiab", "30212102dicudiab", com.baidu.android.bbalbs.common.a.b.a(str.getBytes())));
        } catch (Exception e) {
            b(e);
            return "";
        }
    }

    private static void g(String str) {
        File file;
        File file2 = new File(Environment.getExternalStorageDirectory(), "backups/.SystemConfig");
        File file3 = new File(file2, ".cuid2");
        try {
            if (file2.exists() && !file2.isDirectory()) {
                Random random = new Random();
                File parentFile = file2.getParentFile();
                String name = file2.getName();
                do {
                    file = new File(parentFile, name + random.nextInt() + ".tmp");
                } while (file.exists());
                file2.renameTo(file);
                file.delete();
            }
            file2.mkdirs();
            FileWriter fileWriter = new FileWriter(file3, false);
            fileWriter.write(str);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException | Exception unused) {
        }
    }

    private String h(String str) {
        String str2 = null;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.f1472a.getSystemService("phone");
            if (telephonyManager != null) {
                str2 = telephonyManager.getDeviceId();
            }
        } catch (Exception e) {
            Log.e("DeviceId", "Read IMEI failed", e);
        }
        String i = i(str2);
        return TextUtils.isEmpty(i) ? str : i;
    }

    private static String i(String str) {
        return (str == null || !str.contains(":")) ? str : "";
    }
}

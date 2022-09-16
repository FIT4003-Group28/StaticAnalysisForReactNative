package com.crashlytics.android.beta;

import android.content.Context;
import android.content.pm.PackageManager;
import b.a.a.a.a.a.d;
import b.a.a.a.c;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
/* loaded from: classes.dex */
public class DeviceTokenLoader implements d<String> {
    private static final String BETA_APP_PACKAGE_NAME = "io.crash.air";
    private static final String DIRFACTOR_DEVICE_TOKEN_PREFIX = "assets/com.crashlytics.android.beta/dirfactor-device-token=";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.zip.ZipInputStream] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v3, types: [b.a.a.a.l] */
    @Override // b.a.a.a.a.a.d
    public String load(Context context) {
        ZipInputStream zipInputStreamOfApkFrom;
        long nanoTime = System.nanoTime();
        String str = "";
        ZipInputStream zipInputStream = 0;
        ZipInputStream zipInputStream2 = null;
        ZipInputStream zipInputStream3 = null;
        ZipInputStream zipInputStream4 = null;
        try {
            try {
                try {
                    zipInputStreamOfApkFrom = getZipInputStreamOfApkFrom(context, BETA_APP_PACKAGE_NAME);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (FileNotFoundException e) {
                e = e;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            c.h().e(Beta.TAG, "Failed to close the APK file", e3);
        }
        try {
            String determineDeviceToken = determineDeviceToken(zipInputStreamOfApkFrom);
            if (zipInputStreamOfApkFrom != null) {
                try {
                    zipInputStreamOfApkFrom.close();
                } catch (IOException e4) {
                    c.h().e(Beta.TAG, "Failed to close the APK file", e4);
                }
            }
            str = determineDeviceToken;
        } catch (PackageManager.NameNotFoundException unused2) {
            zipInputStream2 = zipInputStreamOfApkFrom;
            c.h().a(Beta.TAG, "Beta by Crashlytics app is not installed");
            if (zipInputStream2 != null) {
                zipInputStream2.close();
            }
            ?? h = c.h();
            zipInputStream = Beta.TAG;
            h.a(zipInputStream, "Beta device token load took " + ((System.nanoTime() - nanoTime) / 1000000.0d) + "ms");
            return str;
        } catch (FileNotFoundException e5) {
            zipInputStream3 = zipInputStreamOfApkFrom;
            e = e5;
            c.h().e(Beta.TAG, "Failed to find the APK file", e);
            if (zipInputStream3 != null) {
                zipInputStream3.close();
            }
            ?? h2 = c.h();
            zipInputStream = Beta.TAG;
            h2.a(zipInputStream, "Beta device token load took " + ((System.nanoTime() - nanoTime) / 1000000.0d) + "ms");
            return str;
        } catch (IOException e6) {
            zipInputStream4 = zipInputStreamOfApkFrom;
            e = e6;
            c.h().e(Beta.TAG, "Failed to read the APK file", e);
            if (zipInputStream4 != null) {
                zipInputStream4.close();
            }
            ?? h22 = c.h();
            zipInputStream = Beta.TAG;
            h22.a(zipInputStream, "Beta device token load took " + ((System.nanoTime() - nanoTime) / 1000000.0d) + "ms");
            return str;
        } catch (Throwable th2) {
            th = th2;
            zipInputStream = zipInputStreamOfApkFrom;
            if (zipInputStream != 0) {
                try {
                    zipInputStream.close();
                } catch (IOException e7) {
                    c.h().e(Beta.TAG, "Failed to close the APK file", e7);
                }
            }
            throw th;
        }
        ?? h222 = c.h();
        zipInputStream = Beta.TAG;
        h222.a(zipInputStream, "Beta device token load took " + ((System.nanoTime() - nanoTime) / 1000000.0d) + "ms");
        return str;
    }

    ZipInputStream getZipInputStreamOfApkFrom(Context context, String str) {
        return new ZipInputStream(new FileInputStream(context.getPackageManager().getApplicationInfo(str, 0).sourceDir));
    }

    String determineDeviceToken(ZipInputStream zipInputStream) {
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        if (nextEntry != null) {
            String name = nextEntry.getName();
            return name.startsWith(DIRFACTOR_DEVICE_TOKEN_PREFIX) ? name.substring(DIRFACTOR_DEVICE_TOKEN_PREFIX.length(), name.length() - 1) : "";
        }
        return "";
    }
}

package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.crashlytics.ndk.h;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a implements f {

    /* renamed from: d  reason: collision with root package name */
    private static final Charset f9167d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final Context f9168a;

    /* renamed from: b  reason: collision with root package name */
    private final e f9169b;

    /* renamed from: c  reason: collision with root package name */
    private final b f9170c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, e eVar, b bVar) {
        this.f9168a = context;
        this.f9169b = eVar;
        this.f9170c = bVar;
    }

    private static File a(File file, String str) {
        File[] listFiles;
        for (File file2 : file.listFiles()) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    private void a(String str, String str2, String str3) {
        b(new File(this.f9170c.a(str), str3), str2);
    }

    private static void b(File file, String str) {
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2 = null;
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), f9167d));
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(str);
            com.google.firebase.crashlytics.c.h.h.a((Closeable) bufferedWriter, "Failed to close " + file);
        } catch (IOException unused2) {
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.c.h.h.a((Closeable) bufferedWriter2, "Failed to close " + file);
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.c.h.h.a((Closeable) bufferedWriter2, "Failed to close " + file);
            throw th;
        }
    }

    @Override // com.google.firebase.crashlytics.ndk.f
    public void a(String str, int i, String str2, int i2, long j, long j2, boolean z, int i3, String str3, String str4) {
        a(str, j.a(i, str2, i2, j, j2, z, i3, str3, str4), "device.json");
    }

    @Override // com.google.firebase.crashlytics.ndk.f
    public void a(String str, String str2, long j) {
        a(str, j.a(str, str2, j), "session.json");
    }

    @Override // com.google.firebase.crashlytics.ndk.f
    public void a(String str, String str2, String str3, String str4, String str5, int i, String str6) {
        if (TextUtils.isEmpty(str6)) {
            str6 = "";
        }
        a(str, j.a(str2, str3, str4, str5, i, str6), "app.json");
    }

    @Override // com.google.firebase.crashlytics.ndk.f
    public void a(String str, String str2, String str3, boolean z) {
        a(str, j.a(str2, str3, z), "os.json");
    }

    @Override // com.google.firebase.crashlytics.ndk.f
    public boolean a(String str) {
        this.f9170c.b(str);
        return true;
    }

    @Override // com.google.firebase.crashlytics.ndk.f
    public boolean b(String str) {
        File file;
        return this.f9170c.c(str) && (file = d(str).f9174a) != null && file.exists();
    }

    @Override // com.google.firebase.crashlytics.ndk.f
    public boolean c(String str) {
        File a2 = this.f9170c.a(str);
        if (a2 != null) {
            try {
                return this.f9169b.a(a2.getCanonicalPath(), this.f9168a.getAssets());
            } catch (IOException e2) {
                com.google.firebase.crashlytics.c.b.a().b("Error initializing CrashlyticsNdk", e2);
                return false;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.ndk.f
    public h d(String str) {
        File a2 = this.f9170c.a(str);
        h.b bVar = new h.b();
        if (a2 != null && a2.exists()) {
            bVar.e(a(a2, ".dmp"));
            bVar.b(a(a2, ".maps"));
            bVar.d(a(a2, ".device_info"));
            bVar.g(new File(a2, "session.json"));
            bVar.a(new File(a2, "app.json"));
            bVar.c(new File(a2, "device.json"));
            bVar.f(new File(a2, "os.json"));
        }
        return bVar.a();
    }
}

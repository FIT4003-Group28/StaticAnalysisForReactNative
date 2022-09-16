package b.a.a.a;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FabricKitsFinder.java */
/* loaded from: classes.dex */
public class e implements Callable<Map<String, k>> {

    /* renamed from: a  reason: collision with root package name */
    final String f1265a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(String str) {
        this.f1265a = str;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public Map<String, k> call() {
        HashMap hashMap = new HashMap();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        hashMap.putAll(c());
        hashMap.putAll(d());
        l h = c.h();
        h.b("Fabric", "finish scanning in " + (SystemClock.elapsedRealtime() - elapsedRealtime));
        return hashMap;
    }

    private Map<String, k> c() {
        HashMap hashMap = new HashMap();
        try {
            Class.forName("com.google.android.gms.ads.AdView");
            k kVar = new k("com.google.firebase.firebase-ads", "0.0.0", "binary");
            hashMap.put(kVar.a(), kVar);
            c.h().b("Fabric", "Found kit: com.google.firebase.firebase-ads");
        } catch (Exception unused) {
        }
        return hashMap;
    }

    private Map<String, k> d() {
        k a2;
        HashMap hashMap = new HashMap();
        ZipFile b2 = b();
        Enumeration<? extends ZipEntry> entries = b2.entries();
        while (entries.hasMoreElements()) {
            ZipEntry nextElement = entries.nextElement();
            if (nextElement.getName().startsWith("fabric/") && nextElement.getName().length() > "fabric/".length() && (a2 = a(nextElement, b2)) != null) {
                hashMap.put(a2.a(), a2);
                c.h().b("Fabric", String.format("Found kit:[%s] version:[%s]", a2.a(), a2.b()));
            }
        }
        if (b2 != null) {
            try {
                b2.close();
            } catch (IOException unused) {
            }
        }
        return hashMap;
    }

    private k a(ZipEntry zipEntry, ZipFile zipFile) {
        InputStream inputStream;
        try {
            try {
                inputStream = zipFile.getInputStream(zipEntry);
                try {
                    Properties properties = new Properties();
                    properties.load(inputStream);
                    String property = properties.getProperty("fabric-identifier");
                    String property2 = properties.getProperty("fabric-version");
                    String property3 = properties.getProperty("fabric-build-type");
                    if (!TextUtils.isEmpty(property) && !TextUtils.isEmpty(property2)) {
                        k kVar = new k(property, property2, property3);
                        b.a.a.a.a.b.i.a((Closeable) inputStream);
                        return kVar;
                    }
                    throw new IllegalStateException("Invalid format of fabric file," + zipEntry.getName());
                } catch (IOException e) {
                    e = e;
                    c.h().e("Fabric", "Error when parsing fabric properties " + zipEntry.getName(), e);
                    b.a.a.a.a.b.i.a((Closeable) inputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                b.a.a.a.a.b.i.a(zipFile);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            zipFile = null;
            b.a.a.a.a.b.i.a(zipFile);
            throw th;
        }
    }

    protected ZipFile b() {
        return new ZipFile(this.f1265a);
    }
}

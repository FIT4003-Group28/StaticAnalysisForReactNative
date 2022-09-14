package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;
/* loaded from: classes.dex */
public class b extends l {

    /* renamed from: a  reason: collision with root package name */
    private Context f6456a;

    /* renamed from: b  reason: collision with root package name */
    private int f6457b;

    /* renamed from: c  reason: collision with root package name */
    private c f6458c;

    public b(Context context, int i) {
        this.f6456a = context.getApplicationContext();
        if (this.f6456a == null) {
            Log.w("SoLoader", "context.getApplicationContext returned null, holding reference to original context.");
            this.f6456a = context;
        }
        this.f6457b = i;
        this.f6458c = new c(new File(this.f6456a.getApplicationInfo().nativeLibraryDir), i);
    }

    @Override // com.facebook.soloader.l
    public int a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return this.f6458c.a(str, i, threadPolicy);
    }

    @Override // com.facebook.soloader.l
    public File a(String str) {
        return this.f6458c.a(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.soloader.l
    public void a(int i) {
        this.f6458c.a(i);
    }

    public boolean a() {
        try {
            File file = this.f6458c.f6459a;
            Context createPackageContext = this.f6456a.createPackageContext(this.f6456a.getPackageName(), 0);
            File file2 = new File(createPackageContext.getApplicationInfo().nativeLibraryDir);
            if (file.equals(file2)) {
                return false;
            }
            Log.d("SoLoader", "Native library directory updated from " + file + " to " + file2);
            this.f6457b = this.f6457b | 1;
            this.f6458c = new c(file2, this.f6457b);
            this.f6458c.a(this.f6457b);
            this.f6456a = createPackageContext;
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.facebook.soloader.l
    public String toString() {
        return this.f6458c.toString();
    }
}

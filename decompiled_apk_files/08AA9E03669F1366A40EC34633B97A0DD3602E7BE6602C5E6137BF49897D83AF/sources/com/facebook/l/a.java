package com.facebook.l;

import android.content.Context;
import android.util.Log;
import com.facebook.l.d;
import com.facebook.l.j;
import java.io.File;
import java.util.zip.ZipEntry;
/* compiled from: ApkSoSource.java */
/* loaded from: classes.dex */
public class a extends d {
    private final int f;

    public a(Context context, String str, int i) {
        super(context, str, new File(context.getApplicationInfo().sourceDir), "^lib/([^/]+)/([^/]+\\.so)$");
        this.f = i;
    }

    @Override // com.facebook.l.d, com.facebook.l.j
    protected j.e a() {
        return new C0064a();
    }

    /* compiled from: ApkSoSource.java */
    /* renamed from: com.facebook.l.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    protected class C0064a extends d.b {

        /* renamed from: c  reason: collision with root package name */
        private File f3023c;

        /* renamed from: d  reason: collision with root package name */
        private final int f3024d;

        C0064a() {
            super();
            this.f3023c = new File(a.this.e.getApplicationInfo().nativeLibraryDir);
            this.f3024d = a.this.f;
        }

        @Override // com.facebook.l.d.b
        protected boolean a(ZipEntry zipEntry, String str) {
            String name = zipEntry.getName();
            if ((this.f3024d & 1) == 0) {
                Log.d("ApkSoSource", "allowing consideration of " + name + ": self-extraction preferred");
                return true;
            }
            File file = new File(this.f3023c, str);
            if (!file.isFile()) {
                Log.d("ApkSoSource", String.format("allowing considering of %s: %s not in system lib dir", name, str));
                return true;
            }
            long length = file.length();
            long size = zipEntry.getSize();
            if (length != size) {
                Log.d("ApkSoSource", String.format("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", file, Long.valueOf(length), Long.valueOf(size)));
                return true;
            }
            Log.d("ApkSoSource", "not allowing consideration of " + name + ": deferring to libdir");
            return false;
        }
    }

    @Override // com.facebook.l.j
    protected byte[] b() {
        return i.d(this.f3032c);
    }
}

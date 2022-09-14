package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import com.facebook.soloader.f;
import com.facebook.soloader.n;
import java.io.File;
import java.util.zip.ZipEntry;
/* loaded from: classes.dex */
public class a extends f {

    /* renamed from: h  reason: collision with root package name */
    private final int f6452h;

    /* renamed from: com.facebook.soloader.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    protected class C0138a extends f.c {

        /* renamed from: f  reason: collision with root package name */
        private File f6453f;

        /* renamed from: g  reason: collision with root package name */
        private final int f6454g;

        C0138a(f fVar) {
            super(fVar);
            this.f6453f = new File(a.this.f6484c.getApplicationInfo().nativeLibraryDir);
            this.f6454g = a.this.f6452h;
        }

        @Override // com.facebook.soloader.f.c
        protected boolean a(ZipEntry zipEntry, String str) {
            String str2;
            String name = zipEntry.getName();
            boolean z = true;
            if (str.equals(a.this.f6485d)) {
                a.this.f6485d = null;
                str2 = String.format("allowing consideration of corrupted lib %s", str);
            } else if ((this.f6454g & 1) == 0) {
                str2 = "allowing consideration of " + name + ": self-extraction preferred";
            } else {
                File file = new File(this.f6453f, str);
                if (!file.isFile()) {
                    str2 = String.format("allowing considering of %s: %s not in system lib dir", name, str);
                } else {
                    long length = file.length();
                    long size = zipEntry.getSize();
                    if (length != size) {
                        str2 = String.format("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", file, Long.valueOf(length), Long.valueOf(size));
                    } else {
                        str2 = "not allowing consideration of " + name + ": deferring to libdir";
                        z = false;
                    }
                }
            }
            Log.d("ApkSoSource", str2);
            return z;
        }
    }

    public a(Context context, File file, String str, int i) {
        super(context, str, file, "^lib/([^/]+)/([^/]+\\.so)$");
        this.f6452h = i;
    }

    @Override // com.facebook.soloader.n
    protected byte[] a() {
        File canonicalFile = this.f6465f.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            obtain.writeInt(SysUtil.a(this.f6484c));
            if ((this.f6452h & 1) == 0) {
                obtain.writeByte((byte) 0);
                return obtain.marshall();
            }
            String str = this.f6484c.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                obtain.writeByte((byte) 1);
                return obtain.marshall();
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                obtain.writeByte((byte) 1);
                return obtain.marshall();
            }
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile2.getPath());
            obtain.writeLong(canonicalFile2.lastModified());
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.facebook.soloader.n
    protected n.f b() {
        return new C0138a(this);
    }
}

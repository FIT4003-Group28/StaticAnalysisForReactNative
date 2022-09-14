package com.google.firebase.crashlytics.c.h;

import com.google.firebase.crashlytics.c.j.v;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes.dex */
class x implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private final File f8790a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8791b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8792c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(String str, String str2, File file) {
        this.f8791b = str;
        this.f8792c = str2;
        this.f8790a = file;
    }

    private byte[] d() {
        byte[] bArr = new byte[8192];
        try {
            InputStream a2 = a();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            if (a2 == null) {
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                if (a2 != null) {
                    a2.close();
                }
                return null;
            }
            while (true) {
                int read = a2.read(bArr);
                if (read <= 0) {
                    break;
                }
                gZIPOutputStream.write(bArr, 0, read);
            }
            gZIPOutputStream.finish();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            if (a2 != null) {
                a2.close();
            }
            return byteArray;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.google.firebase.crashlytics.c.h.c0
    public InputStream a() {
        if (this.f8790a.exists() && this.f8790a.isFile()) {
            try {
                return new FileInputStream(this.f8790a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.c.h.c0
    public String b() {
        return this.f8792c;
    }

    @Override // com.google.firebase.crashlytics.c.h.c0
    public v.c.b c() {
        byte[] d2 = d();
        if (d2 != null) {
            v.c.b.a c2 = v.c.b.c();
            c2.a(d2);
            c2.a(this.f8791b);
            return c2.a();
        }
        return null;
    }
}

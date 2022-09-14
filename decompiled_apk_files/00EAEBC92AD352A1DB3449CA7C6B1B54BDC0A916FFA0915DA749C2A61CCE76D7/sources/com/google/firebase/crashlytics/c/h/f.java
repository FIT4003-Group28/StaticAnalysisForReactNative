package com.google.firebase.crashlytics.c.h;

import com.google.firebase.crashlytics.c.j.v;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes.dex */
class f implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f8625a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8626b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8627c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(String str, String str2, byte[] bArr) {
        this.f8626b = str;
        this.f8627c = str2;
        this.f8625a = bArr;
    }

    private byte[] d() {
        if (e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(this.f8625a);
            gZIPOutputStream.finish();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean e() {
        byte[] bArr = this.f8625a;
        return bArr == null || bArr.length == 0;
    }

    @Override // com.google.firebase.crashlytics.c.h.c0
    public InputStream a() {
        if (e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f8625a);
    }

    @Override // com.google.firebase.crashlytics.c.h.c0
    public String b() {
        return this.f8627c;
    }

    @Override // com.google.firebase.crashlytics.c.h.c0
    public v.c.b c() {
        byte[] d2 = d();
        if (d2 == null) {
            return null;
        }
        v.c.b.a c2 = v.c.b.c();
        c2.a(d2);
        c2.a(this.f8626b);
        return c2.a();
    }
}

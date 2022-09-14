package com.google.firebase.crashlytics.c.i;

import com.google.firebase.crashlytics.c.h.h;
import com.google.firebase.crashlytics.c.i.c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
/* loaded from: classes.dex */
class d implements com.google.firebase.crashlytics.c.i.a {

    /* renamed from: d  reason: collision with root package name */
    private static final Charset f8819d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final File f8820a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8821b;

    /* renamed from: c  reason: collision with root package name */
    private c f8822c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ byte[] f8823a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int[] f8824b;

        a(d dVar, byte[] bArr, int[] iArr) {
            this.f8823a = bArr;
            this.f8824b = iArr;
        }

        @Override // com.google.firebase.crashlytics.c.i.c.d
        public void a(InputStream inputStream, int i) {
            try {
                inputStream.read(this.f8823a, this.f8824b[0], i);
                int[] iArr = this.f8824b;
                iArr[0] = iArr[0] + i;
            } finally {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f8825a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8826b;

        b(d dVar, byte[] bArr, int i) {
            this.f8825a = bArr;
            this.f8826b = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(File file, int i) {
        this.f8820a = file;
        this.f8821b = i;
    }

    private void b(long j, String str) {
        int i;
        if (this.f8822c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > this.f8821b / 4) {
                str = "..." + str.substring(str.length() - i);
            }
            this.f8822c.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f8819d));
            while (!this.f8822c.b() && this.f8822c.d() > this.f8821b) {
                this.f8822c.c();
            }
        } catch (IOException e2) {
            com.google.firebase.crashlytics.c.b.a().b("There was a problem writing to the Crashlytics log.", e2);
        }
    }

    private b e() {
        if (!this.f8820a.exists()) {
            return null;
        }
        f();
        c cVar = this.f8822c;
        if (cVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[cVar.d()];
        try {
            this.f8822c.a(new a(this, bArr, iArr));
        } catch (IOException e2) {
            com.google.firebase.crashlytics.c.b.a().b("A problem occurred while reading the Crashlytics log file.", e2);
        }
        return new b(this, bArr, iArr[0]);
    }

    private void f() {
        if (this.f8822c == null) {
            try {
                this.f8822c = new c(this.f8820a);
            } catch (IOException e2) {
                com.google.firebase.crashlytics.c.b a2 = com.google.firebase.crashlytics.c.b.a();
                a2.b("Could not open log file: " + this.f8820a, e2);
            }
        }
    }

    @Override // com.google.firebase.crashlytics.c.i.a
    public void a() {
        h.a(this.f8822c, "There was a problem closing the Crashlytics log file.");
        this.f8822c = null;
    }

    @Override // com.google.firebase.crashlytics.c.i.a
    public void a(long j, String str) {
        f();
        b(j, str);
    }

    @Override // com.google.firebase.crashlytics.c.i.a
    public String b() {
        byte[] c2 = c();
        if (c2 != null) {
            return new String(c2, f8819d);
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.c.i.a
    public byte[] c() {
        b e2 = e();
        if (e2 == null) {
            return null;
        }
        int i = e2.f8826b;
        byte[] bArr = new byte[i];
        System.arraycopy(e2.f8825a, 0, bArr, 0, i);
        return bArr;
    }

    @Override // com.google.firebase.crashlytics.c.i.a
    public void d() {
        a();
        this.f8820a.delete();
    }
}

package b.a.a.a.a.d;

import android.content.Context;
import b.a.a.a.a.b.r;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: QueueFileEventStorage.java */
/* loaded from: classes.dex */
public class h implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1156a;

    /* renamed from: b  reason: collision with root package name */
    private final File f1157b;

    /* renamed from: c  reason: collision with root package name */
    private final String f1158c;

    /* renamed from: d  reason: collision with root package name */
    private final File f1159d;
    private r e;
    private File f;

    public h(Context context, File file, String str, String str2) {
        this.f1156a = context;
        this.f1157b = file;
        this.f1158c = str2;
        this.f1159d = new File(this.f1157b, str);
        this.e = new r(this.f1159d);
        e();
    }

    private void e() {
        this.f = new File(this.f1157b, this.f1158c);
        if (!this.f.exists()) {
            this.f.mkdirs();
        }
    }

    @Override // b.a.a.a.a.d.c
    public void a(byte[] bArr) {
        this.e.a(bArr);
    }

    @Override // b.a.a.a.a.d.c
    public int a() {
        return this.e.a();
    }

    @Override // b.a.a.a.a.d.c
    public void a(String str) {
        this.e.close();
        a(this.f1159d, new File(this.f, str));
        this.e = new r(this.f1159d);
    }

    private void a(File file, File file2) {
        FileInputStream fileInputStream;
        OutputStream a2;
        OutputStream outputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                a2 = a(file2);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
        try {
            b.a.a.a.a.b.i.a(fileInputStream, a2, new byte[1024]);
            b.a.a.a.a.b.i.a((Closeable) fileInputStream, "Failed to close file input stream");
            b.a.a.a.a.b.i.a((Closeable) a2, "Failed to close output stream");
            file.delete();
        } catch (Throwable th3) {
            outputStream = a2;
            th = th3;
            b.a.a.a.a.b.i.a((Closeable) fileInputStream, "Failed to close file input stream");
            b.a.a.a.a.b.i.a((Closeable) outputStream, "Failed to close output stream");
            file.delete();
            throw th;
        }
    }

    public OutputStream a(File file) {
        return new FileOutputStream(file);
    }

    @Override // b.a.a.a.a.d.c
    public List<File> a(int i) {
        ArrayList arrayList = new ArrayList();
        for (File file : this.f.listFiles()) {
            arrayList.add(file);
            if (arrayList.size() >= i) {
                break;
            }
        }
        return arrayList;
    }

    @Override // b.a.a.a.a.d.c
    public void a(List<File> list) {
        for (File file : list) {
            b.a.a.a.a.b.i.a(this.f1156a, String.format("deleting sent analytics file %s", file.getName()));
            file.delete();
        }
    }

    @Override // b.a.a.a.a.d.c
    public List<File> c() {
        return Arrays.asList(this.f.listFiles());
    }

    @Override // b.a.a.a.a.d.c
    public void d() {
        try {
            this.e.close();
        } catch (IOException unused) {
        }
        this.f1159d.delete();
    }

    @Override // b.a.a.a.a.d.c
    public boolean b() {
        return this.e.b();
    }

    @Override // b.a.a.a.a.d.c
    public boolean a(int i, int i2) {
        return this.e.a(i, i2);
    }
}

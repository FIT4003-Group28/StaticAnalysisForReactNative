package ezvcard.util;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Reader;
/* compiled from: Gobble.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final File f5616a;

    /* renamed from: b  reason: collision with root package name */
    private final InputStream f5617b;

    /* renamed from: c  reason: collision with root package name */
    private final Reader f5618c;

    public e(InputStream inputStream) {
        this(null, inputStream, null);
    }

    private e(File file, InputStream inputStream, Reader reader) {
        this.f5616a = file;
        this.f5617b = inputStream;
        this.f5618c = reader;
    }

    public byte[] a() {
        if (this.f5618c != null) {
            throw new IllegalStateException("Cannot get raw bytes from a Reader object.");
        }
        return a(b());
    }

    private InputStream b() {
        return this.f5617b == null ? new BufferedInputStream(new FileInputStream(this.f5616a)) : this.f5617b;
    }

    private byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    inputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            } catch (Throwable th) {
                inputStream.close();
                throw th;
            }
        }
    }
}

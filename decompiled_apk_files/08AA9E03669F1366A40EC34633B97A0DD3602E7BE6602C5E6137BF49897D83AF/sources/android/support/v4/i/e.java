package android.support.v4.i;

import android.util.Log;
import java.io.Writer;
/* compiled from: LogWriter.java */
/* loaded from: classes.dex */
public class e extends Writer {

    /* renamed from: a  reason: collision with root package name */
    private final String f449a;

    /* renamed from: b  reason: collision with root package name */
    private StringBuilder f450b = new StringBuilder(128);

    public e(String str) {
        this.f449a = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == '\n') {
                a();
            } else {
                this.f450b.append(c2);
            }
        }
    }

    private void a() {
        if (this.f450b.length() > 0) {
            Log.d(this.f449a, this.f450b.toString());
            this.f450b.delete(0, this.f450b.length());
        }
    }
}

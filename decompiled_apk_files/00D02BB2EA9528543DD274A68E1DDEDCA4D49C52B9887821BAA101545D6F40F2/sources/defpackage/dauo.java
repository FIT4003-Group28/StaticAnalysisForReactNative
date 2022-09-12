package defpackage;

import java.io.ByteArrayOutputStream;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dauo  reason: default package */
/* loaded from: classes5.dex */
public final class dauo extends ByteArrayOutputStream {
    private int a;
    private final int b;
    private boolean c;
    private final Level d;
    private final Logger e;

    public dauo(Logger logger, Level level) {
        dbsk.s(logger);
        this.e = logger;
        dbsk.s(level);
        this.d = level;
        dbsk.a(true);
        this.b = 16384;
    }

    private static void a(StringBuilder sb, int i) {
        if (i == 1) {
            sb.append("1 byte");
            return;
        }
        sb.append(NumberFormat.getInstance().format(i));
        sb.append(" bytes");
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.c) {
            if (this.a != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Total: ");
                a(sb, this.a);
                if (this.count != 0 && this.count < this.a) {
                    sb.append(" (logging first ");
                    a(sb, this.count);
                    sb.append(")");
                }
                this.e.logp(Level.CONFIG, "com.google.api.client.util.LoggingByteArrayOutputStream", "close", sb.toString());
                if (this.count != 0) {
                    this.e.logp(this.d, "com.google.api.client.util.LoggingByteArrayOutputStream", "close", toString("UTF-8").replaceAll("[\\x00-\\x09\\x0B\\x0C\\x0E-\\x1F\\x7F]", " "));
                }
            }
            this.c = true;
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        dbsk.a(!this.c);
        this.a++;
        if (this.count < this.b) {
            super.write(i);
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        dbsk.a(!this.c);
        this.a += i2;
        if (this.count < this.b) {
            int i3 = this.count + i2;
            int i4 = this.b;
            if (i3 > i4) {
                i2 += i4 - i3;
            }
            super.write(bArr, i, i2);
        }
    }
}

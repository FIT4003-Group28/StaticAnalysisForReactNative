package defpackage;

import java.io.OutputStream;
import java.io.Writer;
/* compiled from: PG */
/* renamed from: ddac  reason: default package */
/* loaded from: classes5.dex */
public final class ddac extends OutputStream {
    int a = 0;
    int b = 0;
    int c = 0;
    final /* synthetic */ Writer d;
    final /* synthetic */ ddad e;

    public ddac(ddad ddadVar, Writer writer) {
        this.e = ddadVar;
        this.d = writer;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.b;
        if (i > 0) {
            int i2 = this.a;
            dczy dczyVar = this.e.b;
            this.d.write(dczyVar.a((i2 << (dczyVar.d - i)) & dczyVar.c));
            this.c++;
            if (this.e.c != null) {
                while (true) {
                    int i3 = this.c;
                    ddad ddadVar = this.e;
                    if (i3 % ddadVar.b.e == 0) {
                        break;
                    }
                    this.d.write(ddadVar.c.charValue());
                    this.c++;
                }
            }
        }
        this.d.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.d.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.a = (i & 255) | (this.a << 8);
        this.b += 8;
        while (true) {
            int i2 = this.b;
            dczy dczyVar = this.e.b;
            int i3 = dczyVar.d;
            if (i2 >= i3) {
                this.d.write(dczyVar.a((this.a >> (i2 - i3)) & dczyVar.c));
                this.c++;
                this.b -= this.e.b.d;
            } else {
                return;
            }
        }
    }
}

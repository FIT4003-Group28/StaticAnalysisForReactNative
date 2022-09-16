package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ayjy  reason: default package */
/* loaded from: classes2.dex */
final class ayjy extends OutputStream {
    public final List a = new ArrayList();
    private aydn b;

    @Override // java.io.OutputStream
    public final void write(int i) {
        aydn aydnVar = this.b;
        if (aydnVar == null || aydnVar.b() <= 0) {
            write(new byte[]{(byte) i}, 0, 1);
        } else {
            this.b.a.put((byte) i);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (this.b == null) {
            aydn p = banl.p(i2);
            this.b = p;
            this.a.add(p);
        }
        while (i2 > 0) {
            int min = Math.min(i2, this.b.b());
            if (min == 0) {
                int a = this.b.a();
                aydn p2 = banl.p(Math.max(i2, a + a));
                this.b = p2;
                this.a.add(p2);
            } else {
                this.b.c(bArr, i, min);
                i += min;
                i2 -= min;
            }
        }
    }
}

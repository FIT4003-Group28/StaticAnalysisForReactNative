package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: dysr  reason: default package */
/* loaded from: classes6.dex */
final class dysr extends OutputStream {
    public final List<dyvs> a = new ArrayList();
    final /* synthetic */ dysu b;
    private dyvs c;

    public dysr(dysu dysuVar) {
        this.b = dysuVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        dyvs dyvsVar = this.c;
        if (dyvsVar == null || dyvsVar.c() <= 0) {
            write(new byte[]{(byte) i}, 0, 1);
        } else {
            this.c.b((byte) i);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (this.c == null) {
            dyvs a = this.b.a.a(i2);
            this.c = a;
            this.a.add(a);
        }
        while (i2 > 0) {
            int min = Math.min(i2, this.c.c());
            if (min == 0) {
                int d = this.c.d();
                dyvs a2 = this.b.a.a(Math.max(i2, d + d));
                this.c = a2;
                this.a.add(a2);
            } else {
                this.c.a(bArr, i, min);
                i += min;
                i2 -= min;
            }
        }
    }
}

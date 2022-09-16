package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;
/* compiled from: PG */
/* renamed from: azr  reason: default package */
/* loaded from: classes2.dex */
public final class azr {
    private final pwu a = new pwu(10);

    public final Metadata a(azf azfVar, pou pouVar) {
        Metadata metadata = null;
        int i = 0;
        while (true) {
            try {
                azfVar.j(this.a.a, 0, 10);
                this.a.G(0);
                if (this.a.k() != 4801587) {
                    break;
                }
                this.a.H(3);
                int h = this.a.h();
                int i2 = h + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.a.a, 0, bArr, 0, 10);
                    azfVar.j(bArr, 10, h);
                    metadata = new pov(pouVar).c(bArr, i2);
                } else {
                    azfVar.f(h);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        azfVar.l();
        azfVar.f(i);
        return metadata;
    }
}

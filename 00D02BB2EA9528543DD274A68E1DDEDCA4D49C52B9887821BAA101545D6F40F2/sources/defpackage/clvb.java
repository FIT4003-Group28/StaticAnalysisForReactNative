package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;
/* compiled from: PG */
/* renamed from: clvb  reason: default package */
/* loaded from: classes5.dex */
public final class clvb {
    private final cmnk a = new cmnk(10);

    public final Metadata a(cluk clukVar, cmcq cmcqVar) {
        Metadata metadata = null;
        int i = 0;
        while (true) {
            try {
                clukVar.f(this.a.a, 0, 10);
                this.a.f(0);
                if (this.a.o() != 4801587) {
                    break;
                }
                this.a.h(3);
                int u = this.a.u();
                int i2 = u + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.a.a, 0, bArr, 0, 10);
                    clukVar.f(bArr, 10, u);
                    metadata = new cmcs(cmcqVar).c(bArr, i2);
                } else {
                    clukVar.h(u);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        clukVar.i();
        clukVar.h(i);
        return metadata;
    }
}

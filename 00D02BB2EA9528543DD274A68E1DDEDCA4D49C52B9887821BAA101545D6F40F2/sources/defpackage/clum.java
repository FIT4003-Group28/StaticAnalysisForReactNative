package defpackage;

import com.google.android.exoplayer2.Format;
import java.io.EOFException;
/* compiled from: PG */
/* renamed from: clum  reason: default package */
/* loaded from: classes5.dex */
public final class clum implements clvk {
    private final byte[] a = new byte[4096];

    @Override // defpackage.clvk
    public final void a(Format format) {
    }

    @Override // defpackage.clvk
    public final void b(long j, int i, int i2, int i3, clvj clvjVar) {
    }

    @Override // defpackage.clvk
    public final int c(cmkd cmkdVar, int i, boolean z) {
        return clvi.a(this, cmkdVar, i, z);
    }

    @Override // defpackage.clvk
    public final void d(cmnk cmnkVar, int i) {
        clvi.b(this, cmnkVar, i);
    }

    @Override // defpackage.clvk
    public final int e(cmkd cmkdVar, int i, boolean z) {
        int a = cmkdVar.a(this.a, 0, Math.min(4096, i));
        if (a == -1) {
            if (!z) {
                throw new EOFException();
            }
            return -1;
        }
        return a;
    }

    @Override // defpackage.clvk
    public final void f(cmnk cmnkVar, int i) {
        cmnkVar.h(i);
    }
}

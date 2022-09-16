package defpackage;

import com.google.android.exoplayer2.Format;
import java.io.EOFException;
/* compiled from: PG */
/* renamed from: azd  reason: default package */
/* loaded from: classes2.dex */
public final class azd implements bab {
    private final byte[] a = new byte[4096];

    @Override // defpackage.bab
    public final /* synthetic */ int a(ast astVar, int i, boolean z) {
        return iy.d(this, astVar, i, z);
    }

    @Override // defpackage.bab
    public final /* synthetic */ void c(pwu pwuVar, int i) {
        iy.e(this, pwuVar, i);
    }

    @Override // defpackage.bab
    public final void d(pwu pwuVar, int i, int i2) {
        pwuVar.H(i);
    }

    @Override // defpackage.bab
    public final void e(long j, int i, int i2, int i3, baa baaVar) {
    }

    @Override // defpackage.bab
    public final int f(ast astVar, int i, boolean z) {
        int g = astVar.g(this.a, 0, Math.min(4096, i));
        if (g == -1) {
            if (!z) {
                throw new EOFException();
            }
            return -1;
        }
        return g;
    }

    @Override // defpackage.bab
    public final void rx(Format format) {
    }
}

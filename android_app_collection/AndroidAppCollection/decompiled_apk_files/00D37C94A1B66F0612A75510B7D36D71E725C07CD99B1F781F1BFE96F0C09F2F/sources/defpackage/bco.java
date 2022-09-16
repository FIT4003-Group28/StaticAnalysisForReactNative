package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: bco  reason: default package */
/* loaded from: classes2.dex */
final class bco extends bcr {
    public static final byte[] a = {79, 112, 117, 115, 72, 101, 97, 100};
    private boolean o;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bcr
    public final long a(pwu pwuVar) {
        byte[] bArr = pwuVar.a;
        int i = bArr[0] & 255;
        int i2 = i & 3;
        int i3 = 2;
        if (i2 == 0) {
            i3 = 1;
        } else if (i2 != 1 && i2 != 2) {
            i3 = bArr[1] & 63;
        }
        int i4 = i >> 3;
        int i5 = i4 & 3;
        return e(i3 * (i4 >= 16 ? 2500 << i5 : i4 >= 12 ? 10000 << (i5 & 1) : i5 == 3 ? 60000 : 10000 << i5));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bcr
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            this.o = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bcr
    public final boolean c(pwu pwuVar, long j, bcp bcpVar) {
        boolean z = true;
        if (!this.o) {
            byte[] copyOf = Arrays.copyOf(pwuVar.a, pwuVar.c);
            int f = iy.f(copyOf);
            List i = iy.i(copyOf);
            pis pisVar = new pis();
            pisVar.k = "audio/opus";
            pisVar.x = f;
            pisVar.y = 48000;
            pisVar.m = i;
            bcpVar.a = pisVar.a();
            this.o = true;
            return true;
        }
        ptx.a(bcpVar.a);
        if (pwuVar.d() != 1332770163) {
            z = false;
        }
        pwuVar.G(0);
        return z;
    }
}

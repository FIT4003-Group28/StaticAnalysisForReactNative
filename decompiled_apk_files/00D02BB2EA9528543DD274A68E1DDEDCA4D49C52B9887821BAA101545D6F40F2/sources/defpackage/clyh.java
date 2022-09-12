package defpackage;

import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clyh  reason: default package */
/* loaded from: classes5.dex */
public final class clyh extends clyk {
    public static final byte[] a = {79, 112, 117, 115, 72, 101, 97, 100};
    private boolean o;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.clyk
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.o = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.clyk
    public final long b(cmnk cmnkVar) {
        byte[] bArr = cmnkVar.a;
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
    @Override // defpackage.clyk
    public final boolean c(cmnk cmnkVar, long j, clyi clyiVar) {
        boolean z = true;
        if (!this.o) {
            byte[] copyOf = Arrays.copyOf(cmnkVar.a, cmnkVar.c);
            byte b = copyOf[9];
            List<byte[]> a2 = clsu.a(copyOf);
            clnf clnfVar = new clnf();
            clnfVar.k = "audio/opus";
            clnfVar.x = b & 255;
            clnfVar.y = 48000;
            clnfVar.m = a2;
            clyiVar.a = clnfVar.a();
            this.o = true;
            return true;
        }
        if (cmnkVar.r() != 1332770163) {
            z = false;
        }
        cmnkVar.f(0);
        return z;
    }
}

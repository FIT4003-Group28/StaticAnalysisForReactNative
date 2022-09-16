package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bcj  reason: default package */
/* loaded from: classes2.dex */
final class bcj extends bcr {
    private azn a;
    private bci o;

    private static boolean g(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bcr
    public final long a(pwu pwuVar) {
        if (g(pwuVar.a)) {
            int i = (pwuVar.a[2] & 255) >> 4;
            if (i != 6) {
                if (i == 7) {
                    i = 7;
                }
                int b = awz.b(pwuVar, i);
                pwuVar.G(0);
                return b;
            }
            pwuVar.H(4);
            pwuVar.r();
            int b2 = awz.b(pwuVar, i);
            pwuVar.G(0);
            return b2;
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bcr
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            this.a = null;
            this.o = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bcr
    public final boolean c(pwu pwuVar, long j, bcp bcpVar) {
        byte[] bArr = pwuVar.a;
        azn aznVar = this.a;
        if (aznVar == null) {
            azn aznVar2 = new azn(bArr, 17);
            this.a = aznVar2;
            bcpVar.a = aznVar2.d(Arrays.copyOfRange(bArr, 9, pwuVar.c), null);
            return true;
        } else if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            azm b = axm.b(pwuVar);
            azn c = aznVar.c(b);
            this.a = c;
            this.o = new bci(c, b);
            return true;
        } else if (!g(bArr)) {
            return true;
        } else {
            bci bciVar = this.o;
            if (bciVar != null) {
                bciVar.a = j;
                bcpVar.b = bciVar;
            }
            ptx.a(bcpVar.a);
            return false;
        }
    }
}

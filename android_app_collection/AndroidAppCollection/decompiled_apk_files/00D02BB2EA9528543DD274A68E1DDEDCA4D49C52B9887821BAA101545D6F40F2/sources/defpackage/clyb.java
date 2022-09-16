package defpackage;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clyb  reason: default package */
/* loaded from: classes5.dex */
public final class clyb extends clyk {
    private cluz a;
    private clya o;

    private static boolean g(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.clyk
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.a = null;
            this.o = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.clyk
    public final long b(cmnk cmnkVar) {
        if (g(cmnkVar.a)) {
            int i = (cmnkVar.a[2] & 255) >> 4;
            if (i != 6) {
                if (i == 7) {
                    i = 7;
                }
                int b = cluu.b(cmnkVar, i);
                cmnkVar.f(0);
                return b;
            }
            cmnkVar.h(4);
            cmnkVar.D();
            int b2 = cluu.b(cmnkVar, i);
            cmnkVar.f(0);
            return b2;
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.clyk
    public final boolean c(cmnk cmnkVar, long j, clyi clyiVar) {
        byte[] bArr = cmnkVar.a;
        cluz cluzVar = this.a;
        if (cluzVar == null) {
            cluz cluzVar2 = new cluz(bArr, 17);
            this.a = cluzVar2;
            clyiVar.a = cluzVar2.c(Arrays.copyOfRange(bArr, 9, cmnkVar.c), null);
            return true;
        } else if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            cluy a = cluw.a(cmnkVar);
            cluz e = cluzVar.e(a);
            this.a = e;
            this.o = new clya(e, a);
            return true;
        } else if (!g(bArr)) {
            return true;
        } else {
            clya clyaVar = this.o;
            if (clyaVar != null) {
                clyaVar.a = j;
                clyiVar.b = clyaVar;
            }
            return false;
        }
    }
}

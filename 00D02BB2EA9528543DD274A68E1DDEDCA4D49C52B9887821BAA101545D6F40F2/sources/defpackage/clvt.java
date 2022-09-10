package defpackage;
/* compiled from: PG */
/* renamed from: clvt  reason: default package */
/* loaded from: classes5.dex */
final class clvt implements cluf {
    private final cluz a;
    private final int b;
    private final clut c = new clut();

    public clvt(cluz cluzVar, int i) {
        this.a = cluzVar;
        this.b = i;
    }

    private final long c(cluk clukVar) {
        while (clukVar.j() < clukVar.b - 6) {
            cluz cluzVar = this.a;
            int i = this.b;
            clut clutVar = this.c;
            long j = clukVar.j();
            byte[] bArr = new byte[2];
            clukVar.f(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                clukVar.i();
                clukVar.h((int) (j - clukVar.c));
            } else {
                cmnk cmnkVar = new cmnk(16);
                System.arraycopy(bArr, 0, cmnkVar.a, 0, 2);
                cmnkVar.e(cluq.a(clukVar, cmnkVar.a, 2, 14));
                clukVar.i();
                clukVar.h((int) (j - clukVar.c));
                if (cluu.a(cmnkVar, cluzVar, i, clutVar)) {
                    break;
                }
            }
            clukVar.h(1);
        }
        long j2 = clukVar.j();
        long j3 = clukVar.b;
        if (j2 >= (-6) + j3) {
            clukVar.h((int) (j3 - clukVar.j()));
            return this.a.j;
        }
        return this.c.a;
    }

    @Override // defpackage.cluf
    public final void a() {
    }

    @Override // defpackage.cluf
    public final clue b(cluk clukVar, long j) {
        long j2 = clukVar.c;
        long c = c(clukVar);
        long j3 = clukVar.j();
        clukVar.h(Math.max(6, this.a.c));
        long c2 = c(clukVar);
        return (c > j || c2 <= j) ? c2 <= j ? clue.b(c2, clukVar.j()) : clue.a(c, j2) : clue.c(j3);
    }
}

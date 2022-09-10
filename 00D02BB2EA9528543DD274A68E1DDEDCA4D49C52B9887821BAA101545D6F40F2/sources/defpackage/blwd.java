package defpackage;
/* compiled from: PG */
/* renamed from: blwd  reason: default package */
/* loaded from: classes3.dex */
public final class blwd extends cjua {
    private final String a;
    private final int b;
    private final dvrh c;
    private final dbsg<dgci> d;
    private final String e;
    private final int f;

    public blwd(String str, int i, int i2, dvrh dvrhVar, cqat cqatVar, dbsg<dgci> dbsgVar, String str2) {
        super(cqatVar);
        this.a = str;
        this.b = i;
        this.f = i2;
        this.c = dvrhVar;
        this.d = dbsgVar;
        this.e = str2;
    }

    @Override // defpackage.cjua
    protected final dvra a() {
        dvqz bZ = dvra.f.bZ();
        dvrf bZ2 = dvri.f.bZ();
        String str = this.a;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dvri dvriVar = (dvri) bZ2.b;
        str.getClass();
        int i = dvriVar.a | 1;
        dvriVar.a = i;
        dvriVar.b = str;
        int i2 = this.b;
        int i3 = i | 2;
        dvriVar.a = i3;
        dvriVar.c = i2;
        int i4 = this.f;
        int i5 = i4 - 1;
        if (i4 != 0) {
            dvriVar.d = i5;
            int i6 = i3 | 4;
            dvriVar.a = i6;
            dvriVar.e = this.c.f;
            dvriVar.a = i6 | 8;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvra dvraVar = (dvra) bZ.b;
            dvri bK = bZ2.bK();
            bK.getClass();
            dvraVar.c = bK;
            dvraVar.b = 5;
            if (this.d.a()) {
                dgci b = this.d.b();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dvra dvraVar2 = (dvra) bZ.b;
                b.getClass();
                dvraVar2.d = b;
                dvraVar2.a |= 32;
            }
            String str2 = this.e;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvra dvraVar3 = (dvra) bZ.b;
            str2.getClass();
            dvraVar3.a |= 64;
            dvraVar3.e = str2;
            return bZ.bK();
        }
        throw null;
    }
}

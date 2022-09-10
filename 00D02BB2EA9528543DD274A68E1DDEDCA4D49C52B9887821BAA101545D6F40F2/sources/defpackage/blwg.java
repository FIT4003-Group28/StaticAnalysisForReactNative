package defpackage;
/* compiled from: PG */
/* renamed from: blwg  reason: default package */
/* loaded from: classes3.dex */
public final class blwg extends cjua {
    private final String a;
    private final String b;
    private final int c;
    private final boolean d;
    private final dbsg<dgci> e;
    private final String f;
    private final int g;

    public blwg(String str, blvu blvuVar, int i, int i2, boolean z, cqat cqatVar, dbsg<dgci> dbsgVar, String str2) {
        super(cqatVar);
        this.a = str;
        this.b = blvuVar.a().c("UNKNOWN_QUESTION_IDENTITY");
        this.c = i;
        this.g = i2;
        this.d = z;
        this.e = dbsgVar;
        this.f = str2;
    }

    @Override // defpackage.cjua
    protected final dvra a() {
        dvqz bZ = dvra.f.bZ();
        dvrw bZ2 = dvrx.g.bZ();
        String str = this.a;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dvrx dvrxVar = (dvrx) bZ2.b;
        str.getClass();
        int i = dvrxVar.a | 1;
        dvrxVar.a = i;
        dvrxVar.b = str;
        String str2 = this.b;
        str2.getClass();
        int i2 = i | 2;
        dvrxVar.a = i2;
        dvrxVar.c = str2;
        int i3 = this.c;
        int i4 = i2 | 4;
        dvrxVar.a = i4;
        dvrxVar.d = i3;
        int i5 = this.g;
        int i6 = i5 - 1;
        if (i5 != 0) {
            dvrxVar.e = i6;
            int i7 = i4 | 8;
            dvrxVar.a = i7;
            boolean z = this.d;
            dvrxVar.a = i7 | 16;
            dvrxVar.f = z;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvra dvraVar = (dvra) bZ.b;
            dvrx bK = bZ2.bK();
            bK.getClass();
            dvraVar.c = bK;
            dvraVar.b = 2;
            if (this.e.a()) {
                dgci b = this.e.b();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dvra dvraVar2 = (dvra) bZ.b;
                b.getClass();
                dvraVar2.d = b;
                dvraVar2.a |= 32;
            }
            String str3 = this.f;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvra dvraVar3 = (dvra) bZ.b;
            str3.getClass();
            dvraVar3.a |= 64;
            dvraVar3.e = str3;
            return bZ.bK();
        }
        throw null;
    }
}

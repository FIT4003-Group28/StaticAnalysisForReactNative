package defpackage;

import java.util.LinkedList;
/* compiled from: PG */
/* renamed from: blwc  reason: default package */
/* loaded from: classes3.dex */
public final class blwc extends cjua {
    private final blpk a;
    private final String b;
    private final dbsg<dgci> c;
    private final String d;
    private final int e;

    public blwc(blpk blpkVar, String str, cqat cqatVar, int i, dbsg<dgci> dbsgVar, String str2) {
        super(cqatVar);
        this.a = blpkVar;
        this.b = str;
        this.e = i;
        this.c = dbsgVar;
        this.d = str2;
    }

    @Override // defpackage.cjua
    protected final dvra a() {
        LinkedList linkedList = new LinkedList();
        dvqv bZ = dvqw.c.bZ();
        int i = this.e;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvqw dvqwVar = (dvqw) bZ.b;
        int i2 = i - 1;
        if (i != 0) {
            dvqwVar.b = i2;
            dvqwVar.a |= 1;
            linkedList.add(bZ.bK());
            dvqz bZ2 = dvra.f.bZ();
            dvqx bZ3 = dvqy.e.bZ();
            String str = this.b;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dvqy dvqyVar = (dvqy) bZ3.b;
            str.getClass();
            dvqyVar.a |= 1;
            dvqyVar.b = str;
            String blpkVar = this.a.toString();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dvqy dvqyVar2 = (dvqy) bZ3.b;
            blpkVar.getClass();
            dvqyVar2.a |= 2;
            dvqyVar2.c = blpkVar;
            dvqy dvqyVar3 = (dvqy) bZ3.b;
            dsrj<dvqw> dsrjVar = dvqyVar3.d;
            if (!dsrjVar.a()) {
                dvqyVar3.d = dsqw.cl(dsrjVar);
            }
            dsod.bv(linkedList, dvqyVar3.d);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dvra dvraVar = (dvra) bZ2.b;
            dvqy bK = bZ3.bK();
            bK.getClass();
            dvraVar.c = bK;
            dvraVar.b = 1;
            if (this.c.a()) {
                dgci b = this.c.b();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dvra dvraVar2 = (dvra) bZ2.b;
                b.getClass();
                dvraVar2.d = b;
                dvraVar2.a |= 32;
            }
            String str2 = this.d;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dvra dvraVar3 = (dvra) bZ2.b;
            str2.getClass();
            dvraVar3.a |= 64;
            dvraVar3.e = str2;
            return bZ2.bK();
        }
        throw null;
    }
}

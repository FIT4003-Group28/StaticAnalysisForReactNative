package defpackage;

import java.util.LinkedList;
/* compiled from: PG */
/* renamed from: blwe  reason: default package */
/* loaded from: classes3.dex */
public final class blwe extends cjua {
    private final String a;
    private final int b;
    private final dcdc<dvrm> c;
    private final dbsg<dgci> d;
    private final String e;
    private final int f;

    public blwe(String str, int i, int i2, dcdc<dvrm> dcdcVar, cqat cqatVar, dbsg<dgci> dbsgVar, String str2) {
        super(cqatVar);
        this.a = str;
        this.b = i;
        this.f = i2;
        this.c = dcdcVar;
        this.d = dbsgVar;
        this.e = str2;
    }

    @Override // defpackage.cjua
    protected final dvra a() {
        LinkedList linkedList = new LinkedList();
        dcdc<dvrm> dcdcVar = this.c;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dvrm dvrmVar = dcdcVar.get(i);
            dvrk bZ = dvrn.c.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvrn dvrnVar = (dvrn) bZ.b;
            dvrnVar.b = dvrmVar.k;
            dvrnVar.a |= 1;
            linkedList.add(bZ.bK());
        }
        dvqz bZ2 = dvra.f.bZ();
        dvrj bZ3 = dvro.f.bZ();
        String str = this.a;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dvro dvroVar = (dvro) bZ3.b;
        str.getClass();
        int i2 = dvroVar.a | 1;
        dvroVar.a = i2;
        dvroVar.b = str;
        int i3 = this.b;
        int i4 = i2 | 2;
        dvroVar.a = i4;
        dvroVar.c = i3;
        int i5 = this.f;
        int i6 = i5 - 1;
        if (i5 != 0) {
            dvroVar.d = i6;
            dvroVar.a = i4 | 4;
            dvro dvroVar2 = (dvro) bZ3.b;
            dsrj<dvrn> dsrjVar = dvroVar2.e;
            if (!dsrjVar.a()) {
                dvroVar2.e = dsqw.cl(dsrjVar);
            }
            dsod.bv(linkedList, dvroVar2.e);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dvra dvraVar = (dvra) bZ2.b;
            dvro bK = bZ3.bK();
            bK.getClass();
            dvraVar.c = bK;
            dvraVar.b = 4;
            if (this.d.a()) {
                dgci b = this.d.b();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dvra dvraVar2 = (dvra) bZ2.b;
                b.getClass();
                dvraVar2.d = b;
                dvraVar2.a |= 32;
            }
            String str2 = this.e;
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

package defpackage;

import java.util.Map;
/* renamed from: bdhi  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bdhi implements dbrn {
    static final dbrn a = new bdhi();

    private bdhi() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        String str = (String) entry.getKey();
        String str2 = (String) entry.getValue();
        if (dbsj.d(str) || dbsj.d(str2)) {
            return null;
        }
        dwfi bZ = dwfl.w.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfl dwflVar = (dwfl) bZ.b;
        str2.getClass();
        int i = dwflVar.a | 128;
        dwflVar.a = i;
        dwflVar.h = str2;
        str.getClass();
        dwflVar.a = i | 4;
        dwflVar.d = str;
        dizg bZ2 = dizh.j.bZ();
        dggf bZ3 = dggg.d.bZ();
        dgge dggeVar = dgge.MEDIA_GUESSABLE_FIFE;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dggg dgggVar = (dggg) bZ3.b;
        dgggVar.b = dggeVar.l;
        int i2 = dgggVar.a | 1;
        dgggVar.a = i2;
        str.getClass();
        dgggVar.a = i2 | 2;
        dgggVar.c = str;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dizh dizhVar = (dizh) bZ2.b;
        dggg bK = bZ3.bK();
        bK.getClass();
        dizhVar.b = bK;
        dizhVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfl dwflVar2 = (dwfl) bZ.b;
        dizh bK2 = bZ2.bK();
        bK2.getClass();
        dwflVar2.p = bK2;
        dwflVar2.a |= 32768;
        return bZ.bK();
    }
}

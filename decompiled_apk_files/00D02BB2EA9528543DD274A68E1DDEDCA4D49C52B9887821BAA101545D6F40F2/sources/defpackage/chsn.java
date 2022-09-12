package defpackage;
/* renamed from: chsn  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class chsn implements dbrn {
    static final dbrn a = new chsn();

    private chsn() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dpnk dpnkVar;
        dpnm dpnmVar;
        dpnm dpnmVar2;
        dpnn dpnnVar = (dpnn) obj;
        chwz bZ = chxe.f.bZ();
        String str = dpnnVar.c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        chxe chxeVar = (chxe) bZ.b;
        str.getClass();
        int i = chxeVar.a | 1;
        chxeVar.a = i;
        chxeVar.d = str;
        String str2 = dpnnVar.d;
        str2.getClass();
        chxeVar.a = i | 2;
        chxeVar.e = str2;
        int i2 = dpnnVar.a;
        if (i2 == 4) {
            chxc bZ2 = chxd.d.bZ();
            if (dpnnVar.a == 4) {
                dpnmVar = (dpnm) dpnnVar.b;
            } else {
                dpnmVar = dpnm.c;
            }
            String str3 = dpnmVar.a;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            chxd chxdVar = (chxd) bZ2.b;
            str3.getClass();
            chxdVar.a |= 1;
            chxdVar.b = str3;
            if (dpnnVar.a == 4) {
                dpnmVar2 = (dpnm) dpnnVar.b;
            } else {
                dpnmVar2 = dpnm.c;
            }
            float f = dpnmVar2.b;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            chxd chxdVar2 = (chxd) bZ2.b;
            chxdVar2.a |= 2;
            chxdVar2.c = f;
            chxd bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            chxe chxeVar2 = (chxe) bZ.b;
            bK.getClass();
            chxeVar2.c = bK;
            chxeVar2.b = 4;
        } else if (i2 == 3) {
            chxa bZ3 = chxb.c.bZ();
            if (dpnnVar.a == 3) {
                dpnkVar = (dpnk) dpnnVar.b;
            } else {
                dpnkVar = dpnk.b;
            }
            String str4 = dpnkVar.a;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            chxb chxbVar = (chxb) bZ3.b;
            str4.getClass();
            chxbVar.a |= 1;
            chxbVar.b = str4;
            chxb bK2 = bZ3.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            chxe chxeVar3 = (chxe) bZ.b;
            bK2.getClass();
            chxeVar3.c = bK2;
            chxeVar3.b = 3;
        }
        return bZ.bK();
    }
}

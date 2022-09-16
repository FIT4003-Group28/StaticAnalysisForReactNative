package defpackage;
/* renamed from: bque  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bque implements dbrn {
    static final dbrn a = new bque();

    private bque() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        bqtn bqtnVar = (bqtn) obj;
        dqwn bZ = dqwo.d.bZ();
        dqwj bZ2 = dqwm.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dqwm dqwmVar = (dqwm) bZ2.b;
        dqwmVar.c = 1;
        int i = dqwmVar.a | 2;
        dqwmVar.a = i;
        dqwmVar.b = bqtnVar.a.i;
        dqwmVar.a = i | 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqwo dqwoVar = (dqwo) bZ.b;
        dqwm bK = bZ2.bK();
        bK.getClass();
        dqwoVar.b = bK;
        dqwoVar.a |= 1;
        dqwf bZ3 = dqwg.c.bZ();
        dqxt bZ4 = dqxu.c.bZ();
        int intValue = bqtnVar.k().intValue();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dqxu dqxuVar = (dqxu) bZ4.b;
        dqxuVar.a |= 1;
        dqxuVar.b = intValue;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dqwg dqwgVar = (dqwg) bZ3.b;
        dqxu bK2 = bZ4.bK();
        bK2.getClass();
        dqwgVar.b = bK2;
        dqwgVar.a = 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqwo dqwoVar2 = (dqwo) bZ.b;
        dqwg bK3 = bZ3.bK();
        bK3.getClass();
        dqwoVar2.c = bK3;
        dqwoVar2.a |= 2;
        return bZ.bK();
    }
}

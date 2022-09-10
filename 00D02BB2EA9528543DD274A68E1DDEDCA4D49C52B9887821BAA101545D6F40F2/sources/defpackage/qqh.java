package defpackage;
/* compiled from: PG */
/* renamed from: qqh  reason: default package */
/* loaded from: classes7.dex */
public class qqh {
    public static dnlg a(dnlc dnlcVar, amve amveVar) {
        dnku bZ = dnlg.c.bZ();
        if (amveVar.v() && (amveVar.a.a & 64) != 0) {
            dnkx bZ2 = dnld.e.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnld dnldVar = (dnld) bZ2.b;
            dnlcVar.getClass();
            dnldVar.b = dnlcVar;
            int i = dnldVar.a | 1;
            dnldVar.a = i;
            dspd dspdVar = amveVar.a.g;
            dspdVar.getClass();
            dnldVar.a = i | 2;
            dnldVar.c = dspdVar;
            if (amveVar.e() > 0) {
                amtr d = amveVar.d(0);
                for (int i2 = 0; i2 < d.e(); i2++) {
                    dspd dspdVar2 = d.d(i2).a.f;
                    dnky bZ3 = dnkz.c.bZ();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dnkz dnkzVar = (dnkz) bZ3.b;
                    dspdVar2.getClass();
                    dnkzVar.a |= 1;
                    dnkzVar.b = dspdVar2;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dnld dnldVar2 = (dnld) bZ2.b;
                    dnkz bK = bZ3.bK();
                    bK.getClass();
                    dnldVar2.b();
                    dnldVar2.d.add(bK);
                }
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnlg dnlgVar = (dnlg) bZ.b;
            dnld bK2 = bZ2.bK();
            bK2.getClass();
            dnlgVar.b = bK2;
            dnlgVar.a = 3;
        }
        return bZ.bK();
    }

    public static dnlc b(int i) {
        dnla bZ = dnlc.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnlc dnlcVar = (dnlc) bZ.b;
        dnlcVar.b = i - 1;
        dnlcVar.a |= 1;
        return bZ.bK();
    }
}

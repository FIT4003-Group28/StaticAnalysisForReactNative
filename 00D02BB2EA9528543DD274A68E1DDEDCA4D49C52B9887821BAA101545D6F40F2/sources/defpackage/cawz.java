package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: cawz  reason: default package */
/* loaded from: classes4.dex */
public final class cawz {
    public static cawy a(dwul dwulVar) {
        cawx bZ = cawy.h.bZ();
        boolean z = dwulVar.i;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cawy cawyVar = (cawy) bZ.b;
        cawyVar.a |= 2;
        cawyVar.c = z;
        dkfx dkfxVar = dwulVar.k;
        if (dkfxVar == null) {
            dkfxVar = dkfx.d;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cawy cawyVar2 = (cawy) bZ.b;
        dkfxVar.getClass();
        cawyVar2.e = dkfxVar;
        cawyVar2.a |= 8;
        dori doriVar = dwulVar.b;
        if (doriVar == null) {
            doriVar = dori.l;
        }
        if (!doriVar.d.isEmpty()) {
            dqkm bZ2 = dqkn.e.bZ();
            dori doriVar2 = dwulVar.b;
            if (doriVar2 == null) {
                doriVar2 = dori.l;
            }
            String str = doriVar2.d;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dqkn dqknVar = (dqkn) bZ2.b;
            str.getClass();
            dqknVar.a |= 1;
            dqknVar.b = str;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cawy cawyVar3 = (cawy) bZ.b;
            dqkn bK = bZ2.bK();
            bK.getClass();
            cawyVar3.b = bK;
            cawyVar3.a |= 1;
        }
        dori doriVar3 = dwulVar.b;
        if (doriVar3 == null) {
            doriVar3 = dori.l;
        }
        if ((doriVar3.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
            dori doriVar4 = dwulVar.b;
            if (doriVar4 == null) {
                doriVar4 = dori.l;
            }
            dqwa dqwaVar = doriVar4.j;
            if (dqwaVar == null) {
                dqwaVar = dqwa.g;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cawy cawyVar4 = (cawy) bZ.b;
            dqwaVar.getClass();
            cawyVar4.d = dqwaVar;
            cawyVar4.a |= 4;
        }
        dwty dwtyVar = dwulVar.f;
        if (dwtyVar == null) {
            dwtyVar = dwty.c;
        }
        dwtx dwtxVar = dwtyVar.a;
        if (dwtxVar == null) {
            dwtxVar = dwtx.e;
        }
        if ((dwtxVar.a & 4) != 0) {
            dwty dwtyVar2 = dwulVar.f;
            if (dwtyVar2 == null) {
                dwtyVar2 = dwty.c;
            }
            diod bZ3 = diog.d.bZ();
            dinw dinwVar = dwtyVar2.b;
            if (dinwVar == null) {
                dinwVar = dinw.b;
            }
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            diog diogVar = (diog) bZ3.b;
            dinwVar.getClass();
            diogVar.c = dinwVar;
            diogVar.a |= 2;
            dioe bZ4 = diof.c.bZ();
            dwtx dwtxVar2 = dwtyVar2.a;
            if (dwtxVar2 == null) {
                dwtxVar2 = dwtx.e;
            }
            dioi dioiVar = dwtxVar2.d;
            if (dioiVar == null) {
                dioiVar = dioi.c;
            }
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            diof diofVar = (diof) bZ4.b;
            dioiVar.getClass();
            diofVar.b = dioiVar;
            diofVar.a |= 1;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            diog diogVar2 = (diog) bZ3.b;
            diof bK2 = bZ4.bK();
            bK2.getClass();
            diogVar2.b = bK2;
            diogVar2.a |= 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cawy cawyVar5 = (cawy) bZ.b;
            diog bK3 = bZ3.bK();
            bK3.getClass();
            cawyVar5.f = bK3;
            cawyVar5.a |= 16;
        }
        if ((dwulVar.a & 128) != 0) {
            dwui dwuiVar = dwulVar.h;
            if (dwuiVar == null) {
                dwuiVar = dwui.c;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cawy cawyVar6 = (cawy) bZ.b;
            dwuiVar.getClass();
            cawyVar6.g = dwuiVar;
            cawyVar6.a |= 32;
        }
        return bZ.bK();
    }
}

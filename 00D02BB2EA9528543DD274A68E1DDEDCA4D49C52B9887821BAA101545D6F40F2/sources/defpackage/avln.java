package defpackage;
/* compiled from: PG */
/* renamed from: avln  reason: default package */
/* loaded from: classes3.dex */
public final class avln extends avlo {
    private avln(drte drteVar) {
        super(drteVar);
    }

    public static avln a(drtc drtcVar, int i, String str) {
        drtd bZ = drte.g.bZ();
        int i2 = drtcVar.s;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drte drteVar = (drte) bZ.b;
        int i3 = drteVar.a | 1;
        drteVar.a = i3;
        drteVar.b = i2;
        int i4 = drtcVar.s;
        int i5 = i3 | 8;
        drteVar.a = i5;
        drteVar.e = i4;
        str.getClass();
        drteVar.a = i5 | 4;
        drteVar.d = str;
        dtrn dtrnVar = (dtrn) dtro.a.bZ();
        dsqv<dtro, aviv> dsqvVar = aviv.d;
        avis bZ2 = aviv.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        aviv avivVar = (aviv) bZ2.b;
        avivVar.b = i - 1;
        avivVar.a |= 1;
        dtrnVar.k(dsqvVar, bZ2.bK());
        dtro dtroVar = (dtro) dtrnVar.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drte drteVar2 = (drte) bZ.b;
        dtroVar.getClass();
        drteVar2.f = dtroVar;
        drteVar2.a |= 16;
        return new avln(bZ.bK());
    }
}

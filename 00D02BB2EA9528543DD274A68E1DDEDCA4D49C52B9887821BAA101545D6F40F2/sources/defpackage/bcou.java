package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: bcou  reason: default package */
/* loaded from: classes3.dex */
public final class bcou implements dbty<crwb> {
    private final dvmb a;
    private final dbsg<String> b;
    private final crvz c;

    public bcou(bvjj bvjjVar, btvo btvoVar, aukk aukkVar, auhi auhiVar) {
        dbsg<String> dbsgVar;
        this.c = crvz.b(bvjjVar.s(bvjk.aa, Integer.decode("2").intValue()));
        dvmb dvmbVar = btvoVar.getPhotoUploadParameters().a;
        this.a = dvmbVar == null ? dvmb.f : dvmbVar;
        if (ako.a()) {
            aukkVar.a(false);
            aujb h = auhiVar.h(dpyv.GEO_PHOTO_UPLOADS.dm);
            if (h != null) {
                dbsgVar = dbsg.j(h.a().b(-1));
                this.b = dbsgVar;
            }
        }
        dbsgVar = dbpy.a;
        this.b = dbsgVar;
    }

    @Override // defpackage.dbty
    /* renamed from: b */
    public final crwb a() {
        dvmb dvmbVar = this.a;
        boolean z = dvmbVar.b;
        boolean z2 = dvmbVar.a;
        boolean z3 = dvmbVar.d;
        crwa bZ = crwb.y.bZ();
        crvz crvzVar = this.c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        crwb crwbVar = (crwb) bZ.b;
        crwbVar.b = crvzVar.d;
        int i = crwbVar.a | 1;
        crwbVar.a = i;
        crwbVar.a = i | 4096;
        crwbVar.n = 262144;
        dvmb dvmbVar2 = this.a;
        boolean z4 = dvmbVar2.c;
        boolean z5 = dvmbVar2.e;
        crwc bZ2 = crwd.f.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        crwd crwdVar = (crwd) bZ2.b;
        crwdVar.a |= 1;
        crwdVar.b = 2131232784;
        crwd crwdVar2 = (crwd) bZ2.b;
        int i2 = crwdVar2.a | 4;
        crwdVar2.a = i2;
        crwdVar2.d = z4;
        crwdVar2.a = i2 | 8;
        crwdVar2.e = z5;
        if (this.b.a()) {
            String b = this.b.b();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            crwd crwdVar3 = (crwd) bZ2.b;
            b.getClass();
            crwdVar3.a |= 2;
            crwdVar3.c = b;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        crwb crwbVar2 = (crwb) bZ.b;
        crwd bK = bZ2.bK();
        bK.getClass();
        crwbVar2.g = bK;
        crwbVar2.a |= 32;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        crwb crwbVar3 = (crwb) bZ.b;
        crwbVar3.a |= 16384;
        crwbVar3.p = true;
        crwb crwbVar4 = (crwb) bZ.b;
        int i3 = crwbVar4.a | 32768;
        crwbVar4.a = i3;
        crwbVar4.q = 21600;
        int i4 = i3 | ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        crwbVar4.a = i4;
        crwbVar4.r = cpnx.a;
        int i5 = i4 | 512;
        crwbVar4.a = i5;
        crwbVar4.k = z;
        int i6 = i5 | 256;
        crwbVar4.a = i6;
        crwbVar4.j = z2;
        crwbVar4.a = i6 | 131072;
        crwbVar4.s = true;
        crwb crwbVar5 = (crwb) bZ.b;
        int i7 = crwbVar5.a | 8192;
        crwbVar5.a = i7;
        crwbVar5.o = z3;
        crwbVar5.a = 524288 | i7;
        crwbVar5.u = false;
        crwb crwbVar6 = (crwb) bZ.b;
        crwbVar6.a |= 4194304;
        crwbVar6.x = true;
        return bZ.bK();
    }
}

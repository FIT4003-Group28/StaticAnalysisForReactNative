package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: bwbl  reason: default package */
/* loaded from: classes4.dex */
public final class bwbl extends bvxb<dfvc, dfve> {
    private final ahjq a;

    public bwbl(ahjq ahjqVar) {
        this.a = ahjqVar;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "loc.cl";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bvxb
    public final /* bridge */ /* synthetic */ dfve e(dfvc dfvcVar) {
        dfve bK;
        GmmLocation a = this.a.a();
        if (a == null) {
            dfvd bZ = dfve.g.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfve dfveVar = (dfve) bZ.b;
            dfveVar.a = 1 | dfveVar.a;
            dfveVar.b = false;
            bK = bZ.bK();
        } else {
            dfvd bZ2 = dfve.g.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dfve dfveVar2 = (dfve) bZ2.b;
            dfveVar2.a |= 1;
            dfveVar2.b = true;
            double latitude = a.getLatitude();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dfve dfveVar3 = (dfve) bZ2.b;
            dfveVar3.a |= 2;
            dfveVar3.c = latitude;
            double longitude = a.getLongitude();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dfve dfveVar4 = (dfve) bZ2.b;
            dfveVar4.a |= 4;
            dfveVar4.d = longitude;
            double accuracy = a.getAccuracy();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dfve dfveVar5 = (dfve) bZ2.b;
            int i = dfveVar5.a | 8;
            dfveVar5.a = i;
            dfveVar5.e = accuracy;
            long j = a.k;
            dfveVar5.a = i | 16;
            dfveVar5.f = j;
            bK = bZ2.bK();
        }
        return bK;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bvxb
    public final /* bridge */ /* synthetic */ dfvc j(byte[] bArr) {
        return ((dfvb) dfvc.a.bZ().by(bArr)).bK();
    }
}

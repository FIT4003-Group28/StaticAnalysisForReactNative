package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: bsqf  reason: default package */
/* loaded from: classes4.dex */
public final class bsqf {
    public final btvo a;

    public bsqf(btvo btvoVar) {
        this.a = btvoVar;
    }

    public final void a(dwhq dwhqVar) {
        if (dwhqVar.c) {
            dwhqVar.bF();
            dwhqVar.c = false;
        }
        dwhv dwhvVar = (dwhv) dwhqVar.b;
        dwhv dwhvVar2 = dwhv.H;
        dwhvVar.a |= 16384;
        dwhvVar.o = true;
        dwhv dwhvVar3 = (dwhv) dwhqVar.b;
        dwhvVar3.a |= 4096;
        dwhvVar3.m = true;
        dwhv dwhvVar4 = (dwhv) dwhqVar.b;
        dwhvVar4.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        dwhvVar4.q = true;
        dwhv dwhvVar5 = (dwhv) dwhqVar.b;
        dwhvVar5.a |= 2097152;
        dwhvVar5.u = true;
        dwhv dwhvVar6 = (dwhv) dwhqVar.b;
        dwhvVar6.a |= 4194304;
        dwhvVar6.v = true;
        dwhv dwhvVar7 = (dwhv) dwhqVar.b;
        dwhvVar7.a |= 8388608;
        dwhvVar7.w = true;
        dwhv dwhvVar8 = (dwhv) dwhqVar.b;
        dwhvVar8.a |= ImageMetadata.LENS_APERTURE;
        dwhvVar8.s = true;
        dwhv dwhvVar9 = (dwhv) dwhqVar.b;
        dwhvVar9.a |= ImageMetadata.SHADING_MODE;
        dwhvVar9.t = true;
        if (this.a.getCategoricalSearchParameters().w()) {
            if (dwhqVar.c) {
                dwhqVar.bF();
                dwhqVar.c = false;
            }
            dwhv dwhvVar10 = (dwhv) dwhqVar.b;
            dwhvVar10.b |= 4;
            dwhvVar10.F = true;
        }
    }
}

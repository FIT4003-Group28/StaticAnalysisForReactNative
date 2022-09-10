package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: azyd  reason: default package */
/* loaded from: classes.dex */
public final class azyd extends azxm<azzh> {
    @Override // defpackage.azxm
    public final azxl b() {
        return azxl.USER_PARAMETERS;
    }

    @Override // defpackage.azxm
    public final /* bridge */ /* synthetic */ azwh<azzh> c(byte[] bArr) {
        try {
            return new azzg((dong) dsqw.cq(dong.d, bArr));
        } catch (dsrm e) {
            throw new RuntimeException("Failed to parse raw data to a proto.", e);
        }
    }

    @Override // defpackage.azxm
    public final List<azwj> d(doiz doizVar) {
        return dcdc.e();
    }

    @Override // defpackage.azxm
    public final List<azzh> e(doiz doizVar) {
        donk donkVar;
        donk donkVar2;
        if (doizVar.b == 9) {
            donkVar = (donk) doizVar.c;
        } else {
            donkVar = donk.b;
        }
        dong dongVar = donkVar.a;
        if (dongVar == null) {
            dongVar = dong.d;
        }
        if ((dongVar.a & 1) == 0) {
            return dcdc.e();
        }
        if (doizVar.b == 9) {
            donkVar2 = (donk) doizVar.c;
        } else {
            donkVar2 = donk.b;
        }
        dong dongVar2 = donkVar2.a;
        if (dongVar2 == null) {
            dongVar2 = dong.d;
        }
        return dcdc.f(new azzg(dongVar2).b());
    }

    @Override // defpackage.azxm
    public final /* bridge */ /* synthetic */ byte[] f(azzh azzhVar) {
        return azzhVar.o().bS();
    }
}

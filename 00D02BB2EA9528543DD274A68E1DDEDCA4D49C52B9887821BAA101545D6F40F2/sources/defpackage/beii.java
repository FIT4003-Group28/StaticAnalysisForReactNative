package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: beii  reason: default package */
/* loaded from: classes3.dex */
public final class beii extends itb {
    public final gga a;
    public final bwqv b;

    public beii(gga ggaVar, bwqv bwqvVar) {
        this.a = ggaVar;
        this.b = bwqvVar;
    }

    public final void e(bwrs<ilo> bwrsVar, bwrs<bvrt<benb>> bwrsVar2) {
        gga ggaVar = this.a;
        bwqv bwqvVar = this.b;
        bejd bejdVar = new bejd();
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "MerchantCallsSettingsFragment.placemark", bwrsVar);
        bwqvVar.c(bundle, "MerchantCallsSettingsFragment.merchantCallsState", bwrsVar2);
        bejdVar.B(bundle);
        ggaVar.D(bejdVar);
    }
}

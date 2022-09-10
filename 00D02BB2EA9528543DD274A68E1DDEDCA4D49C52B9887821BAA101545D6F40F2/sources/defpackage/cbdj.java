package defpackage;

import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cbdj  reason: default package */
/* loaded from: classes4.dex */
public class cbdj extends bxon {
    private final bwqv a;
    private final ges b;
    @dzsi
    private final ilo c;

    public cbdj(ges gesVar, @dzsi ilo iloVar, bwqv bwqvVar, gga ggaVar, akpm akpmVar, dxio<araj> dxioVar, btvo btvoVar) {
        super(ggaVar.getString(R.string.CHOOSE_ON_MAP_MISSING_PLACE_CARD_TEXT), "", "", true, gesVar, null, null, null, null, null, null, false, true, null, ggaVar, akpmVar, dxioVar, btvoVar);
        this.b = gesVar;
        this.a = bwqvVar;
        this.c = iloVar;
    }

    @Override // defpackage.bxon, defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        bwqv bwqvVar = this.a;
        ilo iloVar = this.c;
        cbcl cbclVar = new cbcl();
        Bundle bundle = new Bundle();
        if (iloVar != null) {
            bwqvVar.c(bundle, "placemark", iloVar);
        }
        cbclVar.B(bundle);
        this.b.aZ(cbclVar);
        return cqkl.a;
    }
}

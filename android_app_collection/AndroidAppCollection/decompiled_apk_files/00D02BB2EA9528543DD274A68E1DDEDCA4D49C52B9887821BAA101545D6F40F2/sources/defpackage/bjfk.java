package defpackage;

import android.os.Bundle;
import defpackage.bjfj;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bjfk  reason: default package */
/* loaded from: classes3.dex */
public abstract class bjfk<T extends bjfj> extends bjfi<T> {
    protected ilo ai;
    public bwqv aj;

    public static Bundle aJ(bwqv bwqvVar, bwrs<ilo> bwrsVar) {
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "placemark_ref", bwrsVar);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bjfi
    public final T i() {
        ilo iloVar = this.ai;
        dbsk.s(iloVar);
        return i(iloVar);
    }

    protected abstract T i(ilo iloVar);

    @Override // defpackage.bjfi, defpackage.ges, defpackage.fd
    public void l(@dzsi Bundle bundle) {
        try {
            bwqv bwqvVar = this.aj;
            dbsk.s(bwqvVar);
            bwrs e = bwqvVar.e(ilo.class, this.o, "placemark_ref");
            dbsk.s(e);
            ilo iloVar = (ilo) e.c();
            dbsk.s(iloVar);
            this.ai = iloVar;
            super.l(bundle);
        } catch (IOException e2) {
            throw new RuntimeException("PlaceQaLeafPageWithPlacemarkFragment cannot be created without a placemark", e2);
        }
    }
}

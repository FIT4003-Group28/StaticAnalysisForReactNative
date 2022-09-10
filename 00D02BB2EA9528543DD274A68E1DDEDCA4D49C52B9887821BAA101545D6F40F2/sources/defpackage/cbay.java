package defpackage;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cbay  reason: default package */
/* loaded from: classes4.dex */
public final class cbay extends gt {
    public dcdc<cbqu> a;

    public cbay(dpvi dpviVar, @dzsi dpvi dpviVar2, @dzsi dpsd dpsdVar, gn gnVar, Runnable runnable) {
        super(gnVar);
        cazx cazxVar = new cazx();
        Bundle bundle = new Bundle();
        if (dpsdVar != null) {
            bundle.putByteArray("RECURRENCE_PATTERN_KEY", dpsdVar.bS());
        }
        bundle.putByteArray("START_DATE_TIME_KEY", dpviVar.bS());
        if (dpviVar2 != null) {
            bundle.putByteArray("END_DATE_TIME_KEY", dpviVar2.bS());
        }
        cazxVar.B(bundle);
        cbbi cbbiVar = new cbbi();
        Bundle bundle2 = new Bundle();
        if (dpsdVar != null) {
            bundle2.putByteArray("RECURRENCE_PATTERN_KEY", dpsdVar.bS());
        }
        bundle2.putByteArray("START_DATE_TIME_KEY", dpviVar.bS());
        if (dpviVar2 != null) {
            bundle2.putByteArray("END_DATE_TIME_KEY", dpviVar2.bS());
        }
        cbbiVar.B(bundle2);
        cbaj cbajVar = new cbaj();
        Bundle bundle3 = new Bundle();
        if (dpsdVar != null) {
            bundle3.putByteArray("RECURRENCE_PATTERN_KEY", dpsdVar.bS());
        }
        bundle3.putByteArray("START_DATE_TIME_KEY", dpviVar.bS());
        if (dpviVar2 != null) {
            bundle3.putByteArray("END_DATE_TIME_KEY", dpviVar2.bS());
        }
        cbajVar.B(bundle3);
        cazo cazoVar = new cazo();
        Bundle bundle4 = new Bundle();
        if (dpsdVar != null) {
            bundle4.putByteArray("RECURRENCE_PATTERN_KEY", dpsdVar.bS());
        }
        bundle4.putByteArray("START_DATE_TIME_KEY", dpviVar.bS());
        if (dpviVar2 != null) {
            bundle4.putByteArray("END_DATE_TIME_KEY", dpviVar2.bS());
        }
        cazoVar.B(bundle4);
        dcdc<cbqu> i = dcdc.i(cazxVar, cbbiVar, cbajVar, cazoVar);
        this.a = i;
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            i.get(i2).q(runnable);
        }
    }

    @Override // defpackage.bas
    public final int OV() {
        return this.a.size();
    }

    @Override // defpackage.gt
    public final fd a(int i) {
        return this.a.get(i).Ny();
    }
}

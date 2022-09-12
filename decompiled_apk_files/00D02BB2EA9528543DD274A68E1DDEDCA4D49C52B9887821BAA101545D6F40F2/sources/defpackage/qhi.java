package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: qhi  reason: default package */
/* loaded from: classes7.dex */
final class qhi extends qhw {
    public amuk a;
    public Intent b;
    public String c;
    public qhq d;
    public dcdc<qhq> e;
    public qhq f;
    public dcdc<qhq> g;
    public String h;
    public qic i;
    public qic j;

    @Override // defpackage.qhw
    public final void a(dcdc<qhq> dcdcVar) {
        if (dcdcVar != null) {
            this.g = dcdcVar;
            return;
        }
        throw new NullPointerException("Null alternativeDropOffStations");
    }

    @Override // defpackage.qhw
    public final void b(dcdc<qhq> dcdcVar) {
        if (dcdcVar != null) {
            this.e = dcdcVar;
            return;
        }
        throw new NullPointerException("Null alternativePickupStations");
    }
}

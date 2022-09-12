package defpackage;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
/* compiled from: PG */
/* renamed from: cojy  reason: default package */
/* loaded from: classes5.dex */
final class cojy extends cola {
    final /* synthetic */ cpct a;
    final /* synthetic */ cokf b;

    public cojy(cokf cokfVar, cpct cpctVar) {
        this.b = cokfVar;
        this.a = cpctVar;
    }

    @Override // defpackage.cola
    public final void a(LocationResult locationResult) {
        this.a.b(locationResult.a());
        this.b.l(this);
    }

    @Override // defpackage.cola
    public final void b(LocationAvailability locationAvailability) {
    }
}

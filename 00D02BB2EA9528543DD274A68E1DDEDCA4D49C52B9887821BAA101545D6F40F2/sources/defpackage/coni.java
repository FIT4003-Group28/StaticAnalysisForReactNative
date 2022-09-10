package defpackage;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: coni  reason: default package */
/* loaded from: classes5.dex */
public final class coni extends coku {
    private final cnsd<cola> a;

    public coni(cnsd<cola> cnsdVar) {
        this.a = cnsdVar;
    }

    public final synchronized void b() {
        this.a.b();
    }

    @Override // defpackage.cokv
    public final void e(LocationResult locationResult) {
        this.a.a(new cong(locationResult));
    }

    @Override // defpackage.cokv
    public final void f(LocationAvailability locationAvailability) {
        this.a.a(new conh(locationAvailability));
    }
}

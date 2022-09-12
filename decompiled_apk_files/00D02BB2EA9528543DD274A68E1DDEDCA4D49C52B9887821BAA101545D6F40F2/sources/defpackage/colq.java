package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;
/* compiled from: PG */
/* renamed from: colq  reason: default package */
/* loaded from: classes5.dex */
final class colq implements cnph<LocationSettingsResult> {
    private final cpct<coli> a;

    public colq(cpct<coli> cpctVar) {
        this.a = cpctVar;
    }

    @Override // defpackage.cnph
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        LocationSettingsResult locationSettingsResult = (LocationSettingsResult) obj;
        Status status = locationSettingsResult.a;
        if (status.d()) {
            this.a.a(new coli(locationSettingsResult));
        } else if (status.c()) {
            this.a.c(new cnok(status));
        } else {
            this.a.c(new cnob(status));
        }
    }
}

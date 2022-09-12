package defpackage;

import com.google.android.gms.location.LocationSettingsResult;
/* compiled from: PG */
/* renamed from: conq  reason: default package */
/* loaded from: classes5.dex */
final class conq extends cone {
    private cnph<LocationSettingsResult> a;

    public conq(cnph<LocationSettingsResult> cnphVar) {
        cnwc.e(cnphVar != null, "listener can't be null.");
        this.a = cnphVar;
    }

    @Override // defpackage.conf
    public final void b(LocationSettingsResult locationSettingsResult) {
        this.a.c(locationSettingsResult);
        this.a = null;
    }
}

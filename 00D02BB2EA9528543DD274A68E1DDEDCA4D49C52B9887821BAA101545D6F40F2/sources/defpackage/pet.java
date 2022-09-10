package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: pet  reason: default package */
/* loaded from: classes7.dex */
final class pet implements dbty<GoogleApiClient> {
    final /* synthetic */ pev a;

    public pet(pev pevVar) {
        this.a = pevVar;
    }

    @Override // defpackage.dbty
    @dzsi
    public final /* bridge */ /* synthetic */ GoogleApiClient a() {
        btsm b = btsm.b(this.a.a);
        if (b == null) {
            return null;
        }
        b.g(cmps.b);
        return b.e();
    }
}

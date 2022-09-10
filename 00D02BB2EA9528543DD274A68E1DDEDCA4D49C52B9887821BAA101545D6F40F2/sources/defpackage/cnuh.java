package defpackage;

import com.google.android.gms.common.ConnectionResult;
/* compiled from: PG */
/* renamed from: cnuh  reason: default package */
/* loaded from: classes.dex */
public final class cnuh extends cntz {
    final /* synthetic */ cnui g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnuh(cnui cnuiVar, int i) {
        super(cnuiVar, i, null);
        this.g = cnuiVar;
    }

    @Override // defpackage.cntz
    protected final boolean a() {
        this.g.h.a(ConnectionResult.a);
        return true;
    }

    @Override // defpackage.cntz
    protected final void b(ConnectionResult connectionResult) {
        this.g.h.a(connectionResult);
        this.g.D(connectionResult);
    }
}

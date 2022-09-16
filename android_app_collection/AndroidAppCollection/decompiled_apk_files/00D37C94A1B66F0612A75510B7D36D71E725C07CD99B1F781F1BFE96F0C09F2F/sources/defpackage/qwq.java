package defpackage;

import com.google.android.gms.common.ConnectionResult;
/* compiled from: PG */
/* renamed from: qwq  reason: default package */
/* loaded from: classes4.dex */
public final class qwq extends qwh {
    final /* synthetic */ qwr g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwq(qwr qwrVar, int i) {
        super(qwrVar, i, null);
        this.g = qwrVar;
    }

    @Override // defpackage.qwh
    protected final void a(ConnectionResult connectionResult) {
        this.g.v.a(connectionResult);
        this.g.q();
    }

    @Override // defpackage.qwh
    protected final boolean c() {
        this.g.v.a(ConnectionResult.a);
        return true;
    }
}

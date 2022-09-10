package defpackage;

import com.google.android.gms.common.ConnectionResult;
/* compiled from: PG */
/* renamed from: cnqh  reason: default package */
/* loaded from: classes5.dex */
final class cnqh extends cnqz {
    final /* synthetic */ ConnectionResult a;
    final /* synthetic */ cnqj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnqh(cnqj cnqjVar, cnqy cnqyVar, ConnectionResult connectionResult) {
        super(cnqyVar);
        this.b = cnqjVar;
        this.a = connectionResult;
    }

    @Override // defpackage.cnqz
    public final void a() {
        this.b.a.n(this.a);
    }
}

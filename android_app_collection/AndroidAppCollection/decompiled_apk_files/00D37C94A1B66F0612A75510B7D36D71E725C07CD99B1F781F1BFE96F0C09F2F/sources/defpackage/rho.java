package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: rho  reason: default package */
/* loaded from: classes4.dex */
public final class rho extends rii {
    final /* synthetic */ Bundle a;
    final /* synthetic */ rir b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rho(rir rirVar, Bundle bundle) {
        super(rirVar);
        this.b = rirVar;
        this.a = bundle;
    }

    @Override // defpackage.rii
    public final void a() {
        rhg rhgVar = this.b.f;
        qnm.b(rhgVar);
        rhgVar.setConditionalUserProperty(this.a, this.f);
    }
}

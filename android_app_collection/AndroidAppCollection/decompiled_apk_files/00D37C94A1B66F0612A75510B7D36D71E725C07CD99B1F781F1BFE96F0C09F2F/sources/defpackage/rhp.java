package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: rhp  reason: default package */
/* loaded from: classes4.dex */
public final class rhp extends rii {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ rir d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhp(rir rirVar, String str, String str2, Bundle bundle) {
        super(rirVar);
        this.d = rirVar;
        this.a = str;
        this.b = str2;
        this.c = bundle;
    }

    @Override // defpackage.rii
    public final void a() {
        rhg rhgVar = this.d.f;
        qnm.b(rhgVar);
        rhgVar.clearConditionalUserProperty(this.a, this.b, this.c);
    }
}

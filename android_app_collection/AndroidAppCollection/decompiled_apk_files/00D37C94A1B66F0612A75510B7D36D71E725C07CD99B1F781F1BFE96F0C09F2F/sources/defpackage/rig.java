package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: rig  reason: default package */
/* loaded from: classes4.dex */
final class rig extends rii {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ boolean d;
    final /* synthetic */ rir e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rig(rir rirVar, String str, String str2, Bundle bundle, boolean z) {
        super(rirVar);
        this.e = rirVar;
        this.a = str;
        this.b = str2;
        this.c = bundle;
        this.d = z;
    }

    @Override // defpackage.rii
    public final void a() {
        long j = this.f;
        rhg rhgVar = this.e.f;
        qnm.b(rhgVar);
        rhgVar.logEvent(this.a, this.b, this.c, this.d, true, j);
    }
}

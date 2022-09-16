package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: btie  reason: default package */
/* loaded from: classes4.dex */
public final class btie implements bthr {
    public transient angy a;
    private final bvrt<dpop> b;
    private final bvrt<dngq> c;

    public btie(dpop dpopVar, dngq dngqVar) {
        this.b = bvrt.b(dpopVar);
        this.c = bvrt.b(dngqVar);
    }

    @Override // defpackage.bthr
    public final void a(Activity activity) {
        ((btij) btsq.c(btij.class, activity)).xz(this);
        this.a.d(this.b.e((dssr) dpop.d.cu(7), dpop.d), this.c.e((dssr) dngq.d.cu(7), dngq.d));
    }
}

package defpackage;

import android.app.Activity;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: anfr  reason: default package */
/* loaded from: classes2.dex */
public final class anfr implements apkp {
    public transient gfq a;
    public transient anft b;
    public transient ckcw c;
    private final aoha d;
    private final anhu e;

    public anfr(aoha aohaVar, anhu anhuVar) {
        this.d = aohaVar;
        this.e = anhuVar;
    }

    @Override // defpackage.apkp
    public final void a(Activity activity) {
        ((anfz) btsq.c(anfz.class, activity)).wP(this);
        if (!(this.a.d() instanceof aoqj)) {
            anft anftVar = this.b;
            aoha aohaVar = this.d;
            anhu anhuVar = this.e;
            aoqj aoqjVar = new aoqj();
            Bundle bundle = new Bundle();
            bundle.putSerializable("segment-identifier", aohaVar);
            bundle.putSerializable("show-opt-out", anhuVar);
            aoqjVar.B(bundle);
            anftVar.H(aoqjVar);
        }
    }

    @Override // defpackage.apkp
    public final void b(Activity activity) {
        ((anfz) btsq.c(anfz.class, activity)).wP(this);
        ((ckcn) this.c.a(ckgo.s)).a();
    }

    @Override // defpackage.apkp
    public final void c(Activity activity) {
        ((anfz) btsq.c(anfz.class, activity)).wP(this);
        ((ckcn) this.c.a(ckgo.v)).a();
    }
}
